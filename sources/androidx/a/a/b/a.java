package androidx.a.a.b;

import androidx.a.a.b.b;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class a<K, V> extends b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f794a = new HashMap<>();

    static {
        Covode.recordClassIndex(205);
    }

    public final boolean c(K k2) {
        return this.f794a.containsKey(k2);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.a.a.b.b
    public final b.c<K, V> a(K k2) {
        return this.f794a.get(k2);
    }

    @Override // androidx.a.a.b.b
    public final V b(K k2) {
        V v = (V) super.b(k2);
        this.f794a.remove(k2);
        return v;
    }

    @Override // androidx.a.a.b.b
    public final V a(K k2, V v) {
        b.c<K, V> a2 = a(k2);
        if (a2 != null) {
            return a2.f800b;
        }
        this.f794a.put(k2, b(k2, v));
        return null;
    }
}
