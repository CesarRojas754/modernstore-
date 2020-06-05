package pe.edu.upc.moderstores.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.moderstores.model.entity.Categoria;
import pe.edu.upc.moderstores.model.repository.CategoriaRepository;
import pe.edu.upc.moderstores.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	@Transactional
	public Categoria create(Categoria entity) throws Exception {
		// TODO Auto-generated method stub
		return categoriaRepository.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Categoria> readAll() throws Exception {
		// TODO Auto-generated method stub
		return categoriaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Categoria> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return categoriaRepository.findById(id);
	}

	@Override
	@Transactional
	public Categoria update(Categoria entity) throws Exception {
		// TODO Auto-generated method stub
		return categoriaRepository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		categoriaRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		categoriaRepository.deleteAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findByNombre(String nombre) throws Exception {
		// TODO Auto-generated method stub
		return categoriaRepository.findByNombre(nombre);
	}

}
