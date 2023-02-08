package org.example;

import java.util.Iterator;
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
        logger.info(treeSet.first());
        logger.info(treeSet.last());
        logger.info(""+treeSet.size());
        logger.info(""+treeSet.isEmpty());
        treeSet.clear();
    }
}
