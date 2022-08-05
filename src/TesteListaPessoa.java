import java.util.Scanner;

public class TesteListaPessoa {
    public static void main(String[] args) {
        int opcao;
        ListaPessoa lp = new ListaPessoa(2);
        Scanner read = new Scanner(System.in);
        do {
            System.out.println("*** MENU ***");
            System.out.println("[ 1 ] ADICIONA NOVA PESSOA");
            System.out.println("[ 2 ] VISUALIZA TODAS PESSOAS");
            System.out.println("[ 3 ] VISUALIZA TODAS PESSOAS POR TIPO");
            System.out.println("[ 4 ] PESQUISA PESSOAS");
            System.out.println("[ 0 ] ENCERRAR PROGRAMA");
            System.out.println("Digite a opção desejada, de 0 a 4: ");
            opcao = read.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(" *** ADICIONAR PESSOA ***");
                    System.out.println("Para adicionar um convidado, digite 1, para adicionar um ajudante, digite 2");
                    int escolhaConvidadoAjudante = read.nextInt();
                    Pessoa pess1 = null;
                    if (escolhaConvidadoAjudante == 1) {
                        System.out.println("Digite o código do convidado: ");
                        int cod = read.nextInt();
                        read.nextLine();
                        System.out.println("Digite o nome do convidado: ");
                        String nom = read.nextLine();
                        System.out.println("Digite o sexo do convidado (M ou F): ");
                        char sex = read.nextLine().charAt(0);
                        System.out.println("Digite a idade do convidado: ");
                        int ida = read.nextInt();
                        read.nextLine();
                        System.out.println("Convidado estará na festa de Natal (S ou N)? ");
                        char escolhaFestaNatal = read.nextLine().charAt(0);
                        boolean festaNatal = false;
                        if (escolhaFestaNatal == 'S')
                            festaNatal = true;
                        System.out.println("Convidado estará na festa de ano novo (S ou N)? ");
                        char escolhaFestaAnoNovo = read.nextLine().charAt(0);
                        boolean festaAnoNovo = false;
                        if (escolhaFestaAnoNovo == 'S')
                            festaAnoNovo = true;
                        pess1 = new Convidado(cod, nom, sex, ida, festaNatal, festaAnoNovo);
                        System.out.println("Convidado adicionado!");

                    } else if (escolhaConvidadoAjudante == 2) {
                        System.out.println("Digite o código do ajudante: ");
                        int cod = read.nextInt();
                        read.nextLine();
                        System.out.println("Digite o nome do ajudante: ");
                        String nom = read.nextLine();
                        System.out.println("Digite o sexo do ajudante (M ou F): ");
                        char sex = read.nextLine().charAt(0);
                        System.out.println("Digite a idade do ajudante: ");
                        int ida = read.nextInt();
                        read.nextLine();
                        System.out.println("Ajudante faz parte do apoio da cozinha (S ou N)? ");
                        char escolhaApoioCozinha = read.nextLine().charAt(0);
                        boolean apoioCozinha = false;
                        if (escolhaApoioCozinha == 'S')
                            apoioCozinha = true;
                        System.out.println("Ajudante faz parte do apoio da organização (S ou N)? ");
                        char escolhaApoioOrganizacao = read.nextLine().charAt(0);
                        boolean apoioOrganizacao = false;
                        if (escolhaApoioOrganizacao == 'S')
                            apoioOrganizacao = true;
                        pess1 = new Ajudante(cod, nom, sex, ida, apoioCozinha, apoioOrganizacao);
                        System.out.println("Ajudante adicionado!");
                    }
                    lp.adicionaPessoaLista(pess1);//adiciona pessoa criada ao array
                    break;

                case 2:
                    System.out.println(" *** VISUALIZAR TODAS PESSOAS ***");
                    lp.visualizaListaPessoas();
                    break;

                case 3:
                    System.out.println(" *** VISUALIZAR PESSOAS POR TIPO ***");
                    System.out.println("Digite C para convidado e A para ajudante: ");
                    //char visualizaTipo = read.findInLine(".").charAt(0);
                    char visualizaTipo = read.next().trim().toUpperCase().charAt(0);
                    lp.visualizaListaPessoasPorTipo(visualizaTipo);
                    break;

                case 4:
                    read.nextLine();
                    System.out.println(" *** PESQUISAR PESSOAS ***");
                    System.out.println("Digite o nome a pesquisar: ");
                    String nom = read.nextLine();
                    lp.pesquisaPessoa(nom);
                    break;

                case 0:
                    System.out.println("*** FINALIZANDO PROGRAMA... ***");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA, REINICIANDO PROGRAMA");
            }

        }
        while (opcao != 0);

    }
}