package org.example;

public class CommandExecutorProxy implements CommandExecutor{

    private boolean isAdmin = false;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String login, String pawwd) {
        isAdmin = "nic".equals(login) && "psw".equals(pawwd);
        commandExecutor = new CommandExecutorImpl();
    }

    public void executeCommand(String cmd) throws Exception {

        if(isAdmin){
            commandExecutor.executeCommand(cmd);
        }else {
            if (cmd.contains("rm")) {
                throw new Exception("You don't have admin access");
            } else {
                commandExecutor.executeCommand(cmd);
            }
        }
    }
}
