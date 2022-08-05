import java.util.Scanner;
public class ListaPessoa
{
    private Pessoa listaPessoas [];
    private int contador;
    Scanner read = new Scanner(System.in);
    char tipoPessoa;

    public ListaPessoa(int tamanho){
        listaPessoas = new Pessoa[tamanho];
    }
    public void adicionaPessoaLista(Pessoa pes) {
        listaPessoas[contador] = pes;
        contador++;
    }

    public void visualizaListaPessoas(){
        for (int i = 0; i < contador; i++)
        {
            if (listaPessoas[i] instanceof Convidado){
                System.out.println("A pessoa é um convidado!");
                listaPessoas[i].exibeDados();}
            else if (listaPessoas[i] instanceof Ajudante){
                System.out.println("A pessoa é um ajudante!");
                listaPessoas[i].exibeDados();}
        }
    }

    public void visualizaListaPessoasPorTipo(char tipoPessoa){
        for (int i = 0; i < contador; i++)
        {
            if ((listaPessoas[i] instanceof Convidado) && (tipoPessoa == 'C')){
                System.out.println("Exibindo dados de convidado:");
                listaPessoas[i].exibeDados();}
            else if ((listaPessoas[i] instanceof Ajudante) && tipoPessoa == 'A'){
                    System.out.println("Exibindo dados de ajudante:");
                    listaPessoas[i].exibeDados();
            }
        }
    }

    public void pesquisaPessoa(String nome){
        for (int i = 0; i < contador; i++) {
            if ((listaPessoas[i] instanceof Convidado) && (listaPessoas[i].getNome().contains(nome))){
                System.out.println("Convidado");
                listaPessoas[i].exibeDados();}
            else if ((listaPessoas[i] instanceof Ajudante) && (listaPessoas[i].getNome().contains(nome))){
                System.out.println("Ajudante");
                listaPessoas[i].exibeDados();}
            }
        }
    }