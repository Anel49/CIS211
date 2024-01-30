public class OrderedChain<T> implements ChainedNode<T>{

    @Override public boolean add(T element){
        return false;
    }
    @Override public T remove(){
        return null;
    }
    @Override public T remove(T element){
        return null;
    }
    @Override public boolean search(T element, Node<T> node){
        return false;
    }
    @Override public T getFirst(){
        return null;
    }
    @Override public T getLast(){
        return null;
    }
    @Override public int getNumberOfNodes(){
        return 0;
    }
    @Override public boolean isEmpty(){
        return false;
    }
    
}
