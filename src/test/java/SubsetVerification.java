import java.util.ArrayList;
public class SubsetVerification {


        public static void main(String[] args) {
            ArrayList<Integer> S1 = new ArrayList<>();
            S1.add(1);
            S1.add(5);
            S1.add(4);
            S1.add(6);
            S1.add(8);
            S1.add(2);

            ArrayList<Integer> S2 = new ArrayList<>();
            S2.add(5);
            S2.add(8);
            S2.add(2);

            ArrayList<Integer> S3 = new ArrayList<>();
            S3.add(5);
            S3.add(8);
            S3.add(2);
            S3.add(7);

            if (S1.containsAll(S2)) {
                System.out.println("S2 is a subset of S1");
            } else {
                System.out.println("S2 is not a subset of S1");
            }

            if (S1.containsAll(S3)) {
                System.out.println("S3 is a subset of S1");
            } else {
                System.out.println("S3 is not a subset of S1");
            }
        }
    }

