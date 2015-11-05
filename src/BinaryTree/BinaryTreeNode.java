package BinaryTree;

/**
 * Created by Eric on 11/5/2015.
 */
public class BinaryTreeNode {
    private BinaryTree.BinaryTreeNode left, right;
    private Integer data;

    protected void mirror() {
        BinaryTree.BinaryTreeNode temp = this.left;
        this.left = this.right;
        this.right = temp;

        if (left != null && right == null) {
            left.mirror();
        } else if (right == null && left != null) {
            right.mirror();
        }
    }

    protected void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data + " ");
        if (right != null) {
            right.printInOrder();
        }
    }

    protected void setData(Integer data) {
        this.data = data;
    }

    protected void setLeft(BinaryTree.BinaryTreeNode left) {
        this.left = left;
    }

    protected void setRight(BinaryTree.BinaryTreeNode right) {
        this.right = right;
    }

    protected Integer getData() {
        return data;
    }

    protected BinaryTree.BinaryTreeNode getLeft() {
        return left;
    }

    protected BinaryTree.BinaryTreeNode getRight() {
        return right;
    }
}
