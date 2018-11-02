import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.rmi.Remote;

public class Calendrier {

	public static void main (String arg[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Scanner rp = new Scanner(System.in);
		char reponse='O';
		
		while(reponse=='O')
		{
		System.out.println("Entrer le numero d'un mois: ");
		int m=sc.nextInt(); 
		System.out.println();
		
		try{
		System.out.println (month(m)); // affiche le mois correspondant au numero(m) saisi par l'utilisateur
		System.out.println();
		}
		catch(Exception e){
		JFrame frame = new JFrame("Calendrier");
		frame.getContentPane().setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(350,100));
        frame.setLocationRelativeTo(null);
        frame.getContentPane().add(new JLabel(e.getMessage()));
        frame.setVisible(true);
			//System.out.println(e.getMessage()); //récuperer et afficher le message de la ligne 31
			System.out.println();
		}
		System.out.println("voulez vous reessayer? O/N");
		reponse=rp.nextLine().charAt(0);
		}
	}
	
	public static String month(int mois) throws Exception {
		if(mois<1 || mois>12){ throw new Exception (" Erreur: le numero du mois doit etre compris entre 1 et 12");}
		if (mois==1)
			return "Janvier";
		else if (mois==2) 
			return "Fevrier";
		else if (mois==3) 
			return "Mars";
		else if (mois==4) 
			return "Avril";
		else if (mois==5) 
			return "Mai";
		else if (mois==6) 
			return "Juin";
	    else if (mois==7) 
			return "Juillet";
		else if (mois==8) 
			return "Aout";
		else if (mois==9) 
			return "Septembre";
		else if (mois==10) 
			return "Octobre";
		else if (mois==11) 
			return "Novembre";
		else 
			return "Decembre";
		
	}
}