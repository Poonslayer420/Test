/**
 * Created by Niclas on 06.07.2016.
 */

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class testTest {

@Test
    public void testSomething() {
    int i = 5;
    int j = 6;

    //assertThat("Hello",is("Hello"));
    assertThat(j,is(i));
}
}
