package com.analaura.Cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.analaura.Cadastro.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
   // Método para buscar usuário pelo email
Usuario findByEmail(String email);
}