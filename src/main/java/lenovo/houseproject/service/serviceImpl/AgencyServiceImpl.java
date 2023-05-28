package lenovo.houseproject.service.serviceImpl;

import jakarta.transaction.Transactional;
import lenovo.houseproject.entity.Agency;
import lenovo.houseproject.repostiory.AgencyRepository;
import lenovo.houseproject.service.AgencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Repository
@Transactional
@RequiredArgsConstructor
public class AgencyServiceImpl implements AgencyService {
private final AgencyRepository agencyRepository;
        @Override
        public void saveAgency(Agency agency) {
                agencyRepository.save(agency);

        }

        @Override
        public Agency getAgencyById(Long agencyId) {
                return agencyRepository.findById(agencyId).orElseThrow(()->new
                        NullPointerException("User with id:"+agencyId+"is not found"));
        }

        @Override
        public List<Agency> getAllAgencies() {
                return agencyRepository.findAll();
        }

        @Override
        public void updateAgency(Long agencyId, Agency agency) {
                Agency agency1 = agencyRepository.findById(agencyId)
                        .orElseThrow(() -> new NullPointerException
                                ("User with id:" + agencyId + "is not found"));
                agency1.setCountry(agency.getCountry());
                agency1.setEmail(agency.getEmail());
                agency1.setImage(agency.getImage());
                agency1.setName(agency.getName());
                agency1.setPhoneNumber(agency.getPhoneNumber());
                agencyRepository.save(agency1);

        }

        @Override
        public void deleteAgencyById(Long agencyId) {
                if(agencyRepository.existsById(agencyId)) {
                        agencyRepository.deleteById(agencyId);
                }else throw new NullPointerException("User with id:"+agencyId+ " is not found");
        }
}
