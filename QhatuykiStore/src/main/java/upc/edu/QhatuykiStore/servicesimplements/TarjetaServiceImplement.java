package upc.edu.QhatuykiStore.servicesimplements;

import upc.edu.QhatuykiStore.entities.Tarjeta;
import upc.edu.QhatuykiStore.repositories.ITarjetaRepository;
import upc.edu.QhatuykiStore.servicesinterfaces.ITarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarjetaServiceImplement implements ITarjetaService {
    @Autowired
    private ITarjetaRepository tR;
    @Override
    public void insert(Tarjeta tarjeta) {
        tR.save(tarjeta);
    }

    @Override
    public List<Tarjeta> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }
}
