package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
	LinkedHashMap과 HashMap을 비교해봤다.
	LinkedHashMap은 값을 입력된 순서대로 가져오지만 HashMap은 랜덤하게 값을 가져오는 것을 확인할 수 있었다.
	값을 꺼내오는 과정에서 foreach문과 람다식을 사용할 수도 있다.
*/
public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, Object> linkedMap = new LinkedHashMap<String, Object>();
		Set<String> keyList = linkedMap.keySet();

		for (int i = 1; i < 31; i++) {
			linkedMap.put(String.valueOf(i), "hi" + i);
		}
		
		// 람다식으로 꺼내오기
		linkedMap.forEach((key, value) -> {
			value = (String) linkedMap.get(key);
			System.out.println(value);
		});		
		
		
		Iterator<String> iterator = keyList.iterator();
		System.out.println("LinkedHashMap 실행");
		while (iterator.hasNext()) {
			String key = keyList.iterator().next();
			String value = (String) linkedMap.get(key);
			System.out.println("뽑은 것 : [" + key + " - " + value + "]");
			keyList.remove(key);
		}
		
		
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("HashMap 실행");
		Map<String, Object> hashMap = new HashMap<String, Object>();
		Set<String> hashKeyList = hashMap.keySet();
		for (int i = 1; i < 31; i++) {
			hashMap.put(String.valueOf(i), "hi" + i);
		}
		
		System.out.println("arr : "+Arrays.toString(hashKeyList.toArray()));
		while (hashKeyList.iterator().hasNext()) {
			String key = hashKeyList.iterator().next();
			String value = (String) hashMap.get(key);
			System.out.println("뽑은 것 : [" + key + " - " + value + "]");
			hashKeyList.remove(key);
		}
		 
		
	}
}
