/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 28 02:56:32 GMT 2018
 */

package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import tutorial.Company;
import tutorial.CurrentAccount;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CurrentAccount_ESTest extends CurrentAccount_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Company company0 = new Company("");
      CurrentAccount currentAccount0 = new CurrentAccount(company0, (-712));
      currentAccount0.balance = (-712);
      currentAccount0.deposit((-712));
      boolean boolean0 = currentAccount0.withdraw((-712));
      assertEquals((-712), currentAccount0.getBalance());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Company company0 = new Company("");
      CurrentAccount currentAccount0 = new CurrentAccount(company0, (-712));
      boolean boolean0 = currentAccount0.withdraw(2464);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Company company0 = new Company("");
      CurrentAccount currentAccount0 = new CurrentAccount(company0, (-712));
      boolean boolean0 = currentAccount0.withdraw((-712));
      assertEquals(712, currentAccount0.getBalance());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Company company0 = new Company("");
      CurrentAccount currentAccount0 = new CurrentAccount(company0, (-712));
      currentAccount0.deposit((-712));
      assertEquals((-712), currentAccount0.getBalance());
  }
}
