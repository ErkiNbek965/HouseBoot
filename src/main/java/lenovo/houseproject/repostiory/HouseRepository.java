package lenovo.houseproject.repostiory;

import lenovo.houseproject.entity.Agency;
import lenovo.houseproject.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<House,Long> {
}
