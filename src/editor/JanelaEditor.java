package editor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class JanelaEditor extends JFrame implements ComponentListener {
    private JPanel tabuleiro;
    private JPanel background;
    private JPanel painel;
    private GridLayout tabuleirao;
    private BorderLayout teste;
    private GridLayout selecao;

    private static int COMPRIMENTO = 800;
    private static int LARGURA = 600;
    private static int TAM_BOTAO = LARGURA/10;
    private static int QTD_BOTAO = 5;

    private JButton[][] botoes = new JButton[QTD_BOTAO][QTD_BOTAO];

    public JanelaEditor(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 50, COMPRIMENTO, LARGURA);

        // --- Iniciando atributos:
        this.addComponentListener(this);
        this.setResizable(false);
        tabuleirao = new GridLayout(QTD_BOTAO, QTD_BOTAO);
        teste = new BorderLayout();
        background = new JPanel();
        tabuleiro = new JPanel();
        painel = new JPanel();
        selecao = new GridLayout(6, 1);
        selecao.setHgap(10);

        // --- Estilizando
        painel.setPreferredSize(new Dimension(COMPRIMENTO/5, LARGURA));
        tabuleiro.setPreferredSize(new Dimension(TAM_BOTAO*10, TAM_BOTAO*10));
        background.setLayout(teste);
        tabuleiro.setLayout(tabuleirao);
        painel.setLayout(selecao);
        background.add(tabuleiro, BorderLayout.CENTER);
        background.add(painel, BorderLayout.SOUTH);




    }

    @Override
    public void componentResized(ComponentEvent e) {

    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }
}
