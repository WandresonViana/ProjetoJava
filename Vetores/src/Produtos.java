public class Produtos {
    private String descricao;
    private String embalagem;
    private double valor;

    public Produtos(String descricao, String embalagem, double valor) {
        this.descricao = descricao;
        this.embalagem = embalagem;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    
}
