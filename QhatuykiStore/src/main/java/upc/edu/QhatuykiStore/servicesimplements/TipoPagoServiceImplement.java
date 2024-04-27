package upc.edu.QhatuykiStore.servicesimplements;

import upc.edu.QhatuykiStore.entities.TipoPago;
import upc.edu.QhatuykiStore.repositories.ITipoPagoRepository;
import upc.edu.QhatuykiStore.servicesinterfaces.ITipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPagoServiceImplement implements ITipoPagoService {
    @Autowired
    private ITipoPagoRepository TR;
    @Override
    public void insertar(TipoPago t) {TR.save(t);}
    @Override
    public TipoPago listarId(int idTipPago){ return (TipoPago)TR.findById(idTipPago).orElse(new TipoPago());}
    @Override
    public List<TipoPago> listar(){return TR.findAll();}

}
