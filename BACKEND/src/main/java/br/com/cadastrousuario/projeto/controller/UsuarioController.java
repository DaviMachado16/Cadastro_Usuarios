package br.com.cadastrousuario.projeto.controller;

import br.com.cadastrousuario.projeto.DAO.IUsuario;
import br.com.cadastrousuario.projeto.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController{

    //Para implementar a interface IUsuario
    @Autowired
    private IUsuario dao;

    @GetMapping
    public List<Usuario> listaUsuarios () {
        return (List<Usuario>) dao.findAll();
    }

    @PostMapping
    public Usuario criarUsuario (@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }

    @PutMapping
}
