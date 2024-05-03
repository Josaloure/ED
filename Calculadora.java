/**
 * Clase Calculadora
 * Autor : Jose Alonso Ureña
 * Fecha : 04/05/24
 */
public class Calculadora {

        private int n1;
        private int n2;

        public Calculadora(int n1, int n2) {
                this.n1 = n1;
                this.n2 = n2;
        }

        public int suma() {
                return n1 + n2;

        }

        public int resta() {
                return n1 - n2;

        }
        public int producto() {
                return n1 * n2;
        }

        public int division() {
                if (n2 == 0) {
                        throw new ArithmeticException("Division by zero");
                }
                return n1 / n2;
        }
}



