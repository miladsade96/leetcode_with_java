package longest_common_prefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


class SolutionTest {
    private static Stream<Object[]> provideLongestCommonPrefixTestCases() {
        return Stream.of(
                new Object[]{new String[]{}, ""},
                new Object[]{new String[]{"a", "b"}, ""},
                new Object[]{new String[]{"flower", "flow", "flight"}, "fl"},
                new Object[]{new String[]{"dog", "racecar", "car"}, ""},
                new Object[]{new String[]{"flower", "flower", "flower", "flower"}, "flower"}
        );
    }

    @ParameterizedTest
    @MethodSource("provideLongestCommonPrefixTestCases")
    void testLongestCommonPrefix(String[] strs, String expected) {
        String result = Solution.longestCommonPrefix(strs);
        Assertions.assertEquals(expected, result);
    }
}
