import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;
        System.out.println("Nhap USD:");
        Scanner scanner = new Scanner(System.in);
        int USD = scanner.nextInt();
        float VND = USD * rate;
        System.out.println("USD---->VND"+VND);
    }
}
