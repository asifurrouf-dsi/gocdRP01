package samples.echo;

import junit.framework.TestCase;

public class EchoTest extends TestCase
{
    private Echo echo;

    public void setUp() throws Exception
    {
        this.echo = new Echo();
    }

    public void testDefaultMessage() throws Exception
    {
        assertEquals( "Check default message", "defaultMessage", echo.getMessage() );
    }
 
    public void testOverrideMessage() throws Exception
    {
        this.echo.setMessage( "newMessage" );
        assertEquals( "Check overridden message", "newMessage", echo.getMessage() );
    }
}

