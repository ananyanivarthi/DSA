package home_ques.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Binarytree {
    private class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;

    private static class pair {
        Node node;
        int state;

        public pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public void construct(Integer[] arr) {
        Stack<pair> st = new Stack<>();
        root = new Node(arr[0], null, null);
        st.push(new pair(root, 1));
        int idx = 0;
        while (st.size() > 0) {
            pair top = st.peek();
            if (top.state == 1) {
                idx++;
                if (arr[idx] == null) {
                    top.node.left = null;
                } else {
                    Node nn = new Node(arr[idx], null, null);
                    pair np = new pair(nn, 1);
                    st.push(np);
                    top.node.left = nn;
                }
                top.state++;

            } else if (top.state == 2) {
                idx++;
                if (arr[idx] == null) {
                    top.node.right = null;
                } else {
                    Node nn = new Node(arr[idx], null, null);
                    pair np = new pair(nn, 1);
                    st.push(np);
                    top.node.right = nn;
                }
                top.state++;
            } else {
                st.pop();
            }
        }
    }
    public void preorder(Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.data);
        preorder(root.left, ans);
        preorder(root.right,ans);
    }
    public void inorder(Node root,ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
    public void  postorder(Node root,ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        postorder(root.left, ans);
        postorder(root.right,ans);
        ans.add(root.data);
    }
    public int sum(Node root){
        if(root == null){
            return 0;
        }
        int lsum = sum(root.left);
        int rsum = sum(root.right);
        return lsum+root.data+rsum;
    }
    public int max(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int lmax = max(root.left);
        int rmax = max(root.right);
        return Math.max(root.data,Math.max(lmax,rmax));
    }
    public int height(Node root){
        if(root == null){
            return -1;//edges//0=nodes
        }
        int lheight = height(root.left);
        int rheight = height(root.right);
        return Math.max(lheight,rheight)+1;
    }
    public ArrayList<Integer> levelordertraversal(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (queue.size()>0){
            int count = queue.size();
            for (int i=0;i<count;i++){
                Node rm = queue.remove();
                ans.add(rm.data);
               if(rm.left!=null){
                   queue.add(rm.left);
               }
                if(rm.right!=null){
                    queue.add(rm.right);
                }
            }
        }
        return ans;
    }
    public static ArrayList<Integer> path = new ArrayList<>();
    public ArrayList<Integer> nodetopath(Node root,int data){
        if(root==null){
            return new ArrayList<>();
        }
        findnode(root,data,path);
        return path;
    }
    public boolean findnode(Node node,int data, ArrayList<Integer> path){
        if(node == null){
            return false;
        }
        if(node.data==data){
            path.add(node.data);
            return true;
        }
        boolean lr = findnode(node.left,data,path);
        if(lr){
            path.add(node.data);
            return true;
        }
        boolean rr = findnode(node.right,data,path);
        if(rr){
            path.add(node.data);
            return true;
        }
        return false;
    }

    public void display(Node node) {
        if (node == null) {
            return;
        }
        String l = node.left != null ? String.valueOf(node.left.data) : ".";
        String n = String.valueOf(node.data);
        String r = node.right != null ? String.valueOf(node.right.data) : ".";
        System.out.println(l+"->"+n+"<-"+r);
        display(node.left);
        display(node.right);
    }
    public static void main (String[] args){
        Integer[] arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null,70, null, null,87, null, null};
        Binarytree tree = new Binarytree();
        tree.construct(arr);
//        tree.display(tree.root);
        ArrayList<Integer> preorderlist = new ArrayList<>();
//        tree.preorder(tree.root, preorderlist);
//        System.out.println(preorderlist);
//        tree.inorder(tree.root, preorderlist);
//        System.out.println(preorderlist);
//        tree.postorder(tree.root, preorderlist);
//        System.out.println(preorderlist);
//        System.out.println(tree.sum(tree.root));
//        System.out.println(tree.max(tree.root));
//        System.out.println(tree.height(tree.root));
        System.out.println(tree.levelordertraversal(tree.root));
        System.out.println(tree.nodetopath(tree.root, 70));
    }
}
