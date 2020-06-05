package pe.edu.upc.moderstores.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.moderstores.model.entity.TarjetaCredito;
import pe.edu.upc.moderstores.model.repository.TarjetaCreditoRepository;
import pe.edu.upc.moderstores.service.TarjetaCreditoService;

@Service
public class TarjetaCreditoServiceImpl implements TarjetaCreditoService{

	@Autowired
	private TarjetaCreditoRepository tarjetaCreditoRepository;
	
	@Override
	@Transactional
	public TarjetaCredito create(TarjetaCredito entity) throws Exception {
		// TODO Auto-generated method stub
		return tarjetaCreditoRepository.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public List<TarjetaCredito> readAll() throws Exception {
		// TODO Auto-generated method stub
		return tarjetaCreditoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<TarjetaCredito> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return tarjetaCreditoRepository.findById(id);
	}

	@Override
	@Transactional
	public TarjetaCredito update(TarjetaCredito entity) throws Exception {
		// TODO Auto-generated method stub
		return tarjetaCreditoRepository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		tarjetaCreditoRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		tarjetaCreditoRepository.deleteAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<TarjetaCredito> findByNumeroTarjeta(String numeroTarjeta) throws Exception {
		// TODO Auto-generated method stub
		return tarjetaCreditoRepository.findByNumeroTarjeta(numeroTarjeta);
	}

	@Override
	@Transactional(readOnly = true)
	public List<TarjetaCredito> findByTipo(String tipo) throws Exception {
		// TODO Auto-generated method stub
		return tarjetaCreditoRepository.findByTipo(tipo);
	}

}
