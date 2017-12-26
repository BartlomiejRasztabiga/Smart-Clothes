package pl.infinitefuture.smartclothes.util

import pl.infinitefuture.smartclothes.Label

interface DataFormat {

    fun labelToData(label: Label): String

    fun dataToLabel(data: String): Label

}