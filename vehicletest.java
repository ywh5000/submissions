public class vehicletest {
    public static void main(String[] args) {
        bike coolbike5000 = new bike();
        car awesomecar6000 = new car();

        coolbike5000.accelerate(5);
        awesomecar6000.accelerate(10);
    }
}

interface vehicle{
    void changegear(int gear);
    void accelerate(int amount);
    void decelerate(int amount);
}

class bike implements vehicle{
    int speed = 0;
    int gear = 0;
    
    public void changegear(int newgear){
        System.out.println("Bike Gear Changed to "+newgear);
        gear = newgear;
    }

    public void accelerate(int amount){
        System.out.println("Bike Speed increased to "+(speed+amount));
        speed += amount;
    }

    public void decelerate(int amount){
        System.out.println("Bike Speed decreased to "+(speed-amount));
        speed -= amount;
    }
}

class car implements vehicle{
    int speed = 0;
    int gear = 0;
    
    public void changegear(int newgear){
        System.out.println("Car Gear Changed to "+newgear);
        gear = newgear;
    }

    public void accelerate(int amount){
        System.out.println("Car Speed increased to "+(speed+amount));
        speed += amount;
    }

    public void decelerate(int amount){
        System.out.println("Car Speed decreased to "+(speed-amount));
        speed -= amount;
    }
}