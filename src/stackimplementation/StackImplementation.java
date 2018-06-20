package stackimplementation;
import java.util.Scanner;


class Stack
{
    public int capacity = 5;
    public int []stack = new int[5];
    public int topIndex = -1;
    
    public boolean isFull()
    {
        if(topIndex==capacity-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isEmpty()
    {
        if(topIndex==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("Cant insert further! Stack is full!");
        }
        else
        {
            topIndex++;
            stack[topIndex]=data;
        }
    }
    
    public int pop()
    {
        int element = 0;
        if(isEmpty())
        {
            System.out.println("Cant pop out elements as Stack is empty!!!");
        }
        else
        {
            element = stack[topIndex];
            topIndex--;
        }
        return element;
    }
    
    public void peek()
    {
        if(isEmpty())
        {
            System.out.println("Nothing to peek as the Stack is empty");
        }
        else
        {
            System.out.println(stack[topIndex]);
        }
    }
    
    public void traverse()
    {
        if(isEmpty())
        {
            System.out.println("Cant traverse as the Stack is empty.");
        }
        else
        {
            for(int i=0;i<=topIndex;i++)
            {
                System.out.println(stack[i]);
            }
        }
    }
    
    public int length()
    {
        return topIndex;
    }
    
}
public class StackImplementation 
{
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("1 Push an element.");
        System.out.println("2 Pop an element.");
        System.out.println("3 Peek.");
        System.out.println("4 Traverse.");
        System.out.println("5 Find length of the stack.");
        System.out.println("Enter your choice.");
        while(true)
        {
            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter an element.");
		    int data = scan.nextInt();
		    s.push(data);
		    break;
		case 2:
		    int popElement=s.pop();
                    System.out.println(popElement+" is popped out of stack.");
		    break;
		case 3:
		    s.peek();
		    break;
		case 4:
		    s.traverse();
		    break;
		case 5:
		    int len=s.length();
                    System.out.println(len+" is the length of the stack.");
		    break;
		default:
                    System.out.println("Invalid choice");
		    break;
            }
        }
        
        
    }
    
}
