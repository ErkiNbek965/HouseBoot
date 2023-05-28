package lenovo.houseproject.service;

import jakarta.transaction.Transactional;
import lenovo.houseproject.entity.Agency;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AgencyService {
    void saveAgency(Agency agency);
    Agency getAgencyById(Long agencyId);
    List<Agency> getAllAgencies();
    void updateAgency(Long agencyId, Agency agency);
    void deleteAgencyById(Long agencyId);

}
