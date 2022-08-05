public abstract class Pessoa
{
    // atributos
    private int codigo;
    private String nome;
    private char sexo; //F=Feminino, M=Masculino
    private int idade;
    
    //construtor
    public Pessoa(int cod, String nom, char sex, int ida)
    {
        codigo = cod;
        nome = nom;
        sexo = sex;
        idade = ida;
    }
    
    //m�todos GET
    public int getCodigo()
    {
        return codigo;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getSexo()
    {
        if(Character.toUpperCase(sexo)=='F')
            return "Feminino";
        else
            return "Masculino";
    }
    
    public int getIdade()
    {
        return idade;
    }
    
    //m�todos SET
    public void setCodigo(int cod)
    {
        codigo = cod;
    }
    
    public void setNome(String nom)
    {
        nome = nom;
    }
    
    public void setSexo(char sex)
    {
        sexo = sex;
    }
    
    public void setIdade(int ida)
    {
        idade = ida;
    }
    
    //m�todo exibeDados
    public void exibeDados()
    {
        System.out.println("C�digo: " + codigo);
        System.out.println("Nome : " + nome);
        System.out.println("Sexo: " + getSexo());
        System.out.println("Idade : " + idade);
    }
}