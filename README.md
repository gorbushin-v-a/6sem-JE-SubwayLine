# 6sem-JE-SubwayLine
Задача 9: Система управления движением на линии метро.
Необходимо разработать систему, контролирующую движение на
линии метрополитена, соединяющей N станций (7≤ N ≤ 20).
На двух конечных станциях линии расположены депо, в которых стоят
свободные поезда. Движение по линии осуществляется в обе стороны, известно
стандартное время перегона между каждыми двумя соседними станциями.
Время работы метро – с 6.00 утра до 12.00 ночи.
Фактическое движение поездов метро зависит не только от графика, но и
от непредвиденных задержек поездов на станциях. В
этом случае на следующем перегоне между станциями поезд двигается с
большей скоростью (при этом стандартное время перегона можно сократить
лишь в полтора раза) и сокращает
время стоянки на следующей станции (но время стоянки не может быть менее 1
минуты), пытаясь тем самым «нагнать» время задержки и восстановить график
движения на линии.
Период моделирования – некоторый отрезок суток (например, с 6 до 12
часов). Цель моделирования – изучение стабильности движения поездов на
линии.
При моделировании движения непредвиденные задержки поездов на
станциях следует моделировать статистически: отклонение от времени
отправления – случайная величина, изменяющаяся в некотором диапазоне
(например, от 20 до 60 секунд).
В число параметров моделирования следует включить величину N , шаг
моделирования – отрезок времени от 30 до 120 секунд, период моделирования. В
ходе моделирования на экране компьютера должно быть указано – в виде табло на каждой 
станции – время, прошедшее после прибытия последнего поезда на станцию, и длительность
его стоянки, а также время сдвига движения относительно исходного графика. По окончании
моделирования следует предусмотреть вывод итоговой информации, в том числе
количество и среднюю величину возникших задержек поездов, максимальный и
средний интервал между прибытием поездов на станцию.
