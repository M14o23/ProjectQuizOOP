/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectExam;

/**
 *
 * @author M14o2
 */
import java.util.Scanner;

public class HistoryTest extends Exam implements Test {

    private Scanner input = new Scanner(System.in);
   
    
    // this is questions
    private static String[] questions = {
        "ما اسم أول مسجد بناه الرسول عليه الصلاة والسلام؟ ",
        "من أول مؤذن في الاسلام؟",
        "متى وقعت معركة بدر؟",
        "ماهي عاصمة الخلافة العباسية؟",
        "ماهي عاصمة الخلافة الاموية؟",
        "ماذا كانت تسمى المدينة المنورة قبل هجرة الرسول عليه الصلاة والسلام إليها؟",
        "من هو ثالث الخلفاء الراشدين؟",
        "من هو اول خليفة أموي؟",
        "في أي معركة قتل حمزة بن عبدالمطلب عم الرسول علية الصلاة والسلام؟",
        "ماهي المعركة اللتي هزم فيها المسلمون الفرس؟ ",
        "كم استمر حكم الخلافة العباسية؟",
        "متى تأسست المملكة العربية السعودية؟",
        "كم عدد دول شبة الجزيرة العربية؟",
        "متى وقعت الحرب العالمية الاولى؟",
        "متى انتهت الحرب العالمية الاولى؟"

    };
    // this is options
    private static String[][] options = {
        {"المسجد النبوي", "مسجد قباء", "مسجد احد", "مسجد بني خدرة"},
        {"عثمان بن عفان", "علي بن ابي طالب", "بلال بن رباح", "عمر بن الخطاب"},
        {"في العام الاول للهجرة", "في العام الثاني للهجرة", "في العام الثالث للهجرة", "في العام الرابع للهجرة"},
        {"القاهرة", "واشنطن", "نجد", "بغداد"},
        {"القاهرة", "دمشق", "نجد", "بغداد"},
        {"سيسيه", "يثرب", "القيقورة", "ريبوكا"},
        {"عمر بن الخطاب", "ابو بكر الصديق", "عثمان بن عفان", "علي بن ابي طالب"},
        {"معاوية بن ابي سفيان", "عبدالملك بن مروان", "زيد بن الحارثه", "عبدالمطلب"},
        {"معركة عين جالوت", "معركة اليرموك", "معركة بدر", "معركة احد"},
        {"معركة القادسية ", "معركة اليرموك", "معركة بدر", "معركة احد"},
        {"500 عام تقريبا", "400 عام تقريبا", "300 عام", "200 عام"},
        {"1923", "1932", "1922", "1933"},
        {"5", "6", "7", "8"},
        {"1914", "1915", "1916", "1918"},
        {"1914", "1915", "1916", "1918"}

    };
    // this is answers
    private static String[] answers = {"A", "C", "B", "D", "B", "B", "C", "A", "D", "A", "A", "B", "C", "A", "D"};

    @Override
    public void take(Student student) {
        //passing the questions, options, answers, and student
        take(questions, options, answers, student);

    }
}