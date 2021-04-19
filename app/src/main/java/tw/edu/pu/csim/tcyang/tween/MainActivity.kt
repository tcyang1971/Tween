package tw.edu.pu.csim.tcyang.tween

import android.os.Bundle
import android.view.MotionEvent
import android.view.animation.AlphaAnimation
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

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        //1.AlphaAnimation 起始透明度,最後透明度(Alpha)值
        am = AlphaAnimation(0.0f, 1.0f)
        //設定動畫開始到結束的執行時間
        am.duration = 5000
        //設定重複次數，-1為無限次數
        am.repeatCount = 0

        //將動畫特效設定到背景圖並開始執行動畫
        cl.startAnimation(am)
        return false
    }
}