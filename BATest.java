
/**
 * Write a description of class BATest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BATest
{
    int[] savingsValues = { 1030, 1060,1091, 1123, 1156, 1190, 1225, 1261,1298,1336};
    
    @Test
    public void testAccts(){
        
        BankAccount savings = new BankAccount(4858,.03, 1000);
        BankAccount checking = new BankAccount(4857,.04, 1000);
        BankAccount moneyMarket = new BankAccount(4856,.05, 1000);
        
        for( int i = 0; i<10; i++)
        {savings.accrueInterest();
         assert(savings.getBal() == savingsValues[i]);
         checking.accrueInterest();
         moneyMarket.accrueInterest();
        }
            
}
