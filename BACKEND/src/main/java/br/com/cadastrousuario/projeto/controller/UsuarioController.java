package br.com.cadastrousuario.projeto.controller;

import br.com.cadastrousuario.projeto.DAO.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController{

    //Para implementar a interface IUsuario
    @Autowired
    private IUsuario dao;


    @GetMapping("/usuarios")
    public String texto () {
        return "Status 200 ok";
    }
}
