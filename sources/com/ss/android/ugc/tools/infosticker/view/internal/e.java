package com.ss.android.ugc.tools.infosticker.view.internal;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.h.a.m;
import com.ss.android.ugc.tools.view.widget.b.a;
import java.util.List;

public interface e<DATA> {
    static {
        Covode.recordClassIndex(98515);
    }

    void a(m mVar);

    LiveData<List<DATA>> b();

    LiveData<a> c();

    LiveData<a> d();

    LiveData<Object> e();

    void f();

    void g();
}
