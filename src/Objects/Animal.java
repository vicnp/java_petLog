package Objects;
/**
 * @date 08/10/2017 - 18:54
 * @version 2
 * @author Victor Nascimento
 */
public class Animal {
    private byte idade;
    private String nome;
    private char sexo;
    private double peso;
    private Pessoa dono;

    public Animal(String nome, byte idade, double peso, char sexo, Pessoa dono) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setPeso(peso);
        this.setSexo(sexo);
        this.setDono(dono);
    }

    public byte getIdade() {
        return idade;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String toString() {
        return "\nDados do animal: \n >    Nome: " + nome + ", Idade: " + idade +  ", Sexo: " + sexo + ",Peso: " + peso+dono.toString();
    } 
    public Pessoa getDono() {
        return dono;
    }
    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
}
