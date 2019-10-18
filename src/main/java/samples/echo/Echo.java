package samples.echo;

import java.util.Properties;

public class Echo
{
    private String message;
    
    public Echo() throws Exception
    {
        // default message comes from the resource file
        Properties properties = new Properties();
        properties.load( getClass().getResourceAsStream( "/messages.properties" ) );

        message = properties.getProperty( "echo.message" );
    }

    public void setMessage( String message )
    {
        this.message = message;
    }

    public String getMessage()
    {
        return this.message;
    }
}

