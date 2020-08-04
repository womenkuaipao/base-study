package base.study.offer;

import java.util.Stack;

import base.study.offer.structure.Node;

/**
 * 输入链表的头结点，从尾到头反过来打印出每个结点的值
 * @author HP
 *
 */
public class Question5 {
	private static Node head=new Node(0);
	public static void main(String[] args) {
		initLinked();
		System.out.println("head:"+head.getValue());
		System.out.println("---------递归输出--------");
		inversePrint1(head);
		System.out.println("\n---------使用堆栈--------");
		inversePrint2(head);
	}
	public static void initLinked() {
		Node tmpNode=head;                 
		for(int i=1;i<20;i++) {
			Node node=new Node(i);
			tmpNode.setNext(node);
			tmpNode=node;
		}
	}
	
	/**
	 * 递归输出，缺点，链表越长，调用层级越深，容易堆溢出
	 * @param node
	 */
	public static void inversePrint1(Node node) {
		if(node==null) {
			return;
		}
		inversePrint1(node.getNext());
		System.out.print(node.getValue()+" ");
	}
	
	/**
	 * 堆栈使数据反向排序，和递归一样
	 * @param node
	 */
	public static void inversePrint2(Node node) {
		Stack<Node> stack=new Stack<>();
		while(node!=null) {
			stack.push(node);
			node=node.getNext();
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().getValue()+" ");
		}
	}
}
