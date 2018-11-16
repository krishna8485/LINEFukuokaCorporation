/**
 * LINE Fukuoka
 * @author krishnasfamily
 *
 */
public class BinaryTreeDisplay {
    Node node;   
    BinaryTreeDisplay() 
    { 
    	node = null; 
    } 
  
    public static void main(String[] args) 
    { 
    	
    	BinaryTreeDisplay tree = new BinaryTreeDisplay();
    	tree.buildBinaryTree(tree);
    	tree.displayLevelOrder(tree.node);
        
    } 
    
    
    /**
     * Method builds the binary tree
     * @param tree
     */
    public  void buildBinaryTree(BinaryTreeDisplay tree) {
        tree.node = new Node(2); 
        tree.node.left = new Node(1); 
        tree.node.right = new Node(3);   
        tree.node.left.left = new Node(0);  
        tree.node.left.right = new Node(7);
        tree.node.right.left = new Node(9);
        tree.node.right.right = new Node(1);
    }
    
    /**
     * method returns the depth of binary tree
     * @param root
     * @return
     */
    public  int checkDepth(Node root) { 
        if (root == null) {
           return 0; 
        }
        else
        { 
            int lheight = checkDepth(root.left); 
            int rheight = checkDepth(root.right);
            if (lheight > rheight) {
                return(lheight+1);
            }
            else {
            	return(rheight+1);  
            }
        } 
    } 
    
    /**
     * 
     * @param node
     */
    public  void displayLevelOrder(Node node ) 
    { 
        int h = checkDepth(node); 
        int i; 
        for (i=1; i<=h; i++) {
            displayGivenLevel(node, i); 
            System.out.println();
        } 
    }
    
    /**
     * 
     * @param root
     * @param level
     */
    public  void displayGivenLevel (Node node ,int level) 
    { 
        if (node == null) {
            return; 
        }
        if (level == 1) {       	
            System.out.print("("+node.value + ")");
        }
        else if (level > 1) { 
        	displayGivenLevel(node.left, level-1); 
        	 System.out.print(",");
        	displayGivenLevel(node.right, level-1); 
        }

    } 
    
    
} 
