package org.thelangschool.LinkedList;

class ListNode{
    String data;
    ListNode next;
    int index;

    public ListNode(String data){
        this.data = data;
    }

    public void setData(String data){
        this.data=data;
    }

    public String getData(){
        return data;
    }

    public void setNext(ListNode next){
        this.next=next;
    }

    public ListNode getNext(){
        return next;
    }
}