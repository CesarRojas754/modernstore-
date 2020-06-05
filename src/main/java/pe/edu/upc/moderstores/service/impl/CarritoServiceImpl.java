package pe.edu.upc.moderstores.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.moderstores.model.entity.Carrito;
import pe.edu.upc.moderstores.model.repository.CarritoRepository;
import pe.edu.upc.moderstores.service.CarritoService;

@Service
public class CarritoServiceImpl implements CarritoService{

	@Autowired
	private CarritoRepository carritoRepository; 
	
	@Override
	@Transactional
	public Carrito create(Carrito entity) throws Exception {
		// TODO Auto-generated method stub
		return carritoRepository.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Carrito> readAll() throws Exception {
		// TODO Auto-generated method stub
		return carritoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Carrito> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return carritoRepository.findById(id);
	}

	@Override
	@Transactional
	public Carrito update(Carrito entity) throws Exception {
		// TODO Auto-generated method stub
		return carritoRepository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		carritoRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		carritoRepository.deleteAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Carrito> findByCantidad(int cantidad) throws Exception {
		// TODO Auto-generated method stub
		return carritoRepository.findByCantidad(cantidad);
	}

}
