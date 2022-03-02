package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllCars {
    List<VehicleInformation> suvs = new ArrayList<>();
    List<VehicleInformation>sportCars=new ArrayList<>();
    List<VehicleInformation>vans=new ArrayList<>();
    List<VehicleInformation>kombis=new ArrayList<>();
    List<VehicleInformation>coupes=new ArrayList<>();
    List<VehicleInformation>kabriolets=new ArrayList<>();
    List<VehicleInformation>sedans=new ArrayList<>();
    Scanner scanner1=new Scanner(System.in);

    public void addSuv(){
        Suv suv = new Suv();
        add(suv,suvs);
    }
    public void addSportCar(){
        SportCar sportCar=new SportCar();
        add(sportCar,sportCars);
    }
    public void addVan(){
        Van van =new Van();
        add(van,vans);
    }
    public void addKombi(){
        Kombi kombi=new Kombi();
        add(kombi,kombis);
    }
    public void addCoupe(){
        Coupe coupe=new Coupe();
        add(coupe,coupes);
    }
    public void addCabriolet(){
        Kabriolet kabriolet=new Kabriolet();
        add(kabriolet,kabriolets);
    }
    public void addSedan(){
        Sedan sedan=new Sedan();
        add(sedan,sedans);
    }


    public void showSuv(){
        show(suvs);
    }
    public void showSportCar(){
        show(sportCars);
    }
    public void showVan(){
        show(vans);
    }
    public void showKombi(){
        show(kombis);
    }
    public void showCoupe(){
        show(coupes);
    }
    public void showKabriolet(){
        show(kabriolets);
    }
    public void showSedan(){
        show(sedans);
    }


    public void findSuv(){
        int valueToFind = scanner1.nextInt();
        find(suvs,valueToFind );
    }
    public void findSportCar(){
        int valueToFind = scanner1.nextInt();
        find(sportCars,valueToFind );
    }
    public void findVan(){
        int valueToFind = scanner1.nextInt();
        find(vans,valueToFind );
    }
    public void findKombi(){
        int valueToFind = scanner1.nextInt();
        find(kombis,valueToFind );
    }
    public void findCoupe(){
        int valueToFind = scanner1.nextInt();
        find(coupes,valueToFind );
    }
    public void findKabriolet(){
        int valueToFind = scanner1.nextInt();
        find(kabriolets,valueToFind );
    }
    public void findSedan(){
        int valueToFind = scanner1.nextInt();
        find(sedans,valueToFind );
    }



    public void find(List<VehicleInformation> temp_vehicles,int valueToFind){
        for ( VehicleInformation temp_vehicle :temp_vehicles) {
            if(temp_vehicle.getYear()==valueToFind){
                temp_vehicle.showVehicle();
            }
        }

    }
    public void show(List<VehicleInformation> temp_vehicles){
        for (VehicleInformation temp_vehicle:temp_vehicles) {
            temp_vehicle.showVehicle();

        }
    }
    public void add(VehicleInformation vehicleInformation, List<VehicleInformation> temp_vehicles){
        vehicleInformation.addVehicle();
        temp_vehicles.add(vehicleInformation);
    }
}
