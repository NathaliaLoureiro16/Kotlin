package br.org.fundatec.calculadoralp4

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_nomes.*
import kotlinx.android.synthetic.main.content_nomes.*
import java.text.FieldPosition

class NomesActivity : AppCompatActivity() {

    var jogadores = arrayOf<Jogador>()
    val NEWJOGADOR = 483
    val EDITJOGADOR = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nomes)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
//           Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//               .setAction("Action", null).show()
           // var ney = Jogador("Menino Ney", "1", "22")

            detalhes()
        }
    var adapter = ArrayAdapter<Jogador>(baseContext,android.R.layout.simple_list_item_1,jogadores)
            listview.adapter = adapter
    }

    private fun detalhes() {
        val intent = Intent (baseContext, NomesdetalhesActivity::class.java)
        intent.putExtra("nome", "")
        intent.putExtra("gols", "")
        intent.putExtra("quedas", "")
        intent.putExtra("requestCode",EDITJOGADOR)
        startActivityForResult(intent, NEWJOGADOR)
    }

    fun detalhes(jogador: Jogador, position: Int) {
        val intent = Intent (baseContext, NomesdetalhesActivity::class.java)
        intent.putExtra("nome", jogador.nome)
        intent.putExtra("gols", jogador.gols)
        intent.putExtra("quedas", jogador.quedas)
        intent.putExtra("requestCode",EDITJOGADOR)
        intent.putExtra("position", position)
        startActivityForResult(intent, EDITJOGADOR)

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
            listview.setOnItemClickListener { parent, view, position, id ->
                var selecionado = jogadores.get(position)
                detalhes(selecionado, position)
            }
        }else  if (requestCode == EDITJOGADOR && data != null){
            var nome = data.getStringExtra("nome")
            var gols = data.getStringExtra("gols")
            var quedas = data.getStringExtra("quedas")
            var jogador = Jogador(nome,gols,quedas)
            var position = data.getIntExtra("position",0)
            jogadores.set(position,jogador)
            var adapter = ArrayAdapter<Jogador>(baseContext,android.R.layout.simple_list_item_1,jogadores)
            listview.adapter = adapter
            listview.setOnItemClickListener { parent, view, position, id ->
                var selecionado = jogadores.get(position)
                detalhes(selecionado, position)
            }
        }
    }
}
