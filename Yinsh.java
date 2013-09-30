import java.util.Random;

public class Yinsh {
	
	public class java {

	}
	
	private int NbrAnnoNoir=0;
	private int NbrAnnoBlanc=0;
	private int NbrMarkNoir=0;
	private int NbrMarkBlanc=0;

	private int[][] tab = new int[11][11]; 
	
	public enum Color{
		NULL,
		WHITE,
		BLACK,
		MARKNOIR,
		MARKBLANC,
		MARKANNEAUNOIR,
		MARKANNEAUBLANC
	}
	
	
	
	
	public Yinsh() {
		
		
		for(int i=0;i<11;i++){
			for (int j=0;j<11;j++){
				tab[i][j]=0 ;
			}
		}
				
	}
	
	
	public boolean is_initialised()
	{
		if((NbrAnnoNoir==4) && (NbrAnnoBlanc==4))//NbrAnnoNoir et NbrAnnoBlanc initialiser a zero
			return true;
		
		return false;		
	}
	
	
	
	public Color current_Color(){
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
	public void affichetab(){
		for(int s=0;s<11;s++){
			for(int j=0;j<11;j++)
			{
				System.out.print(" " + tab[s][j]+" ");
			}
			System.out.println();
		}
	}
	public void put_ring(char c, int Lign, int Couleur) throws ExeptionYinsh
	{
		int g = (int) c - (int)'A';
		if(tab[g][Lign-1] == 0)
		{
			if((Couleur == 1)&&(NbrAnnoBlanc<5))
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

public void put_maker(char c, int Lign, int Couleur) 
{
	int g = (int) c - (int)'A';
	if(tab[g][Lign-1] == 0)
	{
		if((Couleur == 1)&&(NbrMarkBlanc<5))
		{
			tab[g][Lign-1]=4;
			NbrMarkBlanc++;
		}
		else
		{
			if(NbrMarkNoir<5)
			{
				tab[g][Lign-1]=3;
				NbrMarkNoir++;
			}
		}
	}
}

public void move_ring(char c_actuel, int Lign_actuel, int Couleur_actuel,char c, int Lign, int Couleur)
{
	int g_actuel = (int) c_actuel - (int)'A';
	int g = (int) c - (int)'A';
	
	if(Couleur == 1)
	{
		if(tab[g_actuel][Lign_actuel-1]==6)
		{
			
		}
	}
}

}