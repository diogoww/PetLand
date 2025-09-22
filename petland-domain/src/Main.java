import com.petland.domain.cadastro.Cadastro;
import com.petland.domain.cadastro.Endereco;
import com.petland.domain.cadastro.Perfil;

public class Main {
    public static void main(String[] args){
        Cadastro cadastro = new Cadastro();
        cadastro.setId(1);
        cadastro.setNome("Diogo Varaschin");

        Perfil perfil = new Perfil();
        perfil.setCliente(true);

        cadastro.setPerfil(perfil);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua Lionel Messi");
        endereco.setNumero("10A");

        cadastro.setEndereco(endereco);

        System.out.println("\nCadastro Criado com sucesso!");
        System.out.println("Nome: " + cadastro.getNome());
        System.out.println("Endereço: " + cadastro.getEndereco().getLogradouro() + ", " + cadastro.getEndereco().getNumero());

        System.out.println(cadastro);
    }
}
