package com.bytedance.als;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.als.b;
import com.bytedance.covode.number.Covode;

public abstract class j<T extends b> implements m {
    private final n lifecycle = new n(this);

    static {
        Covode.recordClassIndex(3119);
    }

    public abstract T getApiComponent();

    @Override // androidx.lifecycle.m
    public final i getLifecycle() {
        return this.lifecycle;
    }

    public void onCreate() {
        this.lifecycle.a(i.a.ON_CREATE);
    }

    public void onDestroy() {
        this.lifecycle.a(i.a.ON_DESTROY);
    }

    public void onPause() {
        this.lifecycle.a(i.a.ON_PAUSE);
    }

    public void onResume() {
        this.lifecycle.a(i.a.ON_RESUME);
    }

    public void onStart() {
        this.lifecycle.a(i.a.ON_START);
    }

    public void onStop() {
        this.lifecycle.a(i.a.ON_STOP);
    }
}
