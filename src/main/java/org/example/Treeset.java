package org.example;
import java.util.TreeSet;
import java.util.logging.Level;
import  java.util.logging.Logger;
public class Treeset {
    public static void main(String[] args)
    {
        Logger logger=Logger.getLogger("com-api-jar");
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Tamil");
        treeSet.add("English");
        treeSet.add("Maths");
        treeSet.add("Science");
        treeSet.add("computerscience");
        logger.info(""+treeSet.clone());
        logger.log(Level.INFO,()->""+treeSet.first());
        logger.log(Level.INFO,()->""+treeSet.last());
        logger.log(Level.INFO,()->""+treeSet.size());
        logger.log(Level.INFO,()->""+treeSet.isEmpty());
        treeSet.clear();
    }
}
