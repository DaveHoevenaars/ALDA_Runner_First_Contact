package firstcontact;

/**
 *
 * @author Pieter van den Hombergh {@code p.vandehombergh@gmail.com}
 */
public class Greeting {

    //TODO
        private final String name;

    //Start Solution::replacewith:://TODO
    Greeting( String name ) {
        this.name=name;
    }

    String greet() {
        return "Hayli Hello "+name;
    }
    
}
