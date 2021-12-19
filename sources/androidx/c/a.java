package androidx.c;

import androidx.c.f;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: a  reason: collision with root package name */
    f<K, V> f1790a;

    static {
        Covode.recordClassIndex(550);
    }

    public a() {
    }

    private f<K, V> a() {
        if (this.f1790a == null) {
            this.f1790a = new f<K, V>() {
                /* class androidx.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(551);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final Map<K, V> b() {
                    return a.this;
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final int a() {
                    return a.this.f1839h;
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final void c() {
                    a.this.clear();
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final int b(Object obj) {
                    return a.this.b(obj);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final int a(Object obj) {
                    return a.this.a(obj);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final void a(int i2) {
                    a.this.d(i2);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final Object a(int i2, int i3) {
                    return a.this.f1838g[(i2 << 1) + i3];
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final V a(int i2, V v) {
                    return (V) a.this.a(i2, v);
                }

                /* access modifiers changed from: protected */
                @Override // androidx.c.f
                public final void a(K k2, V v) {
                    a.this.put(k2, v);
                }
            };
        }
        return this.f1790a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return a().d();
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        f<K, V> a2 = a();
        if (a2.f1818b == null) {
            a2.f1818b = new f.b();
        }
        return a2.f1818b;
    }

    @Override // java.util.Map
    public Collection<V> values() {
        f<K, V> a2 = a();
        if (a2.f1820d == null) {
            a2.f1820d = new f.e();
        }
        return a2.f1820d;
    }

    public a(int i2) {
        super(i2);
    }

    public a(g gVar) {
        super(gVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: androidx.c.a<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.f1839h + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
