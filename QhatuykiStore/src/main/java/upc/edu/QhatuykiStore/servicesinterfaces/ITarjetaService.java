package upc.edu.QhatuykiStore.servicesinterfaces;

import upc.edu.QhatuykiStore.entities.Tarjeta;

import java.util.List;

public interface ITarjetaService {
    public void insert(Tarjeta tarjeta);
    public List<Tarjeta> list();
    public void delete(int id);
}
