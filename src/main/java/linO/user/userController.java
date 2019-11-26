package linO.user;

import org.springframework.web.bind.annotation.RequestMapping;

public class userController {

    /* Informa todos usuários registrados no banco. */
    @RequestMapping("/listUser")
    public String listUser() {
        return "Lista de usuários!";
    }

    /* Insere um novo usuário. */
    @RequestMapping("/insertUser")
    public String insertUser() {
        return "Insere novo usuário";
    }

    /* Atualiza o usuário. */
    @RequestMapping("/updateUser")
    public String updateUser() {

        return "Atualiza um usuário!";
    }

    /* Associa um usuário a um grupo. */
    @RequestMapping("/associateUserToGroup")
    public String associateUserToGroup() {

        return "Associa um usuário a um grupo";
    }

    /* Desassocia um usuário a um grupo. */
    @RequestMapping("/deleteUserFromGroup")
    public String deleteUserFromGroup() {

        return "Remove um usuário de um grupo.";
    }

}
