package pe.edu.upc.moderstores.service;

import java.util.List;

import pe.edu.upc.moderstores.model.entity.Suscripcion;

public interface SuscripcionService extends CrudService<Suscripcion, Integer> {

	List<Suscripcion> fetchByMonto(double monto) throws Exception;
}
