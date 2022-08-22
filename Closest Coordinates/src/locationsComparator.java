//package locationsDistance;

//class PriorityQueueComparator implements Comparator<String> { 
//    public int compare(String str1, String str2) 
//    { 
//        String first_Str; 
//        String second_Str; 
//        first_Str = str1; 
//        second_Str = str2; 
//        return second_Str.compareTo(first_Str); 
//    } 
//} 
//



import java.util.Comparator;

public class locationsComparator implements Comparator<location> {
//put compareTo method from on line right by main and then make the priority queue using the comparator in constructor of priority queue
    @Override
    public int compare(location arg0, location arg1) {

        // Overriding compare()method of Comparator
        // for ascending order of distance

        if (arg0.getDistance() > arg1.getDistance())
            return 1;
        else if (arg0.getDistance() < arg1.getDistance())
            return -1;
        return 0;
    }

}
