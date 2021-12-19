package com.bytedance.o.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;

public final class a {
    static {
        Covode.recordClassIndex(25506);
    }

    /* renamed from: com.bytedance.o.b.a$a  reason: collision with other inner class name */
    public static final class C1021a implements h.h.d<Object, T> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ i[] f41672a = {new y(ab.a(C1021a.class), "lazyReadOnlyProperty", "getLazyReadOnlyProperty()Lcom/bytedance/objectcontainer/Lazy;")};

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f41673b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Class f41674c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f41675d = null;

        /* renamed from: e  reason: collision with root package name */
        private final h f41676e = h.i.a((h.f.a.a) new C1022a(this));

        /* renamed from: com.bytedance.o.b.a$a$a  reason: collision with other inner class name */
        static final class C1022a extends m implements h.f.a.a<com.bytedance.o.b<T>> {
            final /* synthetic */ C1021a this$0;

            static {
                Covode.recordClassIndex(25508);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1022a(C1021a aVar) {
                super(0);
                this.this$0 = aVar;
            }

            @Override // h.f.a.a
            public final /* synthetic */ Object invoke() {
                return this.this$0.f41673b.c(this.this$0.f41674c, this.this$0.f41675d);
            }
        }

        static {
            Covode.recordClassIndex(25507);
        }

        C1021a(f fVar, Class cls) {
            this.f41673b = fVar;
            this.f41674c = cls;
        }

        @Override // h.h.d
        public final T a(Object obj, i<?> iVar) {
            l.c(obj, "");
            l.c(iVar, "");
            return (T) ((com.bytedance.o.b) this.f41676e.getValue()).a();
        }
    }

    public static final class c implements h.h.d<Object, T> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ i[] f41678a = {new y(ab.a(c.class), "lazyReadOnlyProperty", "getLazyReadOnlyProperty()Lcom/bytedance/objectcontainer/Lazy;")};

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f41679b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Class f41680c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f41681d = null;

        /* renamed from: e  reason: collision with root package name */
        private final h f41682e = h.i.a((h.f.a.a) new C1023a(this));

        /* renamed from: com.bytedance.o.b.a$c$a  reason: collision with other inner class name */
        static final class C1023a extends m implements h.f.a.a<com.bytedance.o.b<T>> {
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(25511);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C1023a(c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            @Override // h.f.a.a
            public final /* synthetic */ Object invoke() {
                return this.this$0.f41679b.d(this.this$0.f41680c, this.this$0.f41681d);
            }
        }

        static {
            Covode.recordClassIndex(25510);
        }

        c(f fVar, Class cls) {
            this.f41679b = fVar;
            this.f41680c = cls;
        }

        @Override // h.h.d
        public final T a(Object obj, i<?> iVar) {
            l.c(obj, "");
            l.c(iVar, "");
            com.bytedance.o.b bVar = (com.bytedance.o.b) this.f41682e.getValue();
            if (bVar != null) {
                return (T) bVar.a();
            }
            return null;
        }
    }

    public static final class b implements h.h.d<Object, T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.b f41677a;

        static {
            Covode.recordClassIndex(25509);
        }

        b(com.bytedance.o.b bVar) {
            this.f41677a = bVar;
        }

        @Override // h.h.d
        public final T a(Object obj, i<?> iVar) {
            l.c(obj, "");
            l.c(iVar, "");
            return (T) this.f41677a.a();
        }
    }

    public static final class d implements h.h.d<Object, T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.b f41683a;

        static {
            Covode.recordClassIndex(25512);
        }

        d(com.bytedance.o.b bVar) {
            this.f41683a = bVar;
        }

        @Override // h.h.d
        public final T a(Object obj, i<?> iVar) {
            l.c(obj, "");
            l.c(iVar, "");
            com.bytedance.o.b bVar = this.f41683a;
            if (bVar != null) {
                return (T) bVar.a();
            }
            return null;
        }
    }

    public static final <T> h.h.d<Object, T> a(f fVar, Class<T> cls) {
        l.c(fVar, "");
        l.c(cls, "");
        if (fVar.f41687a) {
            return new C1021a(fVar, cls);
        }
        com.bytedance.o.b<T> c2 = fVar.c(cls, null);
        l.a((Object) c2, "");
        return new b(c2);
    }

    public static final <T> h.h.d<Object, T> b(f fVar, Class<T> cls) {
        l.c(fVar, "");
        l.c(cls, "");
        if (fVar.f41687a) {
            return new c(fVar, cls);
        }
        return new d(fVar.d(cls, null));
    }
}
