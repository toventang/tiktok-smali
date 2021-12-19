package com.google.android.datatransport.runtime;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.backends.j;
import com.google.android.datatransport.runtime.backends.l;
import com.google.android.datatransport.runtime.q;
import com.google.android.datatransport.runtime.scheduling.a.ae;
import com.google.android.datatransport.runtime.scheduling.a.c;
import com.google.android.datatransport.runtime.scheduling.a.e;
import com.google.android.datatransport.runtime.scheduling.a.h;
import com.google.android.datatransport.runtime.scheduling.a.z;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import dagger.a.b;
import dagger.a.f;
import java.util.concurrent.Executor;

final class d extends q {

    /* renamed from: a  reason: collision with root package name */
    private javax.a.a<Executor> f49430a;

    /* renamed from: b  reason: collision with root package name */
    private javax.a.a<Context> f49431b;

    /* renamed from: c  reason: collision with root package name */
    private javax.a.a f49432c;

    /* renamed from: d  reason: collision with root package name */
    private javax.a.a f49433d;

    /* renamed from: e  reason: collision with root package name */
    private javax.a.a f49434e;

    /* renamed from: f  reason: collision with root package name */
    private javax.a.a<h> f49435f;

    /* renamed from: g  reason: collision with root package name */
    private javax.a.a<g> f49436g;

    /* renamed from: h  reason: collision with root package name */
    private javax.a.a<s> f49437h;

    /* renamed from: i  reason: collision with root package name */
    private javax.a.a<com.google.android.datatransport.runtime.scheduling.a> f49438i;

    /* renamed from: j  reason: collision with root package name */
    private javax.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.h> f49439j;

    /* renamed from: k  reason: collision with root package name */
    private javax.a.a<o> f49440k;

    /* renamed from: l  reason: collision with root package name */
    private javax.a.a<p> f49441l;

    static {
        Covode.recordClassIndex(30932);
    }

    static final class a implements q.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f49442a;

        static {
            Covode.recordClassIndex(30933);
        }

        private a() {
        }

        @Override // com.google.android.datatransport.runtime.q.a
        public final q a() {
            if (this.f49442a != null) {
                return new d(this.f49442a, (byte) 0);
            }
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        @Override // com.google.android.datatransport.runtime.q.a
        public final /* bridge */ /* synthetic */ q.a a(Context context) {
            this.f49442a = (Context) f.a(context);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.q
    public final p a() {
        return this.f49441l.get();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.q
    public final c b() {
        return this.f49435f.get();
    }

    private d(Context context) {
        this.f49430a = b.a(i.f49449a);
        dagger.a.c a2 = dagger.a.d.a(context);
        this.f49431b = a2;
        j jVar = new j(a2, com.google.android.datatransport.runtime.d.b.f49443a, com.google.android.datatransport.runtime.d.c.f49444a);
        this.f49432c = jVar;
        this.f49433d = b.a(new l(this.f49431b, jVar));
        this.f49434e = new ae(this.f49431b, e.f49499a);
        this.f49435f = b.a(new z(com.google.android.datatransport.runtime.d.b.f49443a, com.google.android.datatransport.runtime.d.c.f49444a, com.google.android.datatransport.runtime.scheduling.a.f.f49500a, this.f49434e));
        com.google.android.datatransport.runtime.scheduling.f fVar = new com.google.android.datatransport.runtime.scheduling.f(com.google.android.datatransport.runtime.d.b.f49443a);
        this.f49436g = fVar;
        com.google.android.datatransport.runtime.scheduling.g gVar = new com.google.android.datatransport.runtime.scheduling.g(this.f49431b, this.f49435f, fVar, com.google.android.datatransport.runtime.d.c.f49444a);
        this.f49437h = gVar;
        javax.a.a<Executor> aVar = this.f49430a;
        javax.a.a aVar2 = this.f49433d;
        javax.a.a<h> aVar3 = this.f49435f;
        this.f49438i = new com.google.android.datatransport.runtime.scheduling.d(aVar, aVar2, gVar, aVar3, aVar3);
        javax.a.a<Context> aVar4 = this.f49431b;
        javax.a.a aVar5 = this.f49433d;
        javax.a.a<h> aVar6 = this.f49435f;
        this.f49439j = new n(aVar4, aVar5, aVar6, this.f49437h, this.f49430a, aVar6, com.google.android.datatransport.runtime.d.b.f49443a);
        javax.a.a<Executor> aVar7 = this.f49430a;
        javax.a.a<h> aVar8 = this.f49435f;
        this.f49440k = new r(aVar7, aVar8, this.f49437h, aVar8);
        this.f49441l = b.a(new r(com.google.android.datatransport.runtime.d.b.f49443a, com.google.android.datatransport.runtime.d.c.f49444a, this.f49438i, this.f49439j, this.f49440k));
    }

    /* synthetic */ d(Context context, byte b2) {
        this(context);
    }
}
