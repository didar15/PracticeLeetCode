import java.util.*;

public class main {

    static class Node {
        public int val;
        public List<Node> children = new ArrayList<Node>();

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    ", children=" + children +
                    '}';
        }
    };

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        //edge cases if given empty input
        if (digits==null || digits.length()==0) return result;
        //mapping each number to letter to String array
        String[] mapping = {"0", "1", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //recursion call to method nesarS
        helper(result, digits, "", 0, mapping);
        return result;
    }

    private static void helper(List<String> result, String inputDigits, String current, int index, String[] mapping) {
        //base case when current position reaches end of input Digits
        if (index==inputDigits.length()) {
            result.add(current);// add cuurent ctring into list each resursion
            return;
        }
        //[inputDigits.charAt(index)-'0'] will convert string number to int
        String letters= mapping[inputDigits.charAt(index)-'0'];
        for (int i = 0; i < letters.length(); i++) {//loop through each combination
            //start recursion
            helper(result, inputDigits,current+letters.charAt(i), index+1, mapping);
            //current+letters.charAt(i) will have as many chars as there are digits
            // since that is when we will add to list
            //each time we recurse to the next index+1 then wait unitl loop is done
        }

    }

    public static void main(String[] args) {
//        TreeNode tree= new TreeNode(2);
//        tree.left=new TreeNode(1);
//        tree.right=new TreeNode(4);
//        tree.right.right=new TreeNode(5);
//        tree.right.left=new TreeNode(3);
//String s = "abcabcbb";
//        ListNode l1=new ListNode(1);
//        l1.next=new ListNode(5);
       // l1.next.next=new ListNode(7);


//        Node root = new Node(1);
//
//        root.children.add(new Node(3));
//        root.children.add(new Node(2));
//        root.children.add(new Node(4));
//
//        root.children.get(0).children.add(new Node(5));
//        root.children.get(0).children.add(new Node(6));

         int [][] a= {{0,1,0,0},
                      {1,1,1,0},
                      {0,1,0,0},
                      {1,1,0,0}};
       // System.out.println(letterCombinations("23"));
       //String [] strs = {"apple", "pen"};
       // List<String> wordList=Arrays.asList("hot","dot","dog","lot","log","cog");
        System.out.println(letterCombinations("233"));
        // String str= "Hello World";
    }
}
