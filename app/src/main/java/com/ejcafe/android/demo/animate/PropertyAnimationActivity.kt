package com.ejcafe.android.demo.animate

import android.animation.*
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.ejcafe.android.demo.R

class PropertyAnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_property_animation)
//        val objectAnimator: ObjectAnimator = ObjectAnimator.ofFloat(findViewById(R.id.textview), "rotation", 0f, 360f)
//        objectAnimator.repeatMode = ValueAnimator.RESTART
//        objectAnimator.setDuration(5000).start()
        (AnimatorInflater.loadAnimator(this, R.animator.prop_anim) as AnimatorSet).apply {
            setTarget(findViewById(R.id.textview))
            start()
        }
    }
}
