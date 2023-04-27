## Односвязный стек
Давайте реализуем стек на основе односвязного стека. Значения стека будем хранить в обёртке, где помимо значения будет указатель на ниже в стеке элемент, в самом же стеке будем хранить указатель на самый верхний элемент. Также реализуем две основные для стека операции. Для `push` создадим обёртку для нового значения, на который теперь будет указывать голова стека, а на старую голову будет указывать указатель на предыдущий элемент в обёртке. Для `pop` вынем значение из обёртки, на которую указывает голова стека, после чего передвиним голову стека на ту обёртку, на которую указывал указатель на предыдущий элемент в голове стека.
Использовать встроенные структуры данных для хранения элементов (массивы, списки, коллекции и так далее) запрещено, список надо писать самому.

Должен получиться такой вывод:

```
EMPTY
Добавим 0
0
Добавим 1
1 -> 0
Добавим 2
2 -> 1 -> 0
Добавим 3
3 -> 2 -> 1 -> 0
Добавим 4
4 -> 3 -> 2 -> 1 -> 0
Добавим 5
5 -> 4 -> 3 -> 2 -> 1 -> 0
Снимем со стека
5
4 -> 3 -> 2 -> 1 -> 0
Снимем со стека
4
3 -> 2 -> 1 -> 0
Снимем со стека
3
2 -> 1 -> 0
Снимем со стека
2
1 -> 0
Снимем со стека
1
0
Снимем со стека
0
EMPTY
```

