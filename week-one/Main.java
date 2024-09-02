public class Main {
    // main class doing basic arthimetic to show how breakpoint works //
    public static void main(String[] args) {

        int  a = 2;  /* to change the values of any variable , can set the the value directly from here ,
        to make breakpoint conditional based on the state of your program*/

        int b = 5 ;  // we can step over and continue to the next line of code
        int c = 10 ;

        int aTimesB = a* b;
        // second break point which will only hit when the condition is true //

        if (aTimesB > c) {
            System.out.println("Bigger");
    }
        else
        {
            System.out.println("Smaller");
        }
    }
}
    /* Break point is point in your code where execution is briefly paused, allowing you to analyze
    the program's state, variables, and behavior at that time.
    We can-able or disable a breakpoint by right-clicking on the dot pointing for the breakpoint .*/