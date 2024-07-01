import java.util.Scanner;
public class neopat_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] a = s.nextLine().split(" ");
        int a1 = Integer.parseInt(a[0]);
        int a2 = Integer.parseInt(a[1]);
        int[][] b = new int[a1][a2];
        for(int i = 0;i<a1;i++){
            for(int j = 0;j<a2;j++){
                b[i][j]=s.nextInt();
            }
        }
        int c = 0;
        for(int i = 0;i<a1;i++){
            for(int j = 0;j<a2;j++){
                if(i==j){
                    c+=b[i][j];
                }
                //System.out.print(b[i][j]+" ");
            }
            //System.out.println();
        }
        System.out.print(c);
    }
}
