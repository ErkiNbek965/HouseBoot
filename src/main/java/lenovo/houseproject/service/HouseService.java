package lenovo.houseproject.service;

import lenovo.houseproject.entity.House;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface HouseService {

    void saveHouse(Long agencyId, House house);


    List<House> getAllHouses(Long agencyId);

    House getHouseById(Long houseId);
    void updateHouseById(Long houseId, House house);

    void deleteHouse(Long houseId);

    List<House> getBookedHouses();
}
