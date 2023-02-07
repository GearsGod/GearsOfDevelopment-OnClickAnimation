package com.gearsofdevelopment.onanimationclick

import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils

abstract class OnClickListener<T> : View.OnClickListener {

    private var animation: Animation? = null

    constructor() {

    }

    constructor(animation: Animation) {
        this.animation = animation;
    }

    override fun onClick(p0: View?) {
        p0!!.isEnabled = false
        if (animation == null) {
            animation = AnimationUtils.loadAnimation(p0.context, R.anim.push)
        }
        animation!!.setAnimationListener(object : OnAnimationListener() {
            override fun onAnimationEnd(animation: Animation?) {
                super.onAnimationEnd(animation)
                p0.clearAnimation()
                val tag: Any? = p0.tag
                try {
                    onClick(p0, tag as T)
                } catch (e: Exception) {
                    onClick(p0, null)
                }
                p0.isEnabled = true
            }
        })
        p0.startAnimation(animation)
    }

    abstract fun onClick(v: View, t: T?)
}