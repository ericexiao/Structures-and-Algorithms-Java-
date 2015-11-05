package BinaryTree;

import java.util.ArrayList;

/**
 * Created by Eric on 11/5/2015.
 */
public class TreeNode {
    private TreeNode left, right;
    private Integer data;

    protected void mirror() {
        TreeNode temp = this.left;
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

    protected void setLeft(TreeNode left) {
        this.left = left;
    }

    protected void setRight(TreeNode right) {
        this.right = right;
    }

    protected Integer getData() {
        return data;
    }

    protected TreeNode getLeft() {
        return left;
    }

    protected TreeNode getRight() {
        return right;
    }
}
