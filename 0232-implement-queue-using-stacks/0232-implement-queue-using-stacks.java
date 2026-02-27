class MyQueue {
    int[] arr;
    int ptr;
    int first;

    public MyQueue() {
        arr=new int[1000];
        ptr=-1;
        first=-1;
        
    }
    
    public void push(int x) {
        arr[++ptr]=x;
        if(ptr==0){
            first=0;
        }
        
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        return arr[first++];
    }
    
    public int peek() {
    if(!empty()){
        return arr[first];
    }
    return -1;
    }
    
    public boolean empty() {
        return first>ptr || ptr==-1;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */