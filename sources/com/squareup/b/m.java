package com.squareup.b;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;

public final class m implements d {

    /* renamed from: b  reason: collision with root package name */
    final LinkedHashMap<String, Bitmap> f58051b;

    /* renamed from: c  reason: collision with root package name */
    private final int f58052c;

    /* renamed from: d  reason: collision with root package name */
    private int f58053d;

    /* renamed from: e  reason: collision with root package name */
    private int f58054e;

    /* renamed from: f  reason: collision with root package name */
    private int f58055f;

    /* renamed from: g  reason: collision with root package name */
    private int f58056g;

    /* renamed from: h  reason: collision with root package name */
    private int f58057h;

    static {
        Covode.recordClassIndex(36067);
    }

    @Override // com.squareup.b.d
    public final synchronized int a() {
        int i2;
        MethodCollector.i(1397);
        i2 = this.f58053d;
        MethodCollector.o(1397);
        return i2;
    }

    @Override // com.squareup.b.d
    public final synchronized int b() {
        int i2;
        MethodCollector.i(1398);
        i2 = this.f58052c;
        MethodCollector.o(1398);
        return i2;
    }

    private m(int i2) {
        if (i2 > 0) {
            this.f58052c = i2;
            this.f58051b = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "activity"
            java.lang.Object r3 = com.squareup.b.ae.a(r5, r0)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            int r0 = r0.flags
            r2 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0029
            r1 = 1
        L_0x0014:
            int r0 = r3.getMemoryClass()
            if (r1 == 0) goto L_0x0022
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 11
            int r0 = r3.getLargeMemoryClass()
        L_0x0022:
            int r0 = r0 * r2
            int r0 = r0 / 7
            r4.<init>(r0)
            return
        L_0x0029:
            r1 = 0
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.b.m.<init>(android.content.Context):void");
    }

    @Override // com.squareup.b.d
    public final Bitmap a(String str) {
        MethodCollector.i(1384);
        if (str != null) {
            synchronized (this) {
                try {
                    Bitmap bitmap = this.f58051b.get(str);
                    if (bitmap != null) {
                        this.f58056g++;
                        return bitmap;
                    }
                    this.f58057h++;
                    MethodCollector.o(1384);
                    return null;
                } finally {
                    MethodCollector.o(1384);
                }
            }
        } else {
            NullPointerException nullPointerException = new NullPointerException("key == null");
            MethodCollector.o(1384);
            throw nullPointerException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r5) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.b.m.a(int):void");
    }

    @Override // com.squareup.b.d
    public final void a(String str, Bitmap bitmap) {
        MethodCollector.i(1387);
        if (str == null || bitmap == null) {
            NullPointerException nullPointerException = new NullPointerException("key == null || bitmap == null");
            MethodCollector.o(1387);
            throw nullPointerException;
        }
        synchronized (this) {
            try {
                this.f58054e++;
                this.f58053d += ae.a(bitmap);
                Bitmap put = this.f58051b.put(str, bitmap);
                if (put != null) {
                    this.f58053d -= ae.a(put);
                }
            } catch (Throwable th) {
                MethodCollector.o(1387);
                throw th;
            }
        }
        a(this.f58052c);
        MethodCollector.o(1387);
    }
}
