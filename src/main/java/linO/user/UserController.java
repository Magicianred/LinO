package linO.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    /* Informa todos usuários registrados no banco. */
    @GetMapping("/listUser")
    public ResponseEntity<String> listUser() {
        return new ResponseEntity<String>(
                "listUser", HttpStatus.OK
        );
    }

    /* Insere um novo usuário. */
    @PostMapping("/insertUser")
    public ResponseEntity<String> insertUser() {
        return new ResponseEntity<String>(
                "insertUser", HttpStatus.OK
        );
    }

    /* Atualiza o usuário. */
    @PostMapping("/updateUser")
    public ResponseEntity<String> updateUser() {
        return new ResponseEntity<String>(
                "updateUser", HttpStatus.OK
        );
    }

    /* Associa um usuário a um grupo. */
    @PostMapping("/associateUserToGroup")
    public ResponseEntity<String> associateUserToGroup() {
        return new ResponseEntity<String>(
                "associateUserToGroup", HttpStatus.OK
        );
    }

    /* Desassocia um usuário a um grupo. */
    @PostMapping("/deleteUserFromGroup")
    public ResponseEntity<String> deleteUserFromGroup() {
        return new ResponseEntity<String>(
                "deleteUserFromGroup", HttpStatus.OK
        );
    }
}
