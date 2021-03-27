package stream;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import object.StudentObj;;
public class IntStreamTest {
	public static void main(String[] args) {
		
		/*
		 * 
		 *	IntStream.range(1, 10) : for(int i=0; i<10; i++)과 같은 역할을 한다.
		 *	mapToObj(i -> new StudentObj("user"+i, 10+i, 3)) : 위 반복문에서 생성한 각각의 값(여기서는 i)을 이용해서 StudentObj라는 객체를 만들어준다.
		 *	.collect(Collectors.toList()) : 생성된 객체를 list에 보관한다.
		 *	.forEach(student->System.out.println(student)); : List내장함수인 forEach를 사용해서 만들어진 list 각각에 대한 처리를 람다식으로 해결한다.
		 *
		 */
	
		IntStream.range(1, 10).mapToObj(i -> new StudentObj("user"+i, 10+i, 3))
		.collect(Collectors.toList())
		.forEach(student->System.out.println(student));
		
		System.out.println("----------------- 구 분-------------------");
		
		// 위 코드와 동일한 코드지만 역할을 나눴다.
		// toList를 사용하여 생성된 List는 캐스팅을 해줘야한다!
		
		ArrayList<StudentObj> list = (ArrayList<StudentObj>) IntStream.range(1, 10)
				.mapToObj(i -> new StudentObj("user"+i, 10+i, 3))
				.collect(Collectors.toList());
		list.forEach(i->{System.out.println(i);});
		
		 
		
		 
		
	}
}
