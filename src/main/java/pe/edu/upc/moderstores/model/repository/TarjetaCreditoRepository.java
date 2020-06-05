package pe.edu.upc.moderstores.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.moderstores.model.entity.TarjetaCredito;

@Repository
public interface TarjetaCreditoRepository extends JpaRepository<TarjetaCredito, Integer>{
	Optional<TarjetaCredito> findByNumeroTarjeta(String numeroTarjeta) throws Exception;
	List<TarjetaCredito> findByTipo(String tipo) throws Exception;
}
