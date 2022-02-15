import io.mockk.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import processor.Processor

class StringProcessorTest {

    private lateinit var filter: StringProcessor

    //Student test repository

    @Before
    fun setup() {
        filter = StringProcessor()
    }

    @Test
    fun process_null_string_no_processor_default_string_not_changed_check_result() {
        val result = filter.process(null, emptyArray())
        assertEquals("", result)
    }
}
