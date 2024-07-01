public class CustomerManager {

    public void add(Logger logger){
        //musteri ekleme kodlari
        System.out.println("musteri eklendi");

        logger.log();

        /*bu sekilde yazmakta kod karmasikligina ve hatalara neden olur
        DatabaseLogger logger = new DatabaseLogger();
        logger.log();*/
    }

}
