public class WordReversal {
	public static void main(String[] args) {
		String sentence = "Dog bites man";
		ReverseWords(sentence);
	}

	public static void ReverseWords(String original) {
		String[] words = original.split(" ");
		for (int i = words.length-1; i >=0; i--) {
			System.out.print(words[i] + " ");
		}
	}
}

