import java.util.*;

public class WordChecker{
	private ArrayList<String> wordList;

	public WordChecker(ArrayList<String> words){
		wordList = words;
	}
	
	public Boolean isWordChain(){
		boolean chain = false;
		if(wordList != null){	
			for(int i = 1; i < wordList.size(); i++){
				if(wordList.get(i).indexOf(wordList.get(i-1)) != -1){
					chain = true;
			}
				else{
					return false;
				}
		}
	}
	return chain;
}	

	public ArrayList<String> createList(String target){
		ArrayList<String> result = new ArrayList<String>();
			for(int i = 0; i < wordList.size(); i++){
				String word = wordList.get(i);
					if(word.indexOf(target) != -1){
						result.add(word.substring(word.indexOf(target)+target.length()));
					}
				}
		return result;
	}
	
}
