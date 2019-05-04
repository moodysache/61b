public class Palindrome {
    public Deque<Character> wordToDeque(String word){
      Deque<Character> list= new LinkedListDeque<>();
       for(int i=0;i<word.length();i++){
           list.addLast(word.charAt(i));
       }
       return list;
    }
    public boolean isPalindrome(String word){

       for(int i=0;i<word.length()/2;i++){
           if(word.charAt(i)!=word.charAt(word.length()-i-1))
               return false;
       }
       return true;
    }

    public boolean isPalindromeDeque(String word){
        Deque x=wordToDeque(word);
        int count=x.size()/2;
        for(int i=0;i<count;i++){
            if(!x.removeFirst().equals(x.removeLast())){
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeOffByOne(String word, CharacterComparator cc){
        for(int i=0;i<word.length()/2;i++){
            if(!cc.equalChars(word.charAt(i), word.charAt(word.length()-1-i)))
                return false;
        }
        return true;
    }
    public boolean isPalindromeDequeOffByOne(String word, CharacterComparator cc){
        Deque x=wordToDeque(word);
        int count=x.size()/2;
        for(int i=0;i<count;i++){
            if(!cc.equalChars((Character)x.removeFirst(),(Character)x.removeLast())){
                return false;
            }
        }
        return true;
    }

}
