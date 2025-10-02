package br.com.cadastrousuario.projeto.DAO;

import br.com.cadastrousuario.projeto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

//Criando interface repositorio, e colocando o nome e tipo de dado da Primary Key do banco
public interface IUsuario  extends CrudRepository<Usuario, Integer> {
}
