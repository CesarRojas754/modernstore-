package pe.edu.upc.moderstores.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.moderstores.model.entity.TarjetaCredito;

public interface TarjetaCreditoService extends CrudService<TarjetaCredito, Integer>{
	Optional<TarjetaCredito> findByNumeroTarjeta(String numeroTarjeta) throws Exception;
	List<TarjetaCredito> findByTipo(String tipo) throws Exception;
}
