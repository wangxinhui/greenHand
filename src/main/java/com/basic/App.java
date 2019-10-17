package com.basic;

/**
 * Hello world!
 *
 */
public class App
{
    static {
        System.out.println("j");
    }
    public static App app = new App();
    public static App app1 = new App();

    {
        System.out.println("g");
    }


    public static void main( String[] args )
    {

        App a = new App();
        System.out.println( "Hello World!" );
    }
}
