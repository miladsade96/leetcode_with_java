package group_anagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class SolutionTest {
    private static Stream<Object[]> provideGroupAnagramsTestCases() {
        return Stream.of(
                new Object[]{List.of("eat", "tea", "ate", "bat", "tan", "nat"),
                        new ArrayList<>(List.of(
                                List.of("eat", "tea", "ate"),
                                List.of("bat"),
                                List.of("tan", "nat")
                        ))},
                new Object[]{List.of("a"),
                        new ArrayList<>(List.of(
                                List.of("a")
                        ))},
                new Object[]{List.of(""),
                        new ArrayList<>(List.of(
                                List.of("")
                        ))}
        );
    }


    @ParameterizedTest
    @MethodSource("provideGroupAnagramsTestCases")
    void groupAnagrams(List<String> input, List<List<String>> expected) {
        Assertions.assertEquals(expected, Solution.groupAnagrams(input));
    }
}
