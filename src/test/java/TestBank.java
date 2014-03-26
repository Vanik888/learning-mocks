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
    Bank mockedBank =  spy(new Bank());
    @BeforeMethod
    public void setUp() {
        System.out.println("Before method");
    }
    @Test
    public void testBank() {
        System.out.println("testMethod");
        when(mockedBank.getString("hello")).thenReturn("hello");


        System.out.println("account 1 = " + mockedBank.getAccount(1));
        System.out.println("account 1 = "+ mockedBank.getAccount(1));
        System.out.println("spyed method in use= " +mockedBank.getString("hy"));
        //is ok there was one usage , method is not overaged
        verify(mockedBank).getString("hy");
        //is not ok because there are no usage this method with this argument
        verify(mockedBank).getString("hello");
        //all ok
        verify(mockedBank, times(2)).getAccount(1);
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("After method");
    }

}
