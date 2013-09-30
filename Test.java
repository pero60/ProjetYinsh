


public class Test {

	
	public static void main(String[] args) {
		
		Yinsh yinsh = new Yinsh();
		System.out.println(yinsh.current_Color());
		try
		{
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
			yinsh.put_maker('D',2,2);
			//if(yinsh.is_initialised())
				yinsh.affichetab();
		}
		catch(ExeptionYinsh e)
		{
			yinsh.affichetab();
			
		}
	}
}
