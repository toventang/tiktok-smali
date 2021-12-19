package com.bytedance.android.live.core.paging;

import androidx.h.i;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;

public interface b<T> {
    static {
        Covode.recordClassIndex(4693);
    }

    LiveData<i<T>> a();

    LiveData<com.bytedance.android.live.core.e.b> b();

    LiveData<com.bytedance.android.live.core.e.b> c();

    LiveData<Boolean> d();

    LiveData<Boolean> e();

    void f();

    void g();

    void h();

    LiveData<Integer> i();

    void j();

    int k();
}
