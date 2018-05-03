package easy.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import easy.users.Administrator;
import easy.users.AdministratorRepository;
import easy.view.JOptionPaneView;

public class Main {
	
	private AdministratorRepository administratorRepository;

	public static void main(String[] args) {
		Main main = new Main();	
		
		
	}
	
	public Main() {
		administratorRepository = new AdministratorRepository();
		administratorRepository.openEntityManagerFactory();
		
		administratorRepository.inItData();
		String input = JOptionPaneView.logInScreen();
		if(administratorRepository.exist(input)) {
			JOptionPane.showMessageDialog(null, "Administrator znaleziony");
		}
		JOptionPaneView.menuStartCashier();
		
		administratorRepository.closeEntityManagerFactory();
	}

}
