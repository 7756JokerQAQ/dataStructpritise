package pri;

class Stack{
    public static void main(String []args){
        Stack st=new Stack();
        st.push(1);
        System.out.println(st.pop());
        st.top();

        st.push(2);
        st.push(3);
        System.out.println(st.pop());

    }
    private int []arr;
    private int size;
    public  Stack(){
        size=0;
        arr=new int[100000];
    }
    public void push(int x){
        arr[++size]=x;
    }
    public int pop(){
        if(size==0){
            //  throw new IllegalAccessError("Error");
            System.out.println("error");
        }
        int temp= arr[size];
        size--;
        return temp;
    }
    public int top(){
        if(size==0){
            //throw new IllegalAccessError("Error");
            System.out.println("error");
        }
        return arr[size];
    }

}