import org.testng.annotations.Test;

public class TestProductdropdown extends SelectProductdropdown {

    @Test
    public static void productdropdown(){
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
    }
}
