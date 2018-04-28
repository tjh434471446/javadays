package main.java.pratice.codewars;

import java.util.*;

public class Mixing {
    public static String mix(String s1, String s2) {
        // your code
        Map map1 = countCharacter(s1);
        Map map2 = countCharacter(s2);
        List<Map.Entry<Character,Integer>> sortKey = sortMap(map1,map2);
        StringBuilder builder = new StringBuilder();
        List<Object> showed = new ArrayList();
        for (Map.Entry i : sortKey)
        {
            if ((Integer)i.getValue() <= 1)
            {
                continue;
            }
            if (showed.contains(i.getKey()))
            {
                continue;
            }
            showed.add(i.getKey());
            if (map1.containsKey(i.getKey())&&(map1.get(i.getKey()).equals(map2.get(i.getKey()))))
            {
                builder.append("=:");
            }
            else if (map1.containsKey(i.getKey())&&(map1.get(i.getKey()).equals(i.getValue())))
            {
                builder.append("1:");
            }
            else {
                builder.append("2:");
            }

            for(int k = 0;k < (Integer) i.getValue();k++)
            {
                builder.append(i.getKey());
            }
            builder.append("/");
        }
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }
    public static Map<Character,Integer> countCharacter(String s)
    {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int icount;
        for (char i:chars)
        {
            if (i < 97 || i > 122) continue;
            icount = map.get(i) == null ? 0 : map.get(i);
            map.put(i, icount + 1);
        }
        return map;
    }
    public static List<Map.Entry<Character,Integer>> sortMap(Map map1,Map map2)
    {
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map1.entrySet());
        list.addAll(new ArrayList<>(map2.entrySet()));
        System.out.println("list?");
        Collections.sort(list,(Map.Entry<Character,Integer> a,Map.Entry<Character,Integer> b)-> b.getValue().compareTo(a.getValue()));
        return list;
    }
    public static String makeResult(String in)
    {
        String[] result = in.split("/");
        String t;
        for (int i = 0;i < result.length - 1;i++)
        {
            if ((result[i].length() == result[i+1].length()))
            {
                t = result[i + 1];
                result[i + 1] = result[i];
                result[i] = t;
            }
        }
        String out = "";
        for (String s:result)
        {
            if (out.equals("")) out = out + s;
            else out = out + "/" + s;
        }
        return out;
    }
}
