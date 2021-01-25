package BinaryTrees_Demo;

/*
* Java实现简单二叉树
* */
public class BinTree {

    Node node;

    private Node addNode(Node node,int data){
        if(node == null){
            return new Node(data);
        }
        if(data < node.data){
            node.leftChild = addNode(node.leftChild,data);
        }else if(data > node.data) {
            node.rightChild = addNode(node.rightChild, data);
        }
        return node;
    }

    public void addNode(int data){
        node = addNode(node,data);
    }

}

class Node{

    int data;
    Node leftChild;
    Node rightChild;

    public Node(int data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }

}
class test{
    public static void main(String[] args) {
        BinTree tree = new BinTree();
        tree.addNode(4);
        tree.addNode(6);
        System.out.println(tree.node.data);//根节点
        System.out.println(tree.node.rightChild.data);//右节点

    }
}