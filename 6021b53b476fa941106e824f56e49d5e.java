

public class colaborador extends Pessoa {

    public colaborador(int iD, String nome, String logradouro, int numero, int cEP, String bairro, String cidade,
            String uF, int telefone, int cPF) {
        super(iD, nome, logradouro, numero, cEP, bairro, cidade, uF, telefone, cPF);
        
    }

    private String situacao;

    public colaborador(int iD, String nome, String logradouro, int numero, int cEP, String bairro, String cidade,
            String uF, int telefone, int cPF, String situacao) {
        super(iD, nome, logradouro, numero, cEP, bairro, cidade, uF, telefone, cPF);
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }





}