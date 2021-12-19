package com.ss.android.ugc.aweme.feed.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Locale;

public final class a<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f93168a = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    private int f93169b;

    /* renamed from: c  reason: collision with root package name */
    private int f93170c = 31;

    /* renamed from: d  reason: collision with root package name */
    private int f93171d;

    /* renamed from: e  reason: collision with root package name */
    private int f93172e;

    /* renamed from: f  reason: collision with root package name */
    private int f93173f;

    /* renamed from: g  reason: collision with root package name */
    private int f93174g;

    static {
        Covode.recordClassIndex(59101);
    }

    public final synchronized String toString() {
        int i2;
        String a2;
        MethodCollector.i(8398);
        int i3 = this.f93173f;
        int i4 = this.f93174g + i3;
        if (i4 != 0) {
            i2 = (i3 * 100) / i4;
        } else {
            i2 = 0;
        }
        a2 = com.a.a(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f93170c), Integer.valueOf(this.f93173f), Integer.valueOf(this.f93174g), Integer.valueOf(i2)});
        MethodCollector.o(8398);
        return a2;
    }

    public final V a(K k2) {
        MethodCollector.i(8389);
        if (k2 != null) {
            synchronized (this) {
                try {
                    V v = this.f93168a.get(k2);
                    if (v != null) {
                        this.f93173f++;
                        return v;
                    }
                    this.f93174g++;
                    MethodCollector.o(8389);
                    return null;
                } finally {
                    MethodCollector.o(8389);
                }
            }
        } else {
            NullPointerException nullPointerException = new NullPointerException("key == null");
            MethodCollector.o(8389);
            throw nullPointerException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r5) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.g.a.a(int):void");
    }

    public final V a(K k2, V v) {
        V put;
        MethodCollector.i(8391);
        if (k2 != null) {
            synchronized (this) {
                try {
                    this.f93171d++;
                    this.f93169b++;
                    put = this.f93168a.put(k2, v);
                    if (put != null) {
                        this.f93169b--;
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8391);
                    throw th;
                }
            }
            a(this.f93170c);
            MethodCollector.o(8391);
            return put;
        }
        NullPointerException nullPointerException = new NullPointerException("key == null || value == null");
        MethodCollector.o(8391);
        throw nullPointerException;
    }
}
