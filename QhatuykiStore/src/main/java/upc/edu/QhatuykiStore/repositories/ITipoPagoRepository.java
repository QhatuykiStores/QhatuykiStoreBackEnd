package upc.edu.QhatuykiStore.repositories;

import upc.edu.QhatuykiStore.entities.TipoPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoPagoRepository extends JpaRepository<TipoPago, Integer> {
}
