package br.org.fundatec.calculadoralp4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }
    fun mapa(view : View){
        val intent = Intent (baseContext, MapsActivity::class.java)
                startActivity(intent)
    }
    fun refri(view : View){
        val intent = Intent (baseContext, RefrizometroActivity::class.java)
        startActivity(intent)
    }
    fun energia(view : View){
        val intent = Intent (baseContext, EnergiaActivity::class.java)
        startActivity(intent)
    }
    fun nome(view : View){
        val intent = Intent (baseContext, NomesActivity::class.java)
        startActivity(intent)
    }
}
