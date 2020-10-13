package 字母异位词分组_49;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String tempStr = new String(chars);

            List<String> itemList = map.get(tempStr);

            if(itemList == null) {
                 itemList = new ArrayList<>();
                 map.put(tempStr,itemList);
            }
            itemList.add(str);
        }

        List resultList = new ArrayList();

        for (Map.Entry<String,List<String>> entry : map.entrySet()) {
            resultList.add(entry.getValue());
        }
        return resultList;

    }
}