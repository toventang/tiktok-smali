package com.ttnet.org.chromium.base.task;

import android.view.Choreographer;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i implements Callable {

    /* renamed from: a  reason: collision with root package name */
    static final Callable f155328a = new i();

    static {
        Covode.recordClassIndex(103350);
    }

    private i() {
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new e(Choreographer.getInstance());
    }
}
