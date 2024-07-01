public class CustomerManager{

    private  I_Logger[] loggers;
    public CustomerManager(I_Logger[] loggers) {
       this.loggers = loggers;
    }



    //loosly - tightly coupled
    public void add(Customer customer){
        System.out.println("musteri eklendi "+customer.getFirstName());
        Utils.runLoggers(loggers, customer.getFirstName());
    }
    public void delete(Customer customer){
        System.out.println("Musteri silindi "+customer.getFirstName());
        Utils.runLoggers(loggers, customer.getFirstName());
    }


}
