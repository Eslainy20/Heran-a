package Q1;

public class Teste {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("Eslainy",20241567,"java","Junior");
        AdministradorRede ad1 = new AdministradorRede("Eduarda",20239874,"Comp Network","linux");

        System.out.println("Desenvolvedor: ");
        d1.exibirDados();
        d1.desenvolverProjeto();
        d1.revisarCodigo();

        System.out.println("\n");

        System.out.println("Administrador: ");
        ad1.exibirDados();
        ad1.monitorarRede();
        ad1.realizarBackup();

    }


}
