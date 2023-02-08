package org.example;
import java.util.HashSet;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

class Hashset {
    String name;
    int id;
    Logger logger=Logger.getLogger("com-api-jar");
    Hashset(String name, int id)
    {
        this.name=name;
        this.id=id;
    }
    @Override
    public String toString()
    {
        String result;
        result="name :"+this.name+" ,id :"+this.id;
        return result;
    }
    public void studentdetails()
    {
        logger.info("StudentName :"+this.name+"; StudentId :"+this.id);
    }
    public static void main(String[] args)
    {
        HashSet<Hashset> hset=new HashSet<>();
        Hashset h1=new Hashset("thavasu",34);
        Hashset h2=new Hashset("moorthi",35);
        Hashset h3=new Hashset("vaasan",36);
        Hashset h4=new Hashset("kannan",37);
        Hashset h5=new Hashset("moorthi",34);
        Hashset h6=new Hashset("rajesh",37);
        Logger logger=Logger.getLogger("com-api-jar");
        logger.log(Level.INFO,()->""+h1);
        logger.log(Level.INFO,()->""+h2);
        hset.add(h1);
        hset.add(h2);
        hset.add(h3);
        hset.add(h4);
        hset.add(h5);
        hset.add(h6);
        logger.log(Level.INFO,""+hset);
        for (Hashset hashing : hset) {
            hashing.studentdetails();
        }
    }

    @Override
    public boolean equals(Object o) {
        Hashset hashing = (Hashset) o;
        boolean result;
        result=id==hashing.id;
        return result;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}