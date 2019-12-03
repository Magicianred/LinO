package linO.userGroup;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserGroupController {

    /* Informa todos os grupos registrados no banco. */
    @GetMapping("/listGroup")
    public ResponseEntity<String> listGroup() {
        return new ResponseEntity<String>(
                "listGroup", HttpStatus.OK
        );
    }

    /* Insere um novo grupo. */
    @GetMapping("/insertGroup")
    public ResponseEntity<String> insertGroup() {
        return new ResponseEntity<String>(
                "insertGroup", HttpStatus.OK
        );
    }
}