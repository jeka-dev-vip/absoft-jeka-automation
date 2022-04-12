package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testAgeUserCanPlay() {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(19), "Aged user can play game");
    }
    @Test
    public void testThatTooYongUsersCanNotPlay() {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertFalse(ageChecker.canPlayGame(17), "Under aged users should not be able play");
    }
}
