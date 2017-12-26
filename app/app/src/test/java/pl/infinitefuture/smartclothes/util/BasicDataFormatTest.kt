package pl.infinitefuture.smartclothes.util

import org.junit.Test

import org.junit.Assert.*
import pl.infinitefuture.smartclothes.Label

class BasicDataFormatTest {

    private val firstLabel = Label(1, "T-shirt", listOf("WSH-1", "BL-3", "DR-4", "IR-2"))
    private val firstDataString = "id=1;name=T-shirt;symbols=[WSH-1,BL-3,DR-4,IR-2]"

    @Test
    fun correctFirstLabelToStringConversion() {
        val dataString = DataFormatter.labelToData(firstLabel)
        assertEquals(firstDataString, dataString)
    }

    @Test
    fun correctFirstDataStringToLabelConversion() {
        val label = DataFormatter.dataToLabel(firstDataString)
        assertEquals(firstLabel, label)
    }

}