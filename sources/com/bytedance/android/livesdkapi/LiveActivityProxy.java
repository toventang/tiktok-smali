package com.bytedance.android.livesdkapi;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public class LiveActivityProxy implements au {
    static {
        Covode.recordClassIndex(13556);
    }

    /* access modifiers changed from: protected */
    @v(a = i.a.ON_CREATE)
    public void onCreate() {
    }

    /* access modifiers changed from: protected */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
    }

    /* access modifiers changed from: protected */
    @v(a = i.a.ON_PAUSE)
    public void onPause() {
    }

    /* access modifiers changed from: protected */
    @v(a = i.a.ON_RESUME)
    public void onResume() {
    }

    /* access modifiers changed from: protected */
    @v(a = i.a.ON_START)
    public void onStart() {
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* access modifiers changed from: protected */
    @v(a = i.a.ON_STOP)
    public void onStop() {
    }
}
