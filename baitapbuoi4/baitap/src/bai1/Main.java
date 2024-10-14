package bai1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // Viết chương trình tính chiều dài cạnh huyền của một tam giác vuông khi biết 2 cạnh góc vuông
    //đầu vào
        double canh1, canh2, canhHuyen;
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập chiều dài cạnh thứ 1: ");
        canh1 = sc.nextDouble();
        System.out.print("Vui lòng nhập chiều dài cạnh thứ 2: ");
        canh2 = sc.nextDouble();

    //code xử lí
        canhHuyen = Math.sqrt((canh1 * canh1) + (canh2 * canh2));
    //đầu ra
        System.out.print("Chiều dài của cạnh huyền là : " + canhHuyen );
    }
}