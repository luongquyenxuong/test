public class Mirror {
    public class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node mirror(Node root) {
        if (root == null) {
            return null;
        }

        // Tạo một nút mới có cùng giá trị với nút gốc
        Node mirroredNode = new Node(root.val);

        // Đệ quy lấy hình ảnh đối xứng của cây con bên trái và cây con bên phải
        mirroredNode.left = mirror(root.right);
        mirroredNode.right = mirror(root.left);

        return mirroredNode;
    }

    //Ở câu hỏi trắc nghiệm :
    //Chọn C a binary search tree

}
