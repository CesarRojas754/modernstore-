package pe.edu.upc.moderstores.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.moderstores.model.entity.Factura;
import pe.edu.upc.moderstores.model.repository.FacturaRepository;
import pe.edu.upc.moderstores.service.FacturaService;

@Service
public class FacturaServiceImpl implements FacturaService{

	@Autowired
	private FacturaRepository facturaRepository;
	
	@Override
	@Transactional
	public Factura create(Factura entity) throws Exception {
		// TODO Auto-generated method stub
		return facturaRepository.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Factura> readAll() throws Exception {
		// TODO Auto-generated method stub
		return facturaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Factura> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return facturaRepository.findById(id);
	}

	@Override
	@Transactional
	public Factura update(Factura entity) throws Exception {
		// TODO Auto-generated method stub
		return facturaRepository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		facturaRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		facturaRepository.deleteAll();
		
	}

}
