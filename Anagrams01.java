import java.util.*;
public class Anagrams01 {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "elbow", "part", "panel", "trap", "tensil", "alter", "later", "below"};
        List<String> anagrams = findAnagrams(words);
        for (String word : anagrams) {
            System.out.println(word);
        }
    }

    public static List<String> findAnagrams(String[] words) {
	List<String>sequence = new ArrayList<String>();
	List<String>list = new ArrayList<String>();
	Set<String>set = new LinkedHashSet<String>();
	ArrayList<String>finallist = new ArrayList<String>();
	//String a[] = new String[words.length];
	//int i = 0;
	for(int i = 0; i < words.length;i++) {
		String str = "";
		words[i] = words[i].toLowerCase();		
		char k[] = words[i].toCharArray();
		Arrays.sort(k);
		for(char ch : k) {
			str += ch;
		}
		sequence.add(str);
		
	}
  	 System.out.println(sequence);
	int count;
	int c;
	for(String s : sequence) {
		String anagram = "";
		count = 0;
		c = 0;
		for(String st : sequence) {
			if(s.equals(st)) {
				if(anagram == "")  {
					anagram += words[count];
					c++;
				}
				else {
					anagram = anagram + "," + words[count];
					c++;
				}
			}
			count++;
		}
		if(c != 1)
			list.add(anagram);
	}
	for(String s : list) {
		set.add(s);
	}
	for(String s : set) {
		finallist.add(s);
	}
	//System.out.println(finallist);	
	return finallist;
    }
   

    

}
