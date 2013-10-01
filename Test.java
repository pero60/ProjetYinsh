import java.util.Scanner;;


public class Test {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Yinsh yinsh = new Yinsh();
		Color color=yinsh.current_Color();
		System.out.println("la couleur qui commence est :" + color);
		
		System.out.println("placer les anneaux");
		try
		{
			while(!yinsh.is_initialised())
			{
					System.out.println("Choisir la ligne:");
					int Lign = sc.nextInt();
					System.out.println("Choisir la colonne:");
					int Colone = sc.nextInt();
					yinsh.put_ring(Colone, Lign, color);
				
			}
			yinsh.affichetab();
		}
		catch(ExeptionYinsh e)
		{
			yinsh.affichetab();
			
		}
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