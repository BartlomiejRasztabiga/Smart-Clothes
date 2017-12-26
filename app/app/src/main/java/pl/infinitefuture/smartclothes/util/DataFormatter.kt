package pl.infinitefuture.smartclothes.util

import pl.infinitefuture.smartclothes.Label

object DataFormatter : DataFormat {

    private val defaultFormat: DataFormat = BasicDataFormat

    override fun labelToData(label: Label): String {
        return defaultFormat.labelToData(label)
    }

    override fun dataToLabel(data: String): Label {
        return defaultFormat.dataToLabel(data)
    }
}


