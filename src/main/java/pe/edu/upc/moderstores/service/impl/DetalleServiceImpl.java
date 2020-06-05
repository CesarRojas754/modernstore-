package pe.edu.upc.moderstores.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.moderstores.model.entity.Detalle;
import pe.edu.upc.moderstores.model.repository.DetalleRepository;
import pe.edu.upc.moderstores.service.DetalleService;

@Service
public class DetalleServiceImpl implements DetalleService{

	@Autowired
	private DetalleRepository detalleRepository;
	
	@Override
	@Transactional
	public Detalle create(Detalle entity) throws Exception {
		// TODO Auto-generated method stub
		return detalleRepository.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Detalle> readAll() throws Exception {
		// TODO Auto-generated method stub
		return detalleRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Detalle> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return detalleRepository.findById(id);
	}

	@Override
	@Transactional
	public Detalle update(Detalle entity) throws Exception {
		// TODO Auto-generated method stub
		return detalleRepository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		detalleRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		detalleRepository.deleteAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Detalle> fetchByMonto(double montoPagar) throws Exception {
		// TODO Auto-generated method stub
		return detalleRepository.fetchByMonto(montoPagar);
	}

}
