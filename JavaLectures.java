//INDEX

//PROGRAMMING STYLE
//DATA TYPES
//ERRORS
//example program:area of a circle
//READING INPUT
//IDENTIFIERS
//MATH OPERATORS
//example program:displaying time
//example program: displaying temperature
//example program: displaying current time**
//example program: BMI Calculator
//LOGICAL OPERATORS
//example program: determining leap year
//example program: multiplication table
//example program: GDC
//example program: angles of a triangle
//UNICODE & ASCII
//CASTING BW CHAR AND INT & ASCII
//STRINGS AND METHODS FOR STRINGS
//FORMATTING
//ARRAYS
//example program:average of a list
//example program: increasing array size
//SORTING 1: SELECTION SORT
//example program: output formatting
//example program :REGEX SEARCH
//METHODS
//example programs:method returning array
//example program: LINEAR SEARCH ALGORITHM
//example program: FAST SEARCH ALGORITHM
//example program: ARRAY SORTING ALGORITHM //*rearrange
//SEARCH ALGORITHMS
//ARRAY LISTS 30.03.2022 //*below needs fixing
//OOP
//STACKS  //*above needs fixing
//POLYMORPHISM 07.06.2022
//TREES 14.10.2022


//PROGRAMMING STYLE 04.03.2022
//exp of the program
//@author Basak Tepe ID:2020400117
//@since Date:xx.xx.xxxx

//class:capitalize each word public class TestCode
//method&variables: capitalize each word excpt first one findMax
//spaces bw code segments, indentation
//javadoc style comments : @author, @since, @param, @return



//java is compiled in JAVA Virtual Machine - into a code called bytecode
//bytecode- machine independent only needs java interpreter of JVM
//JVM makes java architecture neutral, it can run on any platform


//a pair of {} forms a block
// () is used with methods
// [] array





//public class  JavaLectures {                      //class name
//        public static void main(String[] args){ //main method
//                System.out.println("Welcome to Java Programming!"); //statement  ;stt terminator
//        }
//}




//explaining the code:
//public - access modifier
//method - a collection of statements
//main method - a special method java looks for when running a program
//main method is the entry point of any Java code.
//void means program wont return anything.







//PRIMITIVE DATA TYPES OF JAVA 04.03.2022

//boolean
//char
//byte 8 bits
//short 16 bits
//int   32 bits
//long  64 bits  100L
//float 32 bits  100F
//double 64 bits 100D /DEFAULT


//floats are treated as doubles defaultly.


//java packages - used to group related classes
//wrapper class - provide a way to use primt. data types as objects
// ex: for int, wrapper class is Integer
//overflow - adding more than the max value in java
//ex: 2147483647 + 1 (int max limit + 1) = -21474836478

//casting - converting a number from one value to another
// ex:
//byte myNeWByte = (byte)(byteMinVal/2);
//above, we typecasted. java treats the paranths. as int as default








//ERRORS IN PROGRAMMING 04.03.2002
//syntax - does not compile
//runtime - program aborts ex: x = 1/0
//logic - due to programmer


//example: a progeam to calculate area of a circle
// instead of importing math, you can do x*x*x for x^3

//import java.lang.Math;


//public class JavaLectures {
//        public static void main(String[] args){
//                //area of a circle
//                int myRadius = 4;
//                float myPi = 3.14f;
//                float circleArea = myPi*(int)(Math.pow(myRadius,2));
//                System.out.println(circleArea);
//        }
//}


//READING INPUT 04.03.2022

//import java.util.Scanner;
//
//public class JavaLectures{
//        public static void main(String[] args){
//                //Creating a scanner object
//                Scanner input = new Scanner(System.in);
//                double basak = input.nextDouble();
//                System.out.println(basak);
//        }
//}

//java.util.Scanner; explicit
//java.util.*; implicit





//IDENTIFIERS and NAMING 03.04.2022
//java identifiers are used to name class,package,variable,method & interfaces.
//it cannot be a reserved word or true,false,null.class it cannot start with a digit
//it should be sequence of letters,digits,underscres_ and $dollar signs


//CONSTANTS
//final datatype CONSTANTNAME = VALUE;
//final double PI = 3.14159;

//NAMING
//Class names: capitalize each letter ComputeArea
//Constants: capitalize each letter connect with_ MAX_VALUE
//Variables: capitalize first letters except first one myMinValue



//MATH OPERATORS 04.03.2022
//Math.pow(4,2) - exponent
//5/2 gives 2.
//5.0/2 gives 2.5.
//5%2 gives 1.
// 1.23456E2 or 1.23456e2 = 123.456 e menas exponent (10)

// int MyVar = 14-12;
// - is the operator, 14 & 12 are the operands.
//expression: combination of variables and operators
//result = result*10;
//result+=10;

////Displaying time

//import java.util.Scanner;
//public class JavaLectures{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter seconds: ");
//        int seconds = input.nextInt();
//
//        int minutes = seconds/60;
//        int remainingSeconds = seconds%60;
//        System.out.println(seconds + " seconds equal " + minutes + " minutes " + remainingSeconds + " seconds.");
//    }
//}


////Displaying temperatures

//import java.util.Scanner;
//
//public class JavaLectures{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter a Fahrenheit temperature: ");
//        double temperatureFahrenheit = input.nextDouble();
//        double temperatureCelcius = (5*(temperatureFahrenheit-32))/9;
//        System.out.println(temperatureFahrenheit + " Fahrenheit is equal to " + temperatureCelcius + " Celcius degrees.");
//    }
//}
//

//Displaying Current Time

//BMI CALCULATOR
//
//import java.util.Scanner;
//import java.lang.Math;
//
//public class JavaLectures{
//    public static void main(String[] args){
//    Scanner input = new Scanner(System.in);
//    System.out.println("Please enter your weight in kgs: ");
//    int weight = input.nextInt();
//    System.out.println("Please enter your height in meters: ");
//    double height = input.nextDouble();
//    double BMI = weight/(Math.pow(height,2));
//    if (BMI<18.5){
//        System.out.println("You are underweight.");
//    }
//    else if (BMI<25.0){
//        System.out.println("You are normal.");
//    }
//    else if (BMI<30.0){
//        System.out.println("You are overweight.");
//    }
//    else {
//        System.out.println("You are obese.");
//    }
//
//    }
//}




//LOGICAL OPERATORS 11.03.2022

//! not = logical negation
//&& and  = logical conjunction
//|| or = logical disjunction
//^ exclusive or = logical exclusion

//if isCar == True
//if (isCar)
//if isCar!= True
//if (!isCar)

//Determining Leap Year

//import java.util.Scanner;
//
//public class JavaLectures {
//    public static void main(String[] args) {
//        Scanner input  = new Scanner(System.in);
//        System.out.println("Please enter a year: ");
//        int year = input.nextInt();
//        if(year%4 ==0 && year%100!=0) {
//            System.out.println(year +"is a leap year.");
//        }
//        else if(year%400==0) {
//            System.out.println(year +" is a leap year.");
//        }
//        else{
//            System.out.println(year + " is not a leap year.");
//        }
//    }
//}

//multiplication table
//public class JavaLectures {
//    public static void main(String[] args){
//        for (int i=0;i<10;i++) {
//            for (int j=0;j<10;j++) {
//               System.out.print(j+"X"+i+"="+ (i*j) + "  ");
//            }
//            System.out.println();
//        }
//
//    }
//}



//GDC

//import java.util.Scanner;
//
//public class JavaLectures {
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        //euclidean gdc
//        int x = input.nextInt();
//        int y = input.nextInt();
//        int z; //remainder
//        while (true) {
//            int tempx = x;
//            int tempy = y;
//            x = tempy;
//            y = tempx%tempy;
//
//            if( y==0){
//                System.out.println(x);
//                break;
//            }
//        }
//    }
//}

//import java.util.Scanner;
//
////angles of a triangle

//public class JavaLectures {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        //coordinates
//        double x1 = input.nextDouble();
//        double y1 = input.nextDouble();
//        double x2 = input.nextDouble();
//        double y2 = input.nextDouble();
//        double x3 =  input.nextDouble();
//        double y3 = input.nextDouble();
//
//        //sides
//        double a = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
//        double b = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
//        double c = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
//
//        //degrees
//
//        double A = Math.toDegrees(Math.acos((a*a-b*b-c*c))/(-2*b*c));
//        double B  = Math.toDegrees(Math.acos((b*b-a*a-c*c))/(-2*a*c));
//        double C = Math.toDegrees(Math.acos((c*c-b*b-a*a))/(-2*b*a));
//
//        //display results
//        System.out.println(A);
//        //Math.round(A*100)/100.0 - TO ROUND TO 2 DIGITS 2.954 295.4
//        System.out.println(B);
//        System.out.println(C);
//    }
//}
//

//UNICODE & ASCII 16.03.2002

//ASCII TAKES 8 BITS, UNICODE TAKES 16
//UNICODE IS A SUPERSET OF ASCII
//ASCII represents 128 characters and not standardized.
//unicode represents 2^21 characters and it is standardized.

//char myChar = "D";
//char unicodeChar  ="\u0044";





//CASTING BW CHAR AND INT & ASCII 12.03.2022

//char letter = "A";
//letter = letter + 1;
//
//we will get B

//int i = "a"; same as int i = (int)"a";
//char c = 97; same as char c = (char)97;

//if ch>=A && ch<=Z  : uppercase  ASCII: 65 - 90
//if ch>=a && ch<=z  : lowercase  ASCII: 97- 122
//if ch>=0 && ch<=9  : numerical  ASCII: 48-57

//some methods for character class
//Character.isDigit(ch)
//Character.isLetter(ch)
//Character.isUpperCase(ch)
//Character.toUpperCase(ch)

//STRINGS AND METHODS FOR STRINGS 12.03.2022

//String is not a primitive type. It is a reference type.
//Thus it does not store the value directly. Rather it stores an adress.

//String Methods

//stringname.length()
//stringname.CharAt(index)
//stringname1.concat(stringname2)
//stringname.toUpperCase()
//stringname.trim() //same as strip in python

//String Instance Methods

//Instance methods require an object of the class to be invoked.
//stringname1.concat(stringname2)
// String s3 = s1+s2

//Taking string input
//String s1 = input.next()

//Taking char input
//String s1 = input.nextLine()
//char ch = s1.charAt(0);

//Comparing strings & evaluating

//s1.equals(s2) - returns boolean
//s1.equalsIgnoreCase(s2)
//s1.compareTo(s2) - compares length and returns int
//s1.compareToIgnoreCase(s2)
//s1.startsWith(prefix)
//s1.endsWith(suffix)

//Substrings
//s1.substring(beginIndex,endIndex)

//Searching Strings
//s1.indexOf(ch,fromIndex);
//s1.indexOf(s2,fromIndex);
//s1.lastIndexOf(ch/s2,fromIndex); //returns last occurence
//
//these methods return -1 if not matched


//Conversion bw Strings and Numbers - IMPORTANT

//int myInt  = Integer.parseInt(myString); //"12" to 12
//String s1 = myInt + ""; //12 to "12"





//FORMATTING 12.03.2022

//System.out.printf(format,items);
//Sytem.out.printf("I am %s and I am %d years old",name,year)

//%b boolean
//%c char
//%d decimal
//%f floating
//%e scientific notation
//%s string






//ARRAYS 12.03.2022



//IMPORTANT ARRAY METHODS
    //          Sor:  Arrays.sort(numbers);
    //        Search: int loc = Arrays.binarySearch(names, "John")
    //        Compare: boolean result = Arrays.equals(array1, array2)
    //        Fill: Arrays.fill(list, 88)
    //        Conversion to String: String str = Arrays.toString(numbers)





//arrays store a collection of values
//Data type should be same for each array element
//once the size is fixed, it is no longer changeable

//double[] myList; //declare array - no allocation of memory
//myList = new double[10]; //create array
//myList[0] = 10.5;

//declaring and creating at the same time;
//double[] myList = new double[10];

//declaring creating and initializing at the same time;
//double[] myList = {3.3,4.4,5.5} //array initializer

//myList = array reference variable
//it stores the memory location of the array(reference)

//Empty elements
//0 numeric primitive
//\u0000 char
//false boolean

//printing out an array 2 ways
//System.out.println(Arrays.toString(myList));
//or it can be done with a loop

////initializing a list with random numbers
//
//        for (int i =0;i<myList.length();i++){
//        myList[i] = Math.random();
//        }


////initializing a list with user input
//
//        Scanner input = new java.util.Scanner(System.in); //creating the scanner
//        for (int i = 0; i<myList.length();i++){
//        myList[i] = input.nextDouble();
//        }

//algorithm to find the max in an array

//double maxVal = myList[0];
//for (int i = 0; i <myList.length;i++){
//    if myList[i]>maxVal{
//        maxVal  =myList[i];
//    }
//}


//you cannot only access elements indexed from 0 to list length - 1 in java.
// - indexes do not exist in java unlike python.


//example program:average of a list
//read inputs, calculate average and return count of elements above tha avg.

//import java.util.Scanner;
//
//public class JavaLectures{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        double[] myList = new double[n];
//        //filling in the list
//        for(int i =0; i<myList.length;i++){
//            myList[i] = input.nextDouble();
//        }
//        //computing average
//        double sum = 0;
//        for (int i =0;i<myList.length;i++){
//            sum = sum + myList[i];
//        }
//        //determining numbers above the avg
//        int aboveAvg = 0;
//        double avg = sum/n;
//        for (int i=0;i<myList.length;i++){
//            if(myList[i]>avg){
//                aboveAvg++;
//            }
//        }
//        //
//        System.out.println(aboveAvg);
//    }
//}

// double avg = findAverage(myList);


//example program: shuffling a list

//import java.util.Arrays;
//
//public class JavaLectures {
//    public static void main(String[] args) {
//        int[] myList = {1,2,3,4,5,6,7,8,9};
//
//        //changing places
//        for(int i = 0;i < myList.length;i++){
//            int shuffleIndex = (int)(Math.random()*myList.length);
//            int tempVal = myList[i];
//            myList[i] = myList[shuffleIndex];
//            myList[shuffleIndex] = tempVal;
//        }
//
//        System.out.println(Arrays.toString(myList));
//    }
//}




////copying a list


//array1 = array2 does not work, bc you are only copying the same reference;thus the same memory location.


////1) with a loop

//        int[] sourceArray = {1,2,3,4};
//        int[] targetArray = new int[sourceArray.length()];
//
//        for (int i = 0; i < sourceArray.length;i++){
//          targetArray[i] = sourceArray[i];
//        }



////2) clone method: sourceArray.clone[]
//
//        int[] sourceArray = {1,2,3,4};
//        int[] targetArray = sourceArray.clone[];
//


//3)manipulatable copying: arraycopy[a1,i1,a2,i2,count]
//
//        int[] sourceArray = {1,2,3,4};
//        int[] targetArray = new int[sourceArray.length()];
//        System.arraycopy[sourceArray,0,targetArray,0,sourceArray.length()];

//// 0 - starting index
////last parameter - number of elements


////deleting an array

//        myList = null;


////increasing the array size.
//        copy the values into a temp array
//        reassign a larger array to the first array
//        use the 3rd method to put old values from temp array to renewed array
//

//import java.util.Arrays;
//
////increasing array size
//public class JavaLectures {
//    public static void main(String[] args) {
//        int[] myFirstList = {1,2,3,4,5};
//        int[] mySecondList= {6,7,8,9};
//        int[] tempArray = new int[myFirstList.length];
//
//        System.arraycopy(myFirstList,0,tempArray,0,myFirstList.length);
//        myFirstList = new int[tempArray.length+mySecondList.length];
//        System.arraycopy(tempArray,0,myFirstList,0,tempArray.length);
//        System.arraycopy(mySecondList,0,myFirstList,tempArray.length,mySecondList.length);
//        System.out.println(Arrays.toString(myFirstList));
//    }
//}


//FOR-EACH LOOP 14.03.2022

//allows us to traverse a list w/o index variable
//traversing arrays with for-each loop


//        int[] a = {1,2,3,4}
//
//        //classical for loop
//        for (int i = 0; i<a.length();i++){
//        s.o.p(a[i]);
//        }
//
////for-each loop
//        for ( int currentNum:a){
//        s.o.p(currentNum);
//        }

//for each int currentNum in array a, do the following.

//for each is more compact than classical for loop, but it is less flexible: it cannot be manipulated by changing parameters.

//you cannot change/modify array content with for each loop
//currentNum is just a variable not related to the list a

//handy for just reading elements one by one

//RAGGED ARRAYS 21.03.2022

//ragged array: a 2-dimensional array  that has rows of different length
//a ragged array can be created by only specifying the row number
//then you need to create that row with specifying columns
//then you can fill the values

// int[][] grades  = new int[10][]; //dont specify column size
// grades[0] = new int[2]; //first student has 2 grades
//grades[0][0] = 10;
//grades[0][1] = 15;


//ARRAY EXAMPLE PROGRAMS

//SORTING: SELECTION SORT
//import java.util.Arrays;
//import java.util.Scanner;


//example program
//sort an array in increasing order
//this is the selection sort algorithm
//it finds the min value over and over, replacing it with the current element
//public class JavaLectures {
//    public static void main(String[] args){
//        Scanner input  = new Scanner(System.in);
//        int minIndex = 0;
//        int n = input.nextInt();;
//        double[] myArray = new double[n];
//
//
//        for (int i = 0 ; i<n; i++){
//            myArray[i] = input.nextDouble();
//        }
//
//        for( int i = 0 ; i<myArray.length; i++){
//            double minVal = myArray[i];
//            for ( int j = i+1; j<myArray.length; j++){
//                if (myArray[j]<minVal){
//                    minVal = myArray[j];
//                    minIndex = j;
//                }
//            }
//            double tempVar  = myArray[i];
//            myArray[i] = minVal;
//            myArray[minIndex] = tempVar;
//
//        }
//
//        System.out.println(Arrays.toString(myArray));
//
//    }
//}


//example program
//find and print the best selling product
//example for output formatting
//
//public class JavaLectures {
//    public static void main(String[] args){
//        String[] amazonProducts = {"Nike","Adidas","Vans","Converse", "Puma","NewBalance","Asics","Slazenger","Columbia","The NorthFace"};
//        //transaction info
//        String[] itemSold = {"Vans","Vans","Adidas","Asics","Asics","Asics","Puma","NorthFace","Vans","Vans","Adidas","Asics","Vans"};
//        int[] priceSold = {300,400,350,450,250,250,350,475,325,225,600,700,150};
//
//        int[] itemRevenues = new int[amazonProducts.length];
//        for(int i =0;i<amazonProducts.length;i++){
//            int itemRevenue  = 0;
//            for( int j = 0; j<itemSold.length;j++){
//                if (amazonProducts[i].equals(itemSold[j])){
//                    itemRevenue += priceSold[j];
//                }
//            }
//            itemRevenues[i] = itemRevenue;
//        }
//
//        int maxIndex = 0;
//        int maxRevenue = 0;
//        for(int i=0;i<itemRevenues.length;i++){
//            if (itemRevenues[i]>maxRevenue){
//                maxRevenue = itemRevenues[i];
//                maxIndex = i;
//            }
//        }
//
//        String maxSale = amazonProducts[maxIndex];
//
//        for(int i = 0 ; i<amazonProducts.length;i++){
//            System.out.printf("%15s",amazonProducts[i]);
//            System.out.printf("%10d $",itemRevenues[i]);
//            System.out.println();
//        }
//
//        System.out.printf("Maximum sales belong to %s", maxSale);
//    }
//}

//EXAMPLE PROGRAM: SEARCHING WITH REGEX WITHIN ARRAYS AND STRINGS

//IMPORTANT: match.find() is needed for manipulating the matching result.
//to manipulate, we need match.group(), returns a string


//import java.util.ArrayList;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import static java.lang.Float.parseFloat;
//
//public class JavaLectures {
//    public static void main(String[] args){
//        String[] cityNames = {"A","B","C","D","E","F","G","H"};
//        double[][] coordinates = {{-1,3},{-1,-1},{1,1},{3,3},{4,2},{2,0.5},{2,-1},{4,-0.5}};
//        ArrayList<String> pathLengths = new ArrayList<String>();
//        for(int i = 0 ;i<cityNames.length;i++){
//            String fromCity = cityNames[i];
//            double[] fromCoordinates = coordinates[i];
//            for(int j = i+1; j<cityNames.length;j++){
//                String toCity = cityNames[j];
//                double[] toCoordinates = coordinates[j];
//                double pathLength = Math.pow((Math.pow((fromCoordinates[0] - toCoordinates[0]),2) + Math.pow((fromCoordinates[1] - toCoordinates[1]),2)),0.5);
//                System.out.printf("From %s to %s is %.2f km distance.",fromCity,toCity,pathLength);
//                System.out.println();
//                pathLength = Math.round(pathLength*100);
//                pathLength = pathLength/100;
//                pathLengths.add(""+fromCity+toCity +pathLength);
//            }
//        }
//        //cannot extract the path length.
//        //learn regex
//        //REGEX = COMPILE MEANS FIND
//        //match.group converts it into string
//        double minPath = 100000;
//        int matchIndex = 0;
//        Pattern patternpath = Pattern.compile("[^ABCDEFGH]++"); //ignore any non digit.
//        for ( int i =  0; i<pathLengths.size();i++) {
//            Matcher match = patternpath.matcher(pathLengths.get(i));
//            if(match.find()){
//                double matchingPath = Double.parseDouble(match.group());
//                if( matchingPath < minPath){
//                    minPath = matchingPath;
//                    matchIndex = i;
//                }
//            }
//        }
//        Pattern patternCities  = Pattern.compile("[ABCDEFGH]++");
//        Matcher cityMatch  = patternCities.matcher(pathLengths.get(matchIndex));
//
//        //printing out the results
//        System.out.println("The smallest distance is " + minPath + " kilometers.");
//        if(cityMatch.find()) {
//            System.out.println("Which is in between cities " + cityMatch.group());
//        }
//    }
//}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


//METHODS 14.03.2022
//method is a collection of statements that perform an output
//has inputs, and a single output

//ex: math.pow(a,b) : 2 inputs, 1 output

//private static double findAverage(double[] numbers){
//    double sum = 0.0;
//    for(double e:numbers){
//        sum += e;
//        retırm sum/numbers.length
//        }
//}

//double - return type
//findAvg - method name
//(double[] numbers) - method parameters

//method header - first line of the method
//method signature - method name and parameter list
//if method returns nothing, we use void

//call stack
//is a special region in memory
//used for running java programs
//methods are variables are stored in call stack

//Void methods
//methods that don't return anything


//pass by value: for primitive types.
//changing the local parameter does not affect the variable.
//pass by reference: reference type variables.
//array that was passed as an arg will be affected

//in short, methods can modify arrays but not primitive types.


//call stack stores references for arrays.
// heap stores the actual values



//example programs:method returning array

//public class JavaLectures {
//    public static void main(String[] args) {
//        int[] output = generateArray(5);
//        System.out.println(Arrays.toString(output));
//    }
//
//    private static int[] generateArray(int myVal) {
//        int[] myArray = new int[10];
//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = myVal;
//        }
//        return myArray;
//    }
//}


//public class JavaLectures {
//    public static void main(String[] args){
//        int[] myList = generateArray(5);
//        System.out.println(Arrays.toString(myList));
//    }
//    private static int[] generateArray(int myVal){
//        int[] newArray = new int[4];
//        for(int i = 0; i<newArray.length;i++){
//            newArray[i] = myVal;
//        }
//        return newArray;
//    }
//}

//method returns less than 10
//public class JavaLectures {
//    public static void main(String[] args){
//        int[] numbers = {2,11,4,16,7};
//        int[] smallNum = findSmall(numbers);
//        System.out.println(Arrays.toString(smallNum));
//    }
//    private static int[] findSmall(int[] numbers){
//        int numCount = 0;
//        for(int i = 0;i<numbers.length;i++){
//            if(numbers[i]<10){
//                numCount++;
//            }
//        }
//        //creating new list
//        int[] newArray = new int[numCount];
//        // n is a varb to keep track of dif indexes of 2 lists
//        int n = 0;
//        for (int i =0;i<numbers.length;i++){
//            if(numbers[i]<10){
//                newArray[n] = numbers[i];
//                n++;
//            }
//        }
//        return newArray;
//    }
//}



//IMPORTANT NOTE: Scope of variables start from where they are declared and end in the end of the code block they are written in.
//int[] a;
// also gives compile error:
//int[] a = null;
//wont give a compile error.

//you can declare the same variable more than once in different code blocks.
//you cannot declare the same variable again within the same code block

//example program: LINEAR SEARCH 26.03.2022


//we are expecting the method to return the key (index).
//public class JavaLectures {
//    private static int linearSearch(int[] searchList, int x){
//        int key = -1;
//        boolean search = false;
//        for (int i = 0; i<searchList.length;i++){
//            if(searchList[i] == x){
//                key = i;
//                break;
//            }
//        }
//        return key;
//    }
//
//
//    public static void main(String[] args){
//        int[] numberList = {5,8,1,6,3};
//        System.out.println(linearSearch(numberList,6));
//    }
//}
//

//example program: FAST SEARCH 26.03.2022

//needs to be sorted
//public class JavaLectures {
//    private static int fastSearch(int[] numArray,int searchValue){
//        int key = 0;
//        int toplimit = numArray.length-1;
//        int lowlimit = 0 ;
//
//        while(lowlimit <= toplimit) {
//            int midIndex= numArray[(lowlimit+toplimit) / 2];
//            int midVal = numArray[midIndex];
//
//            if (midVal == searchValue) {
//                key = midIndex;
//                return key;
//            }
//            else if (midVal < searchValue) {
//                lowlimit = numArray[midIndex]+1;
//            }
//            else{
//                toplimit = midVal-1;
//            }
//        }
//
//        return key;
//    }
//
//
//    public static void main(String[] args){
//        int[] myNumbers = {1,2,3,4,5,6,7,8,9,10};
//        int myValue = 3;
//        System.out.println(fastSearch(myNumbers,myValue));
//    }
//}


//TEKRAR BAK
//example program: sorting an array in increasing order

//import java.util.Arrays;
//
//public class JavaLectures {
//    private static int[] arraySorter(int[] numArray){
//        for (int i = 1 ; i<numArray.length;i++){
//
//            //pushing elements right
//            for(int k = i; k>0; k--) {
//                if(numArray[k] < numArray[k - 1]) {
//                    int tempVal = numArray[k - 1];
//                    numArray[k - 1] = numArray[k];
//                    numArray[k] = tempVal;
//                    k--;
//                }
//            }
//        }
//        return numArray;
//    }
//
//    public static void main(String[] args){
//        int[] myArray = {2,9,5,4,8,1,6};
//        System.out.println(Arrays.toString(arraySorter(myArray)));
//    }
//
//}

//examine source code again.



//ARRAY LISTS 30.03.2022

//arrays are faster, esp for primitive types.
//arraylists are flexible.
//arrays dont have indexof, lastindex of and contains methods.
//we have to search within loops for elements in arrays.

//flexible unlike arrays. You can add elements.
//no pre-allocating

//Array lists only store objects.
//You cannot store primitive data types s.a integer or double.
//For using primitive types we need a wrapper class.

//ex:
//Integer is the wrapper class for int.
//Double is the wrapper class for double.
//Boolean, Character, Float, Byte,Short & Long
//
//import java.util.ArrayList;
//
//public class JavaLectures {
//    public static void main(String[] args){
//        //declaring
//        ArrayList<Integer> myList;
//        //declaring and creating
//        ArrayList<Integer> values = new ArrayList<>();
//
//        values.add(5); //here 5 is an object.
//
//        values.add(1,5); //inserting to a position.
//        //moves every following element 1 position right.
//
//        values.remove(5); //index
//        //values.remove("istanbul");//content
//        values.remove(Integer.valueOf(5)); //the number is removed by valueof method in order to prevent confusion with the index.
//
//        //overwriting
//        values.set(0,5);
//
//
//        //getting the object
//        int number = values.get(0);
//
//        //dont need arrays.tostring to print out values.
//        System.out.println(values);
//
//        //copying an ArrayList
//        ArrayList<Integer> valuesCopy = new ArrayList<Integer>(values);
//
//
//
//    }
//}
//when we use the add method, what we add is an object: Integer, not int.


//some array properties
//add, remove, size, set, get, contains, clear
//indexOf (returns first position), lastIndexOf, isEmpty


//example program: finding unique values

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class JavaLectures {
//    public static void main(String[] args){
//
//        ArrayList<Integer> myNumbers = new ArrayList<>();
//        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//        int addingvalue = 10000;
//        while(addingvalue!=0){
//            addingvalue = input.nextInt();
//            if(addingvalue!=0)
//                myNumbers.add(addingvalue);
//        }
//        for(int elem: myNumbers){
//            if(!uniqueNumbers.contains(elem)){
//                uniqueNumbers.add(elem);
//            }
//        }
//        System.out.println(uniqueNumbers);
//    }
//}



//example program: finding expensive products
//at the end of the arraylist slide. do after you learn about classes.


//OBJECT ORIENTED PROGRAMMING (OOP) 31.03.2022

//we are going to create classes with their own attributes and methods.

//Student s = new Student();
//s.name = "Basak";
//s.age = 20;
//s.department = "CMPE";
//s.gpa = 3.11;
//s.grades = {10,30,20,50};

//s.printInfo();




//s is an object reference variable; and it points to a student object in heap memory.


/*
 * VISIBILITY -<#<+
 * private data fields are not accessible anywhere.
 * protected data fields are accessible in subclasses.
 * public data fields are accessible everywhere.
 */


/*
 * OOP allows INHERITENCE:
 * defining new classes from existing ones
 * useful for common features
 * subclasses are inherited from superclasses.
 * subclass has more data.
 */


/* super keyword has 2 uses
 * used for calling the superclass constructor
 * used to specify super methods of same name.
 */


/*
 * we use private attributes & getters/setters to
 *regulate input from client code.
 */

/*
 * public is used to declare that you can access
 * the data field(attributes)
 * or methods
 * outside the class file.
 */


/*
 * static keyword is used to indicate shared attributes.
 *static methods can only work with static variables.
 *They are invoked by calling classname.staticmethod();
 *instance methods work both with static &instance variables.
 */


/*
 * final keyword declares CONSTANT data.
 * CLIENT
 * final double PI = 3.14;
 * CLASS
 * final static double PI = 3.14;
 */

/*
 * this has 2 uses:
 * this keyword indicates the data field/attribute.
 * or it can be used to invoke the original constructor.
 */


//STACKS 07.06.2022


/*
 *STACK is a data structure
 *adding elements means pushing them onto the stack
 *and removing elements means popping them out of the stack
 *changes are only done on the object on the top.
 *
 *
 *
 *QUEUE is another data structure
 *adding is done to the back(end)
 *removing is done from the front(top)
 *
 *
 */


/*
 * Stack has a has-a relationship, therefore it is a composition.
 * Extending a class is a is-a relationship.
 */



//POLYMORPHISM 07.06.2022

/*
If some classes/data types are derived (inherited)
from the same superclass
we can create a single arraylist
and store all types of subclasses.
 */

/*
example:
ArrayList <Shape> shapes = new ArrayList<>();
shapes.add(new Circle(10);
shapes.add(new Triangle(10);
 */

/*
DEFINITION OF POLYMORPHISM:
Supertype variables/objects can store subtype objects.
 */

/*
Shape s = new Circle(10,0,0);
superclass type - subclass type association.
polymorphism - birden fazla form alabilen
 */

/*
DYNAMIC BINDING
Java invokes the corresponding method based on
the actual type of the object.
(when there are multiple subclasses with methods named the same)
 */

/*
for (gameCharacter p : x ) //polymorphism
    p.move(); //dynamic binding
 */


/* If there is an inheritance, we can talk avt
dynamic binding & polymorphism.
Person p = new Student();
person - declared type of p
student - actual type of p
 */

/*
This can be done:
Person p = new Student();
assigning subclass to superclass.

HOWEVER,
This CANNOT be done:
Student s = new Person();
assigning superclass to subclass.

In order to do it, one might use typecasting.
Person p = new Student();
Student s = (Student) p;
We have 2 object reference variable referring to the same object.
 */

/*
Instanceof operators
public static void printDetails(Person input){
    if(input instanceof Student){
    Student s = (Student) Person;
    Sysout(s.GPA);
    }
    else if(input instanceof Instructor){
    Instructor s = (Instructor) Person;
    Sysout(s.roomNumber);
    }
}
 */


//ABSTRACT CLASSES & INTERFACES 07.06.2022


//TREES 14.10.2022
/*
A tree is a collection of nodes st
the collection can be empty, ow there is a specially designed node called the ROOT.
Remaining nodes are partitioned into n>=0 disjoint sets T1,T2,,,TN
We call this T1,T2,,,TN the SUBTREES of the ROOT
Each subtree is connected by a directed edge from root
 */




//SEARCHING ALGORITHMS
//SEQUENTIAL SEARCH: each element is checked. ex: linear search
//INTERVAL SEARCH: designed for sorted data structures.
//Interval search algorithms target the center of data structures.
//They work by dividing the search space in half. ex: binary search
