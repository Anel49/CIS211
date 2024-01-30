public class UnOrderedChain<T> implements ChainedNode<T>{
    
    Node<T> head;

    public UnOrderedChain(){
        this.head = null;
    }
    public UnOrderedChain(Node<T> head){
        this.head = head;
    }
    // adds element into the chain and returns boolean value ??
    @Override public boolean add(T element){
        return false;
    }
    // removes the first element from the chain and returns the element removed
    // if there is no element, returns null
    @Override public T remove(){
        return null;
    }
    // revmoes param element from the chain and returns the element
    // if the remove fails, returns null
    @Override public T remove(T element){
        return null;
    }
    // searches for param element in the chain and returns true if found, else returns false
    // accepts the param element to be search and the param node the search is going to start from
    // this method should be implemented using recursion
    @Override public boolean search(T element, Node<T> node) {
        return false;
    }
    // returns the first element in the chain
    // if there is none, returns null
    @Override public T getFirst(){
        return null;
    }
    // returns the last element in the chain
    // if there is none, returns null
    @Override public T getLast(){
        return null;
    }
    // returns the number of nodes in the chain
    @Override public int getNumberOfNodes(){
        return 0;
    }
    // returns true if node is empty, else returns false
    @Override public boolean isEmpty(){
        return false;
    }
}
