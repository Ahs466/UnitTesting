package com.lbg.unittesting;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;


public class SavingsAccountTest {
    @Test
    public void testSavingsAccount (){
        SavingsAccount account = new SavingsAccount("Anika", "Hussain", 2000.0, 2, 5.0,"04/12/2024");
       double amountAfterInterest = account.amountAfterInterest(account.getDeposit(), account.getInterestRate(), account.getDuration());
       double expected = 2208.16f;
       assertThat(expected,closeTo(amountAfterInterest,0.2));

    }
}
