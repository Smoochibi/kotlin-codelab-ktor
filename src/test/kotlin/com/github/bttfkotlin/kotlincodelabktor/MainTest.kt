package com.github.bttfkotlin.kotlincodelabktor

import com.github.bttfkotlin.kotlincodelabktor.bean.Event
import com.github.bttfkotlin.kotlincodelabktor.util.EventUtil
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainTest {

    @Test
    fun `1985 should return one nine eight five`() {
        val testedDate = "1985"

        val events = listOf(Event(testedDate, "test", "test"))
        val event = (EventUtil.prettier(events))[0]
        assertEquals(
                event.date
                , "one thousand nine hundred and eighty five")
    }

    @Test
    fun `1913 should return one thousand nine hundred and thirteen`() {
        val testedDate = "1913"

        val events = listOf(Event(testedDate, "test", "test"))
        val event = (EventUtil.prettier(events))[0]
        assertEquals(
                event.date
                , "one thousand nine hundred and thirteen")
    }

    @Test
    fun `When there is no date, nothing should be return`() {
        val events = listOf(Event("", "test", "test"))
        val size = EventUtil.prettier(events).size

        assertEquals(
                size
                , 0)
    }
}

