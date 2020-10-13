package LC3;

public class LC208_Implement_TrieMD {
    static class Trie {
        private Node root;//dummy node
        /** Initialize your data structure here. */
        public Trie() {
            //root is the top most of tree(starting point)
            root=new Node('\0');// contains no real value
        }
        /** Inserts a word into the trie. */
        public void insert(String word) {
            Node curr=root;//starts at top of tree (pointer used to traverse)
            for (int i = 0; i < word.length(); i++) {//loop through string
                char c= word.charAt(i);//the current letter we are looking at
                if (curr.children[c-'a']==null){//if index of that letter is not taken(char is not used in that level)
                    //c-a is will give a index int value between 0 to 25
                    curr.children[c-'a']=new Node(c);//create a new node with that char in it
                }
                curr=curr.children[c-'a'];// traverse word in tree
            }
            curr.isWord=true; //once the loop is done (word is complete) we mark it as a word
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
           // wordSerch uses getNode method to traverse the word if existed
        Node wordSearch=getNode(word);
        //if wordSearch is not null and last char isWord is ture then word exist
        return wordSearch !=null && wordSearch.isWord;
        }
        private Node getNode(String word){//return the last char Node of word
            Node curr=root;//starts at top of tree (pointer used to traverse)
            for (int i = 0; i < word.length(); i++) {
                char c= word.charAt(i);
                //if the letter is not in available return null
                if (curr.children[c-'a']==null) return null;
                //traverse word in tree you are seaching for
                curr=curr.children[c-'a'];
            }
            return curr;//curr is he last char in word
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            //goes to hetNode method that traverses word until reaching last char in word
            //if last char(meaning all char) exist it will return true
            return getNode(prefix)!=null;
        }

        //store the letters in a node
        class Node{
            public char c;
            public boolean isWord;
            public Node[] children; //points reference to next node

            public Node(char c) {//constructor
                this.c=c;
                isWord= false;
                children= new Node[26];//only dealing with lowercase
            }
        }
    }
}
