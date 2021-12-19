package com.bytedance.ies.lynx.lynx_adapter.wrapper;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.lynx.lynx_adapter.a.a;
import java.lang.reflect.Method;
import java.util.HashMap;

public interface i<T extends View> {
    static {
        Covode.recordClassIndex(20439);
    }

    a a();

    HashMap<String, Method> b();

    T c();

    T d();
}
