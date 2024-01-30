class Node<T>{
    // variable declaration
    public T data;
    public Node<T> nextNode;

    // constructor for param data; sets nextNode to null
    public Node(T data){
        this.data = data;
        this.nextNode = null;
    }
    // constructor for param data and nextNode
    public Node(T data, Node<T> nextNode){
        this.data = data;
        this.nextNode = nextNode;
    }
    // getter for data
    public T getData(){
        return this.data;
    }
    // getter for nextNode
    public Node<T> getNextNode(){
        return this.nextNode;
    }
    // setting for data
    public void setData(T data){
        this.data = data;
    }
    // setter for nextNode
    public void setNextNode(Node<T> nextNode){
        this.nextNode = nextNode;
    }
}