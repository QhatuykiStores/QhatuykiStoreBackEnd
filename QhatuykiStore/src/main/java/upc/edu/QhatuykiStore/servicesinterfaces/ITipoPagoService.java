package upc.edu.QhatuykiStore.servicesinterfaces;

import upc.edu.QhatuykiStore.entities.TipoPago;
import java.util.List;
public interface ITipoPagoService {
    public void insertar(TipoPago t);
    public TipoPago listarId(int idTipPago);
    public List<TipoPago> listar();
}
