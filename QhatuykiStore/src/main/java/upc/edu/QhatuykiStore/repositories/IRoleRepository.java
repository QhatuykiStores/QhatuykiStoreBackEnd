package upc.edu.QhatuykiStore.repositories;
import upc.edu.QhatuykiStore.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {}
