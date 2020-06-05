package pe.edu.upc.moderstores.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.moderstores.model.entity.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer>{

	
}
