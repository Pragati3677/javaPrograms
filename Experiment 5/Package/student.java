class student {
    // Default constructor
    student() {
        this(101); // Calls the parameterized constructor
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    student(int id) {
        System.out.println("Parameterized Constructor: " + id);
    }

    public static void main(String[] args) {
        // Creating an object of Student
        student s1 = new student();
    }
}
