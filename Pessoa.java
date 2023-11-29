
public class Pessoa {
    String nomeP;
    String dataNascimento;
    int idPessoa;

    public Pessoa(String nomeP, String dataNascimento, int idPessoa) {
        this.nomeP = nomeP;
        this.dataNascimento = dataNascimento;
        this.idPessoa = idPessoa;
    }

    public String getNome(){
        return this.nomeP;
    }

    public String getData(){
        return this.dataNascimento;
    }

    public int getID(){
        return this.idPessoa;
    }
}
