// https://www.hackerrank.com/challenges/java-vistor-pattern/problem?isFullScreen=true

package basic;

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int   value;
    private Color color;
    private int   depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}
// daqui pra cima nao pode alterar

class SumInLeavesVisitor extends TreeVis {
	private int totValuesOfLeaves = 0;
	
    public int getResult() {
      	//implement this
        return totValuesOfLeaves;
    }

    public void visitNode(TreeNode node) {
      	//implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
    	totValuesOfLeaves += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
	private int product = 1;
	private int modulo = 1000000007;
    public int getResult() {
      	//implement this
        return product;
    }

    public void visitNode(TreeNode node) {
      	//implement this
    	if(node.getColor()==Color.RED) { 
    		product *= node.getValue();
    		product %= modulo;
    	}
    }

    public void visitLeaf(TreeLeaf leaf) {
      	//implement this
    	if(leaf.getColor()==Color.RED) { 
    		product *= leaf.getValue();
    		product %= modulo;
    	}
    }
}

class FancyVisitor extends TreeVis {
	
	private int nonLeafEvenDepth = 0;
	private int greenLeaf = 0;
    public int getResult() {
      	//implement this
        return Math.abs(greenLeaf - greenLeaf);
    }

    public void visitNode(TreeNode node) {
    	//implement this
    	if(node.getDepth()%2==0) nonLeafEvenDepth += node.getValue();
    }

    public void visitLeaf(TreeLeaf leaf) {
    	//implement this
    	if(leaf.getColor()==Color.GREEN) greenLeaf += leaf.getValue();
    }
}

public class P052AdvancedVisitorPattern {
  
    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
    	Scanner sc=new Scanner(System.in);
    	
    	int totnodes = sc.nextInt();
    	int values[] = new int[totnodes];
    	int colors[] = new int[totnodes];
    	
    	for(int i=0; i<totnodes; i++) {	values[i] = sc.nextInt(); }
    	for(int i=0; i<totnodes; i++) {	colors[i] = sc.nextInt(); }

    	for(int i=1; i<totnodes; i++) {
    		int ind_pai   = sc.nextInt()-1;
    		int ind_filho = sc.nextInt()-1;
    		
    	}
    	
    	return new TreeNode(0, null, 0); // aqui fui eu, kkk
    }


    public static void main(String[] args) {
      	Tree root = solve();
		SumInLeavesVisitor       vis1 = new SumInLeavesVisitor();
      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      	FancyVisitor             vis3 = new FancyVisitor();

      	root.accept(vis1);
      	root.accept(vis2);
      	root.accept(vis3);

      	int res1 = vis1.getResult();
      	int res2 = vis2.getResult();
      	int res3 = vis3.getResult();

      	System.out.println(res1);
     	System.out.println(res2);
    	System.out.println(res3);
	}
}