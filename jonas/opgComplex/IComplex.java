import java.util.Objects;

public interface IComplex {

    String toString();

    double abs();

    double phase();

    Complex plus(Complex b);

    Complex minus(Complex b);

    Complex times(Complex b);

    Complex scale(double alpha);

    Complex conjugate();

    Complex reciprocal();

    double re();

    double im();

    Complex divides(Complex b);

    Complex exp();

    Complex sin();

    Complex cos();

    Complex tan();

    static Complex plus(Complex a, Complex b){
        return null;
    }

    boolean equals(Object x);

    int hashCode();
}
