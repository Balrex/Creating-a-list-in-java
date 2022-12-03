package List;

public class node <T>{
    T data;
    node<T> next;
    public node (node<T> next, T data){
        this.data=data;
        this.next=next;
    }
}
