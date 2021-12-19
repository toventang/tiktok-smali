package com.bytedance.android.live.slot;

import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;

public interface z {
    static {
        Covode.recordClassIndex(7122);
    }

    @v(a = i.a.ON_CREATE)
    void onCreate();

    @v(a = i.a.ON_DESTROY)
    void onDestroy();

    @v(a = i.a.ON_PAUSE)
    void onPause();

    @v(a = i.a.ON_RESUME)
    void onResume();

    @v(a = i.a.ON_START)
    void onStart();

    @v(a = i.a.ON_STOP)
    void onStop();
}
