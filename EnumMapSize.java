package com.keyword;

import java.util.EnumMap;

enum Dimensions{ONE,TWO,THREE,FOUR,MULTI}
public class EnumMapSize
{
    public static void main(String[] args)
    {
        EnumMap<Dimensions,Integer> map = new EnumMap<Dimensions, Integer>(Dimensions.class);
        map.put(Dimensions.ONE,1);
        map.put(Dimensions.TWO,2);
        map.put(Dimensions.THREE,3);
        map.put(Dimensions.FOUR,4);
        map.put(Dimensions.MULTI,5);
        System.out.println("The Map is "+map);
        System.out.println("The Size of the Map is "+map.size());
    }
}
