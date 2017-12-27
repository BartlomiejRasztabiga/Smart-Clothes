package pl.infinitefuture.smartclothes.util

import pl.infinitefuture.smartclothes.R

object LabelSymbols {
    private val WSH1 = Symbol("WSH-1", R.string.WSH_1_name, R.string.WSH_1_description, R.drawable.wsh1)
    private val WSH2 = Symbol("WSH-2", R.string.WSH_2_name, R.string.WSH_2_description, R.drawable.wsh2)
    private val WSH3 = Symbol("WSH-3", R.string.WSH_3_name, R.string.WSH_3_description, R.drawable.wsh3)
    private val WSH4 = Symbol("WSH-4", R.string.WSH_4_name, R.string.WSH_4_description, R.drawable.wsh4)
    private val WSH5 = Symbol("WSH-5", R.string.WSH_5_name, R.string.WSH_5_description, R.drawable.wsh5)
    private val WSH6 = Symbol("WSH-6", R.string.WSH_6_name, R.string.WSH_6_description, R.drawable.wsh6)
    private val WSH7 = Symbol("WSH-7", R.string.WSH_7_name, R.string.WSH_7_description, R.drawable.wsh7)

    private val BL1 = Symbol("BL-1", R.string.BL_1_name, R.string.BL_1_description, R.drawable.bl1)
    private val BL2 = Symbol("BL-2", R.string.BL_2_name, R.string.BL_2_description, R.drawable.bl2)
    private val BL3 = Symbol("BL-3", R.string.BL_3_name, R.string.BL_3_description, R.drawable.bl3)
    private val BL4 = Symbol("BL-4", R.string.BL_4_name, R.string.BL_4_description, R.drawable.bl4)
    private val BL5 = Symbol("BL-5", R.string.BL_5_name, R.string.BL_5_description, R.drawable.bl5)

    private val DR1 = Symbol("DR-1", R.string.DR_1_name, R.string.DR_1_description, R.drawable.dr1)
    private val DR2 = Symbol("DR-2", R.string.DR_2_name, R.string.DR_2_description, R.drawable.dr2)
    private val DR3 = Symbol("DR-3", R.string.DR_3_name, R.string.DR_3_description, R.drawable.dr3)
    private val DR4 = Symbol("DR-4", R.string.DR_4_name, R.string.DR_4_description, R.drawable.dr4)
    private val DR5 = Symbol("DR-5", R.string.DR_5_name, R.string.DR_5_description, R.drawable.dr5)
    private val DR6 = Symbol("DR-6", R.string.DR_6_name, R.string.DR_6_description, R.drawable.dr6)
    private val DR7 = Symbol("DR-7", R.string.DR_7_name, R.string.DR_7_description, R.drawable.dr7)
    private val DR8 = Symbol("DR-8", R.string.DR_8_name, R.string.DR_8_description, R.drawable.dr8)
    private val DR9 = Symbol("DR-9", R.string.DR_9_name, R.string.DR_9_description, R.drawable.dr9)
    private val DR10 = Symbol("DR-10", R.string.DR_10_name, R.string.DR_10_description, R.drawable.dr10)
    private val DR11 = Symbol("DR-11", R.string.DR_11_name, R.string.DR_11_description, R.drawable.dr11)
    private val DR12 = Symbol("DR-12", R.string.DR_12_name, R.string.DR_12_description, R.drawable.dr12)

    private val IR1 = Symbol("IR-1", R.string.IR_1_name, R.string.IR_1_description, R.drawable.ir1)
    private val IR2 = Symbol("IR-2", R.string.IR_2_name, R.string.IR_2_description, R.drawable.ir2)
    private val IR3 = Symbol("IR-3", R.string.IR_3_name, R.string.IR_3_description, R.drawable.ir3)
    private val IR4 = Symbol("IR-4", R.string.IR_4_name, R.string.IR_4_description, R.drawable.ir4)
    private val IR5 = Symbol("IR-5", R.string.IR_5_name, R.string.IR_5_description, R.drawable.ir5)

    private val CH1 = Symbol("CH-1", R.string.CH_1_name, R.string.CH_1_description, R.drawable.ch1)
    private val CH2 = Symbol("CH-2", R.string.CH_2_name, R.string.CH_2_description, R.drawable.ch2)
    private val CH3 = Symbol("CH-3", R.string.CH_3_name, R.string.CH_3_description, R.drawable.ch3)
    private val CH4 = Symbol("CH-4", R.string.CH_4_name, R.string.CH_4_description, R.drawable.ch4)
    private val CH5 = Symbol("CH-5", R.string.CH_5_name, R.string.CH_5_description, R.drawable.ch5)
    private val CH6 = Symbol("CH-6", R.string.CH_6_name, R.string.CH_6_description, R.drawable.ch6)
    private val CH7 = Symbol("CH-7", R.string.CH_7_name, R.string.CH_7_description, R.drawable.ch7)
    private val CH8 = Symbol("CH-8", R.string.CH_8_name, R.string.CH_8_description, R.drawable.ch8)

    private val WE1 = Symbol("WE-1", R.string.WE_1_name, R.string.WE_1_description, R.drawable.we1)
    private val WE2 = Symbol("WE-2", R.string.WE_2_name, R.string.WE_2_description, R.drawable.we2)
    private val WE3 = Symbol("WE-3", R.string.WE_3_name, R.string.WE_3_description, R.drawable.we3)
    private val WE4 = Symbol("WE-4", R.string.WE_4_name, R.string.WE_4_description, R.drawable.we4)

    private val symbolsList = listOf(
            WSH1, WSH2, WSH3, WSH4, WSH5, WSH6, WSH7, BL1,
            BL2, BL3, BL4, BL5,
            DR1, DR2, DR3, DR4, DR5, DR6, DR7, DR8, DR9, DR10, DR11, DR12,
            IR1, IR2, IR3, IR4, IR5,
            CH1, CH2, CH3, CH4, CH5, CH6, CH7, CH8,
            WE1, WE2, WE3, WE4)

    val symbols = symbolsList.map { it.name to it }.toMap()
}
