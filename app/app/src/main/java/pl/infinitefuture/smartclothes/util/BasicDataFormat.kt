package pl.infinitefuture.smartclothes.util

import pl.infinitefuture.smartclothes.Label

/**
 * First data format
 * Example:
 * id=1;name=TAG_NAME;symbols=[AD1, AD2, AD3, BF4, BF3, MH7, MJ2]
 */

object BasicDataFormat : DataFormat {

    private val ID = "id"
    private val NAME = "name"
    private val SYMBOLS = "symbols"

    private val ASSIGN = "="
    private val DELIMITER = ";"

    private val OPEN_ARRAY = "["
    private val END_ARRAY = "]"
    private val ARRAY_DELIMITER = ","

    override fun labelToData(label: Label): String {
        val dataString = StringBuilder()

        dataString.append(ID).append(ASSIGN)
        dataString.append(label.id).append(DELIMITER)
        dataString.append(NAME).append(ASSIGN)
        dataString.append(label.name).append(DELIMITER)
        dataString.append(SYMBOLS).append(ASSIGN)

        dataString.append(OPEN_ARRAY)
        for (symbol in label.symbols) {
            dataString.append(symbol).append(ARRAY_DELIMITER)
        }
        dataString.setLength(dataString.length - 1) //Remove last arrayDelimiter
        dataString.append(END_ARRAY)


        return dataString.toString()
    }

    override fun dataToLabel(data: String): Label {
        val dataArray = data.split(DELIMITER)

        val labelId = dataArray[0].split(ASSIGN)[1].toInt()
        val labelName = dataArray[1].split(ASSIGN)[1]

        val labelSymbolsString = dataArray[2].split(ASSIGN)[1]
        val labelSymbols = labelSymbolsString.substring(1, labelSymbolsString.length - 1).split(ARRAY_DELIMITER)

        return Label(labelId, labelName, labelSymbols)
    }
}
