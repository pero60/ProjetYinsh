import junit.framework.*;
import junit.textui.*;

/**
 * Created with IntelliJ IDEA.
 * User: tperraul
 * Date: 03/10/13
 * Time: 11:15
 * To change this template use File | Settings | File Templates.
 */
public class AllTests {
    public static TestSuite suite () {
        TestSuite suite = new TestSuite (" Mes tests " );
        suite . addTest ( new TestSuite( MaClassTest . class ));
        return suite ;
    }


    public static void main ( String args [])
    {
        junit.textui.TestRunner.run ( AllTests . suite ());
    }
}