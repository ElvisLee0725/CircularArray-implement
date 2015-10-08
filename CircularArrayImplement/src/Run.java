
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularArray<Integer> ca = new CircularArray<Integer>(5);
		ca.set(0, 1);
		ca.set(1, 2);
		ca.set(2, 3);
		ca.set(3, 4);
		ca.set(4, 5);
		System.out.println(ca.get(2));
		for(int i : ca) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		ca.rotate(2);
		for(int i : ca) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		ca.rotate(4);
		for(int i : ca) {
			System.out.print(i + " ");
		}
		
		//ca.get(5);
	}

}
