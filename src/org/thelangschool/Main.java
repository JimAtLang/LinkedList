package org.thelangschool;



class Main {

    public Main(){
        ListNode start = new ListNode("https://www.aol.com/");
        ListNode second = new ListNode("https://www.aol.com/finance/?icid=aol.com-nav");
        start.setNext(second);
    }

    public static void main(String[] args) {
        new Main();
    }
}