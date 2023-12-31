package main.java.mediconnect.modelo.entidade.endereco;

public class Endereco {
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco(String bairro, String cidade, String estado) {
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getCep() {
        return cep;

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }
}
