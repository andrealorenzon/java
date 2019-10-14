public class Main {
    public static void main(String[] args) {
        var b1 = new Book(
                "Titolo libro",
                "Andrea L.",
                42
                );
        System.out.println(b1.getInitials());

        b1.show();

        System.out.println("-------\n");
        System.out.println(b1.toString());
    }


}
