package org.example;

/**
 * Hello world!
 *
 */
public class ProxyMain
{
    public static void main( String[] args )
    {
        CommandExecutor cmdLine = new CommandExecutorProxy("nic", "psw");

        try{
            cmdLine.executeCommand("ls -a");
            cmdLine.executeCommand("rm some Folder");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
