class StringSearchReplace{
    String mainString;
    String searchString;
    String replaceString;
    int NoC = 0;
    int OCC[] = new int[100];

    StringSearchReplace(String n,String s, String r){
        mainString =n;
        searchString = s;
        replaceString = r;
    }

    void printAllOccurences(){
        int lastOcc =0;
        lastOcc = mainString.indexOf(searchString,0);
        while(lastOcc!=-1){  
            OCC[NoC++] = lastOcc;          
            System.out.println(lastOcc);
            lastOcc = mainString.indexOf(searchString,lastOcc+1);            
        }

        System.out.println("No of occurences: " + NoC);
    }

    void replaceOccurence(int i){
        if(i > NoC || i<=0){
            System.out.println("Not valid occurence");
        }
        else{            
            int o = OCC[i-1];
            String newString = mainString.substring(0,o);
            newString += replaceString;
            newString += mainString.substring(o + searchString.length(), mainString.length());
            System.out.println(newString);
        }
    }

    public static void main(String[] args) {
        StringSearchReplace src = new StringSearchReplace("NirmaUniversityNirmaUniversityNirmaUniversityNirmaUniversityNirmaUniversityNirmaUniversity", "Nirma", "Korma");
        src.printAllOccurences();
        src.replaceOccurence(2);
    }
}