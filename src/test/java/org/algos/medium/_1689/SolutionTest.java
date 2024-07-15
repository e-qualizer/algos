package org.algos.medium._1689;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SolutionTest {

    @Test
    void minPartitionsTestOk(){
        assertEquals(Solution.minPartitions("876549"),9);
        assertEquals(Solution.minPartitions("8"),8);
        assertEquals(Solution.minPartitions("0"),0);

        assertNotEquals(Solution.minPartitions("10"), 0);
        assertNotEquals(Solution.minPartitions("4321"), 1);
    }
}
