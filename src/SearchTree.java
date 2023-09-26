public class SearchTree {
    public class Node {
        public int key;
        public Object data;
        public Node left;
        public Node right;

    }



    public Object searchTree(Node root, int key) {
        while (root != null) {
            if (key == root.key) {
                return root.data;
            } else if (key < root.key) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return null;
    }




}
