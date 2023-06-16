import java.util.HashMap;
import java.util.Map;

public class Vendedores {
    static Map<Integer, Vendedores> listaDeVendedoresAtivos = new HashMap();
    public String nome;
    public String cpf;
    public Vendedores(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public static void verificarSeExistiUmVendedor(int valor) {
        listaDeVendedoresAtivos.put(123, new Vendedores("Raissa", "12345678903"));
        listaDeVendedoresAtivos.put(122, new Vendedores("Ana", "12345678904"));
        listaDeVendedoresAtivos.put(133, new Vendedores("Renato", "12345678905"));

        if (listaDeVendedoresAtivos.containsKey(valor)){
            System.out.println("Vendedor cadastrado!");
        }else{
            System.out.println("Vendedor não cadastrado");
        }
    }
}