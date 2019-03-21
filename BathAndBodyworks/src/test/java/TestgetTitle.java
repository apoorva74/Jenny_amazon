import org.testng.annotations.Test;

public class TestgetTitle extends getTitle {

    @Test
    public static void gettitle(){
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
    }
}
