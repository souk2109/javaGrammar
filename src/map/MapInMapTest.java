package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
// Map안에 Map넣기 테스트 [2021/04/18] 향후 채팅에 사용할 예쩡
public class MapInMapTest {
	public static void main(String[] args) {
		
		Map<Integer, Object> channelMap = new LinkedHashMap<Integer, Object>();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("채널명을 입력하시오: ");
			int chnum = scan.nextInt();
			System.out.print("아이디를 입력하시오: ");
			String id = scan.next();
			System.out.print("세션번호를 입력하시오: ");
			String session = scan.next();
			
			Map<String, Object> chnumMap = (LinkedHashMap )channelMap.get(chnum);
			if(chnumMap == null) {
				System.out.println("처음 들어오는 채널명이여서 새로 생성 후 삽입");
				Map<String, Object> newMap = new LinkedHashMap<String, Object>();
				newMap.put(id, session);
				channelMap.put(chnum, newMap);
				System.out.println(channelMap);
				System.out.println();
			}else {
				System.out.println("기존에 있는 채널명이므로 그냥 삽입");
				Map<String, Object> newMap = new LinkedHashMap<String, Object>();
				chnumMap.put(id, session);
				System.out.println(channelMap);
				System.out.println("-----현재 채널에서의 모든 세션-----");
				chnumMap.forEach((userid, sess) -> {
					System.out.println(sess);
				}); 
				System.out.println();
			}
		}
		 
		
		
	}
}
