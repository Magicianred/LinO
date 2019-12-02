package linO.userGroup;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userGroupController {

    /* Informa todos os grupos registrados no banco. */
    @RequestMapping("/listGroup")
    public String listGroup() {

        return "Listar grupos!";
    }

    /* Insere um novo grupo. */
    @RequestMapping("/insertGroup")
    public String insertGroup() {

        return "Insere novo grupo.";
    }

}