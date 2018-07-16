package br.org.fundatec.calculadoralp4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_animation.*

class AnimationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        Picasso.get().load("https://imagepng.org/wp-content/uploads/2017/10/bola.png").into(imagem1)
    }
fun anime(view: View){
    YoYo.with(Techniques.RotateInDownRight)
            .duration(5000)
            .repeat(2000)
            .playOn(imagem1);
}
}
