package com.syslp3.service;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import com.syslp3.entity.Rol;

public interface RolService {
	public List<Map<String, Object>> readAll();
	int create(Rol r);
	int update(Rol r);
	int update(int id);
	int delete(int id);
	List<Rol> readHola(int id);
	Map<String, Object> read(int id);
	List<GrantedAuthority> buscarRolUser(int iduser);
	void convertitMap(Map<String, Object> map);
}
