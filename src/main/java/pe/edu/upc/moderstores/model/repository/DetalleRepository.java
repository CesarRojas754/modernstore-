package pe.edu.upc.moderstores.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.moderstores.model.entity.Detalle;

@Repository
public interface DetalleRepository extends JpaRepository<Detalle, Integer>{

	@Query("select d from Detalle d where d.montoPagar > :montoPagar")
	List<Detalle> fetchByMonto(double montoPagar) throws Exception;
}
