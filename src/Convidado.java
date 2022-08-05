public class Convidado extends Pessoa
{
    private boolean festaNatal;
    private boolean festaAnoNovo;

    public Convidado(int cod, String nom, char sex, int ida, boolean festaNatal, boolean festaAnoNovo){
        super(cod, nom, sex, ida);
        this.festaNatal = festaNatal;
        this.festaAnoNovo = festaAnoNovo;}

    public boolean getFestaNatal() {
        return festaNatal;
    }

    public boolean getFestaAnoNovo() {
        return festaAnoNovo;
    }

    public void setFestaNatal(boolean festaNatal) {
        this.festaNatal = festaNatal;
    }

    public void setFestaAnoNovo(boolean festaAnoNovo) {
        this.festaAnoNovo = festaAnoNovo;
    }

    public void exibeDados(){
        super.exibeDados();
        System.out.println("Festa de natal: " + festaNatal);
        System.out.println("Festa de ano novo: " + festaAnoNovo);
        }

}

