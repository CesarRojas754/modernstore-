package pe.edu.upc.moderstores.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.moderstores.model.entity.Comerciante;

@Repository
public interface ComercianteRepository extends JpaRepository<Comerciante, Integer>{

	Optional<Comerciante> findByUsuario(String usuario) throws Exception;
	Optional<Comerciante> findByCelular(String celular) throws Exception;
	Optional<Comerciante> findByCorreo(String correo) throws Exception;
	List<Comerciante> findByNombres(String nombres) throws Exception;
	List<Comerciante> findByApellidos(String apellidos) throws Exception;
	Optional<Comerciante> findByDni(String dni) throws Exception;
}
