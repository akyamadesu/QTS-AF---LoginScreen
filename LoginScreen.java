import java.util.HashMap;
import java.util.Map;

/**
 * Abaixo, esta classe representa a tela de login.
 */
public class LoginScreen {
    private final Map<String, String> userDatabase;

    /**
     * Constructor da classe LoginScreen.
     * Com alguns dados de exemplo, dá início à base de dados do usuário.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Verifica se o username e senha fornecidos correspondem a algum usuário no banco de dados.
     * @param username - O username a ser verificado.
     * @param password - A senha a ser verificada.
     * @return 'true' se o username e senha correspondem a um usuário no banco de dados, 'false' caso não.
     */
    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Adiciona um novo user na base de dados.
     * @param username O username do novo user.
     * @param password A senha do novo user.
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }
}
