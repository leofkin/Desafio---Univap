

public class associados extends Pessoa {
    
public associados(int iD, String nome, String logradouro, int numero, int cEP, String bairro, String cidade,
            String uF, int telefone, int cPF) {
        super(iD, nome, logradouro, numero, cEP, bairro, cidade, uF, telefone, cPF);
        
    }
private int idassociado;
private String situacao;

public associados(int iD, String nome, String logradouro, int numero, int cEP, String bairro, String cidade, String uF,
        int telefone, int cPF, int idassociado, String situacao) {
    super(iD, nome, logradouro, numero, cEP, bairro, cidade, uF, telefone, cPF);
    this.idassociado = idassociado;
    this.situacao = situacao;
}

public int getIdassociado() {
    return idassociado;
}
public void setIdassociado(int idassociado) {
    this.idassociado = idassociado;
}
public String getSituacao() {
    return situacao;
}
public void setSituacao(String situacao) {
    this.situacao = situacao;
}

}