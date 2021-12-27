import com.company.model.customer.IT;
import com.company.model.customer.MobileApp;
import com.company.model.customer.MobileAppId1517;
import com.company.model.dairy.IceCream;
import com.company.model.dairy.Kefir;
import com.company.model.dairy.Product;
import com.company.model.dairy.Sotrudnik;
import com.company.model.digital.DigitalPriceTag;
import com.company.model.digital.DigitalRetailStore;
import com.company.model.digital.RetailStoreEquipment;

public class RunRetail {

    public static void main(String[] args) {
        Product p = new Kefir();
        p. putOnShell();
        p. takeFromShell ();
        p. scanBarCode ();
        p. putInBasket ();
        p. takeFromBasket();
        p. checkThePrice();
        p. chekName();

        Product i = new IceCream();
        i. takeFromShell();


        Product z = new Product();
        z.chekName();

        Kefir k = new Kefir();
        k.openABottle();
        k. chekName();



        IT d = new MobileApp();
        d. systemUpgrade ();

        MobileApp s = new MobileAppId1517();
        s. mobAppDownload();
        s. mobAppInstall ();
        s. mobAppOpen ();

        DigitalRetailStore e = new RetailStoreEquipment();
        e. storePurchase ();
        e. storePaymentAddToRevenue ();
        e. storeBonusPurchase ();

        RetailStoreEquipment a = new DigitalPriceTag();
        a. retailEquipmentStart ();

        DigitalPriceTag f = new DigitalPriceTag();
        f. tagsReadProductName ();

        Sotrudnik misha = new Sotrudnik();

       Product KefirMishy = new Kefir();
       Product IceCream = new IceCream();

        misha. checkPrice (KefirMishy);
        misha. checkPrice(IceCream);










    }




}
