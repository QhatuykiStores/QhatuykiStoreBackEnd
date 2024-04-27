package upc.edu.QhatuykiStore.servicesimplements;

import upc.edu.QhatuykiStore.entities.Venta;
import upc.edu.QhatuykiStore.repositories.IVentaRepository;
import upc.edu.QhatuykiStore.servicesinterfaces.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IVentaServiceImplement implements IVentaService {
    @Autowired
    private IVentaRepository iVR;
    @Override
    public void insert(Venta venta) {
        iVR.save(venta);
    }

    @Override
    public List<Venta> list() {
        return iVR.findAll();
    }

    @Override
    public void delete(Long idVenta) {
        iVR.deleteById(idVenta);
    }

    @Override
    public Venta listarId(Long idVenta) {
        return iVR.findById(idVenta).orElse(new Venta());
    }

}
