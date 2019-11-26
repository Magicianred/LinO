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
public class LinoController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Lino greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Lino(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/")
    public String index() {

        return "Hello World!";
    }


















}