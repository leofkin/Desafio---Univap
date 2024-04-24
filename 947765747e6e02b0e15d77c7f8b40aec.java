

public class Pessoa {
    
private int ID;
private String nome;
private String logradouro;
private int numero;
private int CEP;
private String bairro;
private String cidade;
private String UF;
private int telefone;
private int CPF;

public Pessoa(int iD, String nome, String logradouro, int numero, int cEP, String bairro, String cidade, String uF,
        int telefone, int cPF) {
    ID = iD;
    this.nome = nome;
    this.logradouro = logradouro;
    this.numero = numero;
    CEP = cEP;
    this.bairro = bairro;
    this.cidade = cidade;
    UF = uF;
    this.telefone = telefone;
    CPF = cPF;
}
public int getID() {
    return ID;
}
public void setID(int iD) {
    ID = iD;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getLogradouro() {
    return logradouro;
}
public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
}
public int getNumero() {
    return numero;
}
public void setNumero(int numero) {
    this.numero = numero;
}
public int getCEP() {
    return CEP;
}
public void setCEP(int cEP) {
    CEP = cEP;
}
public String getBairro() {
    return bairro;
}
public void setBairro(String bairro) {
    this.bairro = bairro;
}
public String getCidade() {
    return cidade;
}
public void setCidade(String cidade) {
    this.cidade = cidade;
}
public String getUF() {
    return UF;
}
public void setUF(String uF) {
    UF = uF;
}
public int getTelefone() {
    return telefone;
}
public void setTelefone(int telefone) {
    this.telefone = telefone;
}
public int getCPF() {
    return CPF;
}
public void setCPF(int cPF) {
    CPF = cPF;
}
}