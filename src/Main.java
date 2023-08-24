// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Queue queue = Queue.getInstance();

        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.display();

        queue.delete();

        queue.display();




}
}