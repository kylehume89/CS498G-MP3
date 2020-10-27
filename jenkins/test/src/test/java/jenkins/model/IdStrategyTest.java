package jenkins;

import static org.junit.Assert.assertEquals;

import jenkins.model.IdStrategy;
import org.junit.Test;

public class IdStrategyTest {

    @Test
    public void invalid() {
        String testFile = "INVALID__FILENAME$%#.txt";
        IdStrategy.CaseSensitive idStrat = new IdStrategy.CaseSensitive();
        assertEquals(idStrat.idFromFilename(testFile), testFile);
    }

    @Test
    public void valid() {
        String testFile = "ValidFileName.txt";
        IdStrategy.CaseSensitive idStrat = new IdStrategy.CaseSensitive();
        assertEquals(idStrat.idFromFilename(testFile), testFile);
    }

}