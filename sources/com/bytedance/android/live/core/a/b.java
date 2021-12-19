package com.bytedance.android.live.core.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import f.a.t;
import java.util.List;

public interface b<K, V> {
    static {
        Covode.recordClassIndex(4544);
    }

    t<Pair<K, a>> a();

    V a(K k2, n<V> nVar);

    List<V> a(K k2, List<V> list);

    void a(K k2);

    void a(K k2, V v);

    List<V> b(K k2);

    int c(K k2);

    void d(K k2);

    public static class a<V> {

        /* renamed from: a  reason: collision with root package name */
        public int f8897a;

        /* renamed from: b  reason: collision with root package name */
        public int f8898b;

        /* renamed from: c  reason: collision with root package name */
        public List<V> f8899c;

        static {
            Covode.recordClassIndex(4545);
        }

        a(int i2, int i3, List<V> list) {
            this.f8897a = i2;
            this.f8898b = i3;
            this.f8899c = list;
        }
    }
}
