//User function Template for Java

/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
    public int getCount(Node node, int bud)
    {
        //code here  
        if(bud == 0 || node == null) {
            return 0;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        
        int count = 0;
        int cost = 1;
        
        while(!q.isEmpty()) {
            int n = q.size();
            for(int i=0; i<n; i++) {
                Node temp = q.poll();
                
                if(bud == 0) {
                    break;
                }
                
                if(temp.left == null && temp.right == null && bud >= cost) {
                    count++;
                     bud -= cost;
                }
                
                if(temp.left != null) {
                    q.add(temp.left);
                }
                
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            cost++;
        }
        return count;
    }
}
