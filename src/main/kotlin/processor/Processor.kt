package processor

interface Processor {
    fun process(input: String): String


    // methods added for coverage calculating
    fun add(a: Int, b: Int) : Int

    fun multiply(a: Int, b: Int): Int
}