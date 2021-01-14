
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Adrian
 */
public class ChessUI extends javax.swing.JFrame {

    // initalize arrays
    
    // square A8 is [0][0], square B8 is [0][1], square A7 is [1][0] in the array.
    private JButton[][] boardSquares = new JButton[8][8];
    private Image[][] pieceImages = new Image[2][6];
    private String message = "White to move";
    private static final String COLUMNS = "ABCDEFGH";
    public static final int QUEEN = 0, KING = 1, ROOK = 2, KNIGHT = 3, BISHOP = 4, PAWN = 5;
        public static final int[] STARTING_ROW = {ROOK, KNIGHT, BISHOP, QUEEN, KING, BISHOP, KNIGHT, ROOK};
    public static final int WHITE = 1, BLACK = 0;
    private final Color CHESSGREEN = new Color(118,150,86);

    public ChessUI() {
        initComponents();
        initalizeGUI();

    }

    public final void initalizeGUI() {
        // get the images for the pieces
        getPieceImages();
        // create a margin of nothing for the buttons so there are no gaps between squares
        Insets buttonMargin = new Insets(0,0,0,0);
        // create transparent icon for buttons
        ImageIcon icon = new ImageIcon(new BufferedImage(60,60,BufferedImage.TYPE_INT_ARGB));
        // loop through the 2d array of squares
        for (int i = 0; i < boardSquares.length; i++) {
            for (int j = 0; j < boardSquares[i].length; j++) {
                // create button for square
                JButton b = new JButton();
                // add button to array for board
                // set the margin
                b.setMargin(buttonMargin);
                // set icon to transparent
                b.setIcon(icon);
                /* 
                Determine background color of squares.
                */
                
                if (i % 2 == j % 2) {
                    b.setBackground(Color.WHITE);
                }
                else {
                    b.setBackground(CHESSGREEN);
                }
                boardSquares[i][j] = b;
            }
        }
        chessBoard.add(new javax.swing.JLabel(""));
        // fill the top row
        for (int i = 0; i < 8; i++) {
            chessBoard.add(
                    new javax.swing.JLabel(COLUMNS.substring(i, i + 1),
                    SwingConstants.CENTER));
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                switch (j) {
                    case 0:
                        chessBoard.add(new javax.swing.JLabel("" + (9 - (i + 1)),
                                SwingConstants.CENTER));
                    default:
                        chessBoard.add(boardSquares[j][i]);
                }
            }
        }
        
    }
    
private void setupBoard() {
    for(int i = 0; i < STARTING_ROW.length; i++) {
        boardSquares[i][0].setIcon(new ImageIcon(pieceImages[BLACK][STARTING_ROW[i]]));
        boardSquares[i][1].setIcon(new ImageIcon(pieceImages[BLACK][PAWN]));
        boardSquares[i][6].setIcon(new ImageIcon(pieceImages[WHITE][PAWN]));
        boardSquares[i][7].setIcon(new ImageIcon(pieceImages[WHITE][STARTING_ROW[i]]));
    }
}
    private void getPieceImages() {
        File image = new File("src//pieces//chesspiecesarray.png");
        try {
            BufferedImage bi = ImageIO.read(image);
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 6; j++) {
                    pieceImages[i][j] = bi.getSubimage(j * 60, i * 60, 60, 60);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error:" + e);
            System.exit(1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boardConstrain = new javax.swing.JPanel();
        chessBoard = new javax.swing.JPanel(new GridLayout(0, 9)) {

            /**
            * Override the preferred size to return the largest it can, in
            * a square shape.  Must (must, must) be added to a GridBagLayout
            * as the only component (it uses the parent as a guide to size)
            * with no GridBagConstaint (so it is centered).
            */
            @Override
            public final java.awt.Dimension getPreferredSize() {
                java.awt.Dimension d = super.getPreferredSize();
                java.awt.Dimension prefSize = null;
                java.awt.Component c = getParent();
                if (c == null) {
                    prefSize = new java.awt.Dimension(
                        (int)d.getWidth(),(int)d.getHeight());
                } else if (c!=null &&
                    c.getWidth()>d.getWidth() &&
                    c.getHeight()>d.getHeight()) {
                    prefSize = c.getSize();
                } else {
                    prefSize = d;
                }
                int w = (int) prefSize.getWidth();
                int h = (int) prefSize.getHeight();
                // the smaller of the two sizes
                int s = (w>h ? h : w);
                return new java.awt.Dimension(s,s);
            }
        };
        panelClock = new javax.swing.JPanel();
        lblP1Time = new javax.swing.JLabel();
        fieldP1Time = new javax.swing.JTextField();
        lblP2Time = new javax.swing.JLabel();
        fieldP2Time = new javax.swing.JTextField();
        lblBaseTime = new javax.swing.JLabel();
        lblInc = new javax.swing.JLabel();
        fieldBaseTime = new javax.swing.JTextField();
        fieldInc = new javax.swing.JTextField();
        bttnStartClock = new javax.swing.JButton();
        bttnPauseClock = new javax.swing.JButton();
        panelCurrentPlayer = new javax.swing.JPanel();
        lblCurrentPlayer = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        bttnNewGame = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        bttnResign = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        bttnExport = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        bttnRestore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boardConstrain.setBackground(new java.awt.Color(245, 160, 76));
        boardConstrain.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), javax.swing.BorderFactory.createEmptyBorder(8, 8, 8, 8)));
        boardConstrain.setLayout(new java.awt.GridBagLayout());

        chessBoard.setBackground(new java.awt.Color(245, 160, 76));
        chessBoard.setLayout(new java.awt.GridLayout(9, 0));
        boardConstrain.add(chessBoard, new java.awt.GridBagConstraints());

        panelClock.setBackground(new java.awt.Color(204, 255, 204));

        lblP1Time.setText("Player 1 Time:");

        fieldP1Time.setEditable(false);

        lblP2Time.setText("Player 2 Time:");

        fieldP2Time.setEditable(false);

        lblBaseTime.setText("Base Time (Mins):");

        lblInc.setText("Increment (Secs):");

        bttnStartClock.setText("Start Clocks");

        bttnPauseClock.setText("Pause Clocks");

        javax.swing.GroupLayout panelClockLayout = new javax.swing.GroupLayout(panelClock);
        panelClock.setLayout(panelClockLayout);
        panelClockLayout.setHorizontalGroup(
            panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnPauseClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttnStartClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelClockLayout.createSequentialGroup()
                        .addComponent(lblP1Time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldP1Time))
                    .addGroup(panelClockLayout.createSequentialGroup()
                        .addComponent(lblP2Time)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldP2Time))
                    .addGroup(panelClockLayout.createSequentialGroup()
                        .addGroup(panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBaseTime)
                            .addComponent(lblInc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldInc, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(fieldBaseTime))))
                .addContainerGap())
        );
        panelClockLayout.setVerticalGroup(
            panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClockLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseTime)
                    .addComponent(fieldBaseTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInc)
                    .addComponent(fieldInc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnStartClock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnPauseClock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblP1Time)
                    .addComponent(fieldP1Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblP2Time)
                    .addComponent(fieldP2Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelCurrentPlayer.setBackground(new java.awt.Color(255, 204, 204));

        lblCurrentPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrentPlayer.setText("White to move");

        javax.swing.GroupLayout panelCurrentPlayerLayout = new javax.swing.GroupLayout(panelCurrentPlayer);
        panelCurrentPlayer.setLayout(panelCurrentPlayerLayout);
        panelCurrentPlayerLayout.setHorizontalGroup(
            panelCurrentPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurrentPlayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurrentPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCurrentPlayerLayout.setVerticalGroup(
            panelCurrentPlayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurrentPlayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurrentPlayer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        bttnNewGame.setText("New Game");
        bttnNewGame.setActionCommand("");
        bttnNewGame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnNewGameActionPerformed(evt);
            }
        });
        jToolBar1.add(bttnNewGame);
        jToolBar1.add(jSeparator1);

        bttnResign.setText("Resign");
        bttnResign.setActionCommand("");
        bttnResign.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.add(bttnResign);
        jToolBar1.add(jSeparator2);

        bttnExport.setText("Export to FEN");
        bttnExport.setActionCommand("");
        bttnExport.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.add(bttnExport);
        jToolBar1.add(jSeparator3);

        bttnRestore.setText("Restore from FEN");
        bttnRestore.setToolTipText("");
        bttnRestore.setActionCommand("");
        bttnRestore.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttnRestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnRestoreActionPerformed(evt);
            }
        });
        jToolBar1.add(bttnRestore);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelCurrentPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boardConstrain, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCurrentPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelClock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boardConstrain, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnNewGameActionPerformed
setupBoard();
    }//GEN-LAST:event_bttnNewGameActionPerformed

    private void bttnRestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnRestoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttnRestoreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChessUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boardConstrain;
    private javax.swing.JButton bttnExport;
    private javax.swing.JButton bttnNewGame;
    private javax.swing.JButton bttnPauseClock;
    private javax.swing.JButton bttnResign;
    private javax.swing.JButton bttnRestore;
    private javax.swing.JButton bttnStartClock;
    private javax.swing.JPanel chessBoard;
    private javax.swing.JTextField fieldBaseTime;
    private javax.swing.JTextField fieldInc;
    private javax.swing.JTextField fieldP1Time;
    private javax.swing.JTextField fieldP2Time;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblBaseTime;
    private javax.swing.JLabel lblCurrentPlayer;
    private javax.swing.JLabel lblInc;
    private javax.swing.JLabel lblP1Time;
    private javax.swing.JLabel lblP2Time;
    private javax.swing.JPanel panelClock;
    private javax.swing.JPanel panelCurrentPlayer;
    // End of variables declaration//GEN-END:variables
}