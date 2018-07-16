package br.org.fundatec.calculadoralp4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.org.fundatec.calculadoralp4.R.id.btnCalcular
import kotlinx.android.synthetic.main.activity_energia.*

class EnergiaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_energia)
        btnCalcular.setOnClickListener({calcular()})
    }

    private fun calcular() {
        var tensao : Double? = edtTensao.text.toString().toDoubleOrNull();
        var corrente : Double? = edtCorrente.text.toString().toDoubleOrNull();
        var potencia : Double? = edtPotencia.text.toString().toDoubleOrNull();
        if (potencia != null && corrente != null){
            var calculo : Double = potencia / corrente;
            edtTensao.setText(calculo.toString());
        }
        if (potencia != null && tensao != null){
            var calculo : Double = potencia / tensao;
            edtCorrente.setText(calculo.toString());
        }
        if (tensao != null && corrente != null){
            var calculo: Double = tensao * corrente;
            edtPotencia.setText(calculo.toString());
        }else{
            if (tensao == null) edtTensao.error = "Insira a tensão";
            if (corrente == null) edtCorrente.error = "Insira a corrente";
            if (potencia == null) edtPotencia.error = "Insira a potencia";
        }
    }
}

