package processor

class TrimStringProcessor : Processor {
    /**
     * Remove leading and trailing whitespaces in the string
     * @param input original string
     * @return Original string without spaces at the begging and at the end of the original string
     */
    override fun process(input: String): String = input.trim()

    // methods added for coverage calculating
    override fun add(a: Int, b: Int) : Int {
        return a + b
    }

    override fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}