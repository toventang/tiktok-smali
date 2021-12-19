package com.ss.android.ugc.aweme.lego.component;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.lego.q;
import java.util.List;

public abstract class LifecycleInflate implements au, q {

    /* renamed from: a  reason: collision with root package name */
    public Context f107468a;

    /* renamed from: b  reason: collision with root package name */
    public List<SparseArray<View>> f107469b;

    static {
        Covode.recordClassIndex(68775);
    }

    @v(a = i.a.ON_CREATE)
    public void onCreate() {
    }

    @v(a = i.a.ON_PAUSE)
    public void onPause() {
    }

    @v(a = i.a.ON_RESUME)
    public void onResume() {
    }

    @v(a = i.a.ON_START)
    public void onStart() {
    }

    @v(a = i.a.ON_STOP)
    public void onStop() {
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        synchronized (this.f107469b) {
            this.f107469b.clear();
        }
        this.f107468a = null;
    }
}
