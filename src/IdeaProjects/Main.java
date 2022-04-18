package IdeaProjects;

public class Main {

    public static void main(String[] args) {

        // данные видеоурока
        String phone = "978--------856 2038";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        phone = phone.replace(".", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("dlinniy");
        } else if (phone.length() < 10) {
            throw new RuntimeException("korotkiy");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("postoronniy");
        }
        System.out.println("phone = " + phone);

        String expectedPhone = "79788562038";
        if (phone.equals(expectedPhone)) {
            System.out.println("uspeh");
        } else {
            System.out.println("neudacha!");
        }

//        ЗАДАЧА 1

//        Представим, что мы работаем в небольшой компании.
//                Данные сотрудников хранятся в неструктурированном формате,
//                и бухгалтерия попросила написать программу,
//        в которой можно работать с Ф.И.О. сотрудников.
//                Напишите четыре строки:
//        первая с именем firstName — для хранения имени;
//        вторая с именем middleName — для хранения отчества;
//        третья с именем lastName — для хранения фамилии;
//        четвертая с именем fullName — для хранения Ф.И.О. сотрудника
//        в формате "Фамилия Имя Отчество".
//                Выведите в консоль фразу: “ФИО сотрудника — ….”
//        В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.

        System.out.println();
        String firstName = "$emion";
        String middleName = "$emionovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName + " ";
        System.out.println("FIO sotrudnika - " + fullName);

        //        ЗАДАЧА 2
//        Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны
//        Ф.И.О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
//                Напишите программу, которая изменит написание
//        Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
//
//        В качестве строки с исходными данными используйте строку fullName.
//
//                Результат программы выведите в консоль в формате:
//        ”Данные ФИО сотрудника для заполнения отчета — …”
        System.out.println();
        System.out.println(fullName.toUpperCase());

//         ЗАДАЧА 3
//        Система, в которой мы работаем, не принимает символ “ё”.
////        Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
////        В качестве исходных данных используйте строку fullName
//        и данные в ней “Иванов Семён Семёнович”.
////        Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        System.out.println();
        fullName = fullName.replace("$", "S");
        System.out.println("Dannie FIO sotrudnika - " + fullName);

    }
}
