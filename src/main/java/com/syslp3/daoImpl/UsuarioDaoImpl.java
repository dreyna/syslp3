package com.syslp3.daoImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.syslp3.dao.UsuarioDao;
import com.syslp3.entity.Usuario;
@Repository
public class UsuarioDaoImpl  implements UsuarioDao{
@Autowired
private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
				String SQL = "SELECT *FROM usuario WHERE username=?";
				return jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	@Override
	public Usuario validarUsuario(String nomuser) {
		// TODO Auto-generated method stub
		String SQL = "SELECT *from usuario WHERE  username=?";
		Usuario user = jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
		return user;
	}
	@Override
	public Map<String, Object> datosUsuario(String username) {
		// TODO Auto-generated method stub
		String SQL = "SELECT u.idusuario, r.idrol, p.nombres, p.apellidos, u.username, r.nomrol FROM  persona as p " + 
				"INNER JOIN usuario as u ON u.idpersona= p.idpersona " + 
				"INNER JOIN usuario_rol as ur ON u.idusuario= ur.idusuario " + 
				"INNER JOIN rol as r ON ur.idrol=r.idrol " + 
				"WHERE u.username= ?";
		return jdbcTemplate.queryForMap(SQL, new Object[] {username});
	}

}
