package com.syslp3.security;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.syslp3.dao.PersonaDao;
import com.syslp3.dao.UsuarioDao;
import com.syslp3.entity.Persona;
import com.syslp3.entity.Usuario;


@Component
public class InfoAdicionalToken implements TokenEnhancer{
	@Autowired
	private UsuarioDao usuarioDao;
	@Autowired
	private PersonaDao personaDao;
Gson g = new Gson();
	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		Usuario user = usuarioDao.read(authentication.getName());
		Persona per = personaDao.read(user.getIdpersona());
		Map<String, Object> datos= new HashMap<>();
		datos.put("iduser", user.getIdusuario());
		datos.put("nombre", per.getNombres());
		datos.put("user", user.getUsername());
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(datos);

		return accessToken;
	}

}
