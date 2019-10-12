import java.util.Scanner;

class GSSArray2{
    private int array[];
    private int size;
    private int elements = 0;
    
    Scanner S = new Scanner(System.in);

    GSSArray2(){
        System.out.println("Enter the initial size of the array:");
        size = S.nextInt();

        array = new int[size];
    }

    private void increaseSize(){
        size = size*2;
        int temp[] = new int[size];

        for (int i = 0; i < elements; i++) {
            temp[i] = array[i];
        }

        array = temp;
    }

    void displaySize() {
        System.out.println(size);
    }

     void insert(int x){
        if (elements == size-1) {
            increaseSize();
        }
        int i;
        for (i = elements-1; i >= 0; --i) {
            if (array[i] > x) {
                array[i+1] = array[i];
            }
            else{
                break;
            }
        }
        array[i+1] = x;
        elements++;
        
    }

    void display(){
        System.out.println("\n________\nGSSArray:\n\n");
        for (int i = 0; i < elements; i++) {
            System.out.println(array[i]);
        }
    }

    boolean delete(int x){
        for (int i = 0; i < elements; i++) {
            if(array[i] == x){
                int j;
                for (j = i; j < elements; j++) {
                    array[j] = array[j+1];
                }
                array[j] = 0;
                --elements;

                return true;
            }
            else{
                continue;
            }
        }
        return false;
    }

}

class GSSArrayDemo2{
    public static void main(String[] args) {

        GSSArray2 arr = new GSSArray2();

        Scanner S = new Scanner(System.in);

        // arr.insert(25);
        // arr.insert(35);
        // arr.insert(45);
        // arr.insert(27);
        // arr.insert(37);
        // arr.insert(1);
        // arr.insert(88);
        // arr.insert(47);
        // arr.insert(22);
        // arr.insert(41);
        // arr.insert(57);
        int choice;
        int data;

        do {
            System.out.println("1: Enter an integer ");
            System.out.println("2: Delete an integer ");
            System.out.println("3: Diplay ");
            System.out.println("0: Exit ");

            choice = S.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the integer ");
                    data = S.nextInt();
                    arr.insert(data);
                    break;

                case 2:
                    System.out.println("Enter the integer ");
                    data = S.nextInt();
                    arr.delete(data);
                    break;

                case 3:
                    arr.display();
                    break;
            
                case 0:
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Wrong Input! ");
                    break;
            }
        } while (choice != 0);
    
        
    }

}