package upc.edu.QhatuykiStore.servicesinterfaces;

import upc.edu.QhatuykiStore.entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users usuario);

    public List<Users> list();

    public void delete(Long idUsuario);

    public Users listarId(Long idUsuario);
}
