package com.bytedance.jedi.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.c.e;
import com.bytedance.jedi.a.c.f;
import f.a.d.g;
import f.a.d.k;
import f.a.t;
import h.f.b.l;
import h.f.b.m;

public final class a<K, V, REQ, RESP, K1, V1> {

    /* renamed from: d  reason: collision with root package name */
    public static final C0938a f39084d = new C0938a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.jedi.a.f.b<K, V, REQ, RESP> f39085a;

    /* renamed from: b  reason: collision with root package name */
    public e<K1, V1> f39086b;

    /* renamed from: c  reason: collision with root package name */
    public b<K, RESP, K1, V1> f39087c;

    public static final class b<K, V, K1, V1> {

        /* renamed from: a  reason: collision with root package name */
        public h.f.a.b<? super K, ? extends K1> f39088a = C0939a.f39090a;

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.b<? super V1, ? extends V> f39089b = C0940b.f39091a;

        /* renamed from: com.bytedance.jedi.a.b.a$b$a  reason: collision with other inner class name */
        static final class C0939a extends m implements h.f.a.b<K, K1> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0939a f39090a = new C0939a();

            static {
                Covode.recordClassIndex(23939);
            }

            C0939a() {
                super(1);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: K */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // h.f.a.b
            public final K1 invoke(K k2) {
                return k2;
            }
        }

        /* renamed from: com.bytedance.jedi.a.b.a$b$b  reason: collision with other inner class name */
        static final class C0940b extends m implements h.f.a.b<V1, V> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0940b f39091a = new C0940b();

            static {
                Covode.recordClassIndex(23940);
            }

            C0940b() {
                super(1);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: V1 */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // h.f.a.b
            public final V invoke(V1 v1) {
                return v1;
            }
        }

        static {
            Covode.recordClassIndex(23938);
        }
    }

    static {
        Covode.recordClassIndex(23936);
    }

    /* renamed from: com.bytedance.jedi.a.b.a$a  reason: collision with other inner class name */
    public static final class C0938a {
        static {
            Covode.recordClassIndex(23937);
        }

        private C0938a() {
        }

        public /* synthetic */ C0938a(byte b2) {
            this();
        }
    }

    public static final class c extends com.bytedance.jedi.a.f.a<K, V, REQ, RESP> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f39092a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f39093b;

        static {
            Covode.recordClassIndex(23941);
        }

        @Override // com.bytedance.jedi.a.f.b
        public final K b(REQ req) {
            return this.f39092a.f39085a.b(req);
        }

        /* renamed from: com.bytedance.jedi.a.b.a$c$a  reason: collision with other inner class name */
        static final class C0941a<T> implements k<f<? extends V1>> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0941a f39094a = new C0941a();

            static {
                Covode.recordClassIndex(23942);
            }

            C0941a() {
            }

            @Override // f.a.d.k
            public final /* synthetic */ boolean a(Object obj) {
                f fVar = (f) obj;
                l.c(fVar, "");
                if (fVar.a() != null) {
                    return true;
                }
                return false;
            }
        }

        static final class b<T, R> implements g<T, R> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f39095a;

            static {
                Covode.recordClassIndex(23943);
            }

            b(c cVar) {
                this.f39095a = cVar;
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                f fVar = (f) obj;
                l.c(fVar, "");
                h.f.a.b<? super V1, ? extends V> bVar = this.f39095a.f39092a.f39087c.f39089b;
                Object obj2 = (Object) fVar.a();
                if (obj2 == 0) {
                    l.a();
                }
                return bVar.invoke(obj2);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.jedi.a.c.e<K1, V1> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.jedi.a.f.a
        public final t<RESP> a(REQ req) {
            h.f.a.m mVar = this.f39093b;
            t<RESP> c2 = this.f39092a.f39085a.c(req);
            t d2 = this.f39092a.f39086b.a(this.f39092a.f39087c.f39088a.invoke(this.f39092a.f39085a.b(req))).a(C0941a.f39094a).d(new b(this));
            l.a((Object) d2, "");
            return (t) mVar.invoke(c2, d2);
        }

        c(a aVar, h.f.a.m mVar) {
            this.f39092a = aVar;
            this.f39093b = mVar;
        }

        @Override // com.bytedance.jedi.a.f.b
        public final V a(REQ req, RESP resp) {
            return this.f39092a.f39085a.a(req, resp);
        }
    }

    public final com.bytedance.jedi.a.f.b<K, V, REQ, RESP> a(h.f.a.m<? super t<RESP>, ? super t<RESP>, ? extends t<RESP>> mVar) {
        l.c(mVar, "");
        return new c(this, mVar);
    }

    private a(com.bytedance.jedi.a.f.b<K, V, REQ, RESP> bVar, e<K1, V1> eVar, b<K, RESP, K1, V1> bVar2) {
        this.f39085a = bVar;
        this.f39086b = eVar;
        this.f39087c = bVar2;
    }

    public /* synthetic */ a(com.bytedance.jedi.a.f.b bVar, e eVar, b bVar2, byte b2) {
        this(bVar, eVar, bVar2);
    }
}
