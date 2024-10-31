public class Restaurante {
    private String nome;
    private String endereco;
    private double preco;
    private String tipoComida;

    public Restaurante(String nome,String endereco,double preco, String tipoComida)
    {
        this.nome = nome;
        this.endereco = endereco;
        this.preco = preco;
        this.tipoComida = tipoComida;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    public void setTipoComida(String tipoComida)
    {
        this.tipoComida = tipoComida;
    }

    public String getNome()
    {
        return this.nome;
    }
    public String getEndereco()
    {
        return this.endereco;
    }
    public double getPreco()
    {
        return this.preco;
    }
    public String getTipoComida()
    {
        return this.tipoComida;
    }

    public void exibirDados()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Preço: " + this.preco);
        System.out.println("Tipo Comida: " + this.tipoComida);
    }
}

