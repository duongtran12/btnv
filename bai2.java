package IOStream;

import java.io.File;
import java.util.Scanner;

public class bai2 {
	public static void deleteFile(File file) {
		File[] files = file.listFiles();
		if(files != null) {
			for (File file2 : files) {
				if(file2.isDirectory()) {
					deleteFile(file2);
				} else {
					file2.delete();
				}
			}
		}
		file.delete();
	}
	
	public static void deleteAll(String name) {
		File file = new File(name); 
		if(file.exists()) {
			if(file.isFile()) {
				file.delete();
				System.out.println(name + " đã được xóa");
			} else if(file.isDirectory()) {
				deleteFile(file);
				System.out.println("Thư mục " + " đã được xóa");
			}
		} else {
			System.out.println("Dường dẫn không tồn tại");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Nhập đường dẫn thư mục hoặc file bạn muốn xóa");
			String name = scanner.nextLine();
			if(name.isEmpty()) {
				System.out.println("Thoát chương trình");
				break;
			} else {
				deleteAll(name);
			}
		}
	}
}
