package pe.edu.upc.moderstores.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.moderstores.model.entity.Calificacion;

@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion, Integer> {

	List<Calificacion> findByPuntaje(int puntaje) throws Exception;
}
