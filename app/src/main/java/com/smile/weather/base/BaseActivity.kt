package com.smile.weather.base

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.jaeger.library.StatusBarUtil
import com.smile.weather.R
import rx.subscriptions.CompositeSubscription


open abstract class BaseActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

      /*  if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            var  window= window
           window.clearFlags(
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                        or WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION
            )
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_LAYOUT_STABLE)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
          //  window.navigationBarColor = Color.WHITE
          //  window.navigationBarColor = ContextCompat.getColor(this, R.color.color_navigation_bar)

        }*/

        StatusBarUtil.setTransparent(this);

        // makeStatusBarTransparent(this)

        //this.window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

    }







    abstract fun initView()
    open fun initData(){

    }


}