package com.ss.android.ugc.aweme.bullet.module.base;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.ui.common.c;
import com.ss.android.ugc.aweme.au;

public class CommonBizActivityDelegate extends c implements au {

    /* renamed from: b  reason: collision with root package name */
    public Activity f69387b;

    static {
        Covode.recordClassIndex(42780);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        Activity activity = this.f69387b;
        if (activity != null) {
            d(activity);
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        Activity activity = this.f69387b;
        if (activity != null) {
            c(activity);
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        Activity activity = this.f69387b;
        if (activity != null) {
            b(activity);
        }
    }

    @v(a = i.a.ON_START)
    public final void onStart() {
        Activity activity = this.f69387b;
        if (activity != null) {
            e(activity);
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
        Activity activity = this.f69387b;
        if (activity != null) {
            f(activity);
        }
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        Activity activity = this.f69387b;
        if (activity != null) {
            a(activity, (Bundle) null);
        }
    }
}
