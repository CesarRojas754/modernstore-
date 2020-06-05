package pe.edu.upc.moderstores.service;

import java.util.List;

import pe.edu.upc.moderstores.model.entity.Carrito;

public interface CarritoService extends CrudService<Carrito, Integer> {

	List<Carrito> findByCantidad(int cantidad) throws Exception;
}
