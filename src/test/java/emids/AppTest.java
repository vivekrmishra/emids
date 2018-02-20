package emids;

import emids.ProspectCustomer;
import emids.Quotation;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	ProspectCustomer customer = new ProspectCustomer("Norman Gomes", "Male", 
    			34, "No", "No", "No", "Yes", "No", "Yes", "Yes", "No");
    	ProspectCustomer customer1 = new ProspectCustomer("Norman Gomes", "Male", 
    			17, "No", "No", "No", "Yes", "No", "Yes", "Yes", "No");
    	ProspectCustomer customer2 = new ProspectCustomer("Norman Gomes", "Male", 
    			27, "No", "No", "No", "Yes", "No", "Yes", "Yes", "No");
    	ProspectCustomer customer3 = new ProspectCustomer("Norman Gomes", "Male", 
    			37, "No", "No", "No", "Yes", "No", "Yes", "Yes", "No");
    	ProspectCustomer customer4 = new ProspectCustomer("Norman Gomes", "Male", 
    			44, "No", "No", "No", "Yes", "No", "Yes", "Yes", "No");
    	ProspectCustomer customer5 = new ProspectCustomer("Norman Gomes", "Male", 
    			54, "No", "No", "No", "Yes", "No", "Yes", "Yes", "No");
    	ProspectCustomer customer6 = new ProspectCustomer("Norman Gomes", "Male", 
    			34, "No", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "No");
    	ProspectCustomer customer7 = new ProspectCustomer("Mary James", "Female", 
    			17, "No", "No", "No", "Yes", "No", "Yes", "Yes", "No");
    	ProspectCustomer customer8 = new ProspectCustomer("Mary James", "Female", 
    			27, "No", "No", "No", "Yes", "No", "Yes", "Yes", "No");
    	ProspectCustomer customer9 = new ProspectCustomer("Mary James", "Female", 
    			37, "No", "No", "No", "Yes", "No", "Yes", "Yes", "No");
    	ProspectCustomer customer10 = new ProspectCustomer("Mary James", "Female", 
    			44, "No", "No", "No", "Yes", "No", "Yes", "Yes", "No");
    	ProspectCustomer customer11 = new ProspectCustomer("Mary James", "Female", 
    			54, "No", "No", "No", "Yes", "No", "Yes", "Yes", "No");
    	ProspectCustomer customer12 = new ProspectCustomer("Mary James", "Female", 
    			34, "No", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "No");
    	ProspectCustomer customer13 = new ProspectCustomer("Mary James", "Female", 
    			34, "No", "No", "No", "Yes", "No", "Yes", "Yes", "No");
        
    	assertEquals( Quotation.calculateQuote(customer), 6856 );
    	assertEquals( Quotation.calculateQuote(customer1), 5151 );
    	assertEquals( Quotation.calculateQuote(customer2), 6233 );
    	assertEquals( Quotation.calculateQuote(customer3), 7542 );
    	assertEquals( Quotation.calculateQuote(customer4), 9050 );
    	assertEquals( Quotation.calculateQuote(customer5), 13032 );
    	assertEquals( Quotation.calculateQuote(customer6), 7132 );
    	assertEquals( Quotation.calculateQuote(customer7), 5050 );
    	assertEquals( Quotation.calculateQuote(customer8), 6111 );
    	assertEquals( Quotation.calculateQuote(customer9), 7394 );
    	assertEquals( Quotation.calculateQuote(customer10), 8873 );
    	assertEquals( Quotation.calculateQuote(customer11), 12777 );
    	assertEquals( Quotation.calculateQuote(customer12), 6992 );
    	assertEquals( Quotation.calculateQuote(customer13), 6722 );
    }
}
