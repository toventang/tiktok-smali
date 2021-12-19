package com.bytedance.assem.arch.b;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.core.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import h.h;
import h.i;
import h.m;
import h.z;

public abstract class w<RECEIVER extends com.bytedance.tiktok.proxy.d> extends v<RECEIVER> {
    public int o;
    public int p;
    public l q = l.SYNC;
    private final h r = i.a(m.NONE, a.f25480a);

    static {
        Covode.recordClassIndex(14821);
    }

    public final Handler A() {
        return (Handler) this.r.getValue();
    }

    public void B() {
    }

    public void C() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25480a = new a();

        static {
            Covode.recordClassIndex(14822);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ w this$0;

        static {
            Covode.recordClassIndex(14823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(w wVar) {
            super(0);
            this.this$0 = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            w wVar = this.this$0;
            wVar.b(wVar.s());
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void bO_() {
        new f(this).invoke();
    }

    @Override // com.bytedance.assem.arch.b.v, com.bytedance.assem.arch.core.a
    public final void j() {
        new e(this).invoke();
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void l() {
        new d(this).invoke();
    }

    @Override // com.bytedance.assem.arch.b.v, com.bytedance.assem.arch.core.a
    public final void n() {
        new g(this).invoke();
    }

    @Override // com.bytedance.assem.arch.b.v, com.bytedance.assem.arch.core.a
    public final void p() {
        new c(this).invoke();
    }

    @Override // com.bytedance.assem.arch.b.v
    public void z() {
        if (w()) {
            s().setVisibility(8);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ w this$0;

        static {
            Covode.recordClassIndex(14824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(w wVar) {
            super(0);
            this.this$0 = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (h.f.b.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                w.super.p();
            } else {
                this.this$0.A().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.b.w.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f25481a;

                    static {
                        Covode.recordClassIndex(14825);
                    }

                    {
                        this.f25481a = r1;
                    }

                    public final void run() {
                        c.super.p();
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ w this$0;

        static {
            Covode.recordClassIndex(14826);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(w wVar) {
            super(0);
            this.this$0 = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.C();
            if (h.f.b.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                w.super.l();
            } else {
                this.this$0.A().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.b.w.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f25482a;

                    static {
                        Covode.recordClassIndex(14827);
                    }

                    {
                        this.f25482a = r1;
                    }

                    public final void run() {
                        d.super.l();
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ w this$0;

        static {
            Covode.recordClassIndex(14828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(w wVar) {
            super(0);
            this.this$0 = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.B();
            if (h.f.b.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                w.super.j();
            } else {
                this.this$0.A().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.b.w.e.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f25483a;

                    static {
                        Covode.recordClassIndex(14829);
                    }

                    {
                        this.f25483a = r1;
                    }

                    public final void run() {
                        e.super.j();
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ w this$0;

        static {
            Covode.recordClassIndex(14830);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(w wVar) {
            super(0);
            this.this$0 = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (h.f.b.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                w.super.bO_();
            } else {
                this.this$0.A().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.b.w.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f25484a;

                    static {
                        Covode.recordClassIndex(14831);
                    }

                    {
                        this.f25484a = r1;
                    }

                    public final void run() {
                        f.super.bO_();
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ w this$0;

        static {
            Covode.recordClassIndex(14832);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(w wVar) {
            super(0);
            this.this$0 = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (h.f.b.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                w.super.n();
            } else {
                this.this$0.A().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.b.w.g.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ g f25485a;

                    static {
                        Covode.recordClassIndex(14833);
                    }

                    {
                        this.f25485a = r1;
                    }

                    public final void run() {
                        g.super.n();
                    }
                });
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void v() {
        View view;
        if (w()) {
            new b(this);
            b(s());
        } else if (this.o != 0 && (view = bx_().f25530c) != null) {
            View findViewById = view.findViewById(this.o);
            if (findViewById == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (findViewById instanceof ViewStub) {
                int i2 = this.p;
                if (i2 != 0) {
                    ((ViewStub) findViewById).setLayoutResource(i2);
                }
                View inflate = ((ViewStub) findViewById).inflate();
                h.f.b.l.a((Object) inflate, "");
                a(inflate);
                b(s());
            } else {
                a(findViewById);
                b(findViewById);
            }
        }
    }

    public final void a(l lVar) {
        h.f.b.l.c(lVar, "");
        this.q = lVar;
    }
}
