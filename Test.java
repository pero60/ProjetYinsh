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
                    yinsh.putring( Colone, Lign, color);
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
                    yinsh.putring( Colone, Lign, color);
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
yinsh.putring('C', 1,1);
yinsh.putring('F', 5,2);
yinsh.putring('K', 9,2);
yinsh.putring('A', 1,1);
yinsh.putring('D', 1,1);
yinsh.putring('G', 5,2);
yinsh.putring('E', 9,2);
yinsh.putring('I', 1,1);
yinsh.putring('H', 9,2);
yinsh.putring('J', 1,1);
yinsh.putmaker('D',2,2);*/