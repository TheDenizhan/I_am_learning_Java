public class Main {

    //interfaces
    public static void main(String[] args) {

        I_Logger[] loggers = {new SmsLogger(), new EmailLogger(),new DatabaseLogger(), new FileLogger()};
        CustomerManager customerManager = new CustomerManager(loggers);

        Customer hasan = new Customer(1,"hasan","Denizhan");

        customerManager.add(hasan);
    }
}
