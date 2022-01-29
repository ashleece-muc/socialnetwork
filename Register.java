package com.ashleece;

import java.util.Objects;
import java.util.Scanner;

public class Register {

    public static void main(String[]args){
        Registration registration = new Registration();
        try(Scanner scanner = new Scanner(System.in)){
System.out.println("Ievadi savu várdu");
String Várds = scanner.nextLine();
registration.setVárds(Várds);
            System.out.println("Ievadi savu uzvárdu");
            String Uzvárds = scanner.nextLine();
            registration.setUzvárds(Uzvárds);
            System.out.println("Ievadi savu e-pastu");
            String epasts = scanner.nextLine();
            registration.setEpasts(epasts);
            System.out.println("Ievadi savu paroli, parole jábut vismaz 8 simboliem");
            String parole = scanner.nextLine();
            registration.setParole(parole);
            if (Objects.equals(parole,registration.getParole())){
                System.out.println("Cien, " + registration.getVárds() +" "+ registration.getUzvárds() +", Esi veiksmígi registréts");

            }else {
                System.out.println("Párbaudi ievadíto informáciju!");
            }

        }
    }
    private void printRegistrationData(Registration registration){
        System.out.println(registration.getVárds());
        System.out.println(registration.getUzvárds());
        System.out.println(registration.getEpasts());
        System.out.println(registration.getParole());
    }
}

class Registration {
    private String Várds;
    private String Uzvárds;
    private String epasts;
    private String parole;


    public String getVárds()
    {
        Várds="Asnáte";
        return Várds;
    }

    public void setVárds(String várds)
    {
        Várds = várds;
    }

    public String getUzvárds()
    {
        Uzvárds = "Muceniece";
        return Uzvárds;
    }

    public void setUzvárds(String uzvárds)
    {
        Uzvárds = uzvárds;
    }

    public String getEpasts()
    {
        epasts = "test@test.lv";
        return epasts;
    }

    public void setEpasts(String epasts)
    {
        // TODO: 29.01.2022
        this.epasts = epasts;
    }

    public String getParole()
    {
        parole = "entropija123";
        return parole;
    }

    public void setParole(String parole)
    {
        // TODO: 29.01.2022
        this.parole = parole;
    }
}
