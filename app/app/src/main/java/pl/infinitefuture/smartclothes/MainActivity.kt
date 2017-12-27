package pl.infinitefuture.smartclothes

import android.content.Intent
import android.nfc.NfcAdapter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import pl.infinitefuture.smartclothes.util.DataFormatter
import pl.infinitefuture.smartclothes.util.LabelSymbols
import pl.infinitefuture.smartclothes.util.NFCTools

class MainActivity : AppCompatActivity() {

    private var mNFCAdapter: NfcAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mNFCAdapter = NfcAdapter.getDefaultAdapter(this)
    }

    override fun onResume() {
        super.onResume()
        mNFCAdapter?.let {
            NFCTools.enableNFC(it, this, javaClass)
        }
    }

    override fun onPause() {
        super.onPause()
        mNFCAdapter?.let {
            NFCTools.disableNfc(it, this)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        val dataOnTag = NFCTools.readFromNFCTag(intent)
        val labelOnTag = DataFormatter.dataToLabel(dataOnTag)
        //nfcMessage.text = dataOnTag

        val labelName = labelOnTag.name
        val labelSymbolsStrings = labelOnTag.symbols

        val labelSymbols = labelSymbolsStrings.map { LabelSymbols.symbols[it] }

        nfcMessage.text = labelName

    }
}
