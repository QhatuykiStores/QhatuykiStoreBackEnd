package upc.edu.QhatuykiStore.repositories;

import upc.edu.QhatuykiStore.entities.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITarjetaRepository extends JpaRepository<Tarjeta, Integer>{

}
