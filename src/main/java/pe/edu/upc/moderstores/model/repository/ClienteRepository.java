package pe.edu.upc.moderstores.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.moderstores.model.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	List<Cliente> findByNombres(String nombres) throws Exception;
	List<Cliente> findByApellidos(String apellidos) throws Exception;
	Optional<Cliente> findByCorreo(String correo) throws Exception;
	Optional<Cliente> findByUsuario(String usuario) throws Exception;
}
