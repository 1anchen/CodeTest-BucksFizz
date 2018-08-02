import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BucksFizzTest {

    BucksFizz bucksFizz;

    @Before
    public void before(){
        bucksFizz = new BucksFizz(100);
    }

    @Test
    public void canGetCounter(){
        assertEquals(100, bucksFizz.getCounter());
    }

    @Test
    public void canGetResult(){
        bucksFizz.runCounter();
        assertEquals(100, bucksFizz.getResult().size());
    }

    @Test
    public void canGetNormalNumberOne(){
        bucksFizz.runCounter();
        assertEquals("1", bucksFizz.getResult().get(0));
    }

    @Test
    public void canGetNormalNumberTwo(){
        bucksFizz.runCounter();
        assertEquals("2", bucksFizz.getResult().get(1));
    }


    @Test
    public void canGetNormalNumberThreeBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(2));
    }

    @Test
    public void canGetNormalNumberFour(){
        bucksFizz.runCounter();
        assertEquals("4", bucksFizz.getResult().get(3));
    }

    @Test
    public void canGetNormalNumberFiveFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(4));
    }

    @Test
    public void canGetNormalNumberSixBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(5));
    }

    @Test
    public void canGetNormalNumberSeven(){
        bucksFizz.runCounter();
        assertEquals("7", bucksFizz.getResult().get(6));
    }

    @Test
    public void canGetNormalNumberEight(){
        bucksFizz.runCounter();
        assertEquals("8", bucksFizz.getResult().get(7));
    }

    @Test
    public void canGetNormalNumberNineBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(8));
    }

    @Test
    public void canGetNormalNumberTenFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(9));
    }

    @Test
    public void canGetNormalNumberEleven(){
        bucksFizz.runCounter();
        assertEquals("11", bucksFizz.getResult().get(10));
    }

    @Test
    public void canGetNormalNumberTwelveBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(11));
    }

    @Test
    public void canGetNormalNumberThirteen(){
        bucksFizz.runCounter();
        assertEquals("13", bucksFizz.getResult().get(12));
    }

    @Test
    public void canGetNormalNumberFourteen(){
        bucksFizz.runCounter();
        assertEquals("14", bucksFizz.getResult().get(13));
    }

    @Test
    public void canGetNormalNumberFifteenBucksFizz(){
        bucksFizz.runCounter();
        assertEquals("BucksFizz", bucksFizz.getResult().get(14));
    }

    @Test
    public void canGetNormalNumberSixteen(){
        bucksFizz.runCounter();
        assertEquals("16", bucksFizz.getResult().get(15));
    }

    @Test
    public void canGetNormalNumberSeventeen(){
        bucksFizz.runCounter();
        assertEquals("17", bucksFizz.getResult().get(16));
    }

    @Test
    public void canGetNormalNumberEighteenBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(17));
    }

    @Test
    public void canGetNormalNumberNineteen(){
        bucksFizz.runCounter();
        assertEquals("19", bucksFizz.getResult().get(18));
    }

    @Test
    public void canGetNormalNumberTwentyFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(19));
    }

    @Test
    public void canGetNormalNumberTwentyOneBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(20));
    }

    @Test
    public void canGetNormalNumberTwentyTwo(){
        bucksFizz.runCounter();
        assertEquals("22", bucksFizz.getResult().get(21));
    }

    @Test
    public void canGetNormalNumberTwentyThree(){
        bucksFizz.runCounter();
        assertEquals("23", bucksFizz.getResult().get(22));
    }

    @Test
    public void canGetNormalNumberTwentyFourBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(23));
    }

    @Test
    public void canGetNormalNumberTwentyFiveFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(24));
    }

    @Test
    public void canGetNormalNumberTwentySix(){
        bucksFizz.runCounter();
        assertEquals("26", bucksFizz.getResult().get(25));
    }

    @Test
    public void canGetNormalNumberTwentySevenBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(26));
    }

    @Test
    public void canGetNormalNumberTwentyEight(){
        bucksFizz.runCounter();
        assertEquals("28", bucksFizz.getResult().get(27));
    }

    @Test
    public void canGetNormalNumberTwentyNine(){
        bucksFizz.runCounter();
        assertEquals("29", bucksFizz.getResult().get(28));
    }

    @Test
    public void canGetNormalNumberThirtyBucksFizz(){
        bucksFizz.runCounter();
        assertEquals("BucksFizz", bucksFizz.getResult().get(29));
    }

    @Test
    public void canGetNormalNumberThirtyOne(){
        bucksFizz.runCounter();
        assertEquals("31", bucksFizz.getResult().get(30));
    }

    @Test
    public void canGetNormalNumberThirtyTwo(){
        bucksFizz.runCounter();
        assertEquals("32", bucksFizz.getResult().get(31));
    }


    @Test
    public void canGetNormalNumberThirtyThreeBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(32));
    }

    @Test
    public void canGetNormalNumberThirtyFour(){
        bucksFizz.runCounter();
        assertEquals("34", bucksFizz.getResult().get(33));
    }

    @Test
    public void canGetNormalNumberThirtyFiveFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(34));
    }

    @Test
    public void canGetNormalNumberThirtySixBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(35));
    }

    @Test
    public void canGetNormalNumberThirtySeven(){
        bucksFizz.runCounter();
        assertEquals("37", bucksFizz.getResult().get(36));
    }

    @Test
    public void canGetNormalNumberThirtyEight(){
        bucksFizz.runCounter();
        assertEquals("38", bucksFizz.getResult().get(37));
    }

    @Test
    public void canGetNormalNumberThirtyNineBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(38));
    }

    @Test
    public void canGetNormalNumberFortyFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(39));
    }

    @Test
    public void canGetNormalNumberFortyOne(){
        bucksFizz.runCounter();
        assertEquals("41", bucksFizz.getResult().get(40));
    }

    @Test
    public void canGetNormalNumberFortyTwoBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(41));
    }

    @Test
    public void canGetNormalNumberFortyThree(){
        bucksFizz.runCounter();
        assertEquals("43", bucksFizz.getResult().get(42));
    }

    @Test
    public void canGetNormalNumberFortyFour(){
        bucksFizz.runCounter();
        assertEquals("44", bucksFizz.getResult().get(43));
    }

    @Test
    public void canGetNormalNumberFortyFiveBucksFizz(){
        bucksFizz.runCounter();
        assertEquals("BucksFizz", bucksFizz.getResult().get(44));
    }

    @Test
    public void canGetNormalNumberFortySix(){
        bucksFizz.runCounter();
        assertEquals("46", bucksFizz.getResult().get(45));
    }

    @Test
    public void canGetNormalNumberFortySeven(){
        bucksFizz.runCounter();
        assertEquals("47", bucksFizz.getResult().get(46));
    }

    @Test
    public void canGetNormalNumberFortyEightBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(47));
    }

    @Test
    public void canGetNormalNumberFortyNine(){
        bucksFizz.runCounter();
        assertEquals("49", bucksFizz.getResult().get(48));
    }

    @Test
    public void canGetNormalNumberFiftyFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(49));
    }

    @Test
    public void canGetNormalNumberFiftyOneBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(50));
    }

    @Test
    public void canGetNormalNumberFiftyTwo(){
        bucksFizz.runCounter();
        assertEquals("52", bucksFizz.getResult().get(51));
    }

    @Test
    public void canGetNormalNumberFiftyThree(){
        bucksFizz.runCounter();
        assertEquals("53", bucksFizz.getResult().get(52));
    }

    @Test
    public void canGetNormalNumberFiftyFourBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(53));
    }

    @Test
    public void canGetNormalNumberFiftyFiveFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(54));
    }

    @Test
    public void canGetNormalNumberFiftySix(){
        bucksFizz.runCounter();
        assertEquals("56", bucksFizz.getResult().get(55));
    }

    @Test
    public void canGetNormalNumberFiftySevenBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(56));
    }

    @Test
    public void canGetNormalNumberFiftyEight(){
        bucksFizz.runCounter();
        assertEquals("58", bucksFizz.getResult().get(57));
    }

    @Test
    public void canGetNormalNumberFiftyNine(){
        bucksFizz.runCounter();
        assertEquals("59", bucksFizz.getResult().get(58));
    }

    @Test
    public void canGetNormalNumberSixtyBucksFizz(){
        bucksFizz.runCounter();
        assertEquals("BucksFizz", bucksFizz.getResult().get(59));
    }

    @Test
    public void canGetNormalNumberSixtyOne(){
        bucksFizz.runCounter();
        assertEquals("61", bucksFizz.getResult().get(60));
    }

    @Test
    public void canGetNormalNumberSixtyTwo(){
        bucksFizz.runCounter();
        assertEquals("62", bucksFizz.getResult().get(61));
    }


    @Test
    public void canGetNormalNumberSixThreeBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(32));
    }

    @Test
    public void canGetNormalNumberSixtyFour(){
        bucksFizz.runCounter();
        assertEquals("64", bucksFizz.getResult().get(63));
    }

    @Test
    public void canGetNormalNumberSixtyFiveFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(64));
    }

    @Test
    public void canGetNormalNumberSixtySixBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(65));
    }

    @Test
    public void canGetNormalNumberSixtySeven(){
        bucksFizz.runCounter();
        assertEquals("67", bucksFizz.getResult().get(66));
    }

    @Test
    public void canGetNormalNumberSixtyEight(){
        bucksFizz.runCounter();
        assertEquals("68", bucksFizz.getResult().get(67));
    }

    @Test
    public void canGetNormalNumberSixtyNineBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(68));
    }

    @Test
    public void canGetNormalNumberSeventyFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(69));
    }

    @Test
    public void canGetNormalNumberSeventyOne(){
        bucksFizz.runCounter();
        assertEquals("71", bucksFizz.getResult().get(70));
    }

    @Test
    public void canGetNormalNumberSeventyTwoBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(71));
    }

    @Test
    public void canGetNormalNumberSeventyThree(){
        bucksFizz.runCounter();
        assertEquals("73", bucksFizz.getResult().get(72));
    }

    @Test
    public void canGetNormalNumberSeventyFour(){
        bucksFizz.runCounter();
        assertEquals("74", bucksFizz.getResult().get(73));
    }

    @Test
    public void canGetNormalNumberSeventyFiveBucksFizz(){
        bucksFizz.runCounter();
        assertEquals("BucksFizz", bucksFizz.getResult().get(74));
    }

    @Test
    public void canGetNormalNumberSeventySix(){
        bucksFizz.runCounter();
        assertEquals("76", bucksFizz.getResult().get(75));
    }

    @Test
    public void canGetNormalNumberSeventySeven(){
        bucksFizz.runCounter();
        assertEquals("77", bucksFizz.getResult().get(76));
    }

    @Test
    public void canGetNormalNumberSeventyEightBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(77));
    }

    @Test
    public void canGetNormalNumberSeventyNine(){
        bucksFizz.runCounter();
        assertEquals("79", bucksFizz.getResult().get(78));
    }

    @Test
    public void canGetNormalNumberEightyFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(79));
    }

    @Test
    public void canGetNormalNumberEightyOneBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(80));
    }

    @Test
    public void canGetNormalNumberEightyTwo(){
        bucksFizz.runCounter();
        assertEquals("82", bucksFizz.getResult().get(81));
    }

    @Test
    public void canGetNormalNumberEightThree(){
        bucksFizz.runCounter();
        assertEquals("83", bucksFizz.getResult().get(82));
    }

    @Test
    public void canGetNormalNumberEightyFourBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(83));
    }

    @Test
    public void canGetNormalNumberEightyFiveFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(84));
    }

    @Test
    public void canGetNormalNumberEightySix(){
        bucksFizz.runCounter();
        assertEquals("86", bucksFizz.getResult().get(85));
    }

    @Test
    public void canGetNormalNumberEightSevenBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(86));
    }

    @Test
    public void canGetNormalNumberEightyEight(){
        bucksFizz.runCounter();
        assertEquals("88", bucksFizz.getResult().get(87));
    }

    @Test
    public void canGetNormalNumberEightyNine(){
        bucksFizz.runCounter();
        assertEquals("89", bucksFizz.getResult().get(88));
    }

    @Test
    public void canGetNormalNumberNinetyBucksFizz(){
        bucksFizz.runCounter();
        assertEquals("BucksFizz", bucksFizz.getResult().get(89));
    }

    @Test
    public void canGetNormalNumberNinetyOne(){
        bucksFizz.runCounter();
        assertEquals("91", bucksFizz.getResult().get(90));
    }

    @Test
    public void canGetNormalNumberNinetyTwo(){
        bucksFizz.runCounter();
        assertEquals("92", bucksFizz.getResult().get(91));
    }


    @Test
    public void canGetNormalNumberNinetyThreeBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(92));
    }

    @Test
    public void canGetNormalNumberNinetyFour(){
        bucksFizz.runCounter();
        assertEquals("94", bucksFizz.getResult().get(93));
    }

    @Test
    public void canGetNormalNumberNinetyFiveFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(94));
    }

    @Test
    public void canGetNormalNumberNinetySixBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(95));
    }

    @Test
    public void canGetNormalNumberNinetySeven(){
        bucksFizz.runCounter();
        assertEquals("97", bucksFizz.getResult().get(96));
    }

    @Test
    public void canGetNormalNumberNinetyEight(){
        bucksFizz.runCounter();
        assertEquals("98", bucksFizz.getResult().get(97));
    }

    @Test
    public void canGetNormalNumberNinetyNineBucks(){
        bucksFizz.runCounter();
        assertEquals("Bucks", bucksFizz.getResult().get(98));
    }

    @Test
    public void canGetNormalNumberOneHundredFizz(){
        bucksFizz.runCounter();
        assertEquals("Fizz", bucksFizz.getResult().get(99));
    }
}
