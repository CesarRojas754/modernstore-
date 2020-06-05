package pe.edu.upc.moderstores.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.moderstores.model.entity.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Integer>{
 
	List<Carrito> findByCantidad(int cantidad) throws Exception;
}
