package com.facebook.fresco.animation.b.a;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.e;
import com.facebook.common.d.i;
import com.facebook.fresco.animation.b.b;
import com.facebook.imagepipeline.a.c.c;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.j.g;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f47531a = a.class;

    /* renamed from: b  reason: collision with root package name */
    private final c f47532b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f47533c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> f47534d;

    /* renamed from: e  reason: collision with root package name */
    private com.facebook.common.h.a<com.facebook.imagepipeline.j.c> f47535e;

    /* renamed from: f  reason: collision with root package name */
    private int f47536f = -1;

    static {
        Covode.recordClassIndex(28829);
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized com.facebook.common.h.a<Bitmap> a() {
        com.facebook.common.h.a<Bitmap> a2;
        MethodCollector.i(2589);
        a2 = a(com.facebook.common.h.a.b(this.f47535e));
        MethodCollector.o(2589);
        return a2;
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized com.facebook.common.h.a<Bitmap> b() {
        MethodCollector.i(3114);
        com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar = null;
        if (!this.f47533c) {
            MethodCollector.o(3114);
            return null;
        }
        c cVar = this.f47532b;
        while (true) {
            e a2 = cVar.a();
            if (a2 == null) {
                break;
            }
            com.facebook.common.h.a<com.facebook.imagepipeline.j.c> b2 = cVar.f47682b.b(a2);
            if (b2 != null) {
                aVar = b2;
                break;
            }
        }
        com.facebook.common.h.a<Bitmap> a3 = a(aVar);
        MethodCollector.o(3114);
        return a3;
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized void c() {
        MethodCollector.i(3509);
        com.facebook.common.h.a.c(this.f47535e);
        this.f47532b.c(this.f47536f);
        this.f47535e = null;
        this.f47536f = -1;
        for (int i2 = 0; i2 < this.f47534d.size(); i2++) {
            com.facebook.common.h.a<com.facebook.imagepipeline.j.c> valueAt = this.f47534d.valueAt(i2);
            if (valueAt != null) {
                com.facebook.common.h.a.c(valueAt);
                this.f47532b.c(this.f47534d.keyAt(i2));
            }
        }
        this.f47534d.clear();
        MethodCollector.o(3509);
    }

    private static com.facebook.common.h.a<com.facebook.imagepipeline.j.c> b(com.facebook.common.h.a<Bitmap> aVar) {
        return com.facebook.common.h.a.a(new d(aVar, g.f48000a));
    }

    private static com.facebook.common.h.a<Bitmap> a(com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar) {
        d dVar;
        try {
            if (com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar) && (aVar.a() instanceof d) && (dVar = (d) aVar.a()) != null) {
                return dVar.f();
            }
            com.facebook.common.h.a.c(aVar);
            return null;
        } finally {
            com.facebook.common.h.a.c(aVar);
        }
    }

    private synchronized void c(int i2) {
        MethodCollector.i(3771);
        com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar = this.f47534d.get(i2);
        if (aVar != null) {
            this.f47534d.delete(i2);
            com.facebook.common.h.a.c(aVar);
            com.facebook.common.e.a.a(f47531a, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i2), this.f47534d);
        }
        MethodCollector.o(3771);
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized com.facebook.common.h.a<Bitmap> a(int i2) {
        MethodCollector.i(2584);
        if (this.f47532b.a(i2)) {
            c cVar = this.f47532b;
            com.facebook.common.h.a<Bitmap> a2 = a(cVar.f47682b.a(cVar.b(i2)));
            MethodCollector.o(2584);
            return a2;
        }
        com.facebook.common.h.a<Bitmap> a3 = a(com.facebook.common.h.a.b(this.f47534d.get(i2)));
        MethodCollector.o(2584);
        return a3;
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized boolean b(int i2) {
        MethodCollector.i(3115);
        if (!this.f47532b.a(i2)) {
            if (this.f47534d.get(i2) == null) {
                MethodCollector.o(3115);
                return false;
            }
        }
        MethodCollector.o(3115);
        return true;
    }

    public a(c cVar, boolean z) {
        this.f47532b = cVar;
        this.f47533c = z;
        this.f47534d = new SparseArray<>();
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized void b(int i2, com.facebook.common.h.a<Bitmap> aVar) {
        MethodCollector.i(3768);
        i.a(aVar);
        com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar2 = null;
        try {
            aVar2 = b(aVar);
            if (aVar2 != null) {
                com.facebook.common.h.a<com.facebook.imagepipeline.j.c> a2 = this.f47532b.a(i2, aVar2);
                if (com.facebook.common.h.a.a((com.facebook.common.h.a<?>) a2)) {
                    com.facebook.common.h.a.c(this.f47534d.get(i2));
                } else {
                    a2 = aVar2.clone();
                    com.facebook.common.h.a.c(this.f47534d.get(i2));
                }
                this.f47534d.put(i2, a2);
                com.facebook.common.e.a.a(f47531a, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i2), this.f47534d);
                com.facebook.common.h.a.c(aVar2);
                MethodCollector.o(3768);
            }
        } finally {
            com.facebook.common.h.a.c(aVar2);
            MethodCollector.o(3768);
        }
    }

    @Override // com.facebook.fresco.animation.b.b
    public final synchronized void a(int i2, com.facebook.common.h.a<Bitmap> aVar) {
        MethodCollector.i(3761);
        i.a(aVar);
        c(i2);
        com.facebook.common.h.a<com.facebook.imagepipeline.j.c> aVar2 = null;
        try {
            aVar2 = b(aVar);
            if (aVar2 != null) {
                com.facebook.common.h.a.c(this.f47535e);
                this.f47535e = this.f47532b.a(i2, aVar2);
                this.f47536f = i2;
            }
        } finally {
            com.facebook.common.h.a.c(aVar2);
            MethodCollector.o(3761);
        }
    }
}
