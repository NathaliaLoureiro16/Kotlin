package br.org.fundatec.calculadoralp4

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_nomes.*
import kotlinx.android.synthetic.main.content_nomes.*

class NomesActivity : AppCompatActivity() {

    var jogadores = arrayOf<Jogador>()
    val NEWJOGADOR = 483

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nomes)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
//           Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//               .setAction("Action", null).show()
            var ney = Jogador("Menino Ney", "1", "22")

            detalhes(ney)
        }
    var adapter = ArrayAdapter<Jogador>(baseContext,android.R.layout.simple_list_item_1,jogadores)
            listview.adapter = adapter
    }

    fun detalhes(jogador: Jogador) {
        val intent = Intent (baseContext, NomesdetalhesActivity::class.java)
        intent.putExtra("nome", jogador.nome)
        intent.putExtra("gols", jogador.gols)
        intent.putExtra("quedas", jogador.quedas)
        startActivityForResult(intent, NEWJOGADOR)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == NEWJOGADOR && data != null){
            var nome = data.getStringExtra("nome")
            var gols = data.getStringExtra("gols")
            var quedas = data.getStringExtra("quedas")

            var jogador = Jogador(nome,gols,quedas)
            jogadores += jogador
            var adapter = ArrayAdapter<Jogador>(baseContext,android.R.layout.simple_list_item_1,jogadores)
            listview.adapter = adapter
        }
    }
}
