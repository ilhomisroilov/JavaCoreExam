import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Tasks {
    public Tasks() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean turnOn = true;

        while(turnOn) {
            System.out.print("Kerakli masala raqamini kiriting:");
            int n = scanner.nextInt();
            switch (n) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
                case 5 -> task5();
                case 6 -> task6();
                case 7 -> task7();
                case 8 -> task8();
                case 9 -> task9();
                case 10 -> task10();
            }

            System.out.println("Dasturdan chiqish uchun 1 ni bosing. Dasturda qolish uchun istalgan sonni kiriting.");
            int choice = scanner.nextInt();
            if (choice == 1) {
                turnOn = false;
            }
        }

    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv o'lchamini kiriting: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Massiv elementlarini kiriting:");

        int firstLargest;
        for(firstLargest = 0; firstLargest < n; ++firstLargest) {
            System.out.print("array[" + firstLargest + "] = ");
            array[firstLargest] = scanner.nextInt();
        }

        firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int[] var5 = array;
        int var6 = array.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            int num = var5[var7];
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        System.out.println("Ikkinchi eng katta element: " + secondLargest);
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv o'lchamini kiriting.");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Massiv elementlarini kiriting.");

        int sum;
        for(sum = 0; sum < n; ++sum) {
            System.out.print("array[" + sum + "] = ");
            array[sum] = scanner.nextInt();
        }

        sum = 0;

        for(int i = 0; i < n; ++i) {
            sum += array[i];
        }

        System.out.println("Massiv yig'indisi=" + sum);
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv o'lchamini kiriting: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Massiv elementlarini kiriting:");

        for(int i = 0; i < n; ++i) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        boolean tartib = true;

        for(int i = 0; i < n - 1; ++i) {
            if (array[i] > array[i + 1]) {
                tartib = false;
                break;
            }
        }

        System.out.println(tartib);
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv o'lchamini kiriting: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Massiv elementlarini kiriting:");

        for(int i = 0; i < n; ++i) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        ArrayList<Integer> duplicates = new ArrayList();

        for(int i = 0; i < n; ++i) {
            boolean isDuplicate = false;

            for(int j = i + 1; j < n; ++j) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate && !duplicates.contains(array[i])) {
                duplicates.add(array[i]);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("Dublikatlar yo'q.");
        } else {
            System.out.println("Dublikatlar: " + String.valueOf(duplicates));
        }

    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Massiv o'lchamini kiriting.");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Massiv elementlarini kiriting.");

        int max;
        for(max = 0; max < n; ++max) {
            System.out.print("array[" + max + "] = ");
            array[max] = scanner.nextInt();
        }

        max = array[0];
        int min = array[0];

        for(int i = 1; i < n; ++i) {
            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maksimum=" + max);
        System.out.println("Minimum=" + min);
    }

    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A ni qiymatini kiriting(true, false).");
        boolean a = scanner.nextBoolean();
        System.out.println("B ni qiymatini kiriting(true, false).");
        boolean b = scanner.nextBoolean();
        System.out.println("A and B =" + (a && b));
        System.out.println("A or B ==" + (a || b));
        System.out.println("A xor B ==" + (a ^ b));
    }

    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Parolni kiriting: ");
        String password = scanner.nextLine();
        boolean Upper = false;
        boolean Lower = false;
        boolean Num = false;
        boolean Emblem = false;
        char[] var6 = password.toCharArray();
        int var7 = var6.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            char ch = var6[var8];
            if (Character.isUpperCase(ch)) {
                Upper = true;
            } else if (Character.isLowerCase(ch)) {
                Lower = true;
            } else if (Character.isDigit(ch)) {
                Num = true;
            } else if ("@#$%".contains(Character.toString(ch))) {
                Emblem = true;
            }

            if (Upper && Lower && Num && Emblem) {
                break;
            }
        }

        boolean Passtype = Upper && Lower && Num && Emblem;
        if (Passtype) {
            System.out.println("Parol yaroqli");
        } else {
            System.out.println("Parol yaroqsiz");
        }

    }

    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Farangeyt=");
        int farangeyt = scanner.nextInt();
        int celcius = (farangeyt - 32) * 5 / 9;
        System.out.println("Celcius=" + celcius);
    }

    public static void task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzunlik=");
        int uzunlik = scanner.nextInt();
        System.out.print("Kenglik=");
        int kenglik = scanner.nextInt();
        int maydon = uzunlik * kenglik;
        System.out.println("Maydon=" + maydon);
    }

    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tug'ilgan kun=");
        int birthDay = scanner.nextInt();
        System.out.print("Tug'ilgan oy=");
        int birthMonth = scanner.nextInt();
        System.out.print("Tug'ilgan yil=");
        int birthYear = scanner.nextInt();
        LocalDate today = LocalDate.now();
        int thisDay = today.getDayOfMonth();
        int thisMonth = today.getMonthValue();
        int thisYear = today.getYear();
        int year = thisYear - birthYear;
        int month = thisMonth - birthMonth;
        int day = thisDay - birthDay;
        if (day < 0) {
            --month;
            day += 30;
        }

        if (month < 0) {
            --year;
            month += 12;
        }

        System.out.println("Yosh: " + year + " yil " + month + " oy " + day + " kun");
    }
}
