package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Hashing{
    String name;
    int id;
    Hashing(String name,int id)
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
        System.out.println("StudentName :"+this.name+"; StudentId :"+this.id);
    }
    public static void main(String[] args)
    {
        HashSet<Hashing> hset=new HashSet<>();
        Hashing h1=new Hashing("thavasu",34);
        Hashing h2=new Hashing("moorthi",35);
        Hashing h3=new Hashing("vaasan",36);
        Hashing h4=new Hashing("kannan",37);
        Hashing h5=new Hashing("moorthi",34);
        Hashing h6=new Hashing("rajesh",37);
        System.out.println(h1);
        System.out.println(h2);
        hset.add(h1);
        hset.add(h2);
        hset.add(h3);
        hset.add(h4);
        hset.add(h5);
        hset.add(h6);
        System.out.println(hset);
        Iterator<Hashing> it=hset.iterator();
        while(it.hasNext())
        {
            it.next().studentdetails();
        }
    }

    @Override
    public boolean equals(Object o) {
        //if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        Hashing hashing = (Hashing) o;
        boolean result;
        result=id==hashing.id;
        return result;
        //return id == hashing.id && Objects.equals(name, hashing.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}