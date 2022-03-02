package View;

public class InformationView {
    public void menu(){
        System.out.println(" Witaj w menu dodawania użytkowników oraz informacji o swoich samochodach.");
        System.out.println(" Wybierz operację: ");
        System.out.println("1. Dodaj pojazd.");
        System.out.println("2. Wyświetl imformacje o pojeździe.");
        System.out.println("3. Znajdź pojazd za pomocą roku produkcji.");
        System.out.println("4. Zakończ.");
    }
    public void firstMenu(){
        System.out.println("Jaki rodzaj pojazdu dodajesz ?");
        System.out.println("SUV - 1,Samochód sportowy - 2,Van - 3,Kombi - 4,Coupe - 5,Kabriolet - 6,Sedan - 7");
    }
    public void secondMenu(){
        System.out.println("Jaki rodzaj pojazdu chcesz wyszukać ?");
        System.out.println("SUV - 1, Samochód sportowy - 2, Model.Van - 3, Model.Kombi - 4, Model.Coupe - 5, Model.Kabriolet - 6, Model.Sedan - 7");
    }
    public void thirdMenu(){
        System.out.println("Jaki samochód chcesz znaleźć?");
        System.out.println("SUV - 1, Samochód sportowy - 2, Model.Van - 3, Model.Kombi - 4, Model.Coupe - 5, Model.Kabriolet - 6, Model.Sedan - 7");
    }
    public void fourthMenu(){
        System.out.println("Podaj rok produkcji: ");
    }
    public void fifthMenu(){
        System.out.println("Narazie");
    }
    public void message(){
        System.out.println("Podaj właściwą liczbę !");
    }
}
