package com.bytedance.android.live.core.performance;

import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;

public abstract class BaseSampler<T> implements Runnable, Runnable {

    /* renamed from: c  reason: collision with root package name */
    private static final String f9229c = BaseSampler.class.getClass().getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    protected Handler f9230a;

    /* renamed from: b  reason: collision with root package name */
    protected a f9231b;

    public interface a {
        static {
            Covode.recordClassIndex(4723);
        }
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

    static {
        Covode.recordClassIndex(4722);
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        com.bytedance.android.live.core.c.a.a(3, f9229c, "onDestroy");
        Handler handler = this.f9230a;
        if (handler != null) {
            handler.removeCallbacks(this);
            this.f9230a = null;
        }
        if (this.f9231b != null) {
            this.f9231b = null;
        }
    }
}
