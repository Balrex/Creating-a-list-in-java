package List;

public class MyList<T> {
    node<T> head; // указатель на первый элемент списка
    node<T> tail; // указатель на послений жлемент списка
    public int count; // счетчик количества элементов в списке
    public MyList(){
    }
    public MyList(MyList<T> original){
        T data;
        this.head=new node<T>(null, null);
        node<T> tmp_next=this.head;
        node<T> go=original.head;
        for (int i=0; i<original.count; ++i){
            tmp_next.data=go.data;
            tmp_next.next=new node<T>(null,null);
            tmp_next=tmp_next.next;
            go=go.next;
            this.count++;
        }
    }
    public void addFirst(T data) {
        node<T> new_node = new node<T>(head, data);
        head = new_node;
        if (tail == null) {
            tail = new_node;
        }
        count++;
    }
    public void addLast(T data) {
        node<T> new_node = new node<T>(null, data);
        if (tail==null){
            head=new_node;
            tail=new_node;
        }else {
            node<T> last_node=tail;
            last_node.next=new_node;
            tail=new_node;
        }
        count++;
    }
    public void NoElements() throws Exception{
        if (count==0){
            throw new NoElemet();
        }
    }
    public void delFirst(){
        head=head.next;
        count--;
    }
    public void delData(T data) {
        node<T> del_befor_node = null;
        node<T> del_node = head;
        for (int i = 0; i < count; ++i) {
            T TempData = del_node.data;
            if (TempData.equals(data)) {
                if( del_befor_node != null) {
                    del_befor_node.next = del_node.next;
                }else {
                    if(del_node == tail){
                        tail=del_befor_node;
                    }else {
                        head=del_node.next;}
                }
                del_node.data = null;
                del_node.next = null;
                count--;
                return;
            }
            if( del_node == this.tail) {
                System.out.println("Узла с такими данными нет в списке");
                break;
            }
            del_befor_node = del_node;
            del_node = del_node.next;
        }
    }
    public void DelAll(){
        if (count != 0) {
            int marcer=count;
            node<T> del_node = head;
            for (int i=0; i<count; ++i){
                head = del_node.next;
                del_node.data=null;
                marcer--;
            }
            if (marcer!=0)
                System.out.println("Что-то пошло не так. В списке ослось " + marcer+" элементов");
            count=0;
            head=null;
            tail=head;
            System.out.println("Список очищен");
        }
    }
    public void Change(int first, int second){
        node<T> tmp1=head;
        node<T> tmp2=head;
        for (int i=0; i<second; ++i){
            tmp2=tmp1;
            tmp1=tmp1.next;
        }
        T data = tmp1.data;
        tmp1.data=tmp2.data;
        tmp2.data=data;
    }
    public void numb(){
        if (count == 0)
            System.out.println("Cписок пуст");
        else System.out.println("В списке "+count+" элементов");
    }

        public void print() {
        node<T> Nnode = head;
        System.out.println("----------------");
       for (int i=0; i<count; ++i){
            System.out.println(Nnode.data + " -> ");
            Nnode=Nnode.next;
        }//while (Nnode.next!=null);
       System.out.println("null");
        System.out.println("-----------------");
    }
}
