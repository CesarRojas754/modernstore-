package pe.edu.upc.moderstores.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.moderstores.model.entity.Suscripcion;
import pe.edu.upc.moderstores.model.repository.SuscripcionRepository;
import pe.edu.upc.moderstores.service.SuscripcionService;

@Service
public class SuscripcionServiceImpl implements SuscripcionService{

	@Autowired
	private SuscripcionRepository suscripcionRepository;
	
	@Override
	@Transactional
	public Suscripcion create(Suscripcion entity) throws Exception {
		// TODO Auto-generated method stub
		return suscripcionRepository.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Suscripcion> readAll() throws Exception {
		// TODO Auto-generated method stub
		return suscripcionRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Suscripcion> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return suscripcionRepository.findById(id);
	}

	@Override
	@Transactional
	public Suscripcion update(Suscripcion entity) throws Exception {
		// TODO Auto-generated method stub
		return suscripcionRepository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		suscripcionRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		suscripcionRepository.deleteAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Suscripcion> fetchByMonto(double monto) throws Exception {
		// TODO Auto-generated method stub
		return suscripcionRepository.fetchByMonto(monto);
	}

}
