package androidx.c;

import com.a;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class e<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<K, V> f1811a;

    /* renamed from: b  reason: collision with root package name */
    private int f1812b;

    /* renamed from: c  reason: collision with root package name */
    private int f1813c;

    /* renamed from: d  reason: collision with root package name */
    private int f1814d;

    /* renamed from: e  reason: collision with root package name */
    private int f1815e;

    /* renamed from: f  reason: collision with root package name */
    private int f1816f;

    /* renamed from: g  reason: collision with root package name */
    private int f1817g;

    static {
        Covode.recordClassIndex(556);
    }

    /* access modifiers changed from: protected */
    public int b(K k2, V v) {
        return 1;
    }

    public final void a() {
        a(-1);
    }

    public final synchronized int b() {
        return this.f1812b;
    }

    public final synchronized Map<K, V> c() {
        return new LinkedHashMap(this.f1811a);
    }

    public final synchronized String toString() {
        int i2;
        int i3 = this.f1816f;
        int i4 = this.f1817g + i3;
        if (i4 != 0) {
            i2 = (i3 * 100) / i4;
        } else {
            i2 = 0;
        }
        return a.a(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f1813c), Integer.valueOf(this.f1816f), Integer.valueOf(this.f1817g), Integer.valueOf(i2)});
    }

    public e(int i2) {
        if (i2 > 0) {
            this.f1813c = i2;
            this.f1811a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V b(K k2) {
        V remove;
        Objects.requireNonNull(k2, "key == null");
        synchronized (this) {
            remove = this.f1811a.remove(k2);
            if (remove != null) {
                this.f1812b -= c(k2, remove);
            }
        }
        return remove;
    }

    public final V a(K k2) {
        Objects.requireNonNull(k2, "key == null");
        synchronized (this) {
            V v = this.f1811a.get(k2);
            if (v != null) {
                this.f1816f++;
                return v;
            }
            this.f1817g++;
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r5) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.c.e.a(int):void");
    }

    private int c(K k2, V v) {
        int b2 = b(k2, v);
        if (b2 >= 0) {
            return b2;
        }
        throw new IllegalStateException("Negative size: " + ((Object) k2) + "=" + ((Object) v));
    }

    public final V a(K k2, V v) {
        V put;
        if (k2 == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f1814d++;
            this.f1812b += c(k2, v);
            put = this.f1811a.put(k2, v);
            if (put != null) {
                this.f1812b -= c(k2, put);
            }
        }
        a(this.f1813c);
        return put;
    }
}
