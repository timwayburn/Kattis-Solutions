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
    private int size;  // Number of elements in list.


    public static void main(String[] args) {

        Tree tree1 = new Tree<Integer>();
        tree1.Insert(10);
        tree1.Insert(18);
        tree1.Insert(3);
        tree1.Insert(9);
        tree1.Insert(1);
        System.out.println(tree1.Leaves());

        Tree tree3 = new Tree<Integer>(); // balanced tree
        tree3.Insert(20);
        tree3.Insert(15);
        tree3.Insert(10);
        tree3.Insert(17);
        tree3.Insert(5);
        tree3.Insert(12);
        tree3.Insert(16);
        tree3.Insert(19);
        tree3.Insert(25);
        tree3.Insert(23);
        tree3.Insert(30);
        tree3.Insert(21);
        tree3.Insert(24);
        tree3.Insert(27);
        tree3.Insert(33);
        System.out.println(tree3.Leaves());
    }

    /**
     * A tree node.
     */
    private class TreeNode {
        public T data;
        public TreeNode leftsub; // left subtree of a node.
        public TreeNode rightsub; // right subtree of a node.

        public TreeNode(T data) {
            this.data = data;
            this.leftsub = null;
            this.rightsub = null;
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
     * Test for presence of a value. (Iteratively)
     * (Worst case Time complexity O(n), searches whole single branch until leaf)
     */
    public boolean Search(T t) {
        TreeNode current = root;
        boolean iterate = true;
        if (current == null) {
            return false;
        }
        while (iterate == true) {
            if (current == null) {
                System.out.println("Not found.");
                return false;
            }
            if (current.data.compareTo(t) == 0) {
                System.out.println("Found.");
                return true;
            } else if (current.data.compareTo(t) > 0) {
                current = current.leftsub;
                System.out.println("gone left.");

            } else if (current.data.compareTo(t) < 0) {
                current = current.rightsub;
                System.out.println("gone right.");
            }
        }
        return false;
    }


    /**
     * Adds value to tree, duplicates are not allowed. (Iteratively)
     * (Worst case Time complexity O(n), adds at end of one long branch)
     */
    public boolean Insert(T t) {
        TreeNode current = root;
        boolean iterate = true;
        if (current == null) {
            root = new TreeNode(t);
            size++;
            return true;
        }
        while (iterate == true) {
            if (current.data.compareTo(t) == 0) {
                System.out.println("Found Duplicate");
                return false;
            } else if (current.data.compareTo(t) > 0) {
                if (current.leftsub == null) {
                    current.leftsub = new TreeNode(t);
                    size++;
                    return true;
                }
                current = current.leftsub;

            } else if (current.data.compareTo(t) < 0) {
                if (current.rightsub == null) {
                    current.rightsub = new TreeNode(t);
                    size++;
                    return true;
                }
                current = current.rightsub;
            }
        }
        return true;
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
        }
        else if (node.rightsub == null) {
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

        if (node.leftsub!= null) {
            helpToString(node.leftsub, stringbuilder);
            stringbuilder.append(", ");
        }

        stringbuilder.append(node.data);

        if (node.rightsub != null) {
            stringbuilder.append(", ");
            helpToString(node.rightsub, stringbuilder);
        }
    }
}

