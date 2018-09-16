package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 500. Keyboard Row（键盘行）
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。
 */
public class Solution500 {
    public static void main(String[] args) {
        Solution500 solution500 = new Solution500();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        solution500.findWords(words);
    }

    /**
     * 把键盘中的字母和其所在行数放到map中
     *
     * @param words
     * @return
     */
    public String[] findWords(String[] words) {
        String[] keyboard = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        List<String> res = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keyboard.length; i++) {
            for (char c : keyboard[i].toCharArray()) {
                map.put(c, i);
            }
        }
        int index;
        for (String word :
                words) {
            index = map.get(word.toUpperCase().toCharArray()[0]);
            for (char c :
                    word.toUpperCase().toCharArray()) {
                if (map.get(c) != index) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                res.add(word);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
