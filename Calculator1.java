/*
Timothy Lin 1-1
ProblemSet 2A
Sep 29,2021
*/


import java.io.IOException;

class Calculator1 {
    private double a, b, c;
    private double x1, y1, x2, y2;
    private double x1M, y1M, x2M, y2M;
    private double term1A, lastTermA, differenceA, numberOfTermsA;
    private double term1G, differenceG, numOfTermsG;

    void display() throws IOException {

        System.out.println("QUADRATIC FORMULA");
        System.out.println(Quadratic(1, 5, 6));
        System.out.println("SLOPE FORMULA");
        System.out.println(Slope(0, 0, 2, 3));
        System.out.println("MIDPOINT FORMULA");
        System.out.println(Midpoint(0, 0, 2, 3));
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.println(SumOfArithmetic(1, 1, 5));
        System.out.println("SUM OF AN GEOMETRIC SERIES");
        System.out.println(SumOfGeometric(3, 2, 3));
    }

    String Quadratic(double a1, double b1, double c1) throws IOException {
        //a is the coefficient of x^2
        //b is the coefficient of x
        //c is the constant
        a = a1;
        b = b1;
        c = c1;
        double rootOne = ((b * -1) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double rootTwo = ((b * -1) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        return ("The solution for " + a + "x^2 + " + b + "x + " + c + " are " + rootOne + " and " + rootTwo);
    }

    String Slope(double x1s, double y1s, double x2s, double y2s) throws IOException {
        //x1 is the x coordinate of point (0,0)
        //y1 is the y coordinate of point (0,0)
        //x2 is the x coordinate of pont (2,3)
        //y2 is the y coordinate of pont (2,3)
        x1 = x1s;
        y1 = y1s;
        x2 = x2s;
        y2 = y2s;
        double rise = y2 - y1;
        double run = x2 - x1;
        double slope = rise / run;
        return ("The line connecting the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") has a slop of " + slope);
    }

    String Midpoint(double x1s, double y1s, double x2s, double y2s) throws IOException {
        //x1M is the x coordinate of point (0,0)
        //y1M is the y coordinate of point (0,0)
        //x2M is the x coordinate of pont (2,3)
        //y2M is the y coordinate of pont (2,3)
        x1M = x1s;
        y1M = y1s;
        x2M = x2s;
        y2M = y2s;
        double avgX = (x2M + x1M) / 2;
        double avgY = (y2M + y1M) / 2;
        return ("The midpoint between (" + x1M + ", " + y1M + ") and (" + x2M + ", " + y2M + ") is " + "(" + avgX + ", " + avgY + ")");
    }

    String SumOfArithmetic(double term1, double difference, double numberOfTerms) throws IOException {
        //term1A is the first term in the arithmetic sequence
        //differenceA is the difference between each term
        //lastTermA is the last term in the sequence
        //numberOfTermsA is the number of terms in the sequence

        term1A = term1;
        differenceA = difference;
        numberOfTermsA = numberOfTerms;
        lastTermA = term1A + differenceA * (numberOfTermsA - 1);

        double sum = (term1A + lastTermA) * (numberOfTermsA / 2.0);
        return ("The sum of the first " + numberOfTermsA + " terms of an arithmetic series that start with " + term1A + " and increases by " + differenceA + " is " + sum);

    }

    String SumOfGeometric(double term1, double difference, double numberOfTerms) throws IOException {
        //term1G is the first term in the arithmetic sequence
        //differenceG is the difference between each term
        //numOfTermsG is the number of terms in the sequence

        term1G = term1;
        differenceG = difference;
        numOfTermsG = numberOfTerms;


        double sum = term1G * ((1.0 - Math.pow(differenceG, numOfTermsG)) / (1.0 - differenceG));
        return ("The sum of the first " + numOfTermsG + " terms of an geometric series that start with " + term1G + " and increases by " + differenceG + " is " + sum);
    }

}


