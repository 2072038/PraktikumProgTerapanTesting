import com.pterapan.demotesting.DemoClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DemoClassTest {
    @BeforeAll
    static void setUp() {
        System.out.println("Testing untuk akun user");
    }

    @Test
    void returnPassword() {
        System.out.println("Testing password user");
        DemoClass demo = new DemoClass();
        Boolean temp = demo.returnPassword("123456");
        assertEquals(true, temp);
    }

    @Test
    void returnUsername() {
        System.out.println("Testing username user");
        DemoClass demo = new DemoClass();
        String username = demo.returnUsername();
        assertEquals("JohnDoe", username);
    }

    @Test
    void returnPurchase() {
        System.out.println("Testing hasil pembelian user");
        DemoClass demo = new DemoClass();
        Object[] purchase = demo.returnPurchase();
        Object[] products = {"apple", "milk", "biscuits", "beef"};
        assertArrayEquals(products, purchase);
    }
}
