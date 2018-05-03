package easy.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

import easy.main.Main;

public class JOptionPaneView {

	public static int menuStartCashier() {

		UIManager UI = new UIManager();
		ImageIcon icon = new ImageIcon(Main.class.getResource("/easylogo.png"));
		UIManager.put("OptionPane.background", new ColorUIResource(Color.decode("#BDBDBD")));
		UI.put("Panel.background", new ColorUIResource(Color.decode("#BDBDBD")));
		UI.put("OptionPane.messageForeground", Color.decode("#424242"));
		UI.put("Button.background", Color.decode("#757575"));
		UI.put("OptionPane.messageFont", new FontUIResource("Arial", Font.BOLD, 24));
		UI.put("Button.foreground", Color.decode("#E0E0E0"));
		UI.put("Button.select", Color.decode("#9E9E9E"));
		UI.put("Button.focus", Color.decode("#757575"));
		// UI.put("Button.rollover", false);
		UI.put("Label.background", Color.red);

		int option = JOptionPane
				.showOptionDialog(null, "Easy-Sale Module", "Easy-Sale Module",
						JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, new String[] {
								"Start selling", "Update prices", "Export of receipts", "Finish the sale", "Exit", },
						"default");

		return option;

	}

	public static String logInScreen() {
		UIManager UI = new UIManager();
		UI.put("Panel.background", new ColorUIResource(Color.decode("#757575")));
		UI.put("OptionPane.background", Color.decode("#757575"));
		UI.put("OptionPane.foreground", Color.decode("#757575"));
		UI.put("OptionPane.messageForeground", Color.decode("#ffffff"));
		UIManager.put("OptionPane.inputDialogTitle", "Easy-Sale");

		return JOptionPane.showInputDialog("Enter your employee code:");

	}

}
