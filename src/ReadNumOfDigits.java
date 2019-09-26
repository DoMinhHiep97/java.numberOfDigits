import java.util.Scanner;
public class ReadNumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Number:");
        int number=scanner.nextInt();
        int hundreds=number/100;
        int dozens=(number/10)%10;
        int unit=number%10;
        String hundredDigits=null;
        String dozenDigits=null;
        String unitDigits = null;

        switch (hundreds){
            case 0: hundredDigits="Không Trăm";
            break;
            case 1:hundredDigits="Một Trăm";
            break;
            case 2:hundredDigits="Hai Trăm";
            break;
            case 3:hundredDigits="Ba Trăm";
            break;
            case 4:hundredDigits="Bốn Trăm";
            break;
            case 5:hundredDigits="Năm Trăm";
                break;
            case 6:hundredDigits="Sáu Trăm";
                break;
            case 7:hundredDigits="Bảy Trăm";
                break;
            case 8:hundredDigits="Tám Trăm";
                break;
            case 9:hundredDigits="Chín Trăm";
                break;
            default:
                System.out.println("Not define!");
                break;
        }
        switch (dozens){
            case 0:dozenDigits="Và";
            break;
            case 1:dozenDigits="Mười";
            break;
            case 2:dozenDigits="Hai Mươi";
            break;
            case 3:dozenDigits="Ba Mươi";
                break;
            case 4:dozenDigits="Bốn Mươi";
                break;
            case 5:dozenDigits="Năm Mươi";
                break;
            case 6:dozenDigits="Sáu Mươi";
                break;
            case 7:dozenDigits="Bảy Mươi";
                break;
            case 8:dozenDigits="Tám Mươi";
                break;
            case 9:dozenDigits="Chín Mươi";
                break;
            default:
                System.out.println("Not define!");
                break;
        }
        switch (unit){
            case 0:unitDigits="Không";
            break;
            case 1:unitDigits="Một";
                break;
            case 2:unitDigits="Hai";
                break;
            case 3:unitDigits="Ba";
                break;
            case 4:unitDigits="Bốn";
                break;
            case 5:unitDigits="Năm";
                break;
            case 6:unitDigits="Sáu";
                break;
            case 7:unitDigits="Bảy";
                break;
            case 8:unitDigits="Tám";
                break;
            case 9:unitDigits="Chín";
                break;
            default:
                System.out.println("Not define");
                break;
        }
        System.out.println(hundredDigits+" "+dozenDigits+" "+unitDigits);
    }
}
