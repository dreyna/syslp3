package com.syslp3.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syslp3.dao.UsuarioDao;
import com.syslp3.entity.Usuario;
import com.syslp3.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{
@Autowired
private UsuarioDao usuarioDao;
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.create(u);
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.update(u);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.delete(id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		return usuarioDao.read(nomuser);
	}

	@Override
	public Usuario validarUsuario(String nomuser) {
		// TODO Auto-generated method stub
		return usuarioDao.validarUsuario(nomuser);
	}

	@Override
	public Map<String, Object> datosUsuario(String username) {
		// TODO Auto-generated method stub
		return usuarioDao.datosUsuario(username);
	}

}
