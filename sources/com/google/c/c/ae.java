package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Map;

final class ae<K, V> extends x<V> {
    public final ab<K, V> map;

    static {
        Covode.recordClassIndex(33366);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final boolean a() {
        return true;
    }

    static class a<V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ab<?, V> map;

        static {
            Covode.recordClassIndex(33369);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.map.values();
        }

        a(ab<?, V> abVar) {
            this.map = abVar;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
    public final br<V> iterator() {
        return new br<V>() {
            /* class com.google.c.c.ae.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final br<Map.Entry<K, V>> f53874a;

            static {
                Covode.recordClassIndex(33367);
            }

            public final boolean hasNext() {
                return this.f53874a.hasNext();
            }

            @Override // java.util.Iterator
            public final V next() {
                return this.f53874a.next().getValue();
            }

            {
                this.f53874a = ae.this.map.entrySet().iterator();
            }
        };
    }

    public final int size() {
        return this.map.size();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final Object writeReplace() {
        return new a(this.map);
    }

    @Override // com.google.c.c.x
    public final z<V> asList() {
        final z<Map.Entry<K, V>> asList = this.map.entrySet().asList();
        return new z<V>() {
            /* class com.google.c.c.ae.AnonymousClass2 */

            static {
                Covode.recordClassIndex(33368);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.c.x
            public final boolean a() {
                return true;
            }

            public final int size() {
                return asList.size();
            }

            @Override // java.util.List
            public final V get(int i2) {
                return (V) ((Map.Entry) asList.get(i2)).getValue();
            }
        };
    }

    ae(ab<K, V> abVar) {
        this.map = abVar;
    }

    @Override // com.google.c.c.x
    public final boolean contains(Object obj) {
        if (obj != null) {
            br<V> it = iterator();
            while (it.hasNext()) {
                if (obj.equals(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
