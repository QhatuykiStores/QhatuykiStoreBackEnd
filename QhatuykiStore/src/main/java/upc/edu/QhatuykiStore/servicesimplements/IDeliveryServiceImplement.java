package upc.edu.QhatuykiStore.servicesimplements;

import upc.edu.QhatuykiStore.entities.Delivery;
import upc.edu.QhatuykiStore.repositories.IDeliveryRepository;
import upc.edu.QhatuykiStore.servicesinterfaces.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDeliveryServiceImplement implements IDeliveryService {
    @Autowired
    private IDeliveryRepository dR;

    @Override
    public void insertDelivery(Delivery d) {
        dR.save(d);
    }

    @Override
    public List<Delivery> listarDelivery() {
        return dR.findAll();
    }

    @Override
    public Delivery listarId(int idDelivery) {
        return dR.findById(idDelivery).orElse(new Delivery());
    }
}
