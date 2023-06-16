public class Gerentes {
    private int id;
    private String nome;
    private String cpf;

    public Gerentes(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public  void VerificarSeGerenteExiste(String nome,String cpf,int id){
        if(nome==getNome() && cpf==getCpf() && id==getId()){
            System.out.println("Esse gerente está cadastrado no sistema");
        }
        else {
            System.out.println("Não temos um gerente com todas essas informações!");
        }

    }
}

