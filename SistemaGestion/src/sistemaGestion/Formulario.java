/*
 * Created by JFormDesigner on Tue Feb 01 21:29:26 CST 2022
 */

package sistemaGestion;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author Ernesto David Lopez
 */
public class Formulario extends JPanel {
	public Formulario() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Ernesto David Lopez
		button1 = new JButton();

		//======== this ========
		setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
		border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER
		, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font
		.BOLD ,12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (
		new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072"
		.equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
		setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- button1 ----
		button1.setText("text");
		add(button1, "cell 6 8");
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Ernesto David Lopez
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
