import java.util.*;

/**
 * A Class for BSTs (Binary Search Trees)
 * Each node in the tree should be represented by an object that contains two pointers,
 * one the the left and one to the right sub-tree.
 *
 *
 * @author Tim Wayburn
 * @version 2016
 */
public class Tree<T extends Comparable<T>> {
    private TreeNode root;   // First element in list.
    private static Counter c;
    private int size;  // Number of elements in list.

    public static void main(String[] args) {

        Tree tree1 = new Tree<Integer>();
        Kattiotr io = new Kattiotr(System.in);
        int go = io.getInt();
        for (int i = 0; i < go; i++) {
            int currentint = io.getInt();
            tree1.add(currentint);
            io.println(c.count);
        }
        io.close();
    }

    /**
     * A tree node.
     */
    private class TreeNode {
        public int data;
        public TreeNode leftsub; // left subtree of a node.
        public TreeNode rightsub; // right subtree of a node.

        public TreeNode(int data) {
            this.data = data;
            this.leftsub = null;
            this.rightsub = null;
        }

        public boolean add(int data) {
            if (data == this.data)
                return false;
            else if (data < this.data) {
                if (leftsub == null) {
                    leftsub = new TreeNode(data);
                    return true;
                } else
                return leftsub.add(data);
            } else if (data > this.data) {
                if (rightsub == null) {
                    rightsub = new TreeNode(data);
                    return true;
                } else
                return rightsub.add(data);
            }
            return false;
        }
    }

    /**
     * Constructor for Tree.
     */
    public Tree() {
        root = null;
        size = 0;
    }


    /**
     * Returns the number of elements in tree. (Worst case Time complexity O(1), size a field)
     */
    public int Size() {
        return size;
    }

    /**
     * Returns the height of the tree. (Recursive) Has private helper method.  (Worst case Time complexity O(n), always goes through all elements.)
     */
    public int Depth() {
        return Depthhelp(root);
    }

    private int Depthhelp(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int rightdepth = Depthhelp(node.rightsub);
        int leftdepth = Depthhelp(node.leftsub);
        if (node.rightsub != null) {
            rightdepth++;
        }
        if (node.leftsub != null) {
            leftdepth++;
        }
        return Math.max(rightdepth, leftdepth);
    }

    /**
     * Returns the number of leaves in tree. (Recursive) Has private helper method.  (Worst case Time complexity O(n), always goes through all elements.)
     */
    public int Leaves() {
        return Leaveshelp(root);
    }

    private int Leaveshelp(TreeNode node) {
        if (node == null) {
            return 0;
        } else if (node.rightsub == null && node.leftsub == null) {
            return 1;
        } else if (node.rightsub == null) {
            return Leaveshelp(node.leftsub);
        } else if (node.leftsub == null) {
            return Leaveshelp(node.rightsub);
        }
        return Leaveshelp(node.rightsub) + Leaveshelp(node.leftsub);
    }

    /**
     * A toString method for trees. (Recursive) Has private helper method.
     *
     * @return the ordered list of all elements in String form.  (Worst case Time complexity O(n), always goes through all elements.)
     */
    public String toString() {
        StringBuilder stringbuilder = new StringBuilder("[");
        helpToString(root, stringbuilder);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    private void helpToString(TreeNode node, StringBuilder stringbuilder) {
        if (node == null)
            return;

        if (node.leftsub != null) {
            helpToString(node.leftsub, stringbuilder);
            stringbuilder.append(", ");
        }

        stringbuilder.append(node.data);

        if (node.rightsub != null) {
            stringbuilder.append(", ");
            helpToString(node.rightsub, stringbuilder);
        }
    }

    public boolean add(int value) {
        if (root == null) {
            root = new TreeNode(value);
            return true;
        } else
            return root.add(value);
    }
}

