package pe.edu.upc.moderstores.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.moderstores.model.entity.Ropa;
import pe.edu.upc.moderstores.model.repository.RopaRepository;
import pe.edu.upc.moderstores.service.RopaService;

@Service
public class RopaServiceImpl implements RopaService{

	@Autowired
	private RopaRepository ropaRepository;
	
	@Override
	@Transactional
	public Ropa create(Ropa entity) throws Exception {
		// TODO Auto-generated method stub
		return ropaRepository.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Ropa> readAll() throws Exception {
		// TODO Auto-generated method stub
		return ropaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Ropa> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return ropaRepository.findById(id);
	}

	@Override
	@Transactional
	public Ropa update(Ropa entity) throws Exception {
		// TODO Auto-generated method stub
		return ropaRepository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		ropaRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		ropaRepository.deleteAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Ropa> fetchByPrecio(double precio) throws Exception {
		// TODO Auto-generated method stub
		return ropaRepository.fetchByPrecio(precio);
	}

}
