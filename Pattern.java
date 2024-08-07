package Pattern_q;



import java.util.*;

class Pattern {

    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            char let='A';
            for (int j = 1; j <= i; j++) {
                System.out.print(let);
                let++;
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            char let='A';
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(let);
                let++;
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        char let='A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(let);
            }
            let++;
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            char let = (char)('A'+n-i);
            for (int j = 1; j <= i; j++) {
                System.out.print(let);
                let++;
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("L");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print("R");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("L");
            }
            for (int j = 1; j <= 2*(n-i)+1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print("R");
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        //erect pyramid
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        //inverted pyramid
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(n-i)+1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        //upper triangukar part
        for(int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //inverted triangular part
        for (int i = 1; i <=n-1; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        for (int i = 1; i <=n; i++) {
            char let = 'A';
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if(j<i){
                    System.out.print(let);
                    let++;
                }
                else if(j==i){
                    System.out.print(let);
                }
                else{
                    let--;
                    System.out.print(let);
                }
            }
            System.out.println();
        }
    }

    public static void pattern19(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(i-1);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=n-i+1;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2*(i-1);j>=1;j--){
                System.out.print(" ");
            }
            for(int j=n-i+1;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2*(n-i);j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern21(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern22(int n){
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int dtop = i-1;
                int dbottom = 2*n-1-i;
                int dleft = j-1;
                int dright = 2*n-1-j;
                System.out.print(n-Math.min(Math.min(dtop,dbottom),Math.min(dleft,dright))+" ");
            }
            System.out.println();
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n = ");
        int n = sc.nextInt();
        Pattern.pattern22(n);
    }
}