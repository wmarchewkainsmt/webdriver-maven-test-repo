import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by banfi on 25.03.15.
 */
public class OnetTest {
    TstClass tstClass = new TstClass();

    @Test
    public void testOnetOpen(){
        tstClass.getOnetAndDoNothing();
        if(tstClass.returnTitle().equals("Onet.pl")){
          tstClass.driverQuit();
        }


    }
}
