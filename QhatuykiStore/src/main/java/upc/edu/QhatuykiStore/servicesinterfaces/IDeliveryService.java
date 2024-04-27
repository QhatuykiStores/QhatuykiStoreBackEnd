package upc.edu.QhatuykiStore.servicesinterfaces;

import upc.edu.QhatuykiStore.entities.Delivery;

import java.util.List;

public interface IDeliveryService {
    public void insertDelivery(Delivery d);
    public List<Delivery> listarDelivery();
    public Delivery listarId(int idDelivery);
}
