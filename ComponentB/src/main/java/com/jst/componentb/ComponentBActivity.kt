package com.jst.componentb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.launcher.ARouter
import com.jst.componenta.api.java.IServiceJava
import com.jst.componenta.api.kotlin.IServiceKotlin
import kotlinx.android.synthetic.main.activity_component_b.*


class ComponentBActivity : AppCompatActivity() {
    lateinit var iServiceJava:IServiceJava
    lateinit var iServiceKotlin:IServiceKotlin

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_component_b)
        textView.setText("This is ComponentBActivity")

        //java 版本的
        iServiceJava = ARouter.getInstance().navigation(IServiceJava::class.java)
        textViewJava.setText(iServiceJava.getData().data)

        //kotlin 版本的
        iServiceKotlin = ARouter.getInstance().navigation(IServiceKotlin::class.java)
        textViewKotlin.setText(iServiceKotlin.getData().data)
    }
}