// import java.util.Scanner;

public class execute_binary_tree {

    public static void main(String[] args) {
        binary_tree tree;
        int root_data = 40;
        // System.out.println("Enter Root data: ");
        // Scanner S = new Scanner(System.in);
        // root_data = S.nextInt();

        tree = new binary_tree(root_data);

        tree.insert(25);
        tree.insert(78);
        tree.insert(10);
        tree.insert(3);
        tree.insert(17);
        tree.insert(32);
        tree.insert(30);
        tree.insert(38);
        tree.insert(50);
        tree.insert(93);

        tree.traverse();

    }
}