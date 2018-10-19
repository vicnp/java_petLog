package Control;

import Objects.Animal;
import java.util.ArrayList;

/**
 *
 * @author Victor Nascimento
 */
public class Estatistica {
   
    //animal
    public double CalcMedIdade_animal(ArrayList<Animal> l_animal){
        int md_idade = 0;
        int div = l_animal.size();
        for (Animal animal : l_animal) {
            md_idade += animal.getIdade();
        }
        return md_idade/div;
    }
    public double CalcMedPeso(ArrayList<Animal> l_animal){
        double md_peso = 0;
        int div = l_animal.size();
        for (Animal animal : l_animal) {
            md_peso += animal.getPeso();
        }
        return md_peso/div;
    }
    public double CalcMedPesoGenero(ArrayList<Animal> l_animal, int genero){
        char SM;
        char s;
        if(genero == 1){
             SM = 'f';
             s = 'F';
        }else{
           SM = 'm';
           s = 'M'; 
        }
        double md_peso = 0; 
        int div = 0;
        for (Animal animal : l_animal) {
            if(animal.getSexo() == SM || animal.getSexo() == s){
                div++;
                md_peso += animal.getPeso();
            }
        }
        if(div != 0){
            return md_peso/div;
        }else{
            return 0;
        }
    }
    public double CalcCustoTotal(ArrayList<Animal> l_animal){
        int md_custo = 0;
        for (Animal animal : l_animal) {
            md_custo += animal.getDono().getMensalidade();
        }
        return md_custo;
    }
    public double CalcCustoMedAnimal(ArrayList<Animal> l_animal){
        int md_custo = 0;
        int div = l_animal.size();
        for (Animal animal : l_animal) {
            md_custo += animal.getDono().getMensalidade();
        }
        return md_custo/div;
        } 
    public double CalcCustoMedGeneroAnimal(ArrayList<Animal> l_animal, int genero){
        char SM;
        char s;
        if(genero == 1){
             SM = 'f';
             s = 'F';
        }else{
           SM = 'm';
           s = 'M'; 
        }
        int md_custo = 0;
        int div = 0;
        for (Animal animal : l_animal) {
            if(animal.getSexo() == SM || animal.getSexo() == s){
                md_custo += animal.getDono().getMensalidade();
                div++;
            }
        }
        
        if(div != 0){
            return md_custo/div;
        }else{
            return 0;
        }
        
    }
    public double CalcCustoTotalGenero(ArrayList<Animal> l_animal, int genero){
        char SM;
        char s;
        if(genero == 1){
             SM = 'f';
             s = 'F';
        }else{
           SM = 'm';
           s = 'M'; 
        }
        int md_custo = 0;
        for (Animal animal : l_animal) {
            if(animal.getSexo() == SM || animal.getSexo() == s){
                md_custo += animal.getDono().getMensalidade();
            }
        }
        return md_custo;
    } 
    public double CalcPctGeneroAnimal(ArrayList<Animal> l_animal, int genero){
        int total = l_animal.size();
        int machos = 0;
        int femeas = 0;
        double pct_genero;
        
        for (Animal animal : l_animal) {
            if(animal.getSexo() == 'f' || animal.getSexo() == 'F'){
                femeas++;
            }else{
                machos++;
            }
        }
        if(genero == 1)
            pct_genero = femeas;
        else
             pct_genero = machos;
        
        pct_genero = pct_genero/total;
        pct_genero = pct_genero*100;
        return pct_genero;
    }
    //Pessoa
    public double CalcMediaIdadePessoa(ArrayList<Animal> l_animal) {
        int md_idade = 0;
        int div = l_animal.size();
        for (Animal animal : l_animal) {
            md_idade += animal.getDono().getIdade();
        }
        return md_idade/div;
    }
    public double CalcPctPessoa(ArrayList<Animal> l_animal, int genero) {
        int total = l_animal.size();
        int homems = 0;
        int mulheres = 0;
        double pct_genero;
        
        for (Animal animal : l_animal) {
            if(animal.getDono().getSexo() == 'f' || animal.getDono().getSexo() == 'F'){
                mulheres++;
            }else{
                homems++;
            }
        }
        if(genero == 1)
            pct_genero = mulheres;
        else
            pct_genero = homems;
        
        pct_genero = pct_genero/total;
        pct_genero = pct_genero*100;
        return pct_genero;
    }
    public String CalcPreferencia(ArrayList<Animal> l_animal, int genero) {
        int animais_macho_por_homem = 0;
        int animais_macho_por_mulher= 0;
        int animais_femea_por_homem = 0;
        int animais_femea_por_mulher= 0;
        for (Animal animal : l_animal) {
            if(animal.getDono().getSexo() == 'M' || animal.getDono().getSexo() == 'm' ){
                if(animal.getSexo() == 'F' || animal.getSexo() == 'f' ){
                   animais_femea_por_homem++;
                }else{
                   animais_macho_por_homem++;
                }
            }
            if(animal.getDono().getSexo() == 'F' || animal.getDono().getSexo() == 'f' ){
                if(animal.getSexo() == 'F' || animal.getSexo() == 'f' ){
                    animais_femea_por_mulher++;
                }else{
                    animais_macho_por_mulher++;
                }   
            }
        }
        if(genero == 0){
            if(animais_femea_por_homem > animais_macho_por_homem){
                return "Femea";
            }else if(animais_femea_por_homem < animais_macho_por_homem) {
                return "Macho";
            }else{
                return "Nenhuma";
            }
        }else{
            if(animais_femea_por_mulher > animais_macho_por_mulher){
                return "Femea";
            }else if(animais_femea_por_mulher < animais_macho_por_mulher) {
                return "Macho";
            }else{
                return "Nenhuma";
            }
        } 
    }
    public double CalcMediaGastosPessoa(ArrayList<Animal> l_animal, int genero) {
        char SM;
        char s;
        if(genero == 1){
             SM = 'f';
             s = 'F';
        }else{
           SM = 'm';
           s = 'M'; 
        }
        int md_custo = 0;
        int div = 0;
        for (Animal animal : l_animal) {
            if(animal.getDono().getSexo() == SM || animal.getDono().getSexo() == s){
                md_custo += animal.getDono().getMensalidade();
                div++;
            }
        }

        if(div != 0){
            return md_custo/div;
        }else{
            return 0;
        }
         
     }
    public double MediaIdadeGenero(ArrayList<Animal> l_animal, int genero){
        char SM;
        char s;
        if(genero == 1){
             SM = 'f';
             s = 'F';
        }else{
           SM = 'm';
           s = 'M'; 
        }
        double md_idade = 0; 
        int div = 0;
        for (Animal animal : l_animal) {
            if(animal.getDono().getSexo() == SM || animal.getSexo() == s){
                div++;
                md_idade += animal.getDono().getIdade();
            }
        }
        if(div != 0){
            return md_idade/div;
        }else{
            return 0;
        }
    }

}
