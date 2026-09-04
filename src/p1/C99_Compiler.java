package p1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class C99_Compiler {
	public static void main(String[] args) {
		String input = "programming";
		approach1(input);
		approach2(input);
		approach3(input);
		
	}
	
	static void approach1(String input){
		String[] strArray = input.split("");
		Map<String,Long> frequencyMap = Arrays.stream(strArray).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Approach 1");
		System.out.println(frequencyMap);
	}
	
	static void approach2(String input) {
		Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
		for (char character: input.toCharArray()) {
			frequencyMap.put(character, frequencyMap.getOrDefault(character, 0)+1);
		}
		System.out.println("Approach 2");
		System.out.println(frequencyMap);
		frequencyMap.forEach((character, count) -> System.out.print(character + " -> " + count + "; "));
	}
	
	static void approach3(String input) {
		Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
		for (char c: input.toCharArray())
			frequencyMap.merge(c, 1, Integer::sum);
		System.out.println("\nApproach 3");
		System.out.println(frequencyMap);
		frequencyMap.forEach((character, count) -> System.out.println(character + " -> " + count));
	}
}
