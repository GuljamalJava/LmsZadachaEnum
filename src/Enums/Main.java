package Enums;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
// todo   Күндөргө Enum түзүңүз (Monday, Tuesday ...)
//        Консолдон бир күндү белгилеңиз. Эгер Monday болсо - анда "Дуйшөмбү куну жава окуйм" же
//        Tuesday болсо - анда "Шейшемби күнү англис тили сабагын окуйм" деп күнгө жараша кайсы сабакты окуганыңызды консолго чыгарыңыз.
//        Жуманын күндөрүн кыргыз тилинде көрсөтүңүз.



            for (Days day : Days.values()) {
                System.out.println(Days.valueOf(day.name()));
            }

        }

    }










