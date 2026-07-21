public class TrieNode{

    HashMap<Character,TrieNode> child = new HashMap<>();
    boolean endOfWord = false ;

}



class PrefixTree {
    private TrieNode root;
    public PrefixTree() {
        root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode cur = root;
        for( char c : word.toCharArray()){
            cur.child.putIfAbsent(c,new TrieNode());
            cur = cur.child.get(c);
        }

        cur.endOfWord=true;


    }

    public boolean search(String word) {
        TrieNode cur = root;

        for( char c : word.toCharArray()){

            if(!cur.child.containsKey(c)){
                return false;
            }
             cur=cur.child.get(c);
        }
      

        return cur.endOfWord;

    }

    public boolean startsWith(String prefix) {

        TrieNode cur = root;
        for( char c : prefix.toCharArray()){

            if(!cur.child.containsKey(c)){
                return false ;
            }

                cur=cur.child.get(c);
        }
         
            return true ;
    }
}
