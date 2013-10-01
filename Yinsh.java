import java.util.Random;

public class Yinsh {
	
	public class java {

	}
	
	private int NbrAnnoNoir=0;
	private int NbrAnnoBlanc=0;
	private int NbrMarkNoir=0;
	private int NbrMarkBlanc=0;

	private Color[][] tab = new Color[11][11]; 
	
	

	
	
	
//constructeur de la classe Yinch	
	public Yinsh() 
	{		
		for(int i=0;i<11;i++){
			for (int j=0;j<11;j++){
				tab[i][j]=Color.NULL ;
			}
		}			
	}
	
//méthode pour savoir si les 5 anneaux des joueurs sont placés
	public boolean is_initialised()
	{
		if((NbrAnnoNoir==4) && (NbrAnnoBlanc==4))//NbrAnnoNoir et NbrAnnoBlanc initialiser a zero
			return true;
		
		return false;		
	}
	
	
//méthode qui récupere aléatoirement la couleur du joueur qui commence 
	public Color current_Color()
	{
		int   i ;
		Random rand = new Random();
		i=rand.nextInt(2);
		if (i==0){
			return Color.WHITE;
		}
		else{
			return Color.BLACK;
		}
	}
	
	
//permet d'afficher le tableau	
	public void affichetab(){
		for(int s=0;s<11;s++){
			for(int j=0;j<11;j++)
			{
				System.out.print(" " + tab[s][j]+" ");
			}
			System.out.println();
		}
	}
	
//méthode qui permet de placer un anneau	
	public void put_ring(int c, int Lign, Color Couleur) throws ExeptionYinsh
	{
		int g =  c - (int)'A';
		if(tab[g][Lign-1] == Color.NULL)
		{
			if((Couleur == Color.WHITE)&&(NbrAnnoBlanc<5))
			{
				tab[g][Lign-1]=Couleur;
				NbrAnnoBlanc++;
			}
			else
			{
				if(NbrAnnoNoir<5)
				{
					tab[g][Lign-1]=Couleur;
					NbrAnnoNoir++;
				}
			}
		}
	}
	
	
//méthode qui permet de placer un marqueur
public void put_maker(char c, int Lign, Color Couleur) 
{
	int g = (int) c - (int)'A';
	if(tab[g][Lign-1] == Color.NULL)
	{
		if((Couleur == Color.WHITE)&&(NbrMarkBlanc<5))
		{
			tab[g][Lign-1]=Color.MARKBLANC;
			NbrMarkBlanc++;
		}
		else
		{
			if(NbrMarkNoir<5)
			{
				tab[g][Lign-1]=Color.MARKNOIR;
				NbrMarkNoir++;
			}
		}
	}
}

//méthode qui permet de déplacer un anneau
public void move_ring(char c_actuel, int Lign_actuel, int Couleur_actuel,char c, int Lign, int Couleur)
{
	int g_actuel = (int) c_actuel - (int)'A';
	int g = (int) c - (int)'A';
	
	if(Couleur == 1)
	{
		if(tab[g_actuel][Lign_actuel-1]==Color.MARKANNEAUBLANC)
		{
			
		}
	}
}

}