package org.example;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashmap {
    public static void main(String[] args)
    {
        Logger logger=Logger.getLogger("com-api-jar");
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Ajay");
        map.put(2,"Deepan");
        map.put(3,"Elavarasan");
        map.put(4,"Harish");
        map.put(6,"Moorthi");
        map.put(7,"Thavasu");
        logger.info(map.get(7));
        logger.info(map.get(6));
        logger.info(""+map.clone());
        logger.info(""+map.isEmpty());
        logger.info(map.replace(4,"kavin"));
        logger.info(map.get(4));
        logger.info(""+map.getClass());
        logger.info(map.remove(2));
        logger.info(map.get(2));
        map.clear();
        logger.info(""+map.size());
    }
}
