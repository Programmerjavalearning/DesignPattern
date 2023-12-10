package org.example;

public class ComputerFactory {

    public static Computer getComputer (String type){
        switch (type){
            case "pc":
                return new Pc("8Go", "1TO", "2.3Ghz");
            case "gamer":
                return new pcGamer("16Go", "2TO", "5.3Ghz");

            case "server":
                return new Server("32Go", "4TO", "8.3Ghz");

            case "imaginaire":
                return new Server("100Go", "40TO", "80.3Ghz");
            default:
                return null;
        }
    }
}
