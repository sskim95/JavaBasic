package chapter6.cooperation;

public class TakeTrans {

    public static void main(String[] args) {

        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);
        Student studentEdward = new Student("Edward", 50000);

        Bus bus100 = new Bus(100);
        studentJames.takeBus(bus100);
        studentJames.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway("2호선");
        studentTomas.takeSubway(subwayGreen);
        studentTomas.showInfo();
        subwayGreen.showInfo();

        Taxi kakoTaxi = new Taxi("카카오택시");
        studentEdward.takeTaxi(kakoTaxi);
        studentEdward.showInfo();
        kakoTaxi.showInfo();
    }
}
