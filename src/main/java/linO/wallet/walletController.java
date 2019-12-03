package linO.wallet;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class walletController {

    /* Informa o saldo atual de um usuário. */
    @GetMapping("/verifyWallet")
    public ResponseEntity<String> verifyWallet() {
        return new ResponseEntity<String>(
                "verifyWallet", HttpStatus.OK
        );
    }

    /* Atualiza informações sobre os gastos de um grupo. */
    @PostMapping("/updateWallet")
    public ResponseEntity<String> updateWallet() {
        return new ResponseEntity<String>(
                "updateWallet", HttpStatus.OK
        );
    }

    /* Insere um novo gasto em um usuário. */
    @PostMapping("/insertSpendInWallet")
    public ResponseEntity<String> insertSpendInWallet() {
        return new ResponseEntity<String>(
                "insertSpendInWallet", HttpStatus.OK
        );
    }

    /* Insere um novo gasto em um usuário. */
    @PostMapping("/updateSpendInWallet")
    public ResponseEntity<String> updateSpendInWallet() {
        return new ResponseEntity<String>(
                "updateSpendInWallet", HttpStatus.OK
        );
    }
}