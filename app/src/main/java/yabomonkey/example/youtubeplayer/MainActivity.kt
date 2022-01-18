package yabomonkey.example.youtubeplayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.youtube.player.YouTubeStandalonePlayer
import yabomonkey.example.youtubeplayer.databinding.ActivityMainBinding
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnPlaySingle.setOnClickListener(this)
        binding.btnStandalone.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent = when (view.id) {
            R.id.btnPlaySingle -> Intent(this, YoutubeActivity::class.java)
            R.id.btnStandalone -> Intent(this, StandaloneActivity::class.java)
            else -> throw IllegalArgumentException("Undefined button click")
        }
        startActivity(intent)
    }


}