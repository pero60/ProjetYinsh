import java.util.Random;


public class Yinsh {
	
	public class java {

	}
	
	private int NbrAnnoNoir=0;
	private int NbrAnnoBlanc=0;
	private int NbrMarkNoir=0;
	private int NbrMarkBlanc=0;

	private final Color[][] tab = new Color[11][12];

    public enum Color {
        A,B,C,D,E,F,G,H,I,J,K,
        NULL,
        WHITE,
        BLACK,
        MARKNOIR,
        MARKBLANC,
        MARKANNEAUNOIR,
        MARKANNEAUBLANC

    }
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
            tab[i]=miseazero(tab[i]);
		}			
	}



   public  Color[] miseazero(Color[] tab)
   {
       for (int j=1;j<12;j++){
           tab[j]=Color.NULL ;
       }
       return tab;
   }
	
//méthode pour savoir si les 5 anneaux des joueurs sont placés
	public boolean is_initialised()
	{
		return ((NbrAnnoNoir==5) && (NbrAnnoBlanc==5)); //NbrAnnoNoir et NbrAnnoBlanc initialiser a zero
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
		for(int i=0;i<11;i++){
			for(int j=0;j<12;j++)
			{
				System.out.print(" " + tab[i][j]+" ");
			}
			System.out.println();
		}
	}
	
//méthode qui permet de placer un anneau	
public void putRing(Coordinates coordinates, Color mCouleur) throws ExeptionYinsh
{


    if(tab[coordinates.g][coordinates.mlign] == Color.NULL)
    {
        if((mCouleur == Color.WHITE)&&(NbrAnnoBlanc<5))
        {
            tab[coordinates.g][coordinates.mlign]=mCouleur;
            NbrAnnoBlanc++;
            System.out.println(NbrAnnoBlanc);
        }
        else
        {
            if(NbrAnnoNoir<5)
            {
                tab[coordinates.g][coordinates.mlign]=mCouleur;
                NbrAnnoNoir++;
                System.out.println(NbrAnnoNoir);
            }
        }
    }


}
	
	
	
//méthode qui permet de placer un marqueur
public void putMarker(Coordinates coordinates, Color couleur)
{
	if(tab[coordinates.g][coordinates.mlign] == Color.NULL)
	{
		if((couleur == Color.WHITE)&&(NbrMarkBlanc<5))
		{
			tab[coordinates.g][coordinates.mlign]=Color.MARKBLANC;
			NbrMarkBlanc++;
		}
		else
		{
			if(NbrMarkNoir<5)
			{
				tab[coordinates.g][coordinates.mlign]=Color.MARKNOIR;
				NbrMarkNoir++;
			}
		}
	}
}

//méthode qui permet de déplacer un anneau
public void moveRing(Coordinates coordinatesdepart,Coordinates coordinatesarrive,Color color)
{

	
	if(/*tab[coordinatesdepart.g][coordinatesdepart.mlign]*/color==Color.BLACK)
	{
		if(tab[coordinatesarrive.g][coordinatesarrive.mlign]==Color.MARKNOIR)
		{
			tab[coordinatesarrive.g][coordinatesarrive.mlign]=Color.MARKANNEAUNOIR;
			tab[coordinatesdepart.g][coordinatesdepart.mlign]=Color.NULL;
		}
	}
	
	
	if(/*tab[coordinatesdepart.g][coordinatesdepart.mlign]*/color==Color.WHITE)
	{
		if(tab[coordinatesarrive.g][coordinatesarrive.mlign]==Color.MARKBLANC)
		{
			tab[coordinatesarrive.g][coordinatesarrive.mlign]=Color.MARKANNEAUBLANC;
			tab[coordinatesdepart.g][coordinatesdepart.mlign]=Color.NULL;
		}
	}
}
   public boolean exist_marker(char colonne, int ligne)
   {
       return true;
   }
}