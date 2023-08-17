package com.epam.rd.autocode.bstprettyprint;

public class TreeNode {
    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer data) {
        this.data = data;
    }

    public void insert(int data){
        if(data > this.data){
            if(rightChild == null){
                this.rightChild = new TreeNode(data);
            }else{
                this.rightChild.insert(data);
            }
        }else if(data < this.data){
            if(this.leftChild == null){
                this.leftChild = new TreeNode(data);
            }else{
                this.leftChild.insert(data);
            }
        }
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

}

