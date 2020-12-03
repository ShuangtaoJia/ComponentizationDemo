package com.jst.componenta;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jst.componenta.api.java.DataJava;
import com.jst.componenta.api.java.IServiceJava;

@Route(path = "/componenta/IServiceJava")
public class IServiceJavaImpl implements IServiceJava {
    @Override
    public DataJava getData() {
        return new DataJava("data from ComponentA IServiceJavaImpl");
    }

    @Override
    public void init(Context context) {

    }
}
