import org.testng.annotations.Test;

public class TestFoamingsoaps extends FoamingSoaps {

    @Test
    public static void category(){
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
    }
}
