package pl.mkonkel.wsb.firebasedb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_main.*
import pl.mkonkel.wsb.firebasedb.model.Note
import timber.log.Timber
import java.util.*

class MainActivity : AppCompatActivity() {
    private val db = FirebaseDatabase.getInstance().reference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        databaseListener()

        button_add_note.setOnClickListener {
            val title = note_title.text.toString()
            val body = note_body.text.toString()

            addNote(title, body)
        }
    }

    private fun addNote(title: String?, message: String?) {
        val note = Note(
            title = title,
            message = message
        )

        val uuid = UUID.randomUUID().toString()

        db.child(NOTE)
            .child(uuid)
            .setValue(note)
            .addOnSuccessListener {
                Timber.i("Successful note adding")
            }
            .addOnFailureListener {
                Timber.e("Failure during adding Note")
            }
    }

    private fun databaseListener() {
        db.child(NOTE)
            .addValueEventListener(object : ValueEventListener {
                override fun onCancelled(p0: DatabaseError) {
                    Timber.e("Request was Canceled!")
                }

                override fun onDataChange(p0: DataSnapshot) {
                    Timber.i("Something was Changed!")
                }

            }
            )
    }


    companion object {
        const val NOTE = "note"
    }
}
