import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * Created by admin on 2/10/2018.
 */
@SuppressWarnings("ALL")
public class DZ3 {
    static  final char A='A';
    static  final char B='B';
    static  final char C='C';
    static  final char D='D';
    static  final char E='E';
    static  final char F='F';

    public static void main(String[] args) {
        getSrting();
        getRepitedInStr();
        getCheckValidation();
       /* Программа запрашивает строку пользователя,которую она должна преобразовать согласно
        меню выбора:
        A. СТРОКА ЗАГЛАВНЫМИ БУКВАМИ
        B. строка в нижнем регистре
        C. С Заглавной Буквы (Первый Символ Каждого Слова В Строке )
        D. пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ
        E. Как в предложении(с заглавной буквы).
                F. выход из программы
        Если ввели любой другой символ (не A,B,C,D,E,F) - программа должна вывести текст об
        ошибке и заново предложить выбрать вариант
        То есть после ввода строки программа отображает меню, представленное выше, через
        которое можно удобно выбирать любое действие. Выбор действия возможен как с заглавной
        так и с прописной буквы.
                Каждое действие над исходной строкой оформить в виде отдельного статического
        метода.
                Для выбора варианта использовать оператор switch.
*/
    }
        public static void getSrting() {
            System.out.printf("Vvedite stroky:%n");
            Scanner console = new Scanner(System.in);
            String str = console.nextLine();
            boolean flag=true;
            if(flag) {
                flag=false;
                System.out.printf("%nA. СТРОКА ЗАГЛАВНЫМИ БУКВАМИ%nB. строка в нижнем регистре%nC. С Заглавной Буквы (Первый Символ Каждого Слова В Строке )%n");
                System.out.printf("D. пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ%nE. Как в предложении(с заглавной буквы)%nF. выход из программы%n");
            }
            String group = console.nextLine().toUpperCase();
            boolean flag1=true;
            while (flag1){

                if (group.charAt(0)!=A && group.charAt(0)!=B && group.charAt(0)!=C && group.charAt(0)!=D && group.charAt(0)!=E && group.charAt(0)!=F) {
                    System.out.printf("%nA. СТРОКА ЗАГЛАВНЫМИ БУКВАМИ%nB. строка в нижнем регистре%nC. С Заглавной Буквы (Первый Символ Каждого Слова В Строке )%n");
                    System.out.printf("D. пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ%nE. Как в предложении(с заглавной буквы)%nF. выход из программы%n");
                    group = console.nextLine().toUpperCase();
                    }

            char choice = group.charAt(0);
            switch(choice) {
                case A:
                    System.out.printf("%nVash vubor СТРОКА ЗАГЛАВНЫМИ БУКВАМИ:%n" + str.toUpperCase());
                    flag1=false;
                    break;
                case B:
                    System.out.printf("%nVash vubor строка в нижнем регистре:%n" + str.toLowerCase());
                    flag1=false;
                    break;
                case C:

                    String[] splittedStr = str.split(" ");

                    for (int i = 0; i < splittedStr.length; i++) {
                        StringBuilder sb = new StringBuilder(splittedStr[i]);
                        sb.setCharAt(0, splittedStr[i].toUpperCase().charAt(0));
                        String.format("%s ", "%nVash vubor С Заглавной Буквы (Первый Символ Каждого Слова В Строке ):%n" + System.out.printf(splittedStr[i].valueOf(sb) + " "));
                    }
                    flag1=false;
                    break;
                case D:
                    String[] splittedStr1 = str.toUpperCase().split(" ");

                    for (int i = 0; i < splittedStr1.length; i++) {
                        StringBuilder sb = new StringBuilder(splittedStr1[i]);
                        sb.setCharAt(0, splittedStr1[i].toLowerCase().charAt(0));
                        String.format("%s ", "%nVash vubor пЕРВЫЙ сИМВОЛ в нИЖНЕМ рЕГИСТРЕ:%n" + System.out.printf(splittedStr1[i].valueOf(sb) + " "));
                    }
                    flag1=false;
                    break;
                case E:
                    StringBuilder sb = new StringBuilder(str);
                    sb.setCharAt(0, str.toUpperCase().charAt(0));
                    System.out.printf("%nVash vubor Как в предложении(с заглавной буквы):%n" + sb + " ");
                    flag1=false;
                    break;
                case F:
                    flag1=false;
                    break;

            }}
            return;
    }

    public static void getRepitedInStr() {
     /*   Задача 2.
        Пользователь вводит строку. Подсчитать количество повторений символов, во введенной
        строке. Вводимая строка должна состоять из символов только латинского алфавита.
                Вывести на экран(построчно) кол-во повторений каждого символа входной строки.
                */
        System.out.printf("Vvedite stroky из символов только латинского алфавита:%n");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int f=str.length();
        StringBuilder sb = new StringBuilder(str);
        int count = 1;
        while (sb.length()!=0) {
            for (int i = 1; i < sb.length()+1; i++) {

                if (sb.length() >= 1) {
                    if (i != 1) {
                        char current = sb.charAt(0);
                        char previous = sb.charAt(i - 1);
                        if (current == previous ) {
                            count++;
                            sb.deleteCharAt(i - 1);
                            i = i - 1;
                            if (sb.length() == 2) {
                                count=count+1;
                                sb.deleteCharAt(0);
                            }
                        }
                    }
                }
            }
            System.out.printf(sb.charAt(0) + " :" + count + " " + "%n");
            sb.deleteCharAt(0);
            if(sb.length()!=0) {
                sb.deleteCharAt(0);
                count = 1;
            }
        }
    }

    public static void getCheckValidation(){
    /*Задача 3.
    Программа запрашивает у пользователя ФИО, мобильный телефон и email, и проверяет
    данные на валидность с помощью регулярных выражений.
            ФИО - только буквы английского алфавита, дефис и пробел
    Мобильный телефон - +380 далее 2 цифры кода (украина) и 7 любых цифр
    email - любые латинские символы, цифры, дефис и нижний прочерк, обязательный символ @
            и .
    Проверить все вводимые данные и вывести неверно введенные.*/
    System.out.printf("Введите ФИО:%n");
    Scanner console = new Scanner(System.in);
    String line = console.nextLine();
    System.out.printf("%nВведите номер мобильного телефона:%n");
    String line1 = console.nextLine();
    System.out.printf("%nВведите Ваш e-mail:%n");
    String line2 = console.nextLine();
    Pattern fio = Pattern.compile("^([A-Za-z-]+)\\s([A-Za-z-]+)\\s([A-Za-z-]+)$");
    Pattern mobile = Pattern.compile("(\\+380(50|67|94))\\d{7}");
    Pattern email = Pattern.compile("^(\\w|\\p{L1})+@(\\w|\\p{all})+\\.([A-Za-z]{2,7})");
    System.out.println(fio.matcher(line).matches());
    boolean flag=false;
    if (!fio.matcher(line).matches()) {
        System.out.printf("%nВы неверно ввели ФИО: %s%n Используйте, только буквы английского алфавита, дефис", line);
        flag=true;
    }
    if (!mobile.matcher(line1).matches()) {
        System.out.printf("%nВы неверно ввели мобильный: %s%n Укажите номер в формате +380 далее 2 цифры кода (украина) и 7 цифр номера", line1);
        flag=true;
    }
    if (!email.matcher(line2).matches()) {
        System.out.printf("%nВы неверно ввели ФИО: %s%n Введите email в формате <любые символы>@<любые символы>.домен состоящий только из букв от 2 до 7 символов", line2);
        flag=true;
    }
    if (flag=false) {
        System.out.printf("%nСпасибо. Вы все ввели правильно!!!");
    }
    }

}

