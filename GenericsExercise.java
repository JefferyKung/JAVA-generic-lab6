

class GenericsExercise {
    public static void main(String[] args) {
    	
//        MyGenericClass<Integer>obj= new MyGenericClass<>(3,4,5);

    	
//        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
//        		MyGenericClass.maximum(3, 4, 5));
        
//        MyGenericClass<Double>obj2= new MyGenericClass<>(6.6, 8.8, 7.7);
        
//        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
//        		MyGenericClass.maximum(6.6, 8.8, 7.7));
    	
    	
    	System.out.println("Integer Max: " + max(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89), Integer.valueOf(3), Integer.valueOf(456), Integer.valueOf(78), Integer.valueOf(45)));
        System.out.println("Double Max: " + max(Double.valueOf(5.6), Double.valueOf(7.8), Double.valueOf(2.9), Double.valueOf(18.6), Double.valueOf(10.25), Double.valueOf(18.6001)));
        System.out.println("String Max: " + max("Strawberry", "Mango", "Apple", "Pomegranate", "Guava", "Blackberry", "Cherry", "Orange", "Date"));
        System.out.println("Boolean Max: " + max(Boolean.TRUE, Boolean.FALSE));
        System.out.println("Byte Max: " + max(Byte.MIN_VALUE, Byte.MAX_VALUE));
        System.out.println("-----------------------------------------------------------------------------------");        
    	System.out.printf("Max of %d, %d and %d is\n%d\n\n", 3, 4, 5 , max(Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5)));
        System.out.printf("Max of %.1f,%.1f and %.1f is\n%.1f\n\n", 6.6, 8.8, 7.7 , max(Double.valueOf(6.6), Double.valueOf(8.8), Double.valueOf(7.7)));
    }


public static <T extends Comparable<T>> T max(T... elements) {
    T max = elements[0];
    for (T element : elements) {
        if (element.compareTo(max) > 0) {
            max = element;
        }
    }
    return max;
}

}

//
//class MyGenericClass{
//    // determines the largest of three Comparable objects
//    public static int maximum (int x, int y, int z) {
//        int max = x; // assume x is initially the largest
//
//        if (y > max) {
//            max = y; // y is the largest so far
//        }
//
//        if (z > max) {
//            max = z; // z is the largest now
//        }
//        return max; // returns the largest object
//    }
//
//    public static double maximum(double x, double y, double z) {
//        double max = x; // assume x is initially the largest
//
//        if (y > max) {
//            max = y; // y is the largest so far
//        }
//
//        if (z > max) {
//            max = z; // z is the largest now
//        }
//        return max; // returns the largest object
//    }    
//}

//class MyGenericClass<T>{
//
//    T x;
//    T y;
//    T z;
//    T max;
//
//    MyGenericClass(T x, T y, T z){
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//    
//
//    void showNumber(){
//        System.out.println(x);
//    }
//    
//    public static <T> T maximum(T x, T y, T z) {
//        T max = x; // assume x is initially the largest
//
//        if (max.compareTo(y) < 0) {
//            max = y; // y is the largest so far
//        }
//
//        if (max.compareTo(z) < 0) {
//            max = z; // z is the largest now
//        }
//        return max; // returns the largest object
//    }   
//}
