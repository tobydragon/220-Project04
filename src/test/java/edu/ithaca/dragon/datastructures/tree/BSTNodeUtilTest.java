package edu.ithaca.dragon.datastructures.tree;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class BSTNodeUtilTest {

    @Test
    public void bstVisualization(){
        // TreeVisualization.visualizeBinaryTree(SampleTrees.getTree1(), "<YOUR_USER_ID>","<YOUR_API_KEY>");
        TreeVisualization.visualizeBinaryTree(SampleTrees.getTree4(), "<YOUR_USER_ID>","<YOUR_API_KEY>");
    }

    @Test
    public void bstAddVisualization(){
        BTNode root = new BTNode(1000);
        Random random = new Random();
        for (int count=0; count<200; count++){
            int numToAdd = random.nextInt(2000);
            try{
                BSTNodeUtil.bstAdd(root, numToAdd);
            }
            catch(Exception e){
                System.out.println("Already in tree, skipping: " + numToAdd);
            }
        }
        TreeVisualization.visualizeBinaryTree(root, "<YOUR_USER_ID>","<YOUR_API_KEY>");
    }
    
}
