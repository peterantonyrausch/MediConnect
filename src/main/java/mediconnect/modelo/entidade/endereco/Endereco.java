package main.java.mediconnect.modelo.entidade.endereco;

public class Endereco {
    private String cep;
    private String logradouro;
    private String numero;

    public Endereco(String cep, String logradouro, String numero) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getCep() {
        return cep;
    }

    public String getLogradouro(){
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }
}
