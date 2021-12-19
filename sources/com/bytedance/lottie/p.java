package com.bytedance.lottie;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public abstract class p implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<d> f40827c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference<a> f40828d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<Context> f40829e;

    static {
        Covode.recordClassIndex(25023);
    }

    public p(d dVar, a aVar, Context context) {
        l.c(dVar, "");
        l.c(aVar, "");
        this.f40827c = new WeakReference<>(dVar);
        this.f40828d = new WeakReference<>(aVar);
        this.f40829e = new WeakReference<>(context);
    }
}
