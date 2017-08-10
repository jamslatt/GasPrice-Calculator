package testGUI;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DropMode;


public class Main {
	private static JTextField GasPrice;
	private static JTextField TripDistance;
	private static JTextField CarGasPerMile;

	public static void main(String[] args) {
		JFrame app = new JFrame();
		app.getContentPane().setFont(new Font("Calibri", Font.PLAIN, 16));
		app.getContentPane().setBackground(SystemColor.menu);
		
		app.setBounds(10, 10, 905, 700);
		app.setBackground(Color.DARK_GRAY);
		app.setResizable(false);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.getContentPane().setLayout(null);
		
		JLabel lblMyLabel = new JLabel("Gas Price Calculator");
		lblMyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblMyLabel.setBounds(211, 0, 467, 106);
		app.getContentPane().add(lblMyLabel);
		
		JLabel lblPriceOfGas = new JLabel("Price of Gas:");
		lblPriceOfGas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPriceOfGas.setBounds(107, 120, 100, 16);
		app.getContentPane().add(lblPriceOfGas);
		
		JLabel lblTripDistance = new JLabel("Trip Distance:");
		lblTripDistance.setLabelFor(lblTripDistance);
		lblTripDistance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTripDistance.setBounds(100, 180, 109, 16);
		app.getContentPane().add(lblTripDistance);
		
		JLabel lblCarsGpm = new JLabel("Car's GPM:");
		lblCarsGpm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCarsGpm.setBounds(121, 240, 88, 16);
		app.getContentPane().add(lblCarsGpm);
		
		GasPrice = new JTextField();
		lblPriceOfGas.setLabelFor(GasPrice);
		GasPrice.setBounds(221, 119, 116, 22);
		app.getContentPane().add(GasPrice);
		GasPrice.setColumns(10);
		
		TripDistance = new JTextField();
		TripDistance.setBounds(221, 179, 116, 22);
		app.getContentPane().add(TripDistance);
		TripDistance.setColumns(10);
		
		CarGasPerMile = new JTextField();
		lblCarsGpm.setLabelFor(CarGasPerMile);
		CarGasPerMile.setBounds(221, 239, 116, 22);
		app.getContentPane().add(CarGasPerMile);
		CarGasPerMile.setColumns(10);
		
		JMenuBar menuBar = new JMenuBar();
		app.setJMenuBar(menuBar);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		menuBar.add(mntmLogin);
		
		JMenuItem mntmHome = new JMenuItem("Home");
		menuBar.add(mntmHome);
		
	}
}
