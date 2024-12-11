public class Rational {
    private int num;
    private int den;
    public Rational(String rationalNumber){
        if (rationalNumber.length() == 1 && Character.isDigit(rationalNumber.charAt(0))){
            this.num = Integer.parseInt(rationalNumber);
            this.den = 1;
            return;
        }

        String[] strings = rationalNumber.split("/");
        int tempNum = Integer.parseInt(strings[0]);
        int tempDen = Integer.parseInt(strings[1]);

        if (tempDen == 0){
            throw new ArithmeticException("Знаменатель не должна быть 0!");
        }

        this.num = tempNum;
        this.den = tempDen;

        int tempNumGcd = tempNum;
        int tempDenGcd = tempDen;

        if (tempDenGcd > tempNumGcd){
            int t = tempNumGcd;
            tempNumGcd = tempDenGcd;
            tempDenGcd = t;
        }

        while(tempDenGcd != 0){
            int temp = tempNumGcd;
            tempNumGcd = tempDenGcd;
            tempDenGcd = temp%tempDenGcd;
        }

        this.num = tempNum/tempNumGcd;
        this.den = tempDen/tempNumGcd;

    }
    public int getNum(){
        return this.num;
    }
    public int getDen(){
        return this.den;
    }

    public Rational add(Rational other) {
        int tempNum = num * other.den + other.num * den;
        int tempDen = den * other.den;
        String s = String.valueOf(tempNum);
        s+="/";
        s+= String.valueOf(tempDen);
        return new Rational(s);
    }

    public Rational subtract(Rational other) {
        int tempNum = num * other.den - other.num * den;
        int tempDen = den * other.den;
        return new Rational(tempNum + "/" + tempDen);
    }

    public Rational multiply(Rational other) {
        int tempNum = num * other.num;
        int tempDen = den * other.den;
        return new Rational(tempNum + "/" + tempDen);
    }

    public Rational divide(Rational other) {
        if (other.num == 0) {
            throw new ArithmeticException("Деление на ноль невозможно!");
        }
        int tempNum = num * other.den;
        int tempDen = den * other.num;
        return new Rational(tempNum + "/" + tempDen);
    }
}
