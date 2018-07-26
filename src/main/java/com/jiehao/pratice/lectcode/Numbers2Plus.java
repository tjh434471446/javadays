package com.jiehao.pratice.lectcode;

public class Numbers2Plus {
    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int addFlag = 0,sum;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while(cur1 != null || cur2 != null){
            sum = getListNodeVal(cur1) + getListNodeVal(cur2) + addFlag;
            addFlag = sum / 10;
            cur1 = cur1 == null?new ListNode(sum % 10):cur1;
            cur1.val = sum % 10;
            if (cur1.next == null){
                if (cur2.next != null){
                    cur1.next = new ListNode(0);
                }else{
                    if (addFlag > 0){
                        cur1.next = new ListNode(0);
                    }
                }
            }
            if (cur2.next == null){
                if (cur1.next != null){
                    cur2.next = new ListNode(0);
                }
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return l1;
    }
    private int getListNodeVal(ListNode l){
        return l == null?0:l.val;
    }
    public static void excute(){
        int[] number1 = {0};
        int[] number2 = {3,4,5};
        ListNode l1 = ListNode.arr2List(number1);
        ListNode l2 = ListNode.arr2List(number2);
        Numbers2Plus numbers2Plus = new Numbers2Plus();
        ListNode cur = numbers2Plus.addTwoNumbers(l1,l2);
        while (cur != null){
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
        static ListNode arr2List(int[] arr){
            ListNode l = new ListNode(arr[0]);
            ListNode cur = l;
            for (int i = 1; i < arr.length; i++){
                cur.next = new ListNode(arr[i]);
                cur = cur.next;
            }
            return l;
        }
    }
}
