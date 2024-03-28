public class Lista<T> {
    private Nodo<T> head;

    private static class Nodo<T> {
        private T data;
        private Nodo<T> next;

        public Nodo(T data) {
            this.data = data;
            this.next = null;
        }
    }


    public void add(T data) {
        Nodo<T> newNode = new Nodo<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Nodo<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Nodo<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void rem
}

