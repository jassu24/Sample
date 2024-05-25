package miittest;

import miit.BalanceAccount;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class BalanceAccountTest 
{
  BalanceAccount account;
  @Before
  public void setup()
  {
	  account=new BalanceAccount("jaspalonkar",2000);
  }
  @Test
  public void testdeposit()
  {
	  account.deposit(-500);
	  assertEquals(1500,account.getbalance());
  }
  @Test
  public void testwidhraw()
  {
	  account.withdraw(200);
	  assertEquals(1800,account.getbalance());
  }
  
}
