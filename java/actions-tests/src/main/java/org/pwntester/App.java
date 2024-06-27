package org.pwntester;
import java.util.Map;
public class App 
{
    public static void main( String[] args )
    {
        Map<String, String> env = System.getenv();
        env.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
