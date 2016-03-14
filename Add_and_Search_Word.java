public class Add_and_Search_Word{
 class TrieNode{
    boolean isEnd = false;
    TrieNode[] children = new TrieNode[26];
    }
  TrieNode root = new TrieNode();
  //Adds a word into the data structure.
  public void addWord(String word){
      TrieNode pNode = root;
      for(char c : word.toCharArray()){
          if(pNode.children[c-'a'] == null){
              pNode.children[c-'a'] = new TrieNode();
              pNode = pNode.children[c-'a'];
          }else
              pNode = pNode.children[c-'a'];
          }
      pNode.isEnd = true;
  }
   // Returns if the word is in the data structure. A word could
   // contain the dot character '.' to represent any one letter.
  public boolean search(String word){
        return search(word,root);
  }

  private boolean search(String word, TrieNode node){
    char [] c = word.toCharArray();
    for(int i = 0 ; i < c.length ; i++){
        if(c[i] != '.'){
            if(node.children[c[i] - 'a'] == null) return false;
            }else{
                 String wordleft = word.substring(i+1);
                 for(TrieNode pnode : node.children){
                    if(pnode != null && search(word.left,pnode))
                    return true;
                  }
                  return false;
                }
            }
            return node.isEnd;
   }
}
