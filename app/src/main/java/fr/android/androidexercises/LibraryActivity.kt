package fr.android.androidexercises

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import com.squareup.picasso.Picasso

class LibraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        // TODO Get image view and load image form URL
        // http://img3.wikia.nocookie.net/__cb20120317101541/harrypotter/images/3/37/Gryffindor_Crest.jpg
        var imageView = findViewById<ImageView>(R.id.downloadImageView)
        Picasso.get()
               .load("http://img3.wikia.nocookie.net/__cb20120317101541/harrypotter/images/3/37/Gryffindor_Crest.jpg")
               .into(imageView)
    }

}
