package tw.edu.pu.csim.tcyang.tween

import android.os.Bundle
import android.view.MotionEvent
import android.view.animation.*
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

        //0.特效組合 AnimationSet
        val set = AnimationSet(true)
        //加入特效組合
        set.addAnimation(am)

        //2.RotateAnimation 起始,最後旋轉角度
        am = RotateAnimation(0.0f, 360.0f)
        am.duration = 5000
        am.repeatCount = 0
        set.addAnimation(am)

        //3.ScaleAnimation縮放x起,始倍率,y起,始倍率
        am = ScaleAnimation(0.2f, 1.0f, 0.2f, 1.0f)
        am.duration = 5000
        am.repeatCount = 0
        set.addAnimation(am)

        //4.TranslateAnimation座標x1,x2,y1,y2位移
        //右下角座標 cl.getWidth(), cl.getHeight()
        am = TranslateAnimation(cl.width.toFloat(), 0.0f, cl.height.toFloat(), 0.0f)
        am.duration = 5000
        am.repeatCount = 0
        set.addAnimation(am)

        //將動畫特效組合設定到背景圖並開始執行動畫
        cl.startAnimation(set)

        //讀取xml方式所定義之特效
        am = AnimationUtils.loadAnimation(this, R.anim.anim1)
        am.setStartOffset(5000)
        txv.startAnimation(am)

        return false
    }
}