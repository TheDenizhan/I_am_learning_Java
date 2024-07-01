public class main {


    //inheritance
    //polimorfizm

    //S – Single Responsibility Principle (SRP)
    //O – Open-Close Principle (OCP)
    //L – Liskov Substitution Principle (LSP)
    //I – Interface Segregation Principle (ISP)
    //D – Dependency Inversion Principle (DIP)

        public static  void main(String[] args){

            individualCustomer hasan = new individualCustomer();
            hasan.customerNumber = "123456 ";

            CorporateCustomer thedenizhan = new CorporateCustomer();
            thedenizhan.customerNumber = "789123 ";

            unionCustomer abc = new unionCustomer();
            abc.customerNumber = "431234 ";


            CustomerManager customerManager = new CustomerManager();
            customerManager.add(thedenizhan);
            customerManager.add(hasan);

            Customer[] customers = {hasan,abc,thedenizhan};
             customerManager.addMultiple(customers);

        }
}
