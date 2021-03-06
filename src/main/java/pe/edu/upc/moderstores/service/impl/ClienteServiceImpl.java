package pe.edu.upc.moderstores.service.impl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.moderstores.model.entity.Cliente;
import pe.edu.upc.moderstores.model.repository.ClienteRepository;
import pe.edu.upc.moderstores.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	

	@Override
	@Transactional
	public Cliente create(Cliente entity) throws Exception {
		return clienteRepository.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> readAll() throws Exception {
		return clienteRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Cliente> findById(Integer id) throws Exception {
		return clienteRepository.findById(id);
		
	}

	@Override
	@Transactional
	public Cliente update(Cliente entity) throws Exception {
		return clienteRepository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Integer id) throws Exception {
			clienteRepository.deleteById(id);
	}

	@Override
	@Transactional
	public void deleteAll() throws Exception {
		clienteRepository.deleteAll();
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findByNombres(String nombres) throws Exception {
		return clienteRepository.findByNombres(nombres);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findByApellidos(String apellidos) throws Exception {
		return clienteRepository.findByApellidos(apellidos);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Cliente> findByCorreo(String correo) throws Exception {
		return clienteRepository.findByCorreo(correo);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Cliente> findByUsuario(String usuario) throws Exception {
		return clienteRepository.findByUsuario(usuario);
	}

}
