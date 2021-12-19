package com.facebook.imagepipeline.a.a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.common.h.a;
import java.util.Collection;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final c f47649a;

    /* renamed from: b  reason: collision with root package name */
    public final int f47650b;

    /* renamed from: c  reason: collision with root package name */
    private a<Bitmap> f47651c;

    /* renamed from: d  reason: collision with root package name */
    private List<a<Bitmap>> f47652d;

    static {
        Covode.recordClassIndex(28887);
    }

    public final synchronized a<Bitmap> a() {
        a<Bitmap> b2;
        MethodCollector.i(2163);
        b2 = a.b(this.f47651c);
        MethodCollector.o(2163);
        return b2;
    }

    public final synchronized void b() {
        MethodCollector.i(2165);
        a.c(this.f47651c);
        this.f47651c = null;
        a.a((Iterable<? extends a<?>>) this.f47652d);
        this.f47652d = null;
        MethodCollector.o(2165);
    }

    public final synchronized int c() {
        MethodCollector.i(2167);
        List<a<Bitmap>> list = this.f47652d;
        if (list != null) {
            int size = list.size();
            MethodCollector.o(2167);
            return size;
        }
        MethodCollector.o(2167);
        return 0;
    }

    public static e a(c cVar) {
        return new e(cVar);
    }

    private e(c cVar) {
        this.f47649a = (c) i.a(cVar);
        this.f47650b = 0;
    }

    e(f fVar) {
        this.f47649a = (c) i.a(fVar.f47653a);
        this.f47650b = fVar.f47656d;
        this.f47651c = a.b(fVar.f47654b);
        this.f47652d = a.a((Collection) fVar.f47655c);
    }

    public final synchronized a<Bitmap> a(int i2) {
        MethodCollector.i(2160);
        List<a<Bitmap>> list = this.f47652d;
        if (list != null) {
            a<Bitmap> b2 = a.b(list.get(i2));
            MethodCollector.o(2160);
            return b2;
        }
        MethodCollector.o(2160);
        return null;
    }

    public final synchronized boolean b(int i2) {
        MethodCollector.i(2161);
        List<a<Bitmap>> list = this.f47652d;
        if (list == null || list.get(i2) == null) {
            MethodCollector.o(2161);
            return false;
        }
        MethodCollector.o(2161);
        return true;
    }
}
