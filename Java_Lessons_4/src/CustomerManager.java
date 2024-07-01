public class CustomerManager {

    public void add(Customer customer){
        System.out.println(customer.customerNumber + "Kaydedildi.");
    }

    //bulk insert
    public  void addMultiple(Customer[] customers){
        for (Customer customer : customers){
            add(customer);
        }
    }

    /*public void add(individualCustomer customer){
        System.out.println(customer.customerNumber + "Kaydedildi.");

    }
    public void add(CorporateCustomer customer){
        System.out.println(customer.comanyName + "Kaydedildi.");
    }

     */
}
