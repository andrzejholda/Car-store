package Controller;

import Model.*;
import View.InformationView;
import java.util.Scanner;

public class Control {

    Scanner scanner = new Scanner(System.in);
    InformationView informationView=new InformationView();
    AllCars allCars=new AllCars();

public  void Start(){

    boolean shouldContinue = true;
    while (shouldContinue)
    {
        informationView.menu();
        int userChoice = scanner.nextInt();
        switch(userChoice)
        {
            case 1->{
                informationView.firstMenu();
                int userChoice2 = scanner.nextInt();
                if(userChoice2==1){
                    allCars.addSuv();
                }
                else if (userChoice2==2){
                    allCars.addSportCar();
                }
                else if (userChoice2==3){
                    allCars.addVan();
                }
                else if (userChoice2==4){
                   allCars.addKombi();
                }
                else if (userChoice2==5){
                   allCars.addCoupe();
                }
                else if (userChoice2==6){
                   allCars.addCabriolet();
                }
                else if (userChoice2==7){
                   allCars.addSedan();
                }
                else if (userChoice2<=0||userChoice2>7) {
                    informationView.message();
                }
            }
            case 2->{
                informationView.secondMenu();
                int userChoice3 = scanner.nextInt();
                if(userChoice3==1){
                    allCars.showSuv();
                    }
                else if (userChoice3==2){
                    allCars.showSportCar();
                }
                else if (userChoice3==3){
                   allCars.showVan();
                }else if (userChoice3==4){
                    allCars.showKombi();
                }else if (userChoice3==5){
                    allCars.showCoupe();
                }else if (userChoice3==6){
                    allCars.showKabriolet();
                }else if (userChoice3==7){
                    allCars.showSedan();
                }else if(userChoice3<=0||userChoice3>7) {
                    informationView.message();
                }
            }
            case 3-> {
                Scanner scanner = new Scanner(System.in);
                informationView.thirdMenu();
                int userChoice5 = scanner.nextInt();
                if (userChoice5 <= 0 || userChoice5 > 7) {
                    informationView.message();

                }
                else {
                    informationView.fourthMenu();
                    switch (userChoice5) {
                        case 1 -> {
                            allCars.findSuv();
                        }
                        case 2 -> {
                           allCars.findSportCar();
                        }
                        case 3 -> {
                            allCars.findVan();
                        }
                        case 4 -> {
                           allCars.findKombi();
                        }
                        case 5 -> {
                           allCars.findCoupe();
                        }
                        case 6 -> {
                          allCars.findKabriolet();
                        }
                        case 7 -> {
                           allCars.findSedan();
                        }

                    }
                }
            }
            case 4-> {shouldContinue=false; informationView.fifthMenu();}
        }
    }
}
}
