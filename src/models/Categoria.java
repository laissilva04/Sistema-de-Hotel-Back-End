package models;

public class Categoria extends Entidade{
    
    private String descricao;
    private double valor;

    public Categoria(String codigo, String descricao, double valor){
        super(codigo);
        this.descricao = descricao;
        this.valor = valor;
    }
    public String getCodigo() {
        return this.getId();
    }
    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setCodigo(String codigo) {
        this.setId(codigo);
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }    
    @Override
    public String toString(){
        return "Categoria{codigo='"+ getCodigo()+"', descricao='"+getDescricao() +"', valor='"+ getValor()+"'}";
    }
}
