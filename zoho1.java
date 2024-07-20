public class zoho1{
    public static void main(String[] args) {
        String a = "race a car";
        String b = a.replaceAll("[:,; ]","");
        String c = "";
        for(int i = b.length()-1;i>=0;i--){
            c = c+b.charAt(i);
        }
        String d = b.toLowerCase();
        String e = c.toLowerCase();

        if(d.equals(e)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}