package main.java.pratice.codewars;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

public class DragonsCurve {
    //Make the function; map the chars to Strings
    //a -> aRbFR, b -> LFaLb, otherwise -> itself
    public IntFunction<String> mapFunction = (int in)->{
        if (in == 'a'){
            return "aRbFR";
        }
        if (in == 'b'){
            return "LFaLb";
        }
        return "" + in;
    };

    /**
     * Make the curve; stream the chars repeatedly (starting with Fa) through the mapFunction n times
     * Then remove the a and b (createFilter function is useful for that)
     */
    public String createCurve(int n) {
        String ret = "Fa";
        while (n >= 0) {
            ret = Arrays.toString(ret.chars().mapToObj(mapFunction).toArray());
            n --;
        }
        return ret;
        /*
        "Fa".chars().filter(createFilter('a',true)).filter(createFilter('b',true)); //That's an IntStream with 'F' and 'a' ready to be acted upon
        return "Fa";
        */
    }

    /**
     * How many of the specified char are in the given curve?
     * Hint: createFilter could be useful for this
     */
    public long howMany(char c, String curve) {
        return 4L; //Determined by die roll; guaranteed to be random
    }

    /**
     * Create a predicate to filter the specified char; keep or remove based on keep variable
     */
    public IntPredicate createFilter(char filterWhat, boolean keep) {
        return (value) -> (filterWhat == value) == keep; //Dat predicate
    }
}
