package com;/*
// A utility function to search a given key in BST
public Node search(Node root, int key)
        {
        // Base Cases: root is null or key is present at root
        if (root==null || root.key==key)
        return root;

        // val is greater than root's key
        if (root.key > key)
        return search(root.left, key);

        // val is less than root's key
        return search(root.right, key);
        }
*/

// Java program to demonstrate insert operation in binary search tree
class BinarySearchTree {

    /* Class containing left and right child of current node and key value*/
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

     boolean searchNode(int key){
        return searchNode(root,key);
    }

    private boolean searchNode(Node root, int key){
        if(root==null)
            return false;
        if(root.key==key)
            return true;
        else if(key<root.key)
            return searchNode(root.left,key);
        else
            return searchNode(root.right,key);
    }

    void deleteNode(int key){
        deleteNode(root,key);
    }

    private Node deleteNode(Node root, int key){
        if(root==null)
            return null;
        if(root.key==key) {
            //Node to be deleted is found,
            //logic to delete goes here
            //case1: node to be delete has 0 left and right child nodes
            if(root.left==null && root.right==null)
                root = null;
            //case2: node with either left or right node
            else if(root.right==null)
                return root.left;
            else if(root.right==null)
                return root.left;
            //case3: node with a sub-tree
            //find the smallest node of the sub-tree and replace that with node to be deleted
            int smallestKey = findSmallest(root);
            root.key = smallestKey;
            root.right = deleteNode(root.right,smallestKey);
            return root;
        }
        if(root.key>key)
            return deleteNode(root.left,key);
        else
            return deleteNode(root.right,key);
    }

    private int findSmallest(Node root){
        /*if(root.left==null)
            return root.key;
        else return findSmallest(root.left);*/

        return root.left == null ? root.key : findSmallest(root.left);
    }

    // This method mainly calls InorderRec()
    void inorder()  { inorderRec(root); }

    void preorder(){ preorder(root); }

    void postorder(){ postorder(root); }

    private void preorder(Node root) {
//        System.out.println("Pre-Order");
        if(root!=null){
            System.out.println("->"+root.key);
            preorder(root.left);
            preorder(root.right);
        }
    }

    // A utility function to do inorder traversal of BST
    private void inorderRec(Node root) {
//        System.out.println("In-Order");
        if (root != null) {
            inorderRec(root.left);
            System.out.println("-> "+root.key);
            inorderRec(root.right);
        }
    }

    private void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println("->"+root.key);
        }
    }

    // Driver Program to test above functions
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        /*System.out.println("In-Order");
        tree.inorder();*/
        System.out.println("Post-Order");
        tree.postorder();
        /*System.out.println("Pre-Order");
        tree.preorder();*/
        System.out.println("key 50 found:: "+tree.searchNode(50));
        tree.deleteNode(70);
    }
}