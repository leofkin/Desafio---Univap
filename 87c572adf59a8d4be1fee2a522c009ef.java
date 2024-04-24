

public class fornecedores extends Pessoa {

    public fornecedores(int iD, String nome, String logradouro, int numero, int cEP, String bairro, String cidade,
            String uF, int telefone, int cPF) {
        super(iD, nome, logradouro, numero, cEP, bairro, cidade, uF, telefone, cPF);
        
    }
    private String nomefantasia;
    private String website;
    
    public fornecedores(int iD, String nome, String logradouro, int numero, int cEP, String bairro, String cidade,
            String uF, int telefone, int cPF, String nomefantasia, String website) {
        super(iD, nome, logradouro, numero, cEP, bairro, cidade, uF, telefone, cPF);
        this.nomefantasia = nomefantasia;
        this.website = website;
    }
    
    public String getNomefantasia() {
        return nomefantasia;
    }
    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website;
    }
}

