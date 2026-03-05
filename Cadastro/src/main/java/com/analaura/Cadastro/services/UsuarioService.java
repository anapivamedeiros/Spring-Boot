package com.analaura.Cadastro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.analaura.Cadastro.entities.Usuario;
import com.analaura.Cadastro.repositories.UsuarioRepository;

@Service
public class UsuarioService {
   
    @Autowired
    private UsuarioRepository repository;
   
    public List<Usuario> listarTodos(){
        return repository.findAll();
    }
   
    public Usuario cadastrar(Usuario usuario) {
        return repository.save(usuario);
    }
    public Usuario atualizar(Long id, Usuario dados) {
    	Usuario usuario = repository.findById(id).orElse(null);

    	if (usuario == null) {
    	return null;
    	}

    	usuario.setNome(dados.getNome());
    	usuario.setEmail(dados.getEmail());
    	usuario.setSenha(dados.getSenha());
    	usuario.setPerfil(dados.getPerfil());
    	usuario.setEndereco(dados.getEndereco());
    	usuario.setBairro(dados.getBairro());
    	usuario.setComplemento(dados.getComplemento());
    	usuario.setCep(dados.getCep());
    	usuario.setCidade(dados.getCidade());
    	usuario.setEstado(dados.getEstado());

    	return repository.save(usuario);
    	}

    	public boolean deletar(Long id) {
    	if (!repository.existsById(id)) {
    	return false;
    	}

    	repository.deleteById(id);
    	return true;
    	}
    	
    	
    	
    	
    	  public Usuario login(String email, String senha) {

    	        Usuario usuario = repository.findByEmail(email);

    	        if (usuario == null) {
    	            return null;
    	        }

    	        if (usuario.getSenha().equals(senha)) {
    	            return usuario;
    	        }

    	        return null;
    	    }

		  public Usuario login1(String email, String senha) {
			// TODO Auto-generated method stub
			return null;
		  }
    	
}

