package com.google.c.c;

import com.bytedance.covode.number.Covode;
import com.google.c.a.h;
import com.google.c.a.k;
import com.google.c.c.ab;
import com.google.c.c.af;
import com.google.c.c.ai;
import com.google.c.c.ak;
import com.google.c.c.aq;
import com.google.c.c.bi;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

public class aj<K, V> extends af<K, V> implements bj<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: a  reason: collision with root package name */
    private final transient ai<V> f53903a;

    /* renamed from: d  reason: collision with root package name */
    private transient aj<V, K> f53904d;

    /* renamed from: e  reason: collision with root package name */
    private transient ai<Map.Entry<K, V>> f53905e;

    static {
        Covode.recordClassIndex(33390);
    }

    public static <K, V> aj<K, V> of() {
        return r.f54100a;
    }

    public static final class a<K, V> extends af.a<K, V> {
        static {
            Covode.recordClassIndex(33391);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.af.a
        public final Collection<V> c() {
            return new n();
        }

        /* renamed from: a */
        public final aj<K, V> b() {
            Collection entrySet = this.f53885a.entrySet();
            if (this.f53886b != null) {
                entrySet = z.sortedCopyOf(az.a(this.f53886b).a(aq.a.KEY), entrySet);
            }
            return aj.a(entrySet, this.f53887c);
        }

        @Override // com.google.c.c.af.a
        public final /* bridge */ /* synthetic */ af.a a(Map.Entry entry) {
            super.a(entry);
            return this;
        }

        @Override // com.google.c.c.af.a
        public final /* bridge */ /* synthetic */ af.a b(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public final a<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.b(iterable);
            return this;
        }

        /* renamed from: a */
        public final a<K, V> b(K k2, V v) {
            super.b(k2, v);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<K, V> extends ai<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private final transient aj<K, V> f53906a;

        static {
            Covode.recordClassIndex(33392);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.c.x
        public final boolean a() {
            return false;
        }

        @Override // com.google.c.c.ai, com.google.c.c.ai, java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.c.c.x, com.google.c.c.x, java.lang.Iterable
        public final br<Map.Entry<K, V>> iterator() {
            return this.f53906a.i();
        }

        public final int size() {
            return this.f53906a.size();
        }

        b(aj<K, V> ajVar) {
            this.f53906a = ajVar;
        }

        @Override // com.google.c.c.x
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f53906a.containsEntry(entry.getKey(), entry.getValue());
        }
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    @Override // com.google.c.c.af, com.google.c.c.af, com.google.c.c.ar, com.google.c.c.g
    public ai<Map.Entry<K, V>> entries() {
        ai<Map.Entry<K, V>> aiVar = this.f53905e;
        if (aiVar != null) {
            return aiVar;
        }
        b bVar = new b(this);
        this.f53905e = bVar;
        return bVar;
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        static final bi.a<aj> f53907a = bi.a(aj.class, "emptySet");

        static {
            Covode.recordClassIndex(33393);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.c.c.aj<K, V> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.c.aj$a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.c.c.af
    public aj<V, K> inverse() {
        aj<V, K> ajVar = this.f53904d;
        if (ajVar != null) {
            return ajVar;
        }
        a builder = builder();
        br it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.b(entry.getValue(), entry.getKey());
        }
        aj<V, K> a2 = builder.b();
        a2.f53904d = this;
        this.f53904d = a2;
        return a2;
    }

    @Override // com.google.c.c.af, com.google.c.c.af, com.google.c.c.ar
    public ai<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    private static <V> ai<V> a(Comparator<? super V> comparator) {
        if (comparator == null) {
            return ai.of();
        }
        return ak.a(comparator);
    }

    public static <K, V> aj<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().a(iterable).b();
    }

    @Override // com.google.c.c.af, com.google.c.c.af, com.google.c.c.ar
    public ai<V> get(K k2) {
        return (ai) h.a(this.f53876b.get(k2), this.f53903a);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Comparator comparator;
        objectOutputStream.defaultWriteObject();
        ai<V> aiVar = this.f53903a;
        if (aiVar instanceof ak) {
            comparator = ((ak) aiVar).comparator();
        } else {
            comparator = null;
        }
        objectOutputStream.writeObject(comparator);
        bi.a(this, objectOutputStream);
    }

    public static <K, V> aj<K, V> copyOf(ar<? extends K, ? extends V> arVar) {
        k.a(arVar);
        if (arVar.isEmpty()) {
            return of();
        }
        if (arVar instanceof aj) {
            aj<K, V> ajVar = (aj) arVar;
            if (!((af) ajVar).f53876b.d()) {
                return ajVar;
            }
        }
        return a(arVar.asMap().entrySet(), (Comparator) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.google.c.c.ab$a */
    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        ai.a aVar;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            ab.a builder = ab.builder();
            int i2 = 0;
            for (int i3 = 0; i3 < readInt; i3++) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    if (comparator == null) {
                        aVar = new ai.a();
                    } else {
                        aVar = new ak.a(comparator);
                    }
                    int i4 = 0;
                    do {
                        aVar.b(objectInputStream.readObject());
                        i4++;
                    } while (i4 < readInt2);
                    ai a2 = aVar.a();
                    if (a2.size() == readInt2) {
                        builder.a(readObject, a2);
                        i2 += readInt2;
                    } else {
                        throw new InvalidObjectException("Duplicate key-value pairs exist for key ".concat(String.valueOf(readObject)));
                    }
                } else {
                    throw new InvalidObjectException("Invalid value count ".concat(String.valueOf(readInt2)));
                }
            }
            try {
                af.c.f53888a.a(this, builder.a());
                af.c.f53889b.a(this, i2);
                c.f53907a.a(this, a(comparator));
            } catch (IllegalArgumentException e2) {
                throw new InvalidObjectException(e2.getMessage()).initCause(e2);
            }
        } else {
            throw new InvalidObjectException("Invalid key count ".concat(String.valueOf(readInt)));
        }
    }

    @Override // com.google.c.c.af, com.google.c.c.af, com.google.c.c.g
    public ai<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> aj<K, V> of(K k2, V v) {
        a builder = builder();
        builder.b(k2, v);
        return builder.b();
    }

    private static <V> ai<V> a(Comparator<? super V> comparator, Collection<? extends V> collection) {
        if (comparator == null) {
            return ai.copyOf((Collection) collection);
        }
        return ak.copyOf((Comparator) comparator, (Collection) collection);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.c.c.ab$a */
    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> aj<K, V> a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        ab.a aVar = new ab.a(collection.size());
        int i2 = 0;
        Iterator<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ai a2 = a(comparator, (Collection) entry.getValue());
            if (!a2.isEmpty()) {
                aVar.a(key, a2);
                i2 += a2.size();
            }
        }
        return new aj<>(aVar.a(), i2, comparator);
    }

    aj(ab<K, ai<V>> abVar, int i2, Comparator<? super V> comparator) {
        super(abVar, i2);
        this.f53903a = a(comparator);
    }

    public static <K, V> aj<K, V> of(K k2, V v, K k3, V v2) {
        a builder = builder();
        builder.b(k2, v);
        builder.b(k3, v2);
        return builder.b();
    }

    public static <K, V> aj<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
        a builder = builder();
        builder.b(k2, v);
        builder.b(k3, v2);
        builder.b(k4, v3);
        return builder.b();
    }

    public static <K, V> aj<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
        a builder = builder();
        builder.b(k2, v);
        builder.b(k3, v2);
        builder.b(k4, v3);
        builder.b(k5, v4);
        return builder.b();
    }

    public static <K, V> aj<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
        a builder = builder();
        builder.b(k2, v);
        builder.b(k3, v2);
        builder.b(k4, v3);
        builder.b(k5, v4);
        builder.b(k6, v5);
        return builder.b();
    }
}
