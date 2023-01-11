package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("abcder");
		str.setCharAt(0, 'v');
		System.out.println(str);

	}

}
