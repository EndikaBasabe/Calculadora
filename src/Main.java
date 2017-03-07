import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPantaila;
	boolean esDecimal = false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			textFieldPantaila.setText(textFieldPantaila.getText() + button1.getText());
			
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button2.getText());
				
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button3.getText());
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton buttonSuma = new JButton("+");
		buttonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(buttonSuma.getText());
			}
		});
		buttonSuma.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button4.getText());
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button5.getText());
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button6.getText());
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton buttonResta = new JButton("-");
		buttonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonResta.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button7.getText());
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button8.getText());
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button9.getText());
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton buttonPor = new JButton("*");
		buttonPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonPor.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textFieldPantaila = new JTextField();
		textFieldPantaila.setColumns(10);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldPantaila.setText(textFieldPantaila.getText() + button0.getText());
			}
		});
		button0.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton buttonPunto = new JButton(".");
		buttonPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!esDecimal){
					textFieldPantaila.setText(textFieldPantaila.getText() + buttonPunto.getText());
					esDecimal = true;
				}
		
			}
		});
		buttonPunto.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton buttonC = new JButton("C");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonC.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton buttonDividir = new JButton("/");
		buttonDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonDividir.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton buttonIgual = new JButton("=");
		buttonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonIgual.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton buttonPlusminus = new JButton("+/-");
		buttonPlusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonPlusminus.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(13)
							.addComponent(textFieldPantaila, GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(buttonPlusminus, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(buttonIgual, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(button7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button0, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
								.addComponent(button4, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(buttonPunto, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
								.addComponent(button8, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
								.addComponent(button5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
								.addComponent(button2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(buttonC, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
								.addComponent(button3, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
								.addComponent(button6, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
								.addComponent(button9, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(buttonDividir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(buttonPor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(buttonResta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(buttonSuma, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))))
					.addGap(40))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(textFieldPantaila, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(button1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
						.addComponent(buttonSuma, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(button3, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addComponent(button2, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonResta, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
						.addComponent(button6, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
						.addComponent(button5, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addComponent(button4, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(buttonPor, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
							.addComponent(button9, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(button7, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
							.addComponent(button8, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(buttonC, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
						.addComponent(buttonDividir, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(button0, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
							.addComponent(buttonPunto, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonIgual, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
						.addComponent(buttonPlusminus, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
