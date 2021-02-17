package com.javarush.task.task17.task1710;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
-c - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u - обновляет данные человека с данным id
-d - производит логическое удаление человека с id, заменяет все его данные на null
-i - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
//        args = "-c Valera м 12/02/1991".split(" ");

//        args = "-u 1 Миронов м 15/04/1990".split(" ");
        args = "-i 0".split(" ");
//        args = "-d 1".split(" ");
        //start here - начни тут
        if (args.length > 0) {
            switch (args[0] ) {
                case "-c" : {
                    Person newPerson = null;
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
                    Date dateBD = null;
                    try {
                        dateBD = dateFormat.parse(args[3]);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    if (args[2].equals("м")) {
                        newPerson = Person.createMale(args[1], dateBD);
                    } else if (args[2].equals("ж")) {
                        newPerson = Person.createFemale(args[1], dateBD);
                    }
                    allPeople.add(newPerson);
                    System.out.println(allPeople.indexOf(newPerson));
//                    System.out.println((allPeople.get(allPeople.size()-1)).getName());
                    break;
                }
                case "-u" : {
                    int idPerson = Integer.parseInt(args [1]);
                    allPeople.get(idPerson).setName(args[2]);
                    Sex sex;
                    if (args[3].equals("м")) { sex = Sex.MALE;}
                    else { sex = Sex.FEMALE;}
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
                    Date dateBD = null;
                    try {
                        dateBD = dateFormat.parse(args[4]);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    allPeople.get(idPerson).setSex(sex);
                    allPeople.get(idPerson).setBirthDate(dateBD);
//                    System.out.println(allPeople.size());
                    break;
                }
                case "-d" : {
                    int idPerson = Integer.parseInt(args [1]);
                    allPeople.get(idPerson).setName(null);
                    allPeople.get(idPerson).setSex(null);
                    allPeople.get(idPerson).setBirthDate(null);
//                    System.out.println(allPeople.get(idPerson).getBirthDate(Locale.ENGLISH));
//                    System.out.println(allPeople.size());
                    break;
                }
                case "-i" : {
                    int idPerson = Integer.parseInt(args[1]);
                    Person person = allPeople.get(idPerson);
                    String sex = person.getSex().equals(Sex.MALE)? "м" : "ж";
                    SimpleDateFormat date = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                    System.out.printf("%s %s %s", person.getName(), sex, date.format(person.getBirthDate( Locale.ENGLISH)));
                    break;
                }
            }
        }
    }
}
