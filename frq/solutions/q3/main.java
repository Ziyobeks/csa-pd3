public class Main {
public void Test (){
 WordChecker wc = new WordChecker();
  wc.wordList = new ArrayList<String>();
  wc.wordList.add("an");
  wc.wordList.add("band");
  wc.wordList.add("band");
  wc.wordList.add("abandon");

  assertTrue(wc.isWordChain());


  wc.wordList.clear();
  wc.wordList.add("to");
  wc.wordList.add("too");
  wc.wordList.add("stool");
  wc.wordList.add("tools");

  assertTrue( ! wc.isWordChain() );
      }
  }
