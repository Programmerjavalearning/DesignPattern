package org.example;

/**
 * Hello world!
 *
 */
public class FactoryMain
{
    public static void main( String[] args )
    {
        Computer pc = ComputerFactory.getComputer("pc");
        System.out.println( pc);


        Computer server = ComputerFactory.getComputer("server");
        System.out.println( server);
    }
}
