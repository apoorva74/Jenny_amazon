import org.testng.annotations.Test;

public class TestShop extends Shop {

    @Test
    public static void getTestshop() {
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
        Shop.shopto();

    }
}
