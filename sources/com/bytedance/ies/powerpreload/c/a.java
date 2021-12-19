package com.bytedance.ies.powerpreload.c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.d;
import com.bytedance.ies.powerpreload.task.f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.e;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class a extends f<com.bytedance.ies.powerpreload.b.c<Object, ?>> {

    /* renamed from: b  reason: collision with root package name */
    public static final h f34510b = i.a((h.f.a.a) b.f34514a);

    /* renamed from: c  reason: collision with root package name */
    public static final C0774a f34511c = new C0774a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final IRetrofitFactory f34512a;

    /* renamed from: com.bytedance.ies.powerpreload.c.a$a  reason: collision with other inner class name */
    public static final class C0774a {
        static {
            Covode.recordClassIndex(20644);
        }

        public static HashMap<com.bytedance.ies.powerpreload.b.i, com.bytedance.ies.ugc.aweme.network.f> a() {
            return (HashMap) a.f34510b.getValue();
        }

        private C0774a() {
        }

        public /* synthetic */ C0774a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<HashMap<com.bytedance.ies.powerpreload.b.i, com.bytedance.ies.ugc.aweme.network.f>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34514a = new b();

        static {
            Covode.recordClassIndex(20645);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HashMap<com.bytedance.ies.powerpreload.b.i, com.bytedance.ies.ugc.aweme.network.f> invoke() {
            return new HashMap();
        }
    }

    @Override // com.bytedance.ies.powerpreload.task.f
    public final Object a() {
        return ((com.bytedance.ies.powerpreload.b.c) this.f34556f).preload(this.f34558h, new c(this));
    }

    static {
        Covode.recordClassIndex(20643);
    }

    static final class c extends m implements h.f.a.b<Class<Object>, Object> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(20646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* renamed from: com.bytedance.ies.powerpreload.c.a$c$a  reason: collision with other inner class name */
        static final class C0775a extends m implements h.f.a.a<com.bytedance.ies.ugc.aweme.network.f> {
            final /* synthetic */ com.bytedance.ies.powerpreload.b.i $strategy;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(20647);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0775a(c cVar, com.bytedance.ies.powerpreload.b.i iVar) {
                super(0);
                this.this$0 = cVar;
                this.$strategy = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ com.bytedance.ies.ugc.aweme.network.f invoke() {
                String str = this.$strategy.f34500c;
                if (str == null) {
                    str = "";
                }
                e b2 = this.this$0.this$0.f34512a.b(str);
                b2.a(this.$strategy);
                C0774a.a().put(this.$strategy, b2.d());
                return C0774a.a().get(this.$strategy);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(Class<Object> cls) {
            Class<Object> cls2 = cls;
            l.c(cls2, "");
            com.bytedance.ies.powerpreload.b.i preloadStrategy = ((com.bytedance.ies.powerpreload.b.c) this.this$0.f34556f).getPreloadStrategy(this.this$0.f34558h);
            com.bytedance.ies.ugc.aweme.network.f fVar = C0774a.a().get(preloadStrategy);
            if (fVar == null) {
                Object invoke = new C0775a(this, preloadStrategy).invoke();
                if (invoke == null) {
                    l.a();
                }
                fVar = (com.bytedance.ies.ugc.aweme.network.f) invoke;
            }
            l.a((Object) fVar, "");
            return fVar.a(cls2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.bytedance.ies.powerpreload.b.c<Object, ?> cVar, d dVar, Bundle bundle, IRetrofitFactory iRetrofitFactory) {
        super(cVar, dVar, bundle);
        l.c(cVar, "");
        l.c(dVar, "");
        l.c(iRetrofitFactory, "");
        this.f34512a = iRetrofitFactory;
    }
}
