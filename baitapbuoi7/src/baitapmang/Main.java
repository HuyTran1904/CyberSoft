package baitapmang;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String[] agrs){
        //nhập
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhập vào số phần tử trong mảng: ");
        n = sc.nextInt();


        if(n <= 0){
            System.out.print("Số phần tử phải lớn hơn 0");
            return;
        }

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử ở vị trí thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        //xuất
        System.out.print("Các phần tử trong mảng là: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        //Tìm số lớn nhất và vị trí của nó ở trong mảng
        int max = arr[0];
        int position = 0;

        for (int i = 1; i < n; i++){
            if (arr[i] > max){
                max = arr[i];
                position = i;
            }
        }
        System.out.println("\nSố lớn nhất trong mảng là: " + max);
        System.out.println("Vị trí của số lớn nhất trong mảng là: " + (position + 1));

        //Tìm số âm đầu tiên và tím số âm lớn nhất và xuất ra vị trí của nó ở trong mảng
        boolean foundNegative = false;
        int firstNegative = 0;
        int fNegativePosition = -1;
        int maxNegative = Integer.MIN_VALUE;
        ArrayList<Integer> mNegativePosition = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (!foundNegative) {
                    firstNegative = arr[i];
                    fNegativePosition = i;
                    foundNegative = true;
                }
                if (arr[i] > maxNegative) {
                    maxNegative = arr[i];
                    mNegativePosition.clear();
                    mNegativePosition.add(i);
                } else if (arr[i] == maxNegative) {
                    mNegativePosition.add(i);
                }
            }
        }

        if(!foundNegative){
            System.out.print("Không có số âm nào tồn tại ở trong mảng");
        } else {
            System.out.println("\nSố âm đầu tiên ở trong mảng là: " + firstNegative);
            System.out.print("Vị trí ố âm đầu tiên ở trong mảng là: " + fNegativePosition );
            System.out.println("\nSố âm lớn nhất ở trong mảng là: " + maxNegative);
            System.out.println("Vị trí của số âm lớn nhất là: " );
            for (int pos: mNegativePosition){
                System.out.print((pos + 1) + " ");
            }
        }

        //Tính tổng các số chẵn
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.print("\nTổng các số chẵn trong mảng là: " + sum);

        //Đếm có bao nhiêu số âm
        int countNegative = 0;
        for (int i = 0; i < n; i++){
            if(arr[i] < 0){
                boolean isDuplicate = false;
                for (int j = 0; j < i; j++){
                    if(arr[i] == arr[j]){
                        isDuplicate = true;
                        break;
                    }
                }
                if(!isDuplicate){
                    countNegative++;
                }
            }
        }
        System.out.print("\nCó " + countNegative + " số âm trong mảng");

        int negativeSum = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] < 0){
                negativeSum += arr[i];
            }
        }
        System.out.print("\nTổng các số âm là: " + negativeSum);

        System.out.print("\nHãy nhập vào x: ");
        int x = sc.nextInt();

        boolean found = false;
        for(int i = 0; i < n; i++){
            if(x == arr[i]){
                System.out.print(x + " có tồn tại ở trong mảng");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.print(x + " không tồn tại ở trong mảng");
        }
    }
}
