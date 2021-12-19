package com.bytedance.jedi.a.i;

import com.bytedance.covode.number.Covode;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.p;
import java.util.List;

public abstract class a<K, V, K1, V1> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f39252a = new b((byte) 0);

    static {
        Covode.recordClassIndex(24061);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(24065);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.jedi.a.i.a$b$a  reason: collision with other inner class name */
        public static final class C0952a extends m implements h.f.a.m<K, V, K1> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0952a f39257a = new C0952a();

            static {
                Covode.recordClassIndex(24066);
            }

            C0952a() {
                super(2);
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: K */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // h.f.a.m
            public final K1 invoke(K k2, V v) {
                if ((k2 instanceof Object) && k2 != 0) {
                    return k2;
                }
                throw new RuntimeException();
            }
        }

        public static <K, V, K1, V1> a<K, V, K1, V1> a(h.f.a.m<? super K, ? super V, ? extends K1> mVar, q<? super K, ? super V, ? super V1, ? extends V1> qVar) {
            l.c(mVar, "");
            l.c(qVar, "");
            return new c(mVar, qVar);
        }
    }

    private a() {
    }

    /* renamed from: com.bytedance.jedi.a.i.a$a  reason: collision with other inner class name */
    public static final class C0951a<K, V, K1, V1> extends a<K, V, K1, V1> {

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.b<? super V, ? extends List<? extends p<? extends K1, ? extends V1>>> f39253b;

        /* renamed from: c  reason: collision with root package name */
        public h.f.a.m<? super V1, ? super V1, ? extends V1> f39254c;

        static {
            Covode.recordClassIndex(24062);
        }

        public /* synthetic */ C0951a() {
            this(AnonymousClass1.f39255a, AnonymousClass2.f39256a);
        }

        public final void a(h.f.a.b<? super V, ? extends List<? extends p<? extends K1, ? extends V1>>> bVar) {
            l.c(bVar, "");
            this.f39253b = bVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C0951a(h.f.a.b<? super V, ? extends List<? extends p<? extends K1, ? extends V1>>> bVar, h.f.a.m<? super V1, ? super V1, ? extends V1> mVar) {
            super((byte) 0);
            l.c(bVar, "");
            l.c(mVar, "");
            this.f39253b = bVar;
            this.f39254c = mVar;
        }
    }

    public static final class c<K, V, K1, V1> extends a<K, V, K1, V1> {

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.m<? super K, ? super V, ? extends K1> f39258b;

        /* renamed from: c  reason: collision with root package name */
        public q<? super K, ? super V, ? super V1, ? extends V1> f39259c;

        static {
            Covode.recordClassIndex(24067);
        }

        public /* synthetic */ c() {
            this(AnonymousClass1.f39260a, AnonymousClass2.f39261a);
        }

        public final void a(h.f.a.m<? super K, ? super V, ? extends K1> mVar) {
            l.c(mVar, "");
            this.f39258b = mVar;
        }

        public final void a(q<? super K, ? super V, ? super V1, ? extends V1> qVar) {
            l.c(qVar, "");
            this.f39259c = qVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(h.f.a.m<? super K, ? super V, ? extends K1> mVar, q<? super K, ? super V, ? super V1, ? extends V1> qVar) {
            super((byte) 0);
            l.c(mVar, "");
            l.c(qVar, "");
            this.f39258b = mVar;
            this.f39259c = qVar;
        }
    }

    public static final class d<K, V, K1, V1> extends a<K, V, K1, V1> {

        /* renamed from: b  reason: collision with root package name */
        public h.f.a.m<? super V, ? super V1, Boolean> f39262b;

        /* renamed from: c  reason: collision with root package name */
        public h.f.a.m<? super V, ? super V1, ? extends V1> f39263c;

        static {
            Covode.recordClassIndex(24070);
        }

        public /* synthetic */ d() {
            this(AnonymousClass1.f39264a, AnonymousClass2.f39265a);
        }

        public final void a(h.f.a.m<? super V, ? super V1, Boolean> mVar) {
            l.c(mVar, "");
            this.f39262b = mVar;
        }

        public final void b(h.f.a.m<? super V, ? super V1, ? extends V1> mVar) {
            l.c(mVar, "");
            this.f39263c = mVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private d(h.f.a.m<? super V, ? super V1, Boolean> mVar, h.f.a.m<? super V, ? super V1, ? extends V1> mVar2) {
            super((byte) 0);
            l.c(mVar, "");
            l.c(mVar2, "");
            this.f39262b = mVar;
            this.f39263c = mVar2;
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
