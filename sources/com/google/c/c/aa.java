package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.c.ab;
import com.google.c.c.af;
import com.google.c.c.z;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

public class aa<K, V> extends af<K, V> implements ao<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    private transient aa<V, K> f53858a;

    static {
        Covode.recordClassIndex(33351);
    }

    public static <K, V> aa<K, V> of() {
        return q.f54099a;
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static final class a<K, V> extends af.a<K, V> {
        static {
            Covode.recordClassIndex(33352);
        }

        public final aa<K, V> a() {
            return (aa) super.b();
        }

        @Override // com.google.c.c.af.a
        public final /* bridge */ /* synthetic */ af b() {
            return super.b();
        }

        public final a<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.b(iterable);
            return this;
        }

        @Override // com.google.c.c.af.a
        public final /* bridge */ /* synthetic */ af.a b(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        @Override // com.google.c.c.af.a
        public final /* bridge */ /* synthetic */ af.a a(Map.Entry entry) {
            super.a(entry);
            return this;
        }

        /* renamed from: a */
        public final a<K, V> b(K k2, V v) {
            super.b(k2, v);
            return this;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.c.c.aa<K, V> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.c.aa$a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.c.c.af
    public aa<V, K> inverse() {
        aa<V, K> aaVar = this.f53858a;
        if (aaVar != null) {
            return aaVar;
        }
        a builder = builder();
        br it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.b(entry.getValue(), entry.getKey());
        }
        aa<V, K> a2 = builder.a();
        a2.f53858a = this;
        this.f53858a = a2;
        return a2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        bi.a(this, objectOutputStream);
    }

    public static <K, V> aa<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().a(iterable).a();
    }

    @Override // com.google.c.c.af, com.google.c.c.af, com.google.c.c.ao, com.google.c.c.ar
    public z<V> get(K k2) {
        z<V> zVar = (z) this.f53876b.get(k2);
        if (zVar == null) {
            return z.of();
        }
        return zVar;
    }

    @Override // com.google.c.c.af, com.google.c.c.af, com.google.c.c.ar
    public z<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> aa<K, V> copyOf(ar<? extends K, ? extends V> arVar) {
        if (arVar.isEmpty()) {
            return of();
        }
        if (arVar instanceof aa) {
            aa<K, V> aaVar = (aa) arVar;
            if (!((af) aaVar).f53876b.d()) {
                return aaVar;
            }
        }
        return a(arVar.asMap().entrySet(), null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.google.c.c.ab$a */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ab.a builder = ab.builder();
            int i2 = 0;
            for (int i3 = 0; i3 < readInt; i3++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    z.a builder2 = z.builder();
                    int i4 = 0;
                    do {
                        builder2.c(objectInputStream.readObject());
                        i4++;
                    } while (i4 < readInt2);
                    builder.a(readObject, builder2.a());
                    i2 += readInt2;
                } else {
                    throw new InvalidObjectException("Invalid value count ".concat(String.valueOf(readInt2)));
                }
            }
            try {
                af.c.f53888a.a(this, builder.a());
                af.c.f53889b.a(this, i2);
            } catch (IllegalArgumentException e2) {
                throw new InvalidObjectException(e2.getMessage()).initCause(e2);
            }
        } else {
            throw new InvalidObjectException("Invalid key count ".concat(String.valueOf(readInt)));
        }
    }

    aa(ab<K, z<V>> abVar, int i2) {
        super(abVar, i2);
    }

    public static <K, V> aa<K, V> of(K k2, V v) {
        a builder = builder();
        builder.b(k2, v);
        return builder.a();
    }

    @Override // com.google.c.c.af, com.google.c.c.af, com.google.c.c.g
    public z<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.c.c.ab$a */
    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> aa<K, V> a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        z sortedCopyOf;
        if (collection.isEmpty()) {
            return of();
        }
        ab.a aVar = new ab.a(collection.size());
        int i2 = 0;
        Iterator<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                sortedCopyOf = z.copyOf(collection2);
            } else {
                sortedCopyOf = z.sortedCopyOf(comparator, collection2);
            }
            if (!sortedCopyOf.isEmpty()) {
                aVar.a(key, sortedCopyOf);
                i2 += sortedCopyOf.size();
            }
        }
        return new aa<>(aVar.a(), i2);
    }

    public static <K, V> aa<K, V> of(K k2, V v, K k3, V v2) {
        a builder = builder();
        builder.b(k2, v);
        builder.b(k3, v2);
        return builder.a();
    }

    public static <K, V> aa<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
        a builder = builder();
        builder.b(k2, v);
        builder.b(k3, v2);
        builder.b(k4, v3);
        return builder.a();
    }

    public static <K, V> aa<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
        a builder = builder();
        builder.b(k2, v);
        builder.b(k3, v2);
        builder.b(k4, v3);
        builder.b(k5, v4);
        return builder.a();
    }

    public static <K, V> aa<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
        a builder = builder();
        builder.b(k2, v);
        builder.b(k3, v2);
        builder.b(k4, v3);
        builder.b(k5, v4);
        builder.b(k6, v5);
        return builder.a();
    }
}
