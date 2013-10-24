

import  junit.framework.*;


public class MaClassTest extends TestCase
{
    public MaClassTest ( String name ) { super ( name ); }
    //test hitoire 1
        public void test_histoire1 ()
    {
        Yinsh yinsh = new Yinsh();


        assertTrue (yinsh.current_Color()==Color.BLACK | yinsh.current_Color()==Color.WHITE );
    }

    public void test_histoire2 ()
    {
        Yinsh yinsh = new Yinsh();


        assertTrue (yinsh.exist_marker('D', 2) );
    }

    public void test_histoire3 ()
    {
        Yinsh yinsh = new Yinsh();


        assertTrue (yinsh.exist_marker('D', 2) );
    }
}

