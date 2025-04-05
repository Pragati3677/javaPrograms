interface Stack{
    int size = 5;
    void push(int element);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}
class integerStack implements Stack
{
    int[] stackArray = new int[size];
    int top = -1;

    public void push(int element){
        if(overflow()){
            System.out.println("stack overflow can not push"+element);
        }
        else{
            stackArray[++top]=element;
            System.out.println("pushed"+element);
        }
    }

    public int pop(){
        if(underflow()){
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            System.out.println("Popped: " + stackArray[top]);
            return stackArray[top--];
            }
           
        }
    
    public boolean overflow(){
        return top == size -1;
    }
    public boolean underflow(){
        return top == -1;
    }

    public void display(){
        if(underflow()){
            System.out.println("Stack is empty");
        }

        else{
            System.out.println("Stack elements is:");
            for(int i=0; i<=top; i++){
                System.out.println(stackArray[i]+ " ");
            }
            System.out.println();
        }

    }
}
class stackIn {

    public static void main(String[] args){
        integerStack test = new integerStack();
        test.pop();
        test.display();
        test.push(56);
        test.push(27);
        test.push(17);
        test.push(1);
        test.push(34);
        test.display();
        test.push(67);
        test.display();
        test.pop();
        test.pop();
        test.display();

    }
}