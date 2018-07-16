package br.org.fundatec.calculadoralp4

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_nomesdetalhes.*
import kotlinx.android.synthetic.main.activity_principal.*
import kotlinx.android.synthetic.main.content_nomesdetalhes.*

class NomesdetalhesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nomesdetalhes)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()
            var intentResult = Intent()
            intentResult.putExtra("nome", edtNome.text.toString())
            intentResult.putExtra("gols", edtGols.text.toString())
            intentResult.putExtra("quedas", edtQuedas.text.toString())
            intentResult.putExtra("position", intent.getIntExtra("position",0))
            setResult(intent.getIntExtra("requestCode",0),intentResult)
            finish()
        }
        edtNome.setText(intent.getStringExtra("nome"))
        edtGols.setText(intent.getStringExtra("gols"))
        edtQuedas.setText(intent.getStringExtra("quedas"))

    }
}
