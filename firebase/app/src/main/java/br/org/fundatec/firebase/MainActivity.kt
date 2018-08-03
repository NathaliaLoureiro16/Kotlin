package br.org.fundatec.firebase

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity() {

    val database = FirebaseDatabase.getInstance()
    val usuarioNome = database.getReference("usuario/nome")
    val usuarioEmail = database.getReference("usuario/email")
    val usuarioTelefone = database.getReference("usuario/telefone")
    val usuarioData = database.getReference("usuario/data")




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            usuarioNome.setValue(nome.text.toString())
            usuarioEmail.setValue(email.text.toString())
            usuarioTelefone.setValue(telefone.text.toString())
            usuarioData.setValue(data.text.toString())
            Snackbar.make(view, "usuario salvo", Snackbar.LENGTH_LONG)
                    .setAction("Ok", null).show()
        }

        //val myRef = database.getReference("message")

       // myRef.setValue("bla")

        usuarioNome.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                val value = dataSnapshot.getValue(String::class.java)
                nome.setText(value)
                //Log.d(FragmentActivity.TAG, "Value is: " + value!!)
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                // Log.w(FragmentActivity.TAG, "Failed to read value.", error.toException())
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }

    }
}
