# Algorithmization

## Одномерные массивы
1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
2. Дана последовательность действительных чисел а1 , а2, ..., аn. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
7. Даны действительные числа a1, a2, ..., an. Найти max( a1 + a2n, a2 + a2n−1, ..., an + an+1) .
8. Дана последовательность целых чисел a1, a2, ..., an . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min(a1, a2, ..., an) .
9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
## Задачи. Массивы массивов
1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1 &nbsp;&nbsp;&nbsp;   2 &nbsp;&nbsp;&nbsp;    3&nbsp;&nbsp;&nbsp;    ...&nbsp;&nbsp;&nbsp;   n<br>
 n&nbsp;   n-1  n-2  ...  1<br>
 1 &nbsp;&nbsp;&nbsp;    2&nbsp;&nbsp;&nbsp;     3&nbsp;&nbsp;&nbsp;    ...&nbsp;&nbsp;&nbsp;   n<br>
 n &nbsp;&nbsp;&nbsp;   n-1 &nbsp;&nbsp;&nbsp;  n-2&nbsp;&nbsp;&nbsp;   ... &nbsp;&nbsp;&nbsp;  1<br>
... &nbsp;&nbsp;&nbsp;  ...&nbsp;&nbsp;&nbsp;   ... &nbsp;&nbsp;&nbsp;  ...&nbsp;&nbsp;&nbsp;  ...<br>
 n &nbsp;&nbsp;&nbsp;   n-1 &nbsp;&nbsp;&nbsp;  n-2 &nbsp;&nbsp;&nbsp;  ... &nbsp;&nbsp;&nbsp;  1<br>

5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 1   1   1   ...   1   1   1<br>
 2   2   2   ...   2   2   0<br>
 3   3   3   ...   3   0   0<br>
... ... ...  ...  ... ... ...<br>
n-1 n-1  0   ...   0   0   0<br> 
 n   0   0   ...   0   0   0 
| Left-Aligned  | Center Aligned  | Right Aligned |
|:------------- |:---------------:| -------------:|
| col 3 is      | some wordy text |     **$1600** |
| col 2 is      | centered        |         $12   |
| zebra stripes | are neat        |        ~~$1~~ |
 

6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1 1 1 ... 1 1 1<br> 
0 1 1 ... 1 1 0<br>
0 0 1 ... 1 0 0<br>
. . .  .  . . .<br>
0 1 1 ... 1 1 0<br>
1 1 1 ... 1 1 1<br>
7. Сформировать квадратную матрицу порядка N по правилу:
A[I, J] = sin((I^2 - J^2) / N)
и подсчитать количество положительных элементов в ней.
8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
10. Найти положительные элементы главной диагонали квадратной матрицы.
11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
..., n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат. Пример магического квадрата порядка 3:
6 1 8<br>
7 5 3<br>
2 9 4<br>
## Одномерные массивы. Сортировки
1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
2. Даны две последовательности a1 <= a2<= ... <= an и b1 <= b2 <= .. <= bm. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= .. <= an .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <= .. <= an .Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai > ai+1 , то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
5. Сортировка вставками. Дана последовательность чисел a1, a2, ...,an . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е.
a1 <= a2 <= .. <= an . Берется следующее число ai  +1 и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1 , то продвигаются
на один элемент вперед. Если ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
7. Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= .. <= bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
8. Даны дроби p1/q1, p2/q2,  ..., pn/qn ( pi, qi - натуральные). Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания.
## Декомпозиция с использованием методов (подпрограммы)
1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:
НОК(А, В) = (A * B) / НОД (A, B)
2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
треугольника.
4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N.
11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N.
13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.
14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.
15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.
16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
