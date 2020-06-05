package pe.edu.upc.moderstores.service;

import java.util.List;

import pe.edu.upc.moderstores.model.entity.Detalle;

public interface DetalleService extends CrudService<Detalle, Integer>{

	List<Detalle> fetchByMonto(double montoPagar) throws Exception;
}
