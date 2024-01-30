interface ChainedNode<T>{

    //adds the T element specified by the param
    public boolean add(T element);

    //removes the first T element
    public T remove();

    //removes the T element specified by the param
    public T remove(T element);

    /* searches for a specific param element in the param node;
    returns true if found, false if not */
    public boolean search(T element, Node<T> node);

    /* returns the first element in the chain; if there is none,
    returns null */
    public T getFirst();

    /* returns the last element in the chain; if there is none,
    returns null */
    public T getLast();

    // returns the number of nodes in the chain
    public int getNumberOfNodes();

    // returns true if the chain is empty, false if not
    public boolean isEmpty();
}
