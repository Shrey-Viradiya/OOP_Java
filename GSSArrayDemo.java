import java.util.Scanner;

class GSSArray{
    private int array[];
    private int size;
    private int elements = 0;
    
    Scanner S = new Scanner(System.in);

    GSSArray(){
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

        for (int i = 0; i <= elements; i++) {
            if (array[i] > x) {
                continue;
            }
            else{
                for (int j = elements; j >= i; --j ) {
                    array[j+1] = array[j];
                }
                array[i] = x;
                elements++;
                break;
            }
        }

        
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

class GSSArrayDemo{
    public static void main(String[] args) {

        GSSArray arr = new GSSArray();

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
        
        
        // int choice;
        // do {
            
        //     System.out.println("1: Enter an integer ");
        //     System.out.println("2: Delete an integer ");
        //     System.out.println("3: Diplay ");
        //     System.out.println("0: Exit ");

        //     choice = S.nextInt();

        //     switch (choice) {
        //         case 1:
        //             System.out.println("Enter the integer ");
        //             int data = S.nextInt();
        //             arr.insert(data);
        //             break;

        //         case 2:
        //             System.out.println("Enter the integer ");
        //             int data2 = S.nextInt();
        //             arr.delete(data2);
        //             break;

        //         case 3:
        //             arr.display();
        //             break;
            
        //         case 0:
        //             System.out.println("Exiting...");
        //             break;
                    
        //         default:
        //             System.out.println("Wrong Input! ");
        //             break;
        //     }
        // } while (choice !=0);
    

        int data;
        boolean flag = true;

        
        System.out.println("Start Entering Elements: ");  
        while (true) {
            data = S.nextInt();

            if(data == -99999){
                System.out.println("Start Deleting Elements: ");
                flag = false;
                continue;
            }else if(data == +99999){
                System.out.println("Start Entering Elements: ");              
                flag = true;
                continue;
            }else if(data == 00000){
                break;
            }

            if(flag == true){
                arr.insert(data);
            }
            else{
                arr.delete(data);
            }
        }

        arr.display();
    }

}