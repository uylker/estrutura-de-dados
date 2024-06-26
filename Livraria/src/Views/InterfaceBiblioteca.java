package Views;

import Funçoes.Ordena;
import LisArv.ArvBi;
import LisArv.IntNoSimples;
import LisArv.ListaEncadeada;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Uylker
 */
public class InterfaceBiblioteca extends javax.swing.JFrame {

    private ListaEncadeada listaEn = new ListaEncadeada();
    private ArvBi arv = new ArvBi();
    private ListaEncadeada carrinho = new ListaEncadeada();

    String[] opcoes = {"Saida", "Cadastro de Livro", "Livros cadastrados", "Selecionar o Livro", "Carrinho", "Remove Livro", "Comprar Livro", "Atualizar Livro Cadastrado"};
    String[] genOpcoes = {"Drama", "Ficção", "Romance", "Terror", "Ação", "Comédia", "Suspense", "Outros"};

    /**
     * Creates new form InterfaceBiblioteca
     */
    public InterfaceBiblioteca() {
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            scaledImage();
        } catch (IOException ex) {

        }
    }

    public void scaledImage() throws IOException {
        BufferedImage originalImage1 = ImageIO.read(new File("src/Imagens/imagembiblioteca_1.jpg"));

        Image imgScale = originalImage1.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon sclimg1 = new ImageIcon(imgScale);
        img.setIcon(sclimg1);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carrinhocompras = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        livroscadastrados = new javax.swing.JButton();
        cadastrarlivro = new javax.swing.JButton();
        removerlivro = new javax.swing.JButton();
        comprarlivro = new javax.swing.JButton();
        atualizarlivros = new javax.swing.JButton();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(814, 470));
        getContentPane().setLayout(null);

        carrinhocompras.setBackground(new java.awt.Color(102, 255, 255));
        carrinhocompras.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        carrinhocompras.setForeground(new java.awt.Color(0, 0, 0));
        carrinhocompras.setText("CARRINHO DE COMPRAS");
        carrinhocompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhocomprasActionPerformed(evt);
            }
        });
        getContentPane().add(carrinhocompras);
        carrinhocompras.setBounds(440, 100, 340, 51);

        sair.setBackground(new java.awt.Color(255, 51, 51));
        sair.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        sair.setForeground(new java.awt.Color(0, 0, 0));
        sair.setText("SAIR");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        getContentPane().add(sair);
        sair.setBounds(60, 340, 720, 50);

        livroscadastrados.setBackground(new java.awt.Color(102, 255, 255));
        livroscadastrados.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        livroscadastrados.setForeground(new java.awt.Color(0, 0, 0));
        livroscadastrados.setText("LIVROS CADASTRADOS");
        livroscadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livroscadastradosActionPerformed(evt);
            }
        });
        getContentPane().add(livroscadastrados);
        livroscadastrados.setBounds(60, 160, 340, 50);

        cadastrarlivro.setBackground(new java.awt.Color(102, 255, 255));
        cadastrarlivro.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cadastrarlivro.setForeground(new java.awt.Color(0, 0, 0));
        cadastrarlivro.setText("CADASTRAR LIVRO");
        cadastrarlivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarlivroActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarlivro);
        cadastrarlivro.setBounds(60, 100, 340, 50);

        removerlivro.setBackground(new java.awt.Color(102, 255, 255));
        removerlivro.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        removerlivro.setForeground(new java.awt.Color(0, 0, 0));
        removerlivro.setText("REMOVER LIVRO");
        removerlivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerlivroActionPerformed(evt);
            }
        });
        getContentPane().add(removerlivro);
        removerlivro.setBounds(440, 160, 340, 51);

        comprarlivro.setBackground(new java.awt.Color(102, 255, 255));
        comprarlivro.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        comprarlivro.setForeground(new java.awt.Color(0, 0, 0));
        comprarlivro.setText("COMPRAR LIVRO");
        comprarlivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarlivroActionPerformed(evt);
            }
        });
        getContentPane().add(comprarlivro);
        comprarlivro.setBounds(440, 220, 340, 51);

        atualizarlivros.setBackground(new java.awt.Color(102, 255, 255));
        atualizarlivros.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        atualizarlivros.setForeground(new java.awt.Color(0, 0, 0));
        atualizarlivros.setText("ATUALIZAR LIVROS");
        atualizarlivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarlivrosActionPerformed(evt);
            }
        });
        getContentPane().add(atualizarlivros);
        atualizarlivros.setBounds(60, 220, 340, 50);
        getContentPane().add(img);
        img.setBounds(0, 0, 820, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carrinhocomprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrinhocomprasActionPerformed
        int livroSelecionado;
        if (arv.size() != 0) {
            String var = "";
            int idCarrinho = 0;
            for (int i = 0; i < arv.size(); i++) {
                var += i + " - " + arv.search(i, 1) + " - " + arv.search(i, 2)
                        + " - Quantidade: " + listaEn.buscaNo(i) + "\n";
            }

            livroSelecionado = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione o ID do Livro \n" + var, "Seleção de livros", JOptionPane.PLAIN_MESSAGE));

            int qntDeLivroSelecionado = 0;
            qntDeLivroSelecionado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade desejada"));
            if (qntDeLivroSelecionado > listaEn.buscaNo(livroSelecionado)) {
                do {
                    qntDeLivroSelecionado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente"
                            + " a quantidade desejada"));
                } while (qntDeLivroSelecionado > listaEn.buscaNo(livroSelecionado));
            }

            listaEn.alteraNo(livroSelecionado, (listaEn.buscaNo(livroSelecionado) - qntDeLivroSelecionado));
            carrinho.insereNo_fim(new IntNoSimples(idCarrinho, arv.search(livroSelecionado, 1), qntDeLivroSelecionado));

        } else {
            JOptionPane.showMessageDialog(null, "Livraria Vazia");
        }
    }//GEN-LAST:event_carrinhocomprasActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        this.dispose();
        JOptionPane.showMessageDialog(null, "Obrigado pela preferência!", "Livraria", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_sairActionPerformed

    private void livroscadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livroscadastradosActionPerformed
        int ordenaPosicao = 0;
        do {
            String[] opcoesDeOrdenacao = {"Padrão", "Alfabetica", "Voltar"};
            ordenaPosicao = JOptionPane.showOptionDialog(null, "Escolha a opção desejada", "Livraria", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesDeOrdenacao, null);

            switch (ordenaPosicao) {
                case 0 -> {
                    if (arv.size() != 0) {

                        Ordena od = new Ordena();

                        JOptionPane.showMessageDialog(null, od.padrao(arv, listaEn));
                    } else {
                        JOptionPane.showMessageDialog(null, "Livraria Vazia");
                    }
                }
                case 1 -> {
                    if (arv.size() != 0) {

                        Ordena od = new Ordena();

                        JOptionPane.showMessageDialog(null, od.alfabetica(arv, listaEn));

                    } else {
                        JOptionPane.showMessageDialog(null, "Livraria Vazia");
                    }
                }
                case 2 -> {
                }
            }
        } while (ordenaPosicao != 2);
    }//GEN-LAST:event_livroscadastradosActionPerformed
    private int id = 0;
    private void cadastrarlivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarlivroActionPerformed

        String nomeLivro = String.valueOf(JOptionPane.showInputDialog(null, "Nome do livro", "Cadastro do Livro", JOptionPane.PLAIN_MESSAGE));
        int quantidadeLivro = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de exemplares", "Cadastro do Livro", JOptionPane.PLAIN_MESSAGE));
        listaEn.insereNo_fim(new IntNoSimples(id, quantidadeLivro));

        String priGenero = null;
        int genero = 1;
        genero = JOptionPane.showOptionDialog(null, "Escolha o gênero do livro", "Livraria", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, genOpcoes, null);

        switch (genero) {
            case 0 ->
                priGenero = "Drama";
            case 1 ->
                priGenero = "Ficção";
            case 2 ->
                priGenero = "Romance";
            case 3 ->
                priGenero = "Terror";
            case 4 ->
                priGenero = "Ação";
            case 5 ->
                priGenero = "Comédia";
            case 6 ->
                priGenero = "Suspense";
            case 7 ->
                priGenero = "Outros";
        }

        arv.insert(id, nomeLivro, priGenero);
        id++;

    }//GEN-LAST:event_cadastrarlivroActionPerformed

    private void removerlivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerlivroActionPerformed
        int idParaExclusao;
        String excluirID = "";
        for (int i = 0; i < carrinho.ContarNos(); i++) {
            excluirID += "Id: " + i + "\n" + "Nome: " + carrinho.buscaNome(i) + "\n" + "Quantidade: " + carrinho.buscaNo(i) + "\n";
        }

        idParaExclusao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do livro que deseja excluir: \n"
                + excluirID));

        if (carrinho.ContarNos() > idParaExclusao) {
            carrinho.excluiNo(idParaExclusao);
        }
    }//GEN-LAST:event_removerlivroActionPerformed

    private void comprarlivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarlivroActionPerformed
        for (int i = 0; i < carrinho.ContarNos(); i++) {
            carrinho.excluiNo(i);
        }
        JOptionPane.showMessageDialog(null, "Livros comprados com sucesso");
    }//GEN-LAST:event_comprarlivroActionPerformed

    private void atualizarlivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarlivrosActionPerformed
        if (arv.size() != 0) {
            String[] opcaoDeAtt = {"Nome", "Genero", "Quantidade"};
            String LivrosCadastrados = "";
            for (int i = 0; i < arv.size(); i++) {
                LivrosCadastrados += "ID: " + i + ", NOME: " + arv.search(i, 1) + ", GÊNERO: " + arv.search(i, 2)
                        + ", QUANTIDADE: " + listaEn.buscaNo(i) + "\n";
            }

            int idParaAtt = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione o ID do livro em que você deseja atualizar: \n" + LivrosCadastrados));
            String lvSelPAtt = "ID: " + idParaAtt + ", Nome" + arv.search(idParaAtt, 1) + ", Genero" + arv.search(idParaAtt, 2);

            int lvPAtt = JOptionPane.showOptionDialog(null, "Selecione o que você deseja atualizar do livro: \n" + lvSelPAtt, "Livraria", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcaoDeAtt, null);

            switch (lvPAtt) {
                case 0:
                    String mNomeLivro = String.valueOf(JOptionPane.showInputDialog("Digite o novo nome do livro"));

                    arv.updateNome(idParaAtt, mNomeLivro);

                    break;
                case 1:
                    String genSel = "";
                    int nGenero = 1;
                    nGenero = JOptionPane.showOptionDialog(null, "Escolha o gênero do livro", "Livraria", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, genOpcoes, null);

                    switch (nGenero) {
                        case 0:
                            genSel = "Drama";
                            break;
                        case 1:
                            genSel = "Ficção";
                            break;
                        case 2:
                            genSel = "Romance";
                            break;
                        case 3:
                            genSel = "Terror";
                            break;
                        case 4:
                            genSel = "Ação";
                            break;
                        case 5:
                            genSel = "Comédia";
                            break;
                        case 6:
                            genSel = "Suspense";
                            break;
                        case 7:
                            genSel = "Outros";
                            break;
                    }
                    arv.updateGenero(idParaAtt, genSel);
                    break;
                case 2:

                    int novaQuantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade"));

                    listaEn.atualizarQuantidade(idParaAtt, novaQuantidade);

                    break;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Livraria Vazia");
        }

    }//GEN-LAST:event_atualizarlivrosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceBiblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceBiblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarlivros;
    private javax.swing.JButton cadastrarlivro;
    private javax.swing.JButton carrinhocompras;
    private javax.swing.JButton comprarlivro;
    private javax.swing.JLabel img;
    private javax.swing.JButton livroscadastrados;
    private javax.swing.JButton removerlivro;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
