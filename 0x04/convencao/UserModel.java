import java.util.List;
import java.util.ArrayList;

public class UserModel {

    private int idUser;
    private String descricao;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static final int IDADE_MINIMA = 18;

    // Método que coleta todos os usuários
    public static List<UserModel> fetchUsers() {
        return new ArrayList<>(); // Exemplo de retorno vazio
    }

    public static List<UserModel> getAllUsers() {
        return new ArrayList<>();
    }

    public static List<UserModel> getUsers() {
        return new ArrayList<>();
    }
}