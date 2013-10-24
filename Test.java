import java.io.IOException;
import java.util.Scanner;


public class Test {

	
	public static void main(String[] args) throws IOException {
		//Scanner sc=new Scanner(System.in);
		Yinsh yinsh = new Yinsh();
		Color colorExact=yinsh.current_Color();
		//Color color;
		System.out.println("la couleur qui commence est :" + colorExact);
		//color =colorExact;
		System.out.println("placer les anneaux");
		//int i=0;
        //String coordonne=  System.in.toString();
		/*try
		{
			while(yinsh.is_initialised()==false)
			{
				if(color==Color.BLACK)
				{
                    System.out.println("c est au " + color+ " de placer l'anneau" );
                    System.out.println("Choisir la ligne:");
                    int Lign = sc.nextInt();
                    System.out.println("Choisir la colonne:");
                    char Colone = (char)System.in.read();
                    yinsh.put_ring( Colone, Lign, color);
                    yinsh.affichetab();
                    color=Color.WHITE;
                    int coordonne=  System.in.read();
				}
				else
				{
                    System.out.println("c est au " + color+ " de placer l'anneau"  );
                   /* System.out.println("Choisir la ligne:");
                    int Lign = sc.nextInt();
                    System.out.println("Choisir la colonne:");
                    char Colone = (char)System.in.read();
                    int coordonne=  System.in.read();
                    yinsh.put_ring( Colone, Lign, color);
                    yinsh.affichetab();
                    color=Color.BLACK;
				}
			}
            yinsh.put_maker('D',2,color);
            yinsh.affichetab();
		}
		catch(ExeptionYinsh e)
		{
			yinsh.affichetab();
		} */
	}
}

/*
yinsh.put_ring('C', 1,1);
yinsh.put_ring('F', 5,2);
yinsh.put_ring('K', 9,2);
yinsh.put_ring('A', 1,1);
yinsh.put_ring('D', 1,1);
yinsh.put_ring('G', 5,2);
yinsh.put_ring('E', 9,2);
yinsh.put_ring('I', 1,1);
yinsh.put_ring('H', 9,2);
yinsh.put_ring('J', 1,1);
yinsh.put_maker('D',2,2);*/