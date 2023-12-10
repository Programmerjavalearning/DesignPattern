package org.example;

public class CommandExecutorImpl implements CommandExecutor {

    public void executeCommand(String cmd) throws Exception {
        System.out.println("Command" + cmd + "was sucessed");

    }
}
