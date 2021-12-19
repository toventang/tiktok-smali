package com.bytedance.ies.powerpreload.task;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.b.e;
import com.bytedance.ies.powerpreload.b.f;
import com.bytedance.ies.powerpreload.b.g;
import com.bytedance.ies.powerpreload.b.h;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.r;
import h.w;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class a extends f<com.bytedance.ies.powerpreload.b.b> {

    /* renamed from: a  reason: collision with root package name */
    public g<Object> f34540a = new g<>(new h());

    /* renamed from: b  reason: collision with root package name */
    private final h.h f34541b = i.a((h.f.a.a) d.f34546a);

    static {
        Covode.recordClassIndex(20660);
    }

    @Override // com.bytedance.ies.powerpreload.task.f
    public final void b() {
        super.b();
        this.f34540a = null;
    }

    static final class d extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f34546a = new d();

        static {
            Covode.recordClassIndex(20664);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.bytedance.ies.powerpreload.task.a$a  reason: collision with other inner class name */
    static final class RunnableC0778a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f34543b;

        static {
            Covode.recordClassIndex(20661);
        }

        RunnableC0778a(a aVar, f fVar) {
            this.f34542a = aVar;
            this.f34543b = fVar;
        }

        public final void run() {
            try {
                if (this.f34542a.f34558h == null) {
                    new Bundle();
                }
                if (this.f34542a.f34540a == null) {
                    throw new w("null cannot be cast to non-null type");
                }
            } catch (Exception e2) {
                com.bytedance.ies.powerpreload.a.a.a(e2);
            }
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f34544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f34545b;

        static {
            Covode.recordClassIndex(20662);
        }

        b(a aVar, e eVar) {
            this.f34544a = aVar;
            this.f34545b = eVar;
        }

        public final void run() {
            try {
                if (this.f34544a.f34558h == null) {
                    new Bundle();
                }
                if (this.f34544a.f34540a == null) {
                    throw new w("null cannot be cast to non-null type");
                }
            } catch (Exception e2) {
                com.bytedance.ies.powerpreload.a.a.a(e2);
            }
        }
    }

    @Override // com.bytedance.ies.powerpreload.task.f
    public final Object a() {
        T t = this.f34556f;
        if (t instanceof f) {
            ((Handler) this.f34541b.getValue()).post(new RunnableC0778a(this, (f) this.f34556f));
        } else if (t instanceof e) {
            com.bytedance.ies.powerpreload.a.a.a().f34483d.invoke().execute(new b(this, (e) this.f34556f));
        } else if (t instanceof com.bytedance.ies.powerpreload.b.a) {
            try {
                bz unused = kotlinx.coroutines.i.a(bs.f159054a, bf.f159041b, null, new c(this, (com.bytedance.ies.powerpreload.b.a) this.f34556f, null), 2);
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    static final class c extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ com.bytedance.ies.powerpreload.b.a $preload;
        Object L$0;
        Object L$1;
        int label;
        private am p$;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(20663);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, com.bytedance.ies.powerpreload.b.a aVar2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
            this.$preload = aVar2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.c(dVar, "");
            c cVar = new c(this.this$0, this.$preload, dVar);
            cVar.p$ = (am) obj;
            return cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            g<Object> gVar;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                am amVar = this.p$;
                gVar = this.this$0.f34540a;
                if (gVar != null) {
                    com.bytedance.ies.powerpreload.b.a aVar2 = this.$preload;
                    if (this.this$0.f34558h == null) {
                        new Bundle();
                    }
                    this.L$0 = amVar;
                    this.L$1 = gVar;
                    this.label = 1;
                    obj = aVar2.a();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return z.f158842a;
            } else if (i2 == 1) {
                gVar = (g) this.L$1;
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj != null) {
                gVar.f34496a.f34497a.postValue(obj);
                return z.f158842a;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.bytedance.ies.powerpreload.b.b bVar, com.bytedance.ies.powerpreload.d dVar, Bundle bundle) {
        super(bVar, dVar, bundle);
        l.c(bVar, "");
        l.c(dVar, "");
    }
}
