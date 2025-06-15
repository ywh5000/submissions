public class salary {
    public static void main(String[] args) {
        employee joe = new employee();
        joe.salset(500.0);
        System.out.println(joe.salget());
    }
}

class employee{
    private String name;
    private String job;
    private double salary;
    private double netsal;
    
    String nameget(){
        return name;
    }
    void nameset(String newname){
        name = newname;
    }
    String jobget(){
        return job;
    }
    void jobset(String newjob){
        job = newjob;
    }
    Double salget(){
        return salary;
    }
    void salset(Double newsal){
        salary = newsal; 
    }
    Double netget(){
        return netsal;
    }
    void netset(Double newnet){
        netsal = newnet; 
    }
}