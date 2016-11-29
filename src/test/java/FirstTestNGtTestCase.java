import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by wkdu on 2016/11/29.
 */
public class FirstTestNGtTestCase {

    @Test
    public void atest() {
        System.out.println("This is a first test case");
        assertThat("1 + 1 =2", 2, equalTo( 1 + 1));

    }


}
