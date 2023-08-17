package com.epam.rd.autocode.bstprettyprint;

public class BinarySearchTree implements PrintableTree{
    private TreeNode root;

    @Override
    public void add(int i) {
        if(root == null){
            this.root = new TreeNode(i);
        }else{
            root.insert(i);
        }
    }

    @Override
    public String prettyPrint() {
        StringBuilder sb = new StringBuilder();
        pretty(this.root, sb, 0, "");
        return sb.toString();
    }

    private void pretty(TreeNode current, StringBuilder sb, int dir, String prefix) {
        if (current == null) {
            return;
        }

        String space = " ".repeat((""+current.getData()).length());

        if (current.getLeftChild() != null) {
            pretty(current.getLeftChild(), sb, 2, prefix + (dir == 2 ? " "+space : dir == 1 ? "│"+space : space));
        }

        sb.append(prefix).append(dir == 1 ? "└" : dir == 2 ? "┌" : "").append(current.getData());

        int index4ForkChar = (current.getLeftChild() != null? 2 : 0) + (current.getRightChild() != null? 1 : 0);

        if (current.getLeftChild() != null || current.getRightChild() != null) {
            sb.append(" ┐┘┤".charAt(index4ForkChar));
        }
        sb.append("\n");

        if (current.getRightChild() != null) {
            pretty(current.getRightChild(), sb, 1, prefix + (dir == 1 ? " "+space :dir == 2 ? "│"+space : space));
        }
    }

}
