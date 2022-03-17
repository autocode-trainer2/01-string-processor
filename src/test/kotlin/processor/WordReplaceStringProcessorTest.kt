package processor

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


class WordReplaceStringProcessorTest {

    companion object {
        const val STRING_TO_REPLACE = "to replace"
        const val REPLACEMENT = "replacement"
    }

    private lateinit var replaceProcessor: WordReplaceStringProcessor

    @Before
    fun setup() {
        replaceProcessor = WordReplaceStringProcessor(STRING_TO_REPLACE, REPLACEMENT)
    }

    @Test
    fun replace_string_no_occurrences() {
        val input = "some string"
        val result = replaceProcessor.process(input)
        assertEquals(input, result)
    }

}
