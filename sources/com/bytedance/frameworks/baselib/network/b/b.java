package com.bytedance.frameworks.baselib.network.b;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class b implements c, Comparable<c>, Runnable {

    /* renamed from: c  reason: collision with root package name */
    protected final AtomicBoolean f28854c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    protected final AtomicBoolean f28855d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    public int f28856e = 0;

    /* renamed from: f  reason: collision with root package name */
    protected int f28857f;

    static {
        Covode.recordClassIndex(16959);
    }

    public final boolean c() {
        return this.f28855d.get();
    }

    public b a(int i2) {
        this.f28857f = i2;
        return this;
    }
}
