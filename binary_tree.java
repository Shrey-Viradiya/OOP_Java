class node {
    int data;
    node left;
    node right;
    
    node(int x){
        data = x;
        left = null;
        right = null;
    }
}

public class binary_tree {
    node root = null;
    int count;

    binary_tree(int data){
        root = new node(data);
        ++count;
    }

    void insert(int data){
        node iterNode = root;
        while (true) {       

            if(data <= iterNode.data && iterNode.left != null){
                iterNode = iterNode.left;
                continue;
            }
            else if(data > iterNode.data && iterNode.right != null){
                iterNode = iterNode.right;
                continue;
            }
            else if(data <= iterNode.data && iterNode.left == null){
                iterNode.left = new node(data);
                break;
            }
            else if(data > iterNode.data && iterNode.right == null){
                iterNode.right = new node(data);
                break;
            }
        }
        ++count;
    }

    

    void traverse(){
        System.out.println("Number of elements: " + count);
        printAscending(root);
    }

       
    
    private void printAscending(node iter) {
        
        if(iter != null) {
            System.out.println(iter.data);
            printAscending(iter.left);               
            printAscending(iter.right);
        }
    }

}