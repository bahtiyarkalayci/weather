import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        /* Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */
        int heat;
        Scanner scanner = new Scanner(System.in);
        System.out.print("hava sıcaklığını giriniz");
        heat = scanner.nextInt();
        if (heat < 5) {
            System.out.print("kayak yapmaya gidebilirsin");
        } else if (heat >= 5 && heat < 15) {
            System.out.print("sinemaya gidebilirsin");
        } else if (heat >= 15 && heat < 25) {
            System.out.println("pikniğe gitmelisin");
        } else {
            System.out.println("hava çok güzel yüzmeye gitmek harika olur");
        }
    }
}0
