package com.maquino.ProyectoTienda_in5bv.Service;

import com.maquino.ProyectoTienda_in5bv.Entity.User;
import com.maquino.ProyectoTienda_in5bv.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> listar() {
        return userRepository.findAll();
    }

    @Override
    public User obtnerePorId(Integer Id) {
        return userRepository.findById(Id).orElseThrow(() -> new RuntimeException("Usuario con Id erroneo"));
    }

    @Override
    public User crear(User user) {
        user.setIdUsuario(null);
        return userRepository.save(user);
    }

    @Override
    public User actualizar(Integer id, User user) {
        User userExistente = userRepository.findById(id).orElse(null);
        if (userExistente != null) {
            userExistente.setNombreUsu(user.getNombreUsu());
            userExistente.setApellidoUsu(user.getApellidoUsu());
            userExistente.setEdadUsu(user.getEdadUsu());
            return userRepository.save(userExistente);
        }
        return null;
    }

    @Override
    public void eliminar(Integer id) {
        userRepository.deleteById(id);
    }
}