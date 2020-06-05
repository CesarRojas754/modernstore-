package pe.edu.upc.moderstores.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.moderstores.model.entity.Suscripcion;

@Repository
public interface SuscripcionRepository extends JpaRepository<Suscripcion, Integer>{
 
	@Query("Select s from Suscripcion s where s.monto > :monto")
	List<Suscripcion> fetchByMonto(double monto) throws Exception;
}
