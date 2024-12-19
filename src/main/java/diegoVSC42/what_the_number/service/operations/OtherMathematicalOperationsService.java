package diegoVSC42.what_the_number.service.operations;

public class OtherMathematicalOperationsService {
    public Double CalculateSquareRoot(Long value) {
        return Math.sqrt(value);
    }

    public Double CalculateCubeRoot(Long value) {
        return Math.cbrt(value);
    }

    public Double CalculateNaturalLogarithm(Long value) {
        return Math.log(value);
    }

    public Double CalculateLogarithmBaseTen(Long value) {
        return Math.log10(value);
    }
}
