package Model;

import java.util.Scanner;

public class VehicleInformation {
    private  String name;
    private   String color;
    private int door;
    private  int year;
    private  String gaz;
    private  int kilometers;




//    public Model.VehicleInformation(String name, String color, int door, String gaz, int year, int kilometers) {
 //   }    // konstruktor z argumentami to konstruktor parametryzowany

    public VehicleInformation() {
    }

    public void addVehicle(){
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Podaj nazwę marki: ");
        String name = scanner.nextLine();
        System.out.println("Podaj kolor: ");
        String color = scanner.nextLine();
        System.out.println("Liczba drzwi: ");
        int door=scanner2.nextInt();
        System.out.println("Rodzaj paliwa: ");
        String gaz = scanner.nextLine();
        System.out.println("Rok produkcji: ");
        int year;
        try {
            year = scanner.nextInt();
        }
        catch(Exception e){
            System.out.println("błąd, wracamy do menu");
            return;

        }
        System.out.println("Ilość przejechanych kilometrów: ");
        int kilometers = scanner1.nextInt();
        this.name = name;
        this.color = color;
        this.door=door;
        this.year = year;
        this.gaz = gaz;
        this.kilometers = kilometers;

    }
    public void showVehicle()
    {
        System.out.println("Nazwa marki: "+this.name);
        System.out.println("Kolor: "+ this.color);
        System.out.println("Liczba drzwi: "+this.door);
        System.out.println("Rok produkcji: "+this.year);
        System.out.println("Rodzaj paliwa: "+this.gaz);
        System.out.println("Ilość przejechanych kilometrów: "+this.kilometers);

    }


    public int getYear() {
        return this.year;
    }
}
