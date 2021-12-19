package com.bytedance.o;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.a.c;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    final Map<q, p<?>> f41720a;

    /* renamed from: b  reason: collision with root package name */
    final Map<Class<? extends Object>, Object<?, ?>> f41721b;

    /* renamed from: c  reason: collision with root package name */
    final Map<e, Map<?, p<?>>> f41722c;

    /* renamed from: d  reason: collision with root package name */
    final Map<r, Set<p<?>>> f41723d;

    /* renamed from: e  reason: collision with root package name */
    final Map<d, List<p<?>>> f41724e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f41725f;

    /* renamed from: g  reason: collision with root package name */
    private final f f41726g;

    static {
        Covode.recordClassIndex(25531);
    }

    public n() {
        this(null, false);
    }

    public final f a() {
        return new f(this.f41726g, this.f41725f, this);
    }

    public class b<CHILD> {

        /* renamed from: c  reason: collision with root package name */
        Class<CHILD> f41734c;

        /* renamed from: d  reason: collision with root package name */
        String f41735d;

        static {
            Covode.recordClassIndex(25535);
        }

        public final b<CHILD> a(Class<? super CHILD>... clsArr) {
            for (Class<? super CHILD> cls : clsArr) {
                n nVar = n.this;
                Class<CHILD> cls2 = this.f41734c;
                String str = this.f41735d;
                nVar.b(cls, str, new p<T>(cls2, str) {
                    /* class com.bytedance.o.n.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ Class f41729a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ String f41730b;

                    static {
                        Covode.recordClassIndex(25533);
                    }

                    @Override // com.bytedance.o.p
                    public final T get(f fVar) {
                        return (T) fVar.a((Type) this.f41729a, this.f41730b);
                    }

                    {
                        this.f41729a = r2;
                        this.f41730b = r3;
                    }
                });
            }
            return this;
        }

        b(Class<CHILD> cls, String str) {
            this.f41734c = cls;
            this.f41735d = str;
        }
    }

    public final <T> a<T> a(Class<T> cls, p<T> pVar) {
        return a((Class) cls, (String) null, (p) pVar);
    }

    public n(f fVar, boolean z) {
        this.f41720a = new LinkedHashMap();
        this.f41721b = new LinkedHashMap();
        this.f41722c = new LinkedHashMap();
        this.f41723d = new LinkedHashMap();
        this.f41724e = new LinkedHashMap();
        this.f41726g = fVar;
        this.f41725f = z;
    }

    public final <T> a<T> a(Class<T> cls, String str, p<T> pVar) {
        return b(cls, str, new s(pVar));
    }

    public final <T> b<T> a(Class<T> cls, String str, final T t) {
        return b(cls, str, new s(new p<T>() {
            /* class com.bytedance.o.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(25532);
            }

            @Override // com.bytedance.o.p
            public final T get(f fVar) {
                return (T) t;
            }
        }));
    }

    public final <T> a<T> b(Class<T> cls, String str, p<T> pVar) {
        q a2 = q.a(cls, str);
        if (!this.f41720a.containsKey(a2)) {
            this.f41720a.put(a2, pVar);
            return new a<>(cls, str, pVar.onCreateGetter);
        }
        throw new c("duplicate already contain " + cls.toString() + " " + this.f41720a.get(a2));
    }

    public final class a<CHILD> extends b<CHILD> {

        /* renamed from: a  reason: collision with root package name */
        o<CHILD> f41732a;

        static {
            Covode.recordClassIndex(25534);
        }

        a(Class<CHILD> cls, String str, o<CHILD> oVar) {
            super(cls, str);
            this.f41732a = oVar;
        }
    }
}
