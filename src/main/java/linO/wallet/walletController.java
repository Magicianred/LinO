package linO.wallet;

import org.springframework.web.bind.annotation.RequestMapping;

public class walletController {
    /* Informa o saldo atual de um usuário. */
    @RequestMapping("/verifyWallet")
    public String verifyWallet() {
        return "Verificar saldo do usuário!";
    }

    /* Atualiza informações sobre os gastos de um grupo. */
    @RequestMapping("/updateWallet")
    public String updateWallet() {
        return "Atualiza um gasto existente.";
    }

    /* Insere um novo gasto em um usuário. */
    @RequestMapping("/insertSpendInWallet")
    public String insertSpendInWallet() {
        return "Insere um novo gasto.";
    }

    /* Insere um novo gasto em um usuário. */
    @RequestMapping("/updateSpendInWallet")
    public String updateSpendInWallet() {
        return "Insere um novo gasto.";
    }

}
