import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        if (input == 1)
            return 1;
        int sum = input * (input + 1) / 2;  // Gauss's formula
        return sum*sum;
    }

    int computeSumOfSquaresTo(int input) {
        if (input == 1)
            return 1;
        return IntStream.range(1, input+1).map(x -> x*x).sum();
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
