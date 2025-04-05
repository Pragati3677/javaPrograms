class StaticExample {
static int count;
static {
count = 10;
System.out.println("Static block executed. Count initialized to " + count);
}
static void displayCount() {
System.out.println("Static method called. Count: " + count);
}
public static void main(String[] args) {
displayCount();
count += 5;
System.out.println("Updated Count: " +count);
}
}