package firstcontact;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 *
 * @author Pieter van den Hombergh {@code p.vandehombergh@gmail.com}
 */
public class GreetingTest {

    @Test
    void firstContact() {
        //Start Solution::replacewith:://TODO implement firstContact
        Greeting g = new Greeting( "Johnny" );
        String greet = g.greet();
        assertThat( greet )
                .as( "expecting polity greeting" )
                .contains( "Hello", "Johnny" );
        //End Solution::replacewith::fail("firstContact completed, Your know waht to do");
    }
    //Start Solution::replacewith:://TODO
    @Test
    public void other() {
        Greeting g = new Greeting( "Henrik" );
        String greet = g.greet();
        assertThat( greet )
                .as( "expecting polity greeting" )
                .contains( "Hello", "Henrik" );
//        fail( "t completed succesfully; you know what to do" );
    }
    //End Solution::replacewith::
}
