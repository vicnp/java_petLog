package GUI;
import Control.Control;
import Objects.Animal;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 * @date 28/09/2017 - 04:35
 * @version 5
 * @author Victor Nascimento
 */
public class GUI extends javax.swing.JFrame {
    ArrayList<Animal> l_animal = new ArrayList<>();
    public static boolean edit;
    public static int index;
    
    public GUI() {
        initComponents();
        setIcon();
        configDialogs();
        setLocationRelativeTo(null);
    }
    public void configDialogs() {
        Toolkit toolkit =  Toolkit.getDefaultToolkit ();
        Dimension dim = toolkit.getScreenSize();
        Dimension inserSize = new Dimension(630,330);
        Insert_Dialog.setMinimumSize(inserSize);
        Insert_Dialog.setSize((int)(dim.width*0.3), (int)(dim.height*0.3));
        Insert_Dialog.setTitle("Inserir");
        Insert_Dialog.setLocationRelativeTo(null);
        Insert_Dialog.setResizable(false);
        
        Statistics_Dialog.setMinimumSize(inserSize);
        Statistics_Dialog.setSize((int)(dim.width*0.35),(int)(dim.height*0.3));
        Statistics_Dialog.setTitle("Sobre os dados");
        Statistics_Dialog.setLocationRelativeTo(null);
        Statistics_Dialog.setResizable(false);
    }
    public void setIcon() {
        Image i;
        try {
            i = ImageIO.read(getClass().getResource("/Imgs/FavIcon.png"));
            setIconImage(i);
        } catch (IOException ex) {
            System.err.println("Icon error"+ex);
        }
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Insert_Dialog = new javax.swing.JDialog();
        Animal = new javax.swing.JPanel();
        Nome = new javax.swing.JLabel();
        Idade = new javax.swing.JLabel();
        Sexo = new javax.swing.JLabel();
        Peso = new javax.swing.JLabel();
        Animal_sexo = new javax.swing.JComboBox<>();
        Animal_name = new javax.swing.JTextField();
        Animal_peso = new javax.swing.JTextField();
        Animal_idade = new javax.swing.JComboBox<>();
        PetLogo = new javax.swing.JLabel();
        Proprietario = new javax.swing.JPanel();
        Nome_pessoa = new javax.swing.JLabel();
        Idade_pessoa = new javax.swing.JLabel();
        Sexo_pessoa = new javax.swing.JLabel();
        Pessoa_sexo = new javax.swing.JComboBox<>();
        Pessoa_nome = new javax.swing.JTextField();
        Pessoa_idade = new javax.swing.JComboBox<>();
        Confirmar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        Mensalidade = new javax.swing.JLabel();
        Pessoa_mensalidade = new javax.swing.JTextField();
        UserLogo = new javax.swing.JLabel();
        MenuPopUp = new javax.swing.JPopupMenu();
        Remove_all = new javax.swing.JMenuItem();
        Statistics_Dialog = new javax.swing.JDialog();
        S_animal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        md_idade_total = new javax.swing.JLabel();
        pct_macho = new javax.swing.JLabel();
        pct_femea = new javax.swing.JLabel();
        peso_md_geral = new javax.swing.JLabel();
        peso_md_femea = new javax.swing.JLabel();
        peso_md_macho = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        soma_total_custo = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        md_gasto_geral = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        custo_total_femea = new javax.swing.JLabel();
        custo_total_macho = new javax.swing.JLabel();
        custo_media_femea = new javax.swing.JLabel();
        custo_media_macho = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        S_pessoa = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pessoa_md_idade = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pct_homem = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pct_mulher = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        homem_md_idade = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        mulher_md_idade = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        prefe_homem = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        pref_mulher = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        md_mes_homem = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        md_mes_mulher = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        Inserir = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_animais = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        Programa = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenuItem();
        Arquivo = new javax.swing.JMenu();
        Salvar = new javax.swing.JMenuItem();

        Insert_Dialog.setResizable(false);

        Animal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Animal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        Nome.setText("Nome:");

        Idade.setText("Idade:");

        Sexo.setText("Sexo:");

        Peso.setText("Peso(KG):");

        Animal_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Femea" }));

        Animal_idade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "29", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" }));

        PetLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/PETLOGO.png"))); // NOI18N
        PetLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout AnimalLayout = new javax.swing.GroupLayout(Animal);
        Animal.setLayout(AnimalLayout);
        AnimalLayout.setHorizontalGroup(
            AnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnimalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PetLogo))
                    .addGroup(AnimalLayout.createSequentialGroup()
                        .addGroup(AnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Peso)
                            .addComponent(Nome)
                            .addGroup(AnimalLayout.createSequentialGroup()
                                .addGroup(AnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AnimalLayout.createSequentialGroup()
                                        .addComponent(Sexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(AnimalLayout.createSequentialGroup()
                                        .addComponent(Idade)
                                        .addGap(6, 6, 6)))
                                .addGroup(AnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Animal_idade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Animal_sexo, 0, 78, Short.MAX_VALUE)))
                            .addComponent(Animal_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Animal_name, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );

        AnimalLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Animal_name, Animal_peso});

        AnimalLayout.setVerticalGroup(
            AnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Animal_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Peso)
                .addGap(3, 3, 3)
                .addComponent(Animal_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Idade)
                    .addComponent(Animal_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sexo)
                    .addComponent(Animal_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PetLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Proprietario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Proprietário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        Nome_pessoa.setText("Nome:");

        Idade_pessoa.setText("Idade:");

        Sexo_pessoa.setText("Sexo:");

        Pessoa_sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        Pessoa_idade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "29", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        Mensalidade.setText("Mensalidade:");

        UserLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/USERLOGO.png"))); // NOI18N

        javax.swing.GroupLayout ProprietarioLayout = new javax.swing.GroupLayout(Proprietario);
        Proprietario.setLayout(ProprietarioLayout);
        ProprietarioLayout.setHorizontalGroup(
            ProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProprietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome_pessoa)
                    .addGroup(ProprietarioLayout.createSequentialGroup()
                        .addGroup(ProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProprietarioLayout.createSequentialGroup()
                                .addComponent(Idade_pessoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(ProprietarioLayout.createSequentialGroup()
                                .addComponent(Sexo_pessoa)
                                .addGap(14, 14, 14)))
                        .addGroup(ProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Pessoa_sexo, 0, 75, Short.MAX_VALUE)
                            .addComponent(Pessoa_idade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Mensalidade)
                    .addComponent(Pessoa_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pessoa_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProprietarioLayout.createSequentialGroup()
                        .addComponent(UserLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Confirmar)
                        .addGap(18, 18, 18)
                        .addComponent(Cancelar)))
                .addContainerGap())
        );
        ProprietarioLayout.setVerticalGroup(
            ProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProprietarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nome_pessoa)
                .addGap(7, 7, 7)
                .addComponent(Pessoa_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mensalidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pessoa_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Idade_pessoa)
                    .addComponent(Pessoa_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sexo_pessoa)
                    .addComponent(Pessoa_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProprietarioLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(ProprietarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cancelar)
                            .addComponent(Confirmar)))
                    .addGroup(ProprietarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(UserLogo)))
                .addContainerGap())
        );

        javax.swing.GroupLayout Insert_DialogLayout = new javax.swing.GroupLayout(Insert_Dialog.getContentPane());
        Insert_Dialog.getContentPane().setLayout(Insert_DialogLayout);
        Insert_DialogLayout.setHorizontalGroup(
            Insert_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Insert_DialogLayout.createSequentialGroup()
                .addComponent(Animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Proprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Insert_DialogLayout.setVerticalGroup(
            Insert_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Animal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Proprietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Remove_all.setText("Remover todos");
        Remove_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_allActionPerformed(evt);
            }
        });
        MenuPopUp.add(Remove_all);

        S_animal.setBorder(javax.swing.BorderFactory.createTitledBorder("Sobre os animais"));

        jLabel1.setText("Média de idade:");

        jLabel3.setText("% dos animais são macho e ");

        jLabel5.setText("% são fêmea");

        jLabel2.setText("anos.");

        jLabel4.setText("O peso médio geral dos animais é de:");

        jLabel7.setText("Kg");

        jLabel8.setText("O peso médio das fêmeas é:");

        jLabel9.setText("Kg");

        jLabel6.setText("O peso médio dos machos é:");

        jLabel11.setText("Kg");

        md_idade_total.setText("0");

        pct_macho.setText("0");

        pct_femea.setText("0");

        peso_md_geral.setText("0");

        peso_md_femea.setText("0");

        peso_md_macho.setText("0");

        jLabel10.setText("O custo total de todos os animais é:");

        soma_total_custo.setText("0");

        jLabel20.setText("Reais");

        jLabel21.setText("O custo médio dos animais é:");

        md_gasto_geral.setText("0");

        jLabel23.setText("Reais");

        jLabel24.setText("O custo total das fêmeas é:");

        jLabel25.setText("O custo total dos machos é:");

        jLabel26.setText("O custo médio das fêmeas é:");

        jLabel27.setText("O custo médio dos machos é:");

        custo_total_femea.setText("0");

        custo_total_macho.setText("0");

        custo_media_femea.setText("0");

        custo_media_macho.setText("0");

        jLabel28.setText("Reais");

        jLabel29.setText("Reais");

        jLabel30.setText("Reais");

        jLabel32.setText("Reais");

        javax.swing.GroupLayout S_animalLayout = new javax.swing.GroupLayout(S_animal);
        S_animal.setLayout(S_animalLayout);
        S_animalLayout.setHorizontalGroup(
            S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(S_animalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(S_animalLayout.createSequentialGroup()
                        .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(S_animalLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(md_idade_total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(S_animalLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peso_md_femea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(S_animalLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peso_md_macho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(S_animalLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(soma_total_custo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20))
                            .addGroup(S_animalLayout.createSequentialGroup()
                                .addComponent(pct_macho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2)
                                .addComponent(pct_femea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(S_animalLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custo_total_femea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel28))
                            .addGroup(S_animalLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custo_total_macho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29))
                            .addGroup(S_animalLayout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custo_media_femea)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30))
                            .addGroup(S_animalLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custo_media_macho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)))
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(S_animalLayout.createSequentialGroup()
                        .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(S_animalLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(peso_md_geral)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(S_animalLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(md_gasto_geral)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        S_animalLayout.setVerticalGroup(
            S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(S_animalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(md_idade_total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(pct_macho)
                    .addComponent(pct_femea))
                .addGap(4, 4, 4)
                .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(peso_md_geral))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(peso_md_femea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(peso_md_macho))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(soma_total_custo)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(md_gasto_geral)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(custo_total_femea)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(custo_total_macho)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(custo_media_femea)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(custo_media_macho)
                    .addComponent(jLabel32))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        S_pessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Sobre as pessoas"));

        jLabel12.setText("Média de idade:");

        pessoa_md_idade.setText("0");

        jLabel14.setText("anos.");

        pct_homem.setText("0");

        jLabel15.setText("% são homens e ");

        pct_mulher.setText("0");

        jLabel17.setText("% são mulheres");

        jLabel18.setText("Média de idade dos homens:");

        homem_md_idade.setText("0");

        jLabel22.setText("Média de idade das mulheres:");

        mulher_md_idade.setText("0");

        jLabel33.setText("Homens preferem animal:");

        prefe_homem.setText("Macho");

        jLabel35.setText("Mulheres preferem animal:");

        pref_mulher.setText("Fêmea");

        jLabel37.setText("Homens gastam em média");

        md_mes_homem.setText("0");

        jLabel39.setText("/mês");

        jLabel40.setText("Mulheres gastam em média");

        md_mes_mulher.setText("0");

        jLabel42.setText("/mês");

        javax.swing.GroupLayout S_pessoaLayout = new javax.swing.GroupLayout(S_pessoa);
        S_pessoa.setLayout(S_pessoaLayout);
        S_pessoaLayout.setHorizontalGroup(
            S_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(S_pessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(S_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(S_pessoaLayout.createSequentialGroup()
                        .addComponent(pct_homem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pct_mulher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addGroup(S_pessoaLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mulher_md_idade))
                    .addGroup(S_pessoaLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prefe_homem))
                    .addGroup(S_pessoaLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(md_mes_homem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39))
                    .addGroup(S_pessoaLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pref_mulher))
                    .addGroup(S_pessoaLayout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(md_mes_mulher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42))
                    .addGroup(S_pessoaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pessoa_md_idade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(S_pessoaLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homem_md_idade)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        S_pessoaLayout.setVerticalGroup(
            S_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(S_pessoaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(S_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pessoa_md_idade)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pct_homem)
                    .addComponent(jLabel15)
                    .addComponent(pct_mulher)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(homem_md_idade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(mulher_md_idade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prefe_homem)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(pref_mulher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(md_mes_homem)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(S_pessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(md_mes_mulher)
                    .addComponent(jLabel42))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Statistics_DialogLayout = new javax.swing.GroupLayout(Statistics_Dialog.getContentPane());
        Statistics_Dialog.getContentPane().setLayout(Statistics_DialogLayout);
        Statistics_DialogLayout.setHorizontalGroup(
            Statistics_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Statistics_DialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(S_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(S_pessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Statistics_DialogLayout.setVerticalGroup(
            Statistics_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Statistics_DialogLayout.createSequentialGroup()
                .addGroup(Statistics_DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(S_pessoa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(S_animal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PetLog");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        Inserir.setText("Inserir");
        Inserir.setToolTipText("Inserir animal");
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.setToolTipText("Selecione uma linha para editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Remover.setText("Remover");
        Remover.setToolTipText("Selecione uma linha para ser removida");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        JTable_animais.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome do Pet", "Idade", "Peso", "Sexo", "Custo", "Nome Dono", "Idade dono", "Sexo dono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_animais.setToolTipText("Dados dos animais cadastrados.");
        JTable_animais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTable_animais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JTable_animaisMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(JTable_animais);
        if (JTable_animais.getColumnModel().getColumnCount() > 0) {
            JTable_animais.getColumnModel().getColumn(0).setMinWidth(35);
            JTable_animais.getColumnModel().getColumn(0).setPreferredWidth(30);
            JTable_animais.getColumnModel().getColumn(0).setMaxWidth(100);
            JTable_animais.getColumnModel().getColumn(1).setMinWidth(100);
            JTable_animais.getColumnModel().getColumn(1).setPreferredWidth(200);
            JTable_animais.getColumnModel().getColumn(2).setMinWidth(30);
            JTable_animais.getColumnModel().getColumn(2).setPreferredWidth(50);
            JTable_animais.getColumnModel().getColumn(2).setMaxWidth(50);
            JTable_animais.getColumnModel().getColumn(3).setPreferredWidth(50);
            JTable_animais.getColumnModel().getColumn(4).setResizable(false);
            JTable_animais.getColumnModel().getColumn(4).setPreferredWidth(50);
            JTable_animais.getColumnModel().getColumn(5).setMinWidth(50);
            JTable_animais.getColumnModel().getColumn(5).setPreferredWidth(80);
            JTable_animais.getColumnModel().getColumn(5).setMaxWidth(100);
            JTable_animais.getColumnModel().getColumn(6).setMinWidth(100);
            JTable_animais.getColumnModel().getColumn(6).setPreferredWidth(200);
            JTable_animais.getColumnModel().getColumn(7).setResizable(false);
            JTable_animais.getColumnModel().getColumn(8).setPreferredWidth(70);
        }

        jButton1.setText("Estatistica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Menu.setToolTipText("Menu");

        Programa.setText("Programa");

        Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Programa.add(Sair);

        Sobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        Sobre.setText("Sobre");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        Programa.add(Sobre);

        Menu.add(Programa);

        Arquivo.setText("Salvar");

        Salvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Salvar.setText("Gerar LOG");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });
        Arquivo.add(Salvar);

        Menu.add(Arquivo);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Inserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Remover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Inserir)
                        .addGap(18, 18, 18)
                        .addComponent(Editar)
                        .addGap(18, 18, 18)
                        .addComponent(Remover)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        edit = false;
        Control.setDialogClean();
        Insert_Dialog.setTitle("Inserir");
        Insert_Dialog.setVisible(true); 
    }//GEN-LAST:event_InserirActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        Control.Confirm_selection(l_animal, index);
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
       Insert_Dialog.dispose();
       Control.setDialogClean();
    }//GEN-LAST:event_CancelarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        Control.CheckForEdit(l_animal,index);
    }//GEN-LAST:event_EditarActionPerformed

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
       Control.Remove_list(l_animal);
    }//GEN-LAST:event_RemoverActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        Control.GenerateLOG(l_animal);
    }//GEN-LAST:event_SalvarActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        Control.credits();
    }//GEN-LAST:event_SobreActionPerformed

    private void Remove_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_allActionPerformed
       Control.RemoveAll(l_animal);
    }//GEN-LAST:event_Remove_allActionPerformed

    private void JTable_animaisMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_animaisMouseReleased
       if(evt.isPopupTrigger()){
          MenuPopUp.show(JTable_animais, evt.getX(), evt.getY());
       }
    }//GEN-LAST:event_JTable_animaisMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Control.GenerateStatistics(l_animal);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Animal;
    public static javax.swing.JComboBox<String> Animal_idade;
    public static javax.swing.JTextField Animal_name;
    public static javax.swing.JTextField Animal_peso;
    public static javax.swing.JComboBox<String> Animal_sexo;
    private javax.swing.JMenu Arquivo;
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Confirmar;
    private javax.swing.JButton Editar;
    private javax.swing.JLabel Idade;
    private javax.swing.JLabel Idade_pessoa;
    private javax.swing.JButton Inserir;
    public static javax.swing.JDialog Insert_Dialog;
    public static javax.swing.JTable JTable_animais;
    private javax.swing.JLabel Mensalidade;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JPopupMenu MenuPopUp;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Nome_pessoa;
    private javax.swing.JLabel Peso;
    public static javax.swing.JComboBox<String> Pessoa_idade;
    public static javax.swing.JTextField Pessoa_mensalidade;
    public static javax.swing.JTextField Pessoa_nome;
    public static javax.swing.JComboBox<String> Pessoa_sexo;
    private javax.swing.JLabel PetLogo;
    private javax.swing.JMenu Programa;
    private javax.swing.JPanel Proprietario;
    private javax.swing.JMenuItem Remove_all;
    private javax.swing.JButton Remover;
    private javax.swing.JPanel S_animal;
    private javax.swing.JPanel S_pessoa;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem Salvar;
    private javax.swing.JLabel Sexo;
    private javax.swing.JLabel Sexo_pessoa;
    private javax.swing.JMenuItem Sobre;
    public static javax.swing.JDialog Statistics_Dialog;
    private javax.swing.JLabel UserLogo;
    public static javax.swing.JLabel custo_media_femea;
    public static javax.swing.JLabel custo_media_macho;
    public static javax.swing.JLabel custo_total_femea;
    public static javax.swing.JLabel custo_total_macho;
    public static javax.swing.JLabel homem_md_idade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel md_gasto_geral;
    public static javax.swing.JLabel md_idade_total;
    public static javax.swing.JLabel md_mes_homem;
    public static javax.swing.JLabel md_mes_mulher;
    public static javax.swing.JLabel mulher_md_idade;
    public static javax.swing.JLabel pct_femea;
    public static javax.swing.JLabel pct_homem;
    public static javax.swing.JLabel pct_macho;
    public static javax.swing.JLabel pct_mulher;
    public static javax.swing.JLabel peso_md_femea;
    public static javax.swing.JLabel peso_md_geral;
    public static javax.swing.JLabel peso_md_macho;
    public static javax.swing.JLabel pessoa_md_idade;
    public static javax.swing.JLabel pref_mulher;
    public static javax.swing.JLabel prefe_homem;
    public static javax.swing.JLabel soma_total_custo;
    // End of variables declaration//GEN-END:variables
}
