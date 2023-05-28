package lenovo.houseproject.service.serviceImpl;

import jakarta.transaction.Transactional;
import lenovo.houseproject.entity.House;
import lenovo.houseproject.repostiory.HouseRepository;
import lenovo.houseproject.service.HouseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
public class HouseServiceImpl implements HouseService {
    private final HouseRepository houseRepository;




    @Override
    public void saveHouse(Long agencyId, House house) {

    }

    @Override
    public List<House> getAllHouses(Long agencyId) {
        return null;
    }

    @Override
    public House getHouseById(Long houseId) {
        return null;
    }

    @Override
    public void updateHouseById(Long houseId, House house) {

    }

    @Override
    public void deleteHouse(Long houseId) {

    }

    @Override
    public List<House> getBookedHouses() {
        return null;
    }
}
