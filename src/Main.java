public class Main {

    public static void main(String[] args) {

        FindMinimum findMinimum = new FindMinimum();
        int dizi [] = {3,6,9,3,7};
        int sonuc = findMinimum.minimumOperations(dizi);
        System.out.println(sonuc);

        DefanginIpAdress defanginIpAdress = new DefanginIpAdress();
        String s = defanginIpAdress.defangIPaddr("1.1.1.1");
        System.out.println(s);

    }

}
