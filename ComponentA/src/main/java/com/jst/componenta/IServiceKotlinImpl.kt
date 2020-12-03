package com.jst.componenta

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.jst.componenta.api.kotlin.DataKotlin
import com.jst.componenta.api.kotlin.IServiceKotlin

@Route(path = "/componenta/IServiceKotlin")
class IServiceKotlinImpl: IServiceKotlin {
    override fun getData(): DataKotlin {
        return DataKotlin("data from ComponentA IServiceKotlinImpl")
    }
    override fun init(context: Context){

    }
}