public class stationsproj {
    public static void main(String[] args) {
        airport newyork = new nyc();
        airport cork = new ork();
        airport beijing = new bei();

        newyork.getinfo();
        newyork.getlocation();

        cork.getinfo();
        cork.getlocation();

        beijing.getinfo();
        beijing.getlocation();
    }
}

class airport {
    void getlocation(){
        System.out.println("none");
    }
    void getinfo(){
        System.out.println("none");
    }
}

class nyc extends airport{

    @Override
    void getlocation() {
        System.out.println("New York is in America");
    }
    
    @Override
    void getinfo(){
        System.out.println("New York has famous landmarks and food.");
    }
}

class ork extends airport{
    @Override
    void getlocation(){
        System.out.println("Cork is in Ireland");
    }
    @Override
    void getinfo(){
        System.out.println("Cork has famous landmarks and food.");
    }
}

class bei extends airport{
    @Override
    void getlocation(){
        System.out.println("Beijing is in China");
    }
    @Override
    void getinfo(){
        System.out.println("Beijing has famous landmarks and food.");
    }
}