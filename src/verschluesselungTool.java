import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JScrollPane;
import java.awt.Color;

public class verschluesselungTool extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					verschluesselungTool frame = new verschluesselungTool();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public verschluesselungTool() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 547);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnDatei = new JMenu("Datei");
		menuBar.add(mnDatei);
		
		JMenuItem mntmLadeDateizum = new JMenuItem("Lade Datei (zum Verschlüsseln)");
		mnDatei.add(mntmLadeDateizum);
		
		JMenuItem mntmLadeDateizum_1 = new JMenuItem("Lade Datei (zum Entschlüsseln)");
		mnDatei.add(mntmLadeDateizum_1);
		
		JMenuItem mntmSpeichereVerschlsselteDatei = new JMenuItem("Speichere Verschlüsselte Datei");
		mnDatei.add(mntmSpeichereVerschlsselteDatei);
		
		JMenuItem mntmSpeichereEntschlsselteDatei = new JMenuItem("Speichere Entschlüsselte Datei");
		mnDatei.add(mntmSpeichereEntschlsselteDatei);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.GREEN);
		textArea.setRows(15);
		textArea.setColumns(20);
		
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.NORTH);
	}
}
