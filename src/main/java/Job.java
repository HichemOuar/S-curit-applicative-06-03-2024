public class Job {
    public static void main(String[] args) {
        String user = "Hichem";
        System.out.println("Hello " + user);
        int resultat=add(1,4);
        System.out.println("Le resultat est: "+resultat);
    }

    public static Integer add(int n1,int n2) {
        int result = n1+n2;
        return result;
    }

}