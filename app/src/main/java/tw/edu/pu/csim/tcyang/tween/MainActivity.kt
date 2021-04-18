package tw.edu.pu.csim.tcyang.tween

import android.os.Bundle
import android.view.animation.Animation
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    lateinit var txv: TextView
    lateinit var cl: ConstraintLayout
    lateinit var am : Animation  //動畫特效

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txv = findViewById(R.id.txv)
        cl = findViewById(R.id.cl)
        cl.setBackgroundResource(R.drawable.salmon)
    }
}