package pl.infinitefuture.smartclothes

import android.content.Context
import android.content.Intent
import android.nfc.NfcAdapter
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_read_label.*
import pl.infinitefuture.smartclothes.util.DataFormatter
import pl.infinitefuture.smartclothes.util.LabelSymbols
import pl.infinitefuture.smartclothes.util.NFCTools
import pl.infinitefuture.smartclothes.util.Symbol

class ReadLabelActivity : AppCompatActivity() {

    private var mNFCAdapter: NfcAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_read_label)

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

        val labelName = labelOnTag.name
        val labelSymbolsStrings = labelOnTag.symbols

        val labelSymbols = labelSymbolsStrings.map { LabelSymbols.symbols[it] }

        nfcMessage.text = labelName
        symbols.adapter = SymbolsGridAdapter(labelSymbols, applicationContext)

    }

    private class SymbolsGridAdapter(private val symbols: List<Symbol?>, private val context: Context) : BaseAdapter() {

        override fun getCount(): Int {
            return symbols.size
        }

        override fun getItem(position: Int): Any {
            return position
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val imageView = ImageView(context)
            imageView.layoutParams = LinearLayout.LayoutParams(256, 256)
            imageView.setOnClickListener { showSymbolDescriptionToast(position) }

            imageView.setImageResource(symbols[position]!!.image)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            return imageView
        }

        private fun showSymbolDescriptionToast(position: Int) {
            val symbolDescription = context.getString(symbols[position]!!.description)
            Toast.makeText(context, symbolDescription, Toast.LENGTH_SHORT).show()
        }
    }
}
