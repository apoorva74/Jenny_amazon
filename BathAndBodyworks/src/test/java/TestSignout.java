import org.testng.annotations.Test;

public class TestSignout extends SignOut {

    @Test
    public static void logout(){
        HomePage.navigateToHomePage();
        Login.openLogin();
        Login.clickSignin();
        BodyCare.selectBodycare();
        SelectNewBodyCare.gotobodycare();
        ProductSelect.product();
        //SelectProductType.type();
        titleSelect.title();
        ProductOn.Productcream();
        AddToCart.cart();
        Checkout.checkout();
        Home.MethodtogobackHome();
        Shop.shopto();
        getTitle.gettitlehome();
        ClickShop.clickonshop();
        SelectAllHand.clickhandsoaps();
        SelectProductdropdown.handsoapproductdropdown();
        CandleHolder.clickcandleholder();
        FragranceName.clickfragrancename();
        FragranceCategory.clickfragrancecategory();
        FoamingSoaps.clickfoamingsoap();
        ExfoliatingSoap.clickexfoliatingsoap();
        NourishingSoaps.clicknourishingsoap();
        SoapHolders.clicksoapholder();
        Tulip.clicktulip();
        Handsantizer.clickhandsantizer();
        PocketBac.clickpocketbac();
        DogBarksproduct.clickproductdog();
        SignOut.gosignout();

    }
}
