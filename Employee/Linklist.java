package org.anuja;


public class Linklist {

    Node head = null;
    Node tail = null;
    Node current = null;

    // ADD
    public void add(Employee emp) {
        Node newNode = new Node(emp);

        if (head == null) {
            head = tail = current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // DISPLAY ALL
    public void displayAll() {
        Node temp = head;
        while (temp != null) {
            display(temp.data);
            temp = temp.next;
        }
    }

    // DISPLAY SINGLE
    public void display(Employee e) {
        System.out.println("Name: " + e.getName());
        System.out.println("Address: " + e.getAddress());
        System.out.println("Age: " + e.getAge());
        System.out.println("Salary: " + e.getBasic_Salary());

        if (e instanceof Manager)
            System.out.println("HRA: " + ((Manager) e).getHouse_Rent_Allowance());

        else if (e instanceof Enginner)
            System.out.println("OT: " + ((Enginner) e).getOverTime());

        else if (e instanceof SalesPerson)
            System.out.println("Commission: " + ((SalesPerson) e).getComission());

        System.out.println("----------------------");
    }

    // FIRST
    public void first() {
        current = head;
        if (current != null)
            display(current.data);
    }

    // LAST
    public void last() {
        current = tail;
        if (current != null)
            display(current.data);
    }

    // NEXT
    public void next() {
        if (current != null && current.next != null) {
            current = current.next;
            display(current.data);
        } else {
            System.out.println("No Next Employee");
        }
    }

    // PREVIOUS
    public void previous() {
        if (current != null && current.prev != null) {
            current = current.prev;
            display(current.data);
        } else {
            System.out.println("No Previous Employee");
        }
    }

    // SORT BY NAME
    public void sortByName(boolean asc) {
        for (Node i = head; i != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {

                int cmp = i.data.getName().compareToIgnoreCase(j.data.getName());

                if ((asc && cmp > 0) || (!asc && cmp < 0)) {
                    Employee temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    // DISPLAY BY TYPE
    public void displayByType(String type) {
        Node temp = head;

        while (temp != null) {
            if (type.equals("Manager") && temp.data instanceof Manager ||
                type.equals("Engineer") && temp.data instanceof Enginner ||
                type.equals("SalesPerson") && temp.data instanceof SalesPerson) {

                display(temp.data);
            }
            temp = temp.next;
        }
    }
}