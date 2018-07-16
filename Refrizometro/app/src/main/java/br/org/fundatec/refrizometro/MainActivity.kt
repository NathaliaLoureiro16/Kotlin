package br.org.fundatec.refrizometro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCalcular.setOnClickListener({ calcular() })
    }

    private fun calcular() {
    val valor : Double? = edtValor.text.toString().toDoubleOrNull();
        val mls: Double? = edtMls.text.toString().toDoubleOrNull();
        if(valor != null && mls != null){
            val valorPorLitro : Double = valor / mls * 1000;
            edtValorLitro.text = valorPorLitro.toString() + " por litro"
        }else{
            if (valor == null) edtValor.error = "Insira um valor"
            if (mls == null) edtMls.error = "Insira um valor valido"
           // Toast.makeText(this, "Preencha os valores", Toast.LENGTH_LONG).show();
        }

    }
}
