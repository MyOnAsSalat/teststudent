import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static  Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static int math = 5 + rand.nextInt(3) ;
    public static int physics = 5 + rand.nextInt(3);
    public static int biology = 5 + rand.nextInt(3);
    public static int chemistry = 5 + rand.nextInt(3);
    public static int russianLanguage = 5 + rand.nextInt(3);
    public static int computerScience = 5 + rand.nextInt(3);
    public static int intelligence = rand.nextInt(10);
    public static int month = 12;
    public static int money = rand.nextInt(5000);

    public static void main(String[] args)  {
        p("У тебя 12 месяцев до поступления, армия или вуз? Тебе решать!");
        while (0 != month) {
            s();
            int v1 = sc.nextInt();
            if (v1 == 1) {if(month >= 1) {if(money > 400){money = money - 400; month--; math++;}else {p("Недостаточно денег");}} else {p("Недостаточно времени");}}
            if (v1 == 2) {if(month >= 1) {if(money > 400){money = money - 400; month--; physics++;}else {p("Недостаточно денег");}} else {p("Недостаточно времени");}}
            if (v1 == 3) {if(month >= 1) {if(month > 1) {if(money > 400){money = money - 400; month--; biology++;}else {p("Недостаточно денег");}} else {p("Недостаточно времени");}}}
            if (v1 == 4) {if(month >= 1) {if(month > 1) {if(money > 400){money = money - 400; month--; chemistry++;}else {p("Недостаточно денег");}} else {p("Недостаточно времени");}}}
            if (v1 == 5) {if(month >= 1) {if(month > 1) {if(money > 400){money = money - 400; month--;  russianLanguage++;}else {p("Недостаточно денег");}} else {p("Недостаточно времени");}}}
            if (v1 == 6) {if(month >= 1) {   if(month > 1) {if(money > 400){money = money - 400; month--; computerScience++;}else {p("Недостаточно денег");}} else {p("Недостаточно времени");}}}
            if (v1 == 7) {if(month >= 3) { month = month - 3; intelligence++; math++; } else {p("Недостаточно времени");}}
            if (v1 == 8) {if(month >= 3) { month = month - 3; intelligence++; physics++; } else {p("Недостаточно времени");}}
            if (v1 == 9) {if(month >= 3) { month = month - 3; intelligence++; biology++; } else {p("Недостаточно времени");}}
            if (v1 == 10) {if(month >= 3) { month = month - 3; intelligence++; chemistry++; } else {p("Недостаточно времени");}}
            if (v1 == 11) {if(month >= 3) { month = month - 3; intelligence++; russianLanguage++; } else {p("Недостаточно времени");}}
            if (v1 == 12) {if(month >= 3) { month = month - 3; intelligence++; computerScience++; } else {p("Недостаточно времени");}}
            if (v1 == 13) {if(month >= 1){money = money + rand.nextInt(400); intelligence++; month--;}}
         }
        if (physics >= 10 & math >= 10 & intelligence >= 8) {p("Ты можешь поступить в физмат");}
        else if (chemistry >= 10 & biology >= 10 & russianLanguage >= 8){p("Ты можешь поступить на медицинский");}
        else if (computerScience >= 10 & math >= 10 & intelligence >=8) {p("Ты поступил в Инфо-тех");}
        else {p("Здравствуй, небо, в облаках, здравствуй, юность, в сапогах.");}
    }
    public static void s()  {
    for (int i = 0; i < 4000; i++) System.out.print((char)8);
        p("Твои статы:");
        p("Месяцев осталось:" + month);
        p("Твой общий уровень развития:" + intelligence);
        p("Твои знания математики:" + math);
        p("Твои знания физики:" + physics);
        p("Твои знания биологии:" + biology);
        p("Твои знания химии:" + chemistry);
        p("Твои знания Русского языка:" + russianLanguage);
        p("Твои знания информатики:" + computerScience);
        p("Твои деньги:" + money);
        p("Физ-мат:1 Нужно  10 физике 8> математике >7 русский язык или общего развития >7");
        p("Медицинский:2 Нужно 10 Химия 10 биология 8> русский язык");
        p("Информационно-технический:3 Нужно 10 информатика 10 математика 8> общего развития");
        p("Ты можешь позаниматься с репетитором м:1 ф:2 б:3 х:4 р:5 и:6; -400руб; +1 к предмету 1; 1 месяц");
        p("Можешь позаниматься сам м:7 ф:8 б:9 х:10 р:11 и:12; + 1 к предмету; + 1 к общему развитию; 3 месяца");
        p("Попытаться заработать до 400 рублей;13; + 1 к общему развитию");

    }
    public static void p(String s) {
        System.out.println(s);
    }

}