/*
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(Tree T) {

	 
	    int getDiameter(Tree root, TreeHeight height)
	    {
	    	TreeHeight leftHieght = new TreeHeight();
	    	TreeHeight rightHeight = new TreeHeight();
	 
	        if (root == null)
	        {
	            height.h = 0;
	            return 0; 
	        }
	         
	        leftHieght.h++;     
	        rightHeight.h++; 
	        int leftNodeDia = getDiameter(root.left, leftHieght);
	        int rightNodeDia = getDiameter(root.right, rightHeight);
	 
	        height.h = Math.max(leftHieght.h, rightHeight.h) + 1;
	 
	        return Math.max(leftHieght.h + rightHeight.h + 1, Math.max(leftNodeDia, rightNodeDia));
	    }
	 
	    int getDiameter()
	    {
	    	TreeHeight height = new TreeHeight();
	        return getDiameter(T, height);
	    }
        
      if (T==null)
      return -1;
      
      return (1 + Math.max(height(node.left), height(node.right)));
      
    }


class Tree
	{
	    int nodeValue;
	    Tree left, right;
	 
	    public Tree(int current)
	    {
	    	nodeValue = current;
	        left = right = null;
	    }
	}
	
	class TreeHeight
	{
	    int h;
	}
	
	
	
}*/