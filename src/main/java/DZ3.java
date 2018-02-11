import java.util.Scanner;

/**
 * Created by admin on 2/10/2018.
 */
public class DZ3 {
    static  final char A='A';
    static  final char B='B';
    static  final char C='C';
    static  final char D='D';
    static  final char E='E';
    static  final char F='F';

    public static void main(String[] args) {
        getSrting();
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
            System.out.printf("Vvedite lubyu stroky:%n");
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
    }}

