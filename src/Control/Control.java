package Control;

import GUI.GUI;
import static GUI.GUI.*;
import Objects.*;
import com.sun.javafx.PlatformUtil;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @date 22/09/2017 - 03:35
 * @updated 08/10/2017 - 18:55
 * @version 8
 * @author Victor Nascimento
 */
public class Control {
    private static void   Print_list(ArrayList<Animal> l_animal) {    
         int index = 0;
         DefaultTableModel dtmAnimal = (DefaultTableModel) JTable_animais.getModel();
         JTable_animais.setRowSorter(new TableRowSorter(dtmAnimal));
         
          if(dtmAnimal.getRowCount() > 0){ //Limpa a tabela;
              dtmAnimal.setRowCount(0); // Define a contagem de linhas da Table para ZERO, se houver elementos na tabela eles serão descartados.
          }
          
          for (Animal animal : l_animal) { // Atualiza a tabela
             Object[] dados = {index, animal.getNome(), animal.getIdade(), animal.getPeso(), //Vetor de elementos para serem adicionados a JTable.
                               animal.getSexo(),animal.getDono().getMensalidade(),animal.getDono().getNome(), //Deve estar na ordem das colunas Jtable.
                               animal.getDono().getIdade(),animal.getDono().getSexo()};
            
             dtmAnimal.addRow(dados);
             index++;
            }
          


    }
    private static void   WriteToDisk(String path, ArrayList<Animal> l_animal) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(path));
        String file_text = "";
        for (Animal animal : l_animal) { //Acumula o texto de todos os elementos de l_animal em uma string
           file_text = file_text+"\r\n"+animal.toString();
        }
        out.write(file_text);//escreve o conteudo de file_text em um arquivo
        out.close();
    }
    private static void   Insert_list(ArrayList<Animal> l_animal) {
        try {
            String nome = Animal_name.getText(); // Recebe todos os dados inseridos pelo usuário.
            byte idade = Byte.parseByte(Animal_idade.getSelectedItem().toString()); //getSelectedItem retorna o indice do elementos selecionado pelo usuário.
            double peso = Double.parseDouble(Animal_peso.getText());
            String sexo_t = Animal_sexo.getSelectedItem().toString();
            char sexo = sexo_t.charAt(0);// Somente um char[0] é salvo.
            
            Pessoa dono = Insert_owner(); //Instancia o dono.
            Animal toInsert = new Animal(nome, idade, peso, sexo, dono);// Instancia o animal, dono é atributo de Animal.
            
            l_animal.add(toInsert); //Finalmente insere o objeto na lista.

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Inserção inválida!"); //Geralmente é acionado caso o usuário insera um valor que não pode ser convertido.
            System.err.println("L57-67, falha trycatch" + e);//Facilitar a vida.
        }
    }
    private static void   Insert_list(ArrayList<Animal> l_animal, int index) {
        try {  
            String nome = Animal_name.getText();
            byte idade = Byte.parseByte(Animal_idade.getSelectedItem().toString());
            double peso = Double.parseDouble(Animal_peso.getText());
            String sexo_t = Animal_sexo.getSelectedItem().toString();
            char sexo = sexo_t.charAt(0);
            
            Pessoa dono = Insert_owner();
            Animal toInsert = new Animal(nome, idade, peso, sexo, dono);
            
            l_animal.set(index, toInsert); //Set substitui um dado elemento por outro.
            JOptionPane.showMessageDialog(null, "Dados atualizados!");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Inserção inválida!");
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "O elemento não pode ser acessado ou foi excluído.");
        }
    }
    private static void   backupFromArray(ArrayList<Animal> l_animal, int index) {
        //O objetivo desse método é recuperar os dados de um elemento da lista(l_animal) e inserir nas variaveis de campo do Inser_Dialog. Assim o usuário não precisa re-digitar tudo.
        Animal_idade.setSelectedIndex(l_animal.get(index).getIdade() - 1);
        Animal_name.setText(l_animal.get(index).getNome());
        Animal_peso.setText(Double.toString(l_animal.get(index).getPeso()));

        Pessoa tmp = l_animal.get(index).getDono();

        Pessoa_idade.setSelectedIndex(tmp.getIdade() - 18);// -18 pois a lista de idade começa em 18. (tmp.getIdade() - 18 == indice_do_elemento)
        Pessoa_nome.setText(tmp.getNome());
        Pessoa_mensalidade.setText(Double.toString(tmp.getMensalidade()));

        if (l_animal.get(index).getSexo() == 'm' || l_animal.get(index).getSexo() == 'M') //Alguns metodos ainda tratam problemas que não existem mais, 
            Animal_sexo.setSelectedIndex(0);                                              //nas versões iniciais do código elas eram necessárias.            
        else 
            Animal_sexo.setSelectedIndex(1);
        

        if (tmp.getSexo() == 'm' || tmp.getSexo() == 'M') 
            Pessoa_sexo.setSelectedIndex(0);
        else 
            Pessoa_sexo.setSelectedIndex(1);
        
    }
    private static Pessoa Insert_owner() {
        String nome_pessoa = Pessoa_nome.getText();
        byte idade_pessoa = Byte.parseByte(Pessoa_idade.getSelectedItem().toString());
        Double mensalidade = Double.parseDouble(Pessoa_mensalidade.getText());
        String sexo_pessoa_t = Pessoa_sexo.getSelectedItem().toString();
        char sexo_pessoa = sexo_pessoa_t.charAt(0);
        Pessoa dono = new Pessoa(nome_pessoa, idade_pessoa, sexo_pessoa, mensalidade);
        
        return dono;
    }
    public static void    Remove_list(ArrayList<Animal> l_animal) {
        //                ^^^^^^ da lista um elemento selecionado pelo usuário.
        if (!Insert_Dialog.isVisible()) {
            if (l_animal.isEmpty()) { //Caso a lista esteja vazia.
                JOptionPane.showMessageDialog(null, "Não há dados cadastrados!");
            } else {
                try {
                    int index = JTable_animais.getSelectedRow(); //Retorna qual elemento o usuário selecionou na JTable.
                    if(index != -1){//Caso o usuário não tenha selecionado nenhum indice o método retorna -1.
                        if (index < l_animal.size() && index >= 0) { //Com o uso do JTable essa checagem se torna desnecessária. // Em versões anteriores era necessário.
                            Animal toPrint = l_animal.get(index);
                            System.out.println("Animal removido:" + toPrint.toString());
                            l_animal.remove(index);
                            Print_list(l_animal);//Atualiza a lista.
                        } else {
                            JOptionPane.showMessageDialog(null, "Não há elemento neste indice !");//Com o uso do JTable esse tratamento se torna desnecessário. // Em versões anteriores era necessário.
                        }
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Inserção inválida!");//Com o uso do JTable esse tratamento se torna desnecessário. // Em versões anteriores era necessário.
                }                                                             //Entretanto tornam a classe mais flexivel.
            }
        }
    }
    public static void    RemoveAll(ArrayList<Animal> l_animal) {
        //remove todos os elementos da lista.         
        if (!Insert_Dialog.isVisible()) { 
            l_animal.clear();
            Print_list(l_animal);
        }   
    }
    public static void    GenerateLOG(ArrayList<Animal> l_animal) {
        try {
            String path;
            JFileChooser f = new JFileChooser(); // Cria o File Chooser
            f.setDialogTitle("Salvar LOG");
            f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //Configura-o para mostrar somente diretórios

            if (f.showSaveDialog(null) != JFileChooser.CANCEL_OPTION) { // Se opção cancelar for escolhida é tratada a execeção;
                if (PlatformUtil.isWindows()) { //Percebe se a plataforma usada é windows, se sim, trata a string com o caminho do arquivo para o padão windows, \\ = contra-barra \\\\ = dupla contra-barra
                    path = f.getSelectedFile().toString().concat("\\PetLOG.txt"); //concatena o o nome e extenção do arquivo. \\TODO pedir ao usuário o nome do arquivo.
                    path = path.replace("\\", "\\\\");
                    WriteToDisk(path, l_animal); // função que escreve no arquivo
                } else if (PlatformUtil.isLinux()) { // se sim, trata a string para o padrão linux.
                    path = f.getSelectedFile().toString().concat("/PetLOG.txt"); //concatena o o nome e extenção do arquivo. \\TODO pedir ao usuário o nome do arquivo.
                    WriteToDisk(path, l_animal);
                }
            } else {
                System.err.println("Ação cancelada pelo usuário");
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar gerar o arquivo. Garanta permissões de usuário."); //Caso a função retorne uma execeção de entrada ou saída o programa informa o usuário.
            System.err.println("Exception " + e); // Geralmente causada por falta de privilégios por parte do usuário, tentar escrever o arquivo em locais protegidos ou ainda falta de espaço em disco.
        }
    }
    public static void    setDialogClean() {
        //Simplesmente define os campos do Insert_Dialog como vazios;
        Animal_idade.setSelectedIndex(0);
        Animal_name.setText("");
        Animal_peso.setText("");
        Animal_sexo.setSelectedIndex(0);
        Pessoa_mensalidade.setText("");
        Pessoa_idade.setSelectedIndex(0);
        Pessoa_nome.setText("");
        Pessoa_sexo.setSelectedIndex(0);
    }
    public static void    Confirm_selection(ArrayList<Animal> l_animal, int index) {
        //Chama os métodos adequados de acordo com o modo escolhido.
        if (!edit) {//Modo edição
            Control.Insert_list(l_animal);
            Control.Print_list(l_animal);
            Control.setDialogClean();
        } else { //Modo Inserção.
            Control.Insert_list(l_animal, GUI.index);
            Control.Print_list(l_animal);
        }
        GUI.Insert_Dialog.dispose();//Esconde o Insert_Dialog.
    }
    public static void    CheckForEdit(ArrayList<Animal> l_animal, int index) {
        //Trata possiveis execeções causadas por dados inesperados na entrada de usuários.
        if (!GUI.Insert_Dialog.isVisible()) {
            if (l_animal.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não há dados cadastrados!");
            } else {
                try {    
                    GUI.index = JTable_animais.getSelectedRow();
                    if(index != -1){
                        if (index < l_animal.size() && GUI.index >= 0) { //Com o uso do JTable esse tratamento se torna desnecessário. // Em versões anteriores era necessário.
                            GUI.edit = true;
                            Control.backupFromArray(l_animal, GUI.index);
                            GUI.Insert_Dialog.setTitle("Editar");
                            GUI.Insert_Dialog.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Não há elemento neste indice !"); //Com o uso do JTable esse tratamento se torna desnecessário. // Em versões anteriores era necessário.
                        }
                    }
                } catch (NumberFormatException ex) {
                    System.err.println("L-68, GUIC.java, usuário pressionou cancelar, ou digitou caractere inválido.\n" + ex);
                }
            }
        }
    }
    public static void    credits() {
        JOptionPane.showMessageDialog(null, "20161STADS0233, Victor Nascimento.", "Sobre", JOptionPane.INFORMATION_MESSAGE); // Eu.
    }
    public static void GenerateStatistics(ArrayList<Animal> l_animal) {
        Estatistica est = new Estatistica();
        if(!l_animal.isEmpty() && !Statistics_Dialog.isVisible()){
            DecimalFormat df = new DecimalFormat("0.##");
            md_idade_total.setText(df.format(est.CalcMedIdade_animal(l_animal)));
            peso_md_geral.setText(df.format(est.CalcMedPeso(l_animal)));
            peso_md_femea.setText(df.format(est.CalcMedPesoGenero(l_animal, 1)));
            peso_md_macho.setText(df.format(est.CalcMedPesoGenero(l_animal, 0)));
            soma_total_custo.setText(df.format(est.CalcCustoTotal(l_animal)));
            md_gasto_geral.setText(df.format(est.CalcCustoMedAnimal(l_animal)));
            custo_media_femea.setText(df.format(est.CalcCustoMedGeneroAnimal(l_animal, 1)));
            custo_media_macho.setText(df.format(est.CalcCustoMedGeneroAnimal(l_animal, 0)));
            custo_total_femea.setText(df.format(est.CalcCustoTotalGenero(l_animal, 1)));
            custo_total_macho.setText(df.format(est.CalcCustoTotalGenero(l_animal, 0)));
            pct_macho.setText(df.format(est.CalcPctGeneroAnimal(l_animal, 0)));
            pct_femea.setText(df.format(est.CalcPctGeneroAnimal(l_animal, 1)));
            
            pessoa_md_idade.setText(df.format(est.CalcMediaIdadePessoa(l_animal)));
            mulher_md_idade.setText(df.format(est.MediaIdadeGenero(l_animal, 1)));
            homem_md_idade.setText(df.format(est.MediaIdadeGenero(l_animal, 0)));
            
            pct_homem.setText(df.format(est.CalcPctPessoa(l_animal, 0)));
            pct_mulher.setText(df.format(est.CalcPctPessoa(l_animal, 1)));
            
            pref_mulher.setText(est.CalcPreferencia(l_animal, 1));
            prefe_homem.setText(est.CalcPreferencia(l_animal, 0));
            md_mes_homem.setText(df.format(est.CalcMediaGastosPessoa(l_animal, 0)));
            md_mes_mulher.setText(df.format(est.CalcMediaGastosPessoa(l_animal, 1)));
            
            Statistics_Dialog.setVisible(true);
        }
    }
}
