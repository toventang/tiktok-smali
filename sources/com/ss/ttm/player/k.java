package com.ss.ttm.player;

import android.content.Context;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.ss.ttm.a.c;
import java.util.HashMap;

public abstract class k {
    static {
        Covode.recordClassIndex(101341);
    }

    /* access modifiers changed from: protected */
    public abstract int a(int i2, float f2);

    /* access modifiers changed from: protected */
    public abstract int a(int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int a(int i2, long j2);

    /* access modifiers changed from: protected */
    public abstract int a(int i2, String str);

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(float f2, float f3);

    /* access modifiers changed from: protected */
    public abstract void a(int i2);

    /* access modifiers changed from: protected */
    public abstract void a(long j2);

    /* access modifiers changed from: protected */
    public abstract void a(Surface surface);

    /* access modifiers changed from: protected */
    public abstract void a(AudioProcessor audioProcessor);

    /* access modifiers changed from: protected */
    public abstract void a(IMediaDataSource iMediaDataSource);

    /* access modifiers changed from: protected */
    public abstract void a(LoadControl loadControl);

    /* access modifiers changed from: protected */
    public abstract void a(MaskInfo maskInfo);

    /* access modifiers changed from: protected */
    public abstract void a(SubInfo subInfo);

    /* access modifiers changed from: protected */
    public abstract void a(f fVar);

    /* access modifiers changed from: protected */
    public abstract void a(String str);

    /* access modifiers changed from: protected */
    public abstract void a(String str, int i2);

    /* access modifiers changed from: protected */
    public abstract float b(int i2, float f2);

    /* access modifiers changed from: protected */
    public abstract int b(int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract long b(int i2, long j2);

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public abstract void b(int i2);

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public abstract void c(int i2);

    /* access modifiers changed from: protected */
    public abstract void c(int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract String d(int i2);

    /* access modifiers changed from: protected */
    public abstract void d();

    /* access modifiers changed from: protected */
    public abstract Object e(int i2);

    /* access modifiers changed from: protected */
    public abstract void e();

    /* access modifiers changed from: protected */
    public abstract void f();

    /* access modifiers changed from: protected */
    public abstract void g();

    /* access modifiers changed from: protected */
    public abstract Context h();

    /* access modifiers changed from: protected */
    public abstract boolean i();

    /* access modifiers changed from: protected */
    public abstract int j();

    public static synchronized k a(Context context, TTPlayerClient tTPlayerClient, HashMap<Integer, Integer> hashMap) {
        w wVar;
        synchronized (k.class) {
            wVar = null;
            if (c.f151884a == 0) {
                c.a();
                c.f151884a = c.f151885b[0];
            }
            if (c.f151884a != 1 || (wVar = w.a(tTPlayerClient, context)) == null) {
                r.a(16, "not find start service info.");
                if (hashMap == null || hashMap.get(100).intValue() != 1) {
                    if (!r.a(7) && r.a(10, 0) < 3) {
                        r.a(7, true);
                    }
                } else if (hashMap.get(7).intValue() == 0 && hashMap.get(10).intValue() < 3) {
                    hashMap.put(7, 1);
                }
            }
        }
        return wVar;
    }
}
