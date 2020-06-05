package pe.edu.upc.moderstores.service;

import java.util.List;

import pe.edu.upc.moderstores.model.entity.Categoria;

public interface CategoriaService extends CrudService<Categoria, Integer> {

	List<Categoria> findByNombre(String nombre) throws Exception;
}
