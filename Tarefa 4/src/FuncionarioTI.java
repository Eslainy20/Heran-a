package Q1;

public class FuncionarioTI {
    private String nome;
    private int matricula;

    public FuncionarioTI(String nome,int matricula){
        this.nome=nome;
        this.matricula=matricula;
    }
    void exibirDados(){
        System.out.println("Nome:" +getNome());
        System.out.println("Numero da Matricula:" +getMatricula());

    }

    void atualizarCadastro(){
        System.out.println("Cadastro atualizado"  +getMatricula());
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

}
