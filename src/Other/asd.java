package Other;

public class asd {
    public static void main(String[] args) {

        int[] firstArray = new int [3];
        int[] arr = new int[5];
        int[] secondArray = new int [2];
        mergeArrays(firstArray, secondArray);

//        fillAndPrintArray(arr);
    }
    static void fillAndPrintArray(int[] arr) {
        for (int a =0; a< arr.length; a++) {
            arr[a] = a*a;
            System.out.println(arr[a]);

        }


    }

    static int[] mergeArrays(int[] firstArray,int[] secondArray) {
        int [] ar = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, ar, 0, firstArray.length-1);
        System.arraycopy(secondArray, 0, ar, ar.length-1, secondArray.length-1);

return   ar;
}

    public void printArray(int[] array) {
fillArray(array);
for (int a:array) {
    System.out.println(a);
}
    }

    public void fillArray(int[] array) {
for(int i =0; i<array.length-1; i++ ){
    array [i] = i*i;
}


    }
    public static int getMinFromTwo(int x, int y){
        return Math.min(x,y);
    }
    public static int getMinFromFour(int x, int y, int m, int n){
        int min = getMinFromTwo(x, y);
        int min2 = getMinFromTwo(m, n);
        return Math.min(min, min2);
    }

    public static int incrementIfPositive(int a) {
        if (a>0){
            return a+1;
        }
        else {
            return a;
        }//Твой код здесь
    }

    public static void printJavaWord(int count) {
for (int i =0; i<count; i++){
    System.out.println("Java");
}
    }
    public static boolean determineAdult(int age) {
       if (age >= 18){
           return true;
       }
       if (age < 18&& age >0 ) {
           return false;

       }
       else {
           System.out.println("Ошибка! Введите правильный возраст.");
           return false;
       }


    }
}

