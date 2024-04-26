package ai.developer.code.data.binarysearchtree;

public class BinarySearchTree {

    private Node root;

    public void insert(Node node) {
        this.root = insertRecursive(root, node);
    }

    private Node insertRecursive(Node root, Node node) {
        int data = node.getData();
        if(root == null) {
            root = node;
            return root;
        }

        if(data > root.getData()) {
            root.right = insertRecursive(root.right, node);
        }else {
            root.left = insertRecursive(root.left, node);
        }

        return root;
    }


    public void display() {
        displayRecursive(root);
    }

    private void displayRecursive(Node root) {
        if(root != null) {
            displayRecursive(root.left);
            System.out.println(root.getData());
            displayRecursive(root.right);
        }

    }


    public void remove(int data) {
        removeRecursive(root, data);


    }

    private Node removeRecursive(Node root, int data){
        if(root == null) {
            return root;
        } else if(data < root.getData()) {
            root.left = removeRecursive(root.left, data);
        }else if(data > root.getData())  {
            root.right =  removeRecursive(root.right, data);
        }else { // ici on a trouve le node
            if(root.left == null && root.right == null) {
                root = null;
            }else if(root.right != null) {
                int successor = successor(root);
                root.setData(successor);
                root.right = removeRecursive(root.right, successor);
            } else {
                int predecessor = predecessor(root);
                root.setData(predecessor);
                root.left = removeRecursive(root.left, predecessor);
            }
        }


        return root;
    }



    private int successor(Node root) {
        root = root.right;
        while(root.left != null) {
            root = root.left;
        }
        return root.getData();
    }

    private int predecessor(Node root) {
        root = root.left;
        while(root.right != null) {
            root = root.right;
        }
        return root.getData();
    }

}
