package pe.edu.upc.moderstores.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.moderstores.model.entity.Comerciante;
import pe.edu.upc.moderstores.model.repository.ComercianteRepository;
import pe.edu.upc.moderstores.service.ComercianteService;

@Service
public class ComercianteServiceImpl implements ComercianteService{

	@Autowired
	private ComercianteRepository comercianteRepository;
	
	@Override
	@Transactional
	public Comerciante create(Comerciante entity) throws Exception {
		// TODO Auto-generated method stub
		return comercianteRepository.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Comerciante> readAll() throws Exception {
		// TODO Auto-generated method stub
		return comercianteRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Comerciante> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return comercianteRepository.findById(id);
	}

	@Override
	@Transactional
	public Comerciante update(Comerciante entity) throws Exception {
		// TODO Auto-generated method stub
		return comercianteRepository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		comercianteRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		comercianteRepository.deleteAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Comerciante> findByUsuario(String usuario) throws Exception {
		// TODO Auto-generated method stub
		return comercianteRepository.findByUsuario(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Comerciante> findByCelular(String celular) throws Exception {
		// TODO Auto-generated method stub
		return comercianteRepository.findByCelular(celular);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Comerciante> findByCorreo(String correo) throws Exception {
		// TODO Auto-generated method stub
		return comercianteRepository.findByCorreo(correo);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Comerciante> findByNombres(String nombres) throws Exception {
		// TODO Auto-generated method stub
		return comercianteRepository.findByNombres(nombres);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Comerciante> findByApellidos(String apellidos) throws Exception {
		// TODO Auto-generated method stub
		return comercianteRepository.findByApellidos(apellidos);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Comerciante> findByDni(String dni) throws Exception {
		// TODO Auto-generated method stub
		return comercianteRepository.findByDni(dni);
	}

}
