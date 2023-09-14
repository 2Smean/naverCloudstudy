package bit701.day0914;

class Box<T>
{
	private T content;
	
	public void setContent(T content) {
		this.content = content;
	}
	
	public T getContent() {
		return content;
	}
}
public class Ex6_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String>box1=new Box<String>();//뒤에는 앞에 있는 <String>과 같게 해도되고
		box1.setContent("Hello 반가워요");
		System.out.println(box1.getContent());
		System.out.println();
		
		Box<Double>box2=new Box<>();// <>로 해도 된다
		box2.setContent(23.8);
		System.out.println(box2.getContent());
	}

}
