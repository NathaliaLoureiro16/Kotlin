package br.org.fundatec.calculadoralp4

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_nomes.*

class NomesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nomes)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
//           Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//               .setAction("Action", null).show()

            detalhes()
        }

    }

    fun detalhes(){
        val intent = Intent (baseContext, NomesdetalhesActivity::class.java)
        startActivity(intent)
    }

}
