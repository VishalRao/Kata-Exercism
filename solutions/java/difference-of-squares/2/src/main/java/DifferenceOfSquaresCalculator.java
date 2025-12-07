import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = input * (input + 1) / 2;  // Gauss's formula
        return sum*sum;
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.rangeClosed(1, input).map(x -> x*x).sum();
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
