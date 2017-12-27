package pl.infinitefuture.smartclothes.util

import org.junit.Test

import org.junit.Assert.*
import pl.infinitefuture.smartclothes.Label

class BasicDataFormatTest {

    private val firstLabel = Label(1, "Tangle Teezer", listOf("WSH-7", "BL-5", "DR-4", "IR-5", "CH-8", "WE-4"))
    private val firstDataString = "id=1;name=Tangle Teezer;symbols=[WSH-7,BL-5,DR-4,IR-5,CH-8,WE-4]"

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