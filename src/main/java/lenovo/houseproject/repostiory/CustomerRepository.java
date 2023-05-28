package lenovo.houseproject.repostiory;

import lenovo.houseproject.entity.Agency;
import lenovo.houseproject.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
