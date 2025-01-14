package valid_anagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "anagram, nagaram, true",
            "rat, car, false",
            "angel, glean, true",
            "arc, car, true",
            "dusty, study, true",
            "save, vase, true",
            "dinn, diin, false"
    })
    void validAnagramTest(String s, String t, boolean result) {
        Assertions.assertEquals(result, Solution.isAnagramV1(s, t));
        Assertions.assertEquals(result, Solution.isAnagramV2(s, t));
        Assertions.assertEquals(result, Solution.isAnagramV3(s, t));
    }
}
