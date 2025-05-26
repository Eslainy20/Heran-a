package Q1;

public class Desenvolvedor extends FuncionarioTI {
    private String linguagemPrincipal;
    private String nivel;


    public Desenvolvedor(String nome,int matricula, String linguagemPrincipal ,String nivel){
        super(nome,matricula);
        this.linguagemPrincipal=linguagemPrincipal;
        this.nivel=nivel;
    }

    void desenvolverProjeto(){
        System.out.println(getNome() + " esta desenvolvendo um projeto em " +linguagemPrincipal);

    }

    void atualizarProjeto(){
        System.out.println("Projeto atualizado pelo " +getNome());
    }

    void exibirTecnologiasUsadas(){
        System.out.println("Tecnologia: " +linguagemPrincipal);

    }

    void revisarCodigo(){
        System.out.println("Codigo revisado por desenvolvedor " +nivel);

    }

}
