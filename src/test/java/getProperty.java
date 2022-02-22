public class getProperty {
    public static void main(String[] args) {
        System.out.println("Java version: "+ System.getProperty("java.version"));
        System.out.println("Java runtime: "+ System.getProperty("java.runtime.version"));
        System.out.println("Java vendor: "+ System.getProperty("java.vendor"));
        System.out.println("Java vendor url: "+ System.getProperty("java.vendor.url"));
        System.out.println("Java class: "+ System.getProperty("java.class.path"));
    }
}
