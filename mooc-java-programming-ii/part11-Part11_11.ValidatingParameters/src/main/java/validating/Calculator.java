package validating;


//The methods of the Calculator class should be as follows: The method factorial should only work 
// if the parameter is a non-negative number (0 or greater). The method binomialCoefficient should only 
// work when the parameters are non-negative and the subset size does not exceed the set size. 
// If these methods receive invalid parameters when they are called, they should throw an IllegalArgumentException
public class Calculator {

    public int factorial(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("non-negative number (0 or greater) is allowed.");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (setSize < 0 || subsetSize < 0 || (subsetSize > setSize) ) {
            throw new IllegalArgumentException("parameters should be non-negative and the subset size should not exceed the set size");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
