package com.google.c.c;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Map;

abstract class ac<K, V> extends ai<Map.Entry<K, V>> {
    static {
        Covode.recordClassIndex(33362);
    }

    /* access modifiers changed from: package-private */
    public abstract ab<K, V> b();

    ac() {
    }

    static class a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ab<K, V> map;

        static {
            Covode.recordClassIndex(33363);
        }

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return this.map.entrySet();
        }

        a(ab<K, V> abVar) {
            this.map = abVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.x
    public final boolean a() {
        return b().d();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ai
    public final boolean c() {
        return b().e();
    }

    @Override // com.google.c.c.ai
    public int hashCode() {
        return b().hashCode();
    }

    public int size() {
        return b().size();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.c.c.ai, com.google.c.c.x
    public Object writeReplace() {
        return new a(b());
    }

    @Override // com.google.c.c.x
    public boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            V v = b().get(entry.getKey());
            if (v == null || !v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
