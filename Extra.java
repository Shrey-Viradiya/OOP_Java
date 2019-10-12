class MyDegree{
    double fahrenheit,celsius;

    MyDegree(double data, String type){
        if (type == "fahrenheit") {
            setFahren(data);
        }
        else if (type == "celsius") {
            setCel(data);
        }
    }
    void setFahren(double data){
        fahrenheit = data;
        celsius = compute2Cel(data);
    }

    double compute2Fah(double data){
        return (9.0/5.0) * data + 32;
    }

    void setCel(double data){
        celsius = data;
        fahrenheit = compute2Fah(data);
    }

    double compute2Cel(double data){
        return (5.0/9.0)*(data - 32);
    }
}



class Extra {

    public static void main(String[] args) {
        MyDegree d1 = new MyDegree(25, "celsius");

        System.out.println(d1.celsius);
        System.out.println(d1.fahrenheit);

        d1.setFahren(99);
        System.out.println(d1.celsius);
        System.out.println(d1.fahrenheit);
    }
    
}

class MyDate {
    int date, month, year;
    MyDegree high;
    MyDegree low;

    static boolean isValid(int d,int m,int y){
        if(d <= 0 || m <= 0 || m >=13 || y<=0 || d > 31){ //Simple Error
            return false;
        }
        else if((y % 4 == 0 && y % 100 != 0) && m == 2 && d > 29){ //checking whether leap year
            return false;
        }
        else if(!(y % 4 == 0 && y % 100 != 0) && m == 2 && d > 28){ //checking whether not leap year
           return false;
        }
        else if((m == 1 ||m == 3 ||m == 5 ||m == 7 ||m == 8  || m == 10 || m == 12) && d>31){ //check date according to month
            return false;
        }
        else if((m == 4 ||m == 6 ||m == 9 ||m == 11) && d>30){ //check date according to month
            return false;
        }
        else{
            return true;
        }
    }

    MyDate(int x,int y, int z){
        if(isValid(x, y, z)){
            date = x;
            month = y;
            year = z;
        }
        else{
            date = 1;
            month = 1;
            year = 2019;
            System.out.println("The Entry is invalid. By default the date will be set to: 1/1/2019");
        }
    }

    void setHigh(double data,String type){
        high = new MyDegree(data,type);
    }
    
    void setLow(double data,String type){
        low = new MyDegree(data,type);
    }

    int getDate() {return date;}
    int getMonth() {return month;}
    int getYear() { return year;}

    int getHigh(){ return (int)(high.celsius);}
    int getLow(){ return (int)(low.celsius);}

    String display(){
        return "" + date + "/" + month + "/" + year;
    }
}
