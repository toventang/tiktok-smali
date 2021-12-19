package com.google.gson.internal.bind;

import com.bytedance.covode.number.Covode;
import com.google.gson.c.c;
import com.google.gson.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.s;
import com.google.gson.v;
import com.google.gson.w;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T> extends v<T> {

    /* renamed from: a  reason: collision with root package name */
    final f f54770a;

    /* renamed from: b  reason: collision with root package name */
    private final s<T> f54771b;

    /* renamed from: c  reason: collision with root package name */
    private final k<T> f54772c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.gson.b.a<T> f54773d;

    /* renamed from: e  reason: collision with root package name */
    private final w f54774e;

    /* renamed from: f  reason: collision with root package name */
    private final TreeTypeAdapter<T>.a f54775f = new a(this, (byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private v<T> f54776g;

    static {
        Covode.recordClassIndex(33963);
    }

    private v<T> a() {
        v<T> vVar = this.f54776g;
        if (vVar != null) {
            return vVar;
        }
        v<T> a2 = this.f54770a.a(this.f54774e, this.f54773d);
        this.f54776g = a2;
        return a2;
    }

    final class a implements j {
        static {
            Covode.recordClassIndex(33965);
        }

        private a() {
        }

        /* synthetic */ a(TreeTypeAdapter treeTypeAdapter, byte b2) {
            this();
        }

        @Override // com.google.gson.j
        public final <R> R a(l lVar, Type type) {
            return (R) TreeTypeAdapter.this.f54770a.a(lVar, type);
        }
    }

    @Override // com.google.gson.v
    public final T read(com.google.gson.c.a aVar) {
        if (this.f54772c == null) {
            return a().read(aVar);
        }
        l a2 = com.google.gson.internal.k.a(aVar);
        if (a2 instanceof n) {
            return null;
        }
        return this.f54772c.a(a2, this.f54773d.type, this.f54775f);
    }

    public static w a(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    public static w a(com.google.gson.b.a<?> aVar, Object obj) {
        boolean z;
        if (aVar.type == aVar.rawType) {
            z = true;
        } else {
            z = false;
        }
        return new SingleTypeFactory(obj, aVar, z, null);
    }

    @Override // com.google.gson.v
    public final void write(c cVar, T t) {
        s<T> sVar = this.f54771b;
        if (sVar == null) {
            a().write(cVar, t);
        } else if (t == null) {
            cVar.f();
        } else {
            com.google.gson.internal.k.a(sVar.a(t), cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class SingleTypeFactory implements w {

        /* renamed from: a  reason: collision with root package name */
        private final com.google.gson.b.a<?> f54777a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f54778b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<?> f54779c;

        /* renamed from: d  reason: collision with root package name */
        private final s<?> f54780d;

        /* renamed from: e  reason: collision with root package name */
        private final k<?> f54781e;

        static {
            Covode.recordClassIndex(33964);
        }

        @Override // com.google.gson.w
        public final <T> v<T> create(f fVar, com.google.gson.b.a<T> aVar) {
            com.google.gson.b.a<?> aVar2 = this.f54777a;
            if (aVar2 != null) {
                if (!aVar2.equals(aVar) && (!this.f54778b || this.f54777a.type != aVar.rawType)) {
                    return null;
                }
            } else if (!this.f54779c.isAssignableFrom(aVar.rawType)) {
                return null;
            }
            return new TreeTypeAdapter(this.f54780d, this.f54781e, fVar, aVar, this);
        }

        SingleTypeFactory(Object obj, com.google.gson.b.a<?> aVar, boolean z, Class<?> cls) {
            s<?> sVar;
            boolean z2;
            k<?> kVar = null;
            if (obj instanceof s) {
                sVar = (s) obj;
            } else {
                sVar = null;
            }
            this.f54780d = sVar;
            kVar = obj instanceof k ? (k) obj : kVar;
            this.f54781e = kVar;
            if (sVar == null && kVar == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            com.google.gson.internal.a.a(z2);
            this.f54777a = aVar;
            this.f54778b = z;
            this.f54779c = cls;
        }
    }

    public TreeTypeAdapter(s<T> sVar, k<T> kVar, f fVar, com.google.gson.b.a<T> aVar, w wVar) {
        this.f54771b = sVar;
        this.f54772c = kVar;
        this.f54770a = fVar;
        this.f54773d = aVar;
        this.f54774e = wVar;
    }
}
