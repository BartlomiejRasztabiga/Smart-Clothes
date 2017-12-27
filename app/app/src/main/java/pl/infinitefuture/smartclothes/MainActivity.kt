package pl.infinitefuture.smartclothes

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        readLabelButton.setOnClickListener { goToReadLabelActivity() }
    }

    private fun goToReadLabelActivity() {
        val intent = Intent(this, ReadLabelActivity::class.java)
        startActivity(intent)
    }

    private fun goToWriteLabelActivity() {

    }
}