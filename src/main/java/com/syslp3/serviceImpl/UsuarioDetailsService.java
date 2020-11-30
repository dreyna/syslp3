package com.syslp3.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.syslp3.dao.RolDao;
import com.syslp3.dao.UsuarioDao;
import com.syslp3.entity.Usuario;

@Service("userService")
public class UsuarioDetailsService implements UserDetailsService{
@Autowired
private UsuarioDao usuarioDao;
@Autowired
private RolDao rolDao;
@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	// TODO Auto-generated method stub
	Usuario usuario = usuarioDao.validarUsuario(username); 
	UserDetails details = new User(usuario.getUsername(), usuario.getPassword(), rolDao.buscarRolUser(usuario.getIdusuario()));
	return details;
}
}
