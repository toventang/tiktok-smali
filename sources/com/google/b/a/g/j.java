package com.google.b.a.g;

import com.bytedance.covode.number.Covode;
import com.google.b.a.g.g;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class j extends AbstractMap<String, Object> implements Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public Map<String, Object> f53660h;

    /* renamed from: i  reason: collision with root package name */
    public final d f53661i;

    static {
        Covode.recordClassIndex(33189);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return new b();
    }

    final class a implements Iterator<Map.Entry<String, Object>> {

        /* renamed from: b  reason: collision with root package name */
        private boolean f53663b;

        /* renamed from: c  reason: collision with root package name */
        private final Iterator<Map.Entry<String, Object>> f53664c;

        /* renamed from: d  reason: collision with root package name */
        private final Iterator<Map.Entry<String, Object>> f53665d;

        static {
            Covode.recordClassIndex(33190);
        }

        public final void remove() {
            if (this.f53663b) {
                this.f53665d.remove();
            }
            this.f53664c.remove();
        }

        public final boolean hasNext() {
            if (this.f53664c.hasNext() || this.f53665d.hasNext()) {
                return true;
            }
            return false;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ Map.Entry<String, Object> next() {
            if (!this.f53663b) {
                if (this.f53664c.hasNext()) {
                    return this.f53664c.next();
                }
                this.f53663b = true;
            }
            return this.f53665d.next();
        }

        a(g.c cVar) {
            this.f53664c = cVar.iterator();
            this.f53665d = j.this.f53660h.entrySet().iterator();
        }
    }

    final class b extends AbstractSet<Map.Entry<String, Object>> {

        /* renamed from: b  reason: collision with root package name */
        private final g.c f53667b;

        static {
            Covode.recordClassIndex(33191);
        }

        public final void clear() {
            j.this.f53660h.clear();
            this.f53667b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
        public final Iterator<Map.Entry<String, Object>> iterator() {
            return new a(this.f53667b);
        }

        public final int size() {
            return j.this.f53660h.size() + this.f53667b.size();
        }

        b() {
            this.f53667b = new g(j.this, j.this.f53661i.f53623b).entrySet();
        }
    }

    public j() {
        this(EnumSet.noneOf(c.class));
    }

    public enum c {
        IGNORE_CASE;

        static {
            Covode.recordClassIndex(33192);
        }
    }

    /* renamed from: b */
    public j clone() {
        try {
            j jVar = (j) super.clone();
            f.a(this, jVar);
            jVar.f53660h = (Map) f.b(this.f53660h);
            return jVar;
        } catch (CloneNotSupportedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public j(EnumSet<c> enumSet) {
        this.f53660h = new a();
        this.f53661i = d.a(getClass(), enumSet.contains(c.IGNORE_CASE));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        i a2 = this.f53661i.a(str);
        if (a2 != null) {
            return a2.a(this);
        }
        if (this.f53661i.f53623b) {
            str = str.toLowerCase();
        }
        return this.f53660h.get(str);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map<? extends java.lang.String, ?>] */
    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        for (Map.Entry<? extends String, ? extends Object> entry : map.entrySet()) {
            b((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.f53661i.a(str) == null) {
            if (this.f53661i.f53623b) {
                str = str.toLowerCase();
            }
            return this.f53660h.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object put(String str, Object obj) {
        i a2 = this.f53661i.a(str);
        if (a2 != null) {
            Object a3 = a2.a(this);
            a2.a(this, obj);
            return a3;
        }
        if (this.f53661i.f53623b) {
            str = str.toLowerCase();
        }
        return this.f53660h.put(str, obj);
    }

    public j b(String str, Object obj) {
        i a2 = this.f53661i.a(str);
        if (a2 != null) {
            a2.a(this, obj);
        } else {
            if (this.f53661i.f53623b) {
                str = str.toLowerCase();
            }
            this.f53660h.put(str, obj);
        }
        return this;
    }
}
