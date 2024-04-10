package BinarysearchTree;

public class BST {

    TreeNode root;


    public static TreeNode insert(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }
        if (val < node.val) {
            node.left = insert(node.left, val);
        } else if (val > node.val) {
            node.right = insert(node.right, val);
        }
        return node;
    }

    public void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
            return;
        }
        TreeNode current = root;
        TreeNode pre = null;
        while (true) {
            pre = current;
            if (val < current.val) {
                current = current.left;
                if (current == null) {
                    pre.left = new TreeNode(val);
                    break;
                }
            } else if (val > current.val) {
                current = current.right;
                if (current == null) {
                    pre.right = new TreeNode(val);
                    break;
                }
            }
        }
    }

    public boolean search(int val) {
        if (root == null) {
            return false;
        }
        TreeNode temp = root;
        while (temp != null) {
            if (temp.val == val) {
                return true;
            }
            if (val < temp.val) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;
    }


    public static void inOrder(TreeNode node) {
        if(node!=null) {
            inOrder(node.left);
            System.out.print(node.val+" ");
            inOrder(node.right);
        }
    }
}