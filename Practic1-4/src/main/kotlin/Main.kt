fun main(args: Array<String>) {
    println("введите 1 число: ");
    var jack1: Int = readln()!!.toInt();
    println("введите 2 число: ");
    var jack2: Int = readln()!!.toInt();
    println("Введите операцию ('+','-','*','/'): ")
    val jack3: String = readln();
    var sum: Int = 0;
    if (jack3 == "+")
    {
        sum = jack1 + jack2;
    }
    if (jack3 == "-")
    {
        sum = jack1 - jack2;
    }
    if (jack3 == "*")
    {
        sum = jack1 * jack2;
    }
    if (jack3 == "/")
    {
        sum = jack1 / jack2;
    }
    else
        println("Вы ввели не верно символ операции!");
    println("Ответ: ")
    print(sum);
}