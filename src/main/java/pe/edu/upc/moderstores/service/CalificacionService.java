package pe.edu.upc.moderstores.service;

import java.util.List;

import pe.edu.upc.moderstores.model.entity.Calificacion;

public interface CalificacionService extends CrudService<Calificacion, Integer>{

	List<Calificacion> findByPuntaje(int puntaje) throws Exception;
}
