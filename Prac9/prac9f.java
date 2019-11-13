/**
 * prac9f
 */

class IllegalValueException extends Exception{
    IllegalValueException(String Message){
        super(Message);
    }
}

public class prac9f {
    public static void main(String[] args) {
        try {
            usertrail x = new usertrail(1, 2);
            usertrail y = new usertrail(-1, 2);
            usertrail z = new usertrail(1,0);   
        } catch (IllegalValueException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
    
}

class usertrail{
    int val1,val2;

    usertrail(int val1, int val2) throws IllegalValueException{
        if(show(val1,val2) == false){
            throw new IllegalValueException("Not Valid Numbers");
        }
        this.val1 = val1;
        this.val2 = val2;
    }

    boolean show(int val1, int val2){
        // this method returns True if both val1 and val2 are greater than or equal to zero 
        // else it'll return False

        if (val1 >= 0 && val2 >= 0) {
            return true;
        } else {
            return false;
        }
    }
}