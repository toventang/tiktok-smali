package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.common.h.c;
import com.facebook.imageutils.a;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final c<Bitmap> f48069a;

    /* renamed from: b  reason: collision with root package name */
    private int f48070b;

    /* renamed from: c  reason: collision with root package name */
    private long f48071c;

    /* renamed from: d  reason: collision with root package name */
    private final int f48072d;

    /* renamed from: e  reason: collision with root package name */
    private final int f48073e;

    static {
        Covode.recordClassIndex(29046);
    }

    public final synchronized int a() {
        int i2;
        MethodCollector.i(14202);
        i2 = this.f48070b;
        MethodCollector.o(14202);
        return i2;
    }

    public final synchronized long b() {
        long j2;
        MethodCollector.i(14203);
        j2 = this.f48071c;
        MethodCollector.o(14203);
        return j2;
    }

    public final synchronized int c() {
        int i2;
        MethodCollector.i(14229);
        i2 = this.f48072d;
        MethodCollector.o(14229);
        return i2;
    }

    public final synchronized int d() {
        int i2;
        MethodCollector.i(14230);
        i2 = this.f48073e;
        MethodCollector.o(14230);
        return i2;
    }

    public final synchronized boolean a(Bitmap bitmap) {
        MethodCollector.i(14136);
        int a2 = a.a(bitmap);
        int i2 = this.f48070b;
        if (i2 < this.f48072d) {
            long j2 = this.f48071c;
            long j3 = (long) a2;
            if (j2 + j3 <= ((long) this.f48073e)) {
                this.f48070b = i2 + 1;
                this.f48071c = j2 + j3;
                MethodCollector.o(14136);
                return true;
            }
        }
        MethodCollector.o(14136);
        return false;
    }

    public final synchronized void b(Bitmap bitmap) {
        boolean z;
        boolean z2;
        MethodCollector.i(14137);
        int a2 = a.a(bitmap);
        if (this.f48070b > 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z, "No bitmaps registered.");
        long j2 = (long) a2;
        if (j2 <= this.f48071c) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object[] objArr = {Integer.valueOf(a2), Long.valueOf(this.f48071c)};
        if (z2) {
            this.f48071c -= j2;
            this.f48070b--;
            MethodCollector.o(14137);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(i.a("Bitmap size bigger than the total registered size: %d, %d", objArr));
            MethodCollector.o(14137);
            throw illegalArgumentException;
        }
    }

    public b(int i2, int i3) {
        boolean z;
        boolean z2 = true;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        i.a(i3 <= 0 ? false : z2);
        this.f48072d = i2;
        this.f48073e = i3;
        this.f48069a = new c<Bitmap>() {
            /* class com.facebook.imagepipeline.memory.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(29047);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.h.c
            public final /* synthetic */ void a(Bitmap bitmap) {
                Bitmap bitmap2 = bitmap;
                try {
                    b.this.b(bitmap2);
                } finally {
                    bitmap2.recycle();
                }
            }
        };
    }
}
