public class Calculator {

        private int a, b;
        public static int add(int a, int b) {
            return a+b;
        }

        public static int subtract(int a, int b) {
            return a-b;
        }

        public static long multiply(int a, int b) {
            return a * b;
        }

        public static double divide(int a, int b) {
            double result;
            if (b == 0) {
                throw new IllegalArgumentException("На 0 делить нельзя");
            } else {
                result = Double.valueOf(a)/Double.valueOf(b);
            }
            return result;
        }

        public static void add2(int a, int b) {
            System.out.println(a+b);
        }
        public static void subtract2(int a, int b) {
            System.out.println(a-b);
        }

        public static void multiply2(int a, int b) {
            System.out.println(a*b);
        }

        public static void divide2(int a, int b) {
            double result;
            if (b == 0) {
                throw new IllegalArgumentException("На 0 делить нельзя");
            } else {
                result = Double.valueOf(a)/Double.valueOf(b);
            }
            System.out.println(result);
        }

}

