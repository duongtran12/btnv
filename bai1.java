package IOStream;

import java.io.File;
import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập đường dẫn:");
		String name = scanner.nextLine();
		File file = new File(name);
		if (file.isDirectory()) {
			Double size = (double) file.length();
			System.out.println("Kích thước của file là:" + size);
		}
		else {
			System.out.println("Không tìm thấy file");
		}
	}
}
