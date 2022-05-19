package App;

public class History {
	private String keyWord;
	private Node word;
	
	public History(String keyWord, Node word) {
		this.keyWord = keyWord;
		this.word = word;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Node getWord() {
		return word;
	}

	public void setWord(Node word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "Từ : " + keyWord + "\nThông tin từ : " + word + "\n";
	}
	
	
}
