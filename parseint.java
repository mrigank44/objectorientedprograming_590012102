public class parseint {
    public static void main(String[] args) {

        System.out.println("Integer values are:");

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            System.out.println(num);
        }
    }
}
