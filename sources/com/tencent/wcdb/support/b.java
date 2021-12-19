package com.tencent.wcdb.support;

import com.a;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;

public class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f154705a;

    /* renamed from: b  reason: collision with root package name */
    public int f154706b;

    /* renamed from: c  reason: collision with root package name */
    private int f154707c;

    /* renamed from: d  reason: collision with root package name */
    private int f154708d;

    /* renamed from: e  reason: collision with root package name */
    private int f154709e;

    /* renamed from: f  reason: collision with root package name */
    private int f154710f;

    /* renamed from: g  reason: collision with root package name */
    private int f154711g;

    static {
        Covode.recordClassIndex(103086);
    }

    /* access modifiers changed from: protected */
    public void a(V v) {
    }

    public final void a() {
        a(-1);
    }

    public final synchronized String toString() {
        int i2;
        String a2;
        MethodCollector.i(LiveFeedRefreshTimeSetting.DEFAULT);
        int i3 = this.f154710f;
        int i4 = this.f154711g + i3;
        if (i4 != 0) {
            i2 = (i3 * 100) / i4;
        } else {
            i2 = 0;
        }
        a2 = a.a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f154706b), Integer.valueOf(this.f154710f), Integer.valueOf(this.f154711g), Integer.valueOf(i2)});
        MethodCollector.o(LiveFeedRefreshTimeSetting.DEFAULT);
        return a2;
    }

    public b(int i2) {
        if (i2 > 0) {
            this.f154706b = i2;
            this.f154705a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V b(K k2) {
        MethodCollector.i(70);
        if (k2 != null) {
            synchronized (this) {
                try {
                    V v = this.f154705a.get(k2);
                    if (v != null) {
                        this.f154710f++;
                        return v;
                    }
                    this.f154711g++;
                    MethodCollector.o(70);
                    return null;
                } finally {
                    MethodCollector.o(70);
                }
            }
        } else {
            NullPointerException nullPointerException = new NullPointerException("key == null");
            MethodCollector.o(70);
            throw nullPointerException;
        }
    }

    public final V c(K k2) {
        V remove;
        MethodCollector.i(74);
        if (k2 != null) {
            synchronized (this) {
                try {
                    remove = this.f154705a.remove(k2);
                    if (remove != null) {
                        this.f154707c--;
                    }
                } finally {
                    MethodCollector.o(74);
                }
            }
            if (remove != null) {
                a(remove);
            }
            return remove;
        }
        NullPointerException nullPointerException = new NullPointerException("key == null");
        MethodCollector.o(74);
        throw nullPointerException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r5) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.support.b.a(int):void");
    }

    public final V a(K k2, V v) {
        V put;
        MethodCollector.i(71);
        if (k2 == null || v == null) {
            NullPointerException nullPointerException = new NullPointerException("key == null || value == null");
            MethodCollector.o(71);
            throw nullPointerException;
        }
        synchronized (this) {
            try {
                this.f154708d++;
                this.f154707c++;
                put = this.f154705a.put(k2, v);
                if (put != null) {
                    this.f154707c--;
                }
            } catch (Throwable th) {
                MethodCollector.o(71);
                throw th;
            }
        }
        if (put != null) {
            a(put);
        }
        a(this.f154706b);
        MethodCollector.o(71);
        return put;
    }
}
