Реализовать таблицу истинности т е у нас есть p = false и q = true . Чему будет ранво p & q == ? , ? - вынести в таблицу.
 _______________________
|   p   |   q   |  p&q  |
------------------------
| false | false | false |
| false | true  | false |
| true  | false | false |
| true  | true  | true  |

Вопросы для самопроверки:
1.Что такое байт-код и почему он так важен для интернет-программирования на
языке Java?

Байт-код это код компилируемый из синтаксиса языка Java в машинный код в помощью
специального компилятора JavaVirtualMachine для кождого устройства этот компилятор свой
это позволяет запускать программу написанную на языке Java на любом устройстве где установлена
JavaVirtualMachine.

2. Каковы три ключевых принuипа объектно-ориентированного программирования?

Абстракция, наследование, полиморфизм, инкапсуляция

3. С чего начинается выполнение программы на Java?

С компиляции кода в машинный код.

4. Что такое переменная?

Переменная это своего рода контейнер для данных указанного типа и соответствующего размера

5. Какое из перечисленных ниже имен переменных недопустимо?
А. count
Б. $count
В. count27
Г. 67count

Ответ Г - переменная не может начинаться с цифры

6. Как создаются однострочный и мноrострочный комментарии?

Однострочный комментарий создается с помощью сочетания символов //
Пример:
// Это однострочный комментарий

Многострочные комментарии начинаются с помощью сочетания символов /* и заканчиваюся сочетанием */
Пример:
/* Это
многострочный
комментарий */

7. Как выглядит общая форма условного оператора if? Как выглядит общая форма
цикла for?

if (условие) {
Блок кода;
}

for (int итерируемая переменная; условие окончания цикла; изменение переменной по окончании итерации) {
Блок кода;
}

8. Как создать блок кода?

Блоки кода записываются в фигурных скобках.

9. Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая вычислила бы ваш вес на Луне.

См. класс MoonWeight

10. Видоизмените программу, созданную в упражнении 1.2, таким образом, чтобы
она выводила таблиuу перевода дюймов в метры. Выведите значения длины до
12 футов через каждый дюйм. После каждых 12 дюймов выведите пустую строку.
(Один метр приблизительно равен 39,37 дюйма.)

Не понял задачу нет упражнения 1.2

11. Если при вводе кода программы вы допустите опечатку, то какого рода сообщение
об ошибке получите?

Будет сообщение о неправильном синтаксисе или несуществующей переменной, классе или методе.

12. Имеет ли значение, с какой именно позиuии в строке начинается инструкuия?

В языке Java с точки зрения выполнения программы это не имеет значения, однако это может быть важно
с точки зрения читаемости кода программистами.

+Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено

См. класс PowX