package pe.edu.upc.moderstores.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.upc.moderstores.model.entity.Ropa;

@Repository
public interface RopaRepository extends JpaRepository<Ropa, Integer>{

	@Query("select r from Ropa r where r.precio > :precio")
	List<Ropa> fetchByPrecio(double precio) throws Exception;
}
