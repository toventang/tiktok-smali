package com.google.b.a.g;

import com.bytedance.covode.number.Covode;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class g extends AbstractMap<String, Object> {

    /* renamed from: a  reason: collision with root package name */
    final Object f53641a;

    /* renamed from: b  reason: collision with root package name */
    final d f53642b;

    static {
        Covode.recordClassIndex(33183);
    }

    final class a implements Map.Entry<String, Object> {

        /* renamed from: b  reason: collision with root package name */
        private Object f53644b;

        /* renamed from: c  reason: collision with root package name */
        private final i f53645c;

        static {
            Covode.recordClassIndex(33184);
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.f53644b;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String getKey() {
            String str = this.f53645c.f53659c;
            if (g.this.f53642b.f53623b) {
                return str.toLowerCase();
            }
            return str;
        }

        public final int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object obj2 = this.f53644b;
            this.f53644b = com.google.b.a.f.a.a.a.a.b.a(obj);
            this.f53645c.a(g.this.f53641a, obj);
            return obj2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!getKey().equals(entry.getKey()) || !getValue().equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        a(i iVar, Object obj) {
            this.f53645c = iVar;
            this.f53644b = com.google.b.a.f.a.a.a.a.b.a(obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final class c extends AbstractSet<Map.Entry<String, Object>> {
        static {
            Covode.recordClassIndex(33186);
        }

        /* renamed from: a */
        public final b iterator() {
            return new b();
        }

        public final void clear() {
            for (String str : g.this.f53642b.f53624c) {
                g.this.f53642b.a(str).a(g.this.f53641a, (Object) null);
            }
        }

        public final boolean isEmpty() {
            for (String str : g.this.f53642b.f53624c) {
                if (g.this.f53642b.a(str).a(g.this.f53641a) != null) {
                    return false;
                }
            }
            return true;
        }

        public final int size() {
            int i2 = 0;
            for (String str : g.this.f53642b.f53624c) {
                if (g.this.f53642b.a(str).a(g.this.f53641a) != null) {
                    i2++;
                }
            }
            return i2;
        }

        c() {
        }
    }

    /* renamed from: a */
    public final c entrySet() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public final class b implements Iterator<Map.Entry<String, Object>> {

        /* renamed from: b  reason: collision with root package name */
        private int f53647b = -1;

        /* renamed from: c  reason: collision with root package name */
        private i f53648c;

        /* renamed from: d  reason: collision with root package name */
        private Object f53649d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f53650e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f53651f;

        /* renamed from: g  reason: collision with root package name */
        private i f53652g;

        static {
            Covode.recordClassIndex(33185);
        }

        public final void remove() {
            i iVar = this.f53652g;
            if (iVar == null || this.f53650e) {
                throw new IllegalStateException();
            }
            this.f53650e = true;
            iVar.a(g.this.f53641a, (Object) null);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public final /* synthetic */ Map.Entry<String, Object> next() {
            if (hasNext()) {
                this.f53652g = this.f53648c;
                Object obj = this.f53649d;
                this.f53651f = false;
                this.f53650e = false;
                this.f53648c = null;
                this.f53649d = null;
                return new a(this.f53652g, obj);
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            if (!this.f53651f) {
                this.f53651f = true;
                this.f53649d = null;
                while (this.f53649d == null) {
                    int i2 = this.f53647b + 1;
                    this.f53647b = i2;
                    if (i2 >= g.this.f53642b.f53624c.size()) {
                        break;
                    }
                    i a2 = g.this.f53642b.a(g.this.f53642b.f53624c.get(this.f53647b));
                    this.f53648c = a2;
                    this.f53649d = a2.a(g.this.f53641a);
                }
            }
            if (this.f53649d != null) {
                return true;
            }
            return false;
        }

        b() {
        }
    }

    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        i a2;
        if ((obj instanceof String) && (a2 = this.f53642b.a((String) obj)) != null) {
            return a2.a(this.f53641a);
        }
        return null;
    }

    public g(Object obj, boolean z) {
        this.f53641a = obj;
        d a2 = d.a(obj.getClass(), z);
        this.f53642b = a2;
        com.google.b.a.f.a.a.a.a.b.a(!a2.f53622a.isEnum());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(String str, Object obj) {
        String str2;
        String str3 = str;
        i a2 = this.f53642b.a(str3);
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str2 = "no field of key ".concat(valueOf);
        } else {
            str2 = new String("no field of key ");
        }
        com.google.b.a.f.a.a.a.a.b.a(a2, str2);
        Object a3 = a2.a(this.f53641a);
        a2.a(this.f53641a, com.google.b.a.f.a.a.a.a.b.a(obj));
        return a3;
    }
}
