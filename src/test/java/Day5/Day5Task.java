package Day5;

public class Day5Task {
    public static void main(String[] args) {

        String rawText = "INFORMATION\n" +
                         "Sitemap\n" +
                         "Shipping & Returns\n" +
                         "Privacy Notice\n" +
                         "Conditions of Use\n" +
                         "About us\n" +
                         "Contact us";
        System.out.println(rawText);
        String[] rawTaxt1 = rawText.split("Privacy Notice");
        String secondPartText = rawTaxt1[1];
        String[] rawinfo = secondPartText.split("of Use");
        System.out.println(secondPartText);
        String info = rawinfo[0].trim();
        System.out.println(info);

    }

}
