package com.dm.tutorialscrollinactivity401

import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<CollapsingToolbarLayout>(R.id.toolbar_layout).title = title
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Sostituisci con la tua azione", Snackbar.LENGTH_LONG)
                    .setAction("Azione", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Popola il menu; questo aggiunge elementi alla barra delle azioni, se presente.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Gestisci i clic sugli elementi della barra delle azioni qui.
        // La barra delle azioni gestirà automaticamente i clic sul pulsante Home / Su,
        // purché specifichi un'attività genitore in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}