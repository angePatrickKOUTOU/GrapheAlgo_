package Graphe;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner myInput = new Scanner( System.in );
		System.out.print("----------------------------1--Console-----------------------------\n");
		System.out.print("----------------------------2--Graphique---------------------------\n");
		int i=myInput.nextInt();
				if(i==1)
				{Tache t= null;boolean b=true;
					while(b)
					{
						System.out.print("+------------------------------------------------------+\n");
						System.out.print("|--- -----------1-Home---------------------------------|\n");
						System.out.print("|---------------2-Saisir tache-------------------------|\n");
						System.out.print("|---------------3-AfficherCheminCritiqueText-----------|\n");
						System.out.print("|---------------4-Exit---------------------------------|\n");
						System.out.print("+------------------------------------------------------+\n");
						System.out.print("Saisi un numero entre 1 et 4 : \n");
						int k=myInput.nextInt();
						switch (k) {
						case 1: {break;}
						case 2:{
							t=new Tache();
							t.saisir();
							break;
						}
						case 3:
						{
							if(t!=null)t.AfficherCheminCritiqueConsole();
							break;
						}
						case 4:
							{b=false;
								break;}
						default:
							System.out.println("numero entre 1 et 4");
						}
					}
				}
				else
				{
					MainFraim frame = new MainFraim();
					frame.setVisible(true);
				}

	}

}
