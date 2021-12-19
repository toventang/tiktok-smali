package com.bytedance.android.livesdk.liveroom;

import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;

public interface ISubController extends l {
    static {
        Covode.recordClassIndex(10478);
    }

    void init();

    @v(a = i.a.ON_CREATE)
    void onCreate();

    @v(a = i.a.ON_DESTROY)
    void onDestory();

    @v(a = i.a.ON_RESUME)
    void onResume();
}
