package upc.edu.QhatuykiStore.servicesinterfaces;

import upc.edu.QhatuykiStore.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role rol);

    public List<Role> list();

    public void delete(Long idRol);

    public Role listarId(Long idRol);
}
