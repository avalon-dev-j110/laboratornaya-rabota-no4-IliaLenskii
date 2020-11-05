package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.common.Personcl;
import ru.avalon.java.dev.j10.labs.common.Sortcl;
import ru.avalon.java.dev.j10.labs.common.PersonComparator;
import java.util.Date;
import java.util.Comparator;

public class Application {

    public static void main(String[] args) {

	    String[] strings = {
			"Орест", "Пелагея", "Сергей", "Остап",
			"Паула", "Осип", "Перри", "Иосиф",
			"Иосиф", "Сидор", "Аркадий", "Соломон",
			"Фёкла", "Ария", "Аркадий", "Арсен",
			"Сергей", "Феликс", "Фелисити","Пётр"
		};

		Personcl[] persons = new Personcl[strings.length];

	    for(int i = 0; i < strings.length; ++i) {
	    	String s = strings[i];
	    	Date d = null;

	    	if(s == null || s == "")
	    		continue;

	    	if(i > 0 && (i % 4) == 0) {
	    		d = new Date();
				d.setYear( d.getYear() - i ); // Deprecated
			}

			persons[i] = new Personcl(s, d);
		}

        Sort sort = new Sortcl();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */

		Comparator<String> comparator = new PersonComparator();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);

		//for (Person p : persons)
		//	System.out.println(p.getName() +" - "+ p.getBirthDate());

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);

        //for(int i = 0; i < strings.length; ++i)
		//	System.out.println(strings[i]);

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);

		//for(int i = 0; i < strings.length; ++i)
		//	System.out.println(strings[i]);
    }
}
