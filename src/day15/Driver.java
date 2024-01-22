package day15;

public class Driver {
    public void drive( Vehicle vehicle ){
        vehicle.run();
        System.out.println( vehicle instanceof Bus ? "<버스타입입니다>." : "<택시타입입니다>" );
        System.out.println( vehicle instanceof Taxi ? "<택시타입입니다>." : "<버스타입입니다>" );

        Bus bus2 = new Bus();
        System.out.println( bus2 instanceof Vehicle );
        System.out.println( vehicle instanceof Object);

    }
}
