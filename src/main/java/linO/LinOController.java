/*
  GET
      /listarUsuario	Informa todos usuários registrados no banco.
      /listarGrupo	    Informa todos os grupos registrados no banco.
      /verificaSaldo	Informa o saldo atual de um usuário.

  POST
      /insereUsuario	    Insere um novo usuário.
      /atualizaUsuario	    Atualiza o usuário.
      /insereGrupo	        Insere um novo grupo.
      /insereUsuarioGrupo	Associa um usuário a um grupo
      /removeUsuarioGrupo 	Desassocia um usuário de um grupo
      /insereGasto	        Insere um novo gasto de grupo.
      /atualizaGasto	    Atualiza informações sobre os gastos de um grupo.
*/

package linO;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinOController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public LinO greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new LinO(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }

    /* Informa todos usuários registrados no banco. */
    @RequestMapping("/listarUsuario")
    public String listarUsuario() {
        return "Lista de usuários!";
    }

    /* Informa todos os grupos registrados no banco. */
    @RequestMapping("/listarGrupo")
    public String listarGrupo() {
        return "Listar grupos!";
    }

    /* Informa o saldo atual de um usuário. */
    @RequestMapping("/verificaSaldo")
    public String verificaSaldo() {
        return "Verificar saldo do usuário!";
    }

    /* Insere um novo usuário. */
    @RequestMapping("/insereUsuario")
    public String insereUsuario() {
        return "Insere novo usuário";
    }

    /* Atualiza o usuário. */
    @RequestMapping("/atualizaUsuario")
    public String atualizaUsuario() {
        return "Atualiza um usuário!";
    }

    /* Insere um novo grupo. */
    @RequestMapping("/insereGrupo")
    public String insereGrupo() {
        return "Insere novo grupo.";
    }

    /* Associa um usuário a um grupo. */
    @RequestMapping("/insereUsuarioGrupo")
    public String insereUsuarioGrupo() {
        return "Associa um usuário a um grupo";
    }

    /* Desassocia um usuário a um grupo. */
    @RequestMapping("/removeUsuarioGrupo")
    public String removeUsuarioGrupo() {
        return "Remove um usuário de um grupo.";
    }

    /* Insere um novo gasto em um usuário. */
    @RequestMapping("/insereGasto")
    public String insereGasto() {
        return "Insere um novo gasto.";
    }

    /* Atualiza informações sobre os gastos de um grupo. */
    @RequestMapping("/atualizaGasto")
    public String atualizaGasto() {
        return "Atualiza um gasto existente.";
    }
}