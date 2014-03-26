import static org.mockito.Mockito.*;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import static org.mockito.Mockito.mock;

/**
 * Created by vanik on 26.03.14.
 */
public class TestBank {
    Bank mockedBank =  mock(Bank.class);
    @BeforeMethod
    public void setUp() {
        System.out.println("Before method");
        when(mockedBank.getAccount(10)).thenReturn(10);

    }
    @Test
    public void tesBank() {
        System.out.println("testMethod");
        Assert.assertEquals(10, mockedBank.getAccount(10));
        System.out.println(mockedBank.getAccount(100));
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("After method");
    }

}
