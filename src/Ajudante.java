public class Ajudante extends Pessoa
{

    private boolean apoioCozinha;
    private boolean apoioOrganizacao;

    public Ajudante(int cod, String nom, char sex, int ida, boolean apoioCozinha, boolean apoioOrganizacao){
        super(cod, nom, sex, ida);
        this.apoioCozinha = apoioCozinha;
        this.apoioOrganizacao = apoioOrganizacao;
    }

    public boolean getApoioCozinha() {
        return apoioCozinha;
    }

    public void setApoioCozinha(boolean apoioCozinha) {
        this.apoioCozinha = apoioCozinha;
    }

    public boolean getApoioOrganizacao() {
        return apoioOrganizacao;
    }

    public void setApoioOrganizacao(boolean apoioOrganizacao) {
        this.apoioOrganizacao = apoioOrganizacao;
    }

    public void exibeDados(){
        super.exibeDados();
        System.out.println("Apoio organizacao: " + apoioOrganizacao);
        System.out.println("Apoio cozinha: " + apoioCozinha);
    }

}
