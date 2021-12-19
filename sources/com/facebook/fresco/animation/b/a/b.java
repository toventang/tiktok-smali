package com.facebook.fresco.animation.b.a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.h.a;

public final class b implements com.facebook.fresco.animation.b.b {

    /* renamed from: a  reason: collision with root package name */
    private int f47537a = -1;

    /* renamed from: b  reason: collision with root package name */
    private a<Bitmap> f47538b;

    static {
        Covode.recordClassIndex(28830);
    }

    @Override // com.facebook.fresco.animation.b.b
    public final void b(int i2, a<Bitmap> aVar) {
    }

    private synchronized void d() {
        MethodCollector.i(11595);
        a.c(this.f47538b);
        this.f47538b = null;
        this.f47537a = -1;
        MethodCollector.o(11595);
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized a<Bitmap> a() {
        a<Bitmap> b2;
        MethodCollector.i(11100);
        b2 = a.b(this.f47538b);
        MethodCollector.o(11100);
        return b2;
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized a<Bitmap> b() {
        MethodCollector.i(11261);
        try {
        } finally {
            d();
            MethodCollector.o(11261);
        }
        return a.b(this.f47538b);
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized void c() {
        MethodCollector.i(11263);
        d();
        MethodCollector.o(11263);
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized a<Bitmap> a(int i2) {
        MethodCollector.i(11099);
        if (this.f47537a == i2) {
            a<Bitmap> b2 = a.b(this.f47538b);
            MethodCollector.o(11099);
            return b2;
        }
        MethodCollector.o(11099);
        return null;
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized boolean b(int i2) {
        MethodCollector.i(11262);
        if (i2 != this.f47537a || !a.a((a<?>) this.f47538b)) {
            MethodCollector.o(11262);
            return false;
        }
        MethodCollector.o(11262);
        return true;
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized void a(int i2, a<Bitmap> aVar) {
        MethodCollector.i(11419);
        if (aVar == null || this.f47538b == null || !aVar.a().equals(this.f47538b.a())) {
            a.c(this.f47538b);
            this.f47538b = a.b(aVar);
            this.f47537a = i2;
            MethodCollector.o(11419);
            return;
        }
        MethodCollector.o(11419);
    }
}
