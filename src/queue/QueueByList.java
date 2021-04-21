package queue;
 
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/*
 * [2021/04/21] LinkedList를 통한 Queue구현
 * 
 * ArrayList와 LinkedList 모두 순서를 보장한다.
 * ArrayList가 순차적인 추가와 검색이 빠르므로 ArrayList를 사용했다.
 *  
*/
class listQueue<T> {
	List<T> list = new ArrayList<>();
	public void enqueue(T data) {
		list.add(data);
		System.out.println(data + "추가");
	}
	public void dequeue() {
		if(list.isEmpty()) {
			throw new NoSuchElementException();
		}
		System.out.println(list.get(0) + "삭제");
		list.remove(0);
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public T peek() {
		return list.get(list.size() - 1);
	}
}

public class QueueByList {

	public static void main(String[] args) {
		/*
		 * Generic을 사용해서 listQueue를 만들었으므로 
		 * String뿐만 아니라 아래와 같이 Integer등 다양한 클래스 사용 가능하다.
		 * 
		 * listQueue<Integer> myQ = new listQueue<>();
		 */
		listQueue<String> myQ = new listQueue<>();
		if(myQ.isEmpty()) {
			System.out.println("비었음");
		}else {
			System.out.println("비어있지 않음");
		}
		myQ.enqueue("1");
		myQ.enqueue("2");
		myQ.dequeue();
		myQ.enqueue("3");
		myQ.dequeue();
		myQ.enqueue("4");
		if(myQ.isEmpty()) {
			System.out.println("비었음");
		}else {
			System.out.println("비어있지 않음");
		}
	}
}
