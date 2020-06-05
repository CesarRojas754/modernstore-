package pe.edu.upc.moderstores.service;

import java.util.List;

import pe.edu.upc.moderstores.model.entity.Ropa;

public interface RopaService extends CrudService<Ropa, Integer>{

	List<Ropa> fetchByPrecio(double precio) throws Exception;
}
