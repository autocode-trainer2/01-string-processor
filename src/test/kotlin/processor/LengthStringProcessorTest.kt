package processor

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


class LengthStringProcessorTest {

    private lateinit var lengthProcessor: LengthStringProcessor

    @Before
    fun setup() {
        lengthProcessor = LengthStringProcessor()
    }

    @Test
    fun process_short_string() {
        val shortString = "test"
        val result = lengthProcessor.process(shortString)
        assertEquals("mini $shortString", result)
    }

}
