import java.util.Random;

public class Yinsh {
	
	public class java {

	}
	
	private int NbrAnnoNoir=0;
	private int NbrAnnoBlanc=0;
	private int NbrMarkNoir=0;
	private int NbrMarkBlanc=0;

	private Color[][] tab = new Color[11][12]; 
	
	

	
	
	
//constructeur de la classe Yinch	
	public Yinsh() 
	{	
		tab[0][0]=Color.A;
		tab[1][0]=Color.B;
		tab[2][0]=Color.C;
		tab[3][0]=Color.D;
		tab[4][0]=Color.E;
		tab[5][0]=Color.F;
		tab[6][0]=Color.G;
		tab[7][0]=Color.H;
		tab[8][0]=Color.I;
		tab[9][0]=Color.J;
		tab[10][0]=Color.K;
		
		for(int i=0;i<11;i++){
			for (int j=1;j<12;j++){
				tab[i][j]=Color.NULL ;
			}
		}			
	}
	
//méthode pour savoir si les 5 anneaux des joueurs sont placés
	public boolean is_initialised()
	{
		if((NbrAnnoNoir==4) && (NbrAnnoBlanc==4))//NbrAnnoNoir et NbrAnnoBlanc initialiser a zero
		{
			return true;
		}
		else
		{
			return false;
		}
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
			for(int j=0;j<12;j++)
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
		if(tab[g][Lign] == Color.NULL)
		{
			if((Couleur == Color.WHITE)&&(NbrAnnoBlanc<5))
			{
				tab[g][Lign]=Couleur;
				NbrAnnoBlanc++;
				System.out.println(NbrAnnoBlanc);
			}
			else
			{
				if(NbrAnnoNoir<5)
				{
					tab[g][Lign]=Couleur;
					NbrAnnoNoir++;
					System.out.println(NbrAnnoNoir);
				}
			}
		}
	}
	
	
	
//méthode qui permet de placer un marqueur
public void put_maker(char c, int Lign, Color Couleur) 
{
	int g = (int) c - (int)'A';
	if(tab[g][Lign] == Color.NULL)
	{
		if((Couleur == Color.WHITE)&&(NbrMarkBlanc<5))
		{
			tab[g][Lign]=Color.MARKBLANC;
			NbrMarkBlanc++;
		}
		else
		{
			if(NbrMarkNoir<5)
			{
				tab[g][Lign]=Color.MARKNOIR;
				NbrMarkNoir++;
			}
		}
	}
}

//méthode qui permet de déplacer un anneau
public void move_ring(char c_depart, int Lign_depart,char c_arrive, int Lign_arrive)
{
	int colonne_depart = (int) c_depart - (int)'A';
	int colonne_arrive = (int) c_arrive - (int)'A';
	
	if(tab[colonne_depart][Lign_depart]==Color.BLACK)
	{
		if(tab[colonne_arrive][Lign_arrive]==Color.MARKNOIR)
		{
			tab[colonne_arrive][Lign_arrive]=Color.MARKANNEAUNOIR;
			tab[colonne_depart][Lign_depart]=Color.NULL;
		}
	}
	
	
	if(tab[colonne_depart][Lign_depart]==Color.WHITE)
	{
		if(tab[colonne_arrive][Lign_arrive]==Color.MARKBLANC)
		{
			tab[colonne_arrive][Lign_arrive]=Color.MARKANNEAUBLANC;
			tab[colonne_depart][Lign_depart]=Color.NULL;
		}
	}
}

}