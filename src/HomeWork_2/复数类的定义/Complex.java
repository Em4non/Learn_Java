package HomeWork_2.复数类的定义;

class Complex {
    double RealPart;
    double ImaginaryPart;

    public double getImaginaryPart() {
        return ImaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        ImaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return RealPart;
    }

    public Complex() {
    }

    public void setRealPart(double realPart) {
        RealPart = realPart;
    }

    public Complex(double realPart, double imaginaryPart) {
        RealPart = realPart;
        ImaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        return RealPart +
                "+" + ImaginaryPart +
                'i';
    }

    public String add(Complex t) {
        double realSum;
        double imaginarySum;
        realSum = RealPart + t.getRealPart();
        imaginarySum = ImaginaryPart + t.getImaginaryPart();
        if (imaginarySum > 0 && realSum != 0)
            return realSum + "+" + imaginarySum + "i";
        else {
            if (realSum == 0) return String.valueOf(imaginarySum) + "i";
            else if (imaginarySum == 0) return String.valueOf(realSum);
            else return String.valueOf(realSum) + String.valueOf(imaginarySum) + "iii";
        }
    }

    public String sub(Complex t) {
        double realSum;
        double imaginarySum;
        realSum = RealPart - t.getRealPart();
        imaginarySum = ImaginaryPart - t.getImaginaryPart();
        if (imaginarySum > 0)
            return realSum + "+" + imaginarySum + 'i';
        else {
            if (realSum == 0) return String.valueOf(imaginarySum) + 'i';
            else if (imaginarySum == 0) return String.valueOf(realSum);
            else return String.valueOf(realSum) + String.valueOf(imaginarySum) + 'i';
        }

    }
}
