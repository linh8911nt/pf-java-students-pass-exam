import java.util.Scanner;

public class StudentsPassExam {
    public static void main(String[] args) {
        int size;
        int[] students;
        Scanner input = new Scanner(System.in);

        //Kiểm tra số lượng sinh viên nhập vào không quá 30 người
        do {
            System.out.println("Số lượng sinh viên: ");
            size = input.nextInt();
            if (size > 30)
                System.out.println("Số lượng sinh viên không quá 30 người");
        }while (size > 30);

        //Khởi tạo danh sách
        students = new int[size];

        //Nhập điểm sinh viên vào danh sách
        for (int i = 0; i < students.length; i++){
            System.out.println("Điểm sinh viên " + (i + 1) + " : ");
            students[i] = input.nextInt();
        }

        //in ra danh sách điểm sinh viên và đếm số lượng sinh viên thi đỗ
        int count = 0;
        for (int j = 0; j < students.length; j++){
            System.out.println("Điểm: " + students[j]);
            if (students[j] > 5 && students[j] <= 10)
                count += 1;
        }
        System.out.println("Số lượng sinh viên đỗ: " + count);
    }
}
