package Objects;
/**
 * @date 08/10/2017 - 18:00
 * @version 2
 * @author Victor
 */
public class Pessoa {
    private String nome;
    private byte idade;
    private char sexo;
    private Double mensalidade;

    public Pessoa(String nome, byte idade, char sexo, double mensalidade) {
        this.setIdade(idade);
        this.setMensalidade(mensalidade);
        this.setNome(nome);
        this.setSexo(sexo);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public byte getIdade() {
        return idade;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public double getMensalidade() {
        return mensalidade;
    }
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    @Override
    public String toString() {
        return "\r\nDados Dono: \n >    Nome: " + nome + ", Idade: " + idade + ", Sexo: " + sexo + ", Mensalidade: " + mensalidade.floatValue();
    }  
}
