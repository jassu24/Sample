package miittest;

import miit.Calculator;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class CalculatorTest 
{

	Calculator sum1;
	@Before
	public void setup() 
	{
	  sum1= new Calculator();
    }
}