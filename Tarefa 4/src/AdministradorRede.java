package Q1;

public class AdministradorRede extends FuncionarioTI {
    private String certificacao;
    private String sistemaOperacionalResponsavel;

    public AdministradorRede(String nome, int matricula ,String certificacao, String sistemaOperacionalResponsavel){
        super(nome,matricula);
        this.certificacao=certificacao;
        this.sistemaOperacionalResponsavel=sistemaOperacionalResponsavel;
    }

    void monitorarRede(){
        System.out.println( getNome() + " esta monitorando a rede ");
    }

    void  realizarBackup(){
        System.out.println("Backup realizado por " +getNome());
    }

    void exibirDados(){
        super.exibirDados();
        System.out.println("Certificacao: " +certificacao);
        System.out.println("Sistema Responsavel: " +sistemaOperacionalResponsavel);
    }
}
