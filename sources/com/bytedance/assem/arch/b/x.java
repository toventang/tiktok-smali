package com.bytedance.assem.arch.b;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.b.a.a;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tiktok.proxy.d;
import h.f.b.ab;
import h.w;
import h.z;

public abstract class x<RECEIVER extends com.bytedance.tiktok.proxy.d> extends v<RECEIVER> {
    public static final h.h r = h.i.a(h.m.NONE, c.f25487a);
    public static final h.h s = h.i.a(h.m.NONE, b.f25486a);
    public static final a t = new a((byte) 0);
    public int o;
    public com.bytedance.assem.arch.core.l p = com.bytedance.assem.arch.core.l.SYNC;
    public View q;
    private final h.h u = h.i.a(h.m.NONE, d.f25488a);

    public final Handler A() {
        return (Handler) this.u.getValue();
    }

    public abstract int C();

    public void D() {
    }

    public void E() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(14835);
        }

        public static boolean a() {
            return ((Boolean) x.r.getValue()).booleanValue();
        }

        public static boolean b() {
            return ((Boolean) x.s.getValue()).booleanValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25486a = new b();

        static {
            Covode.recordClassIndex(14836);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }

        private static boolean a() {
            try {
                System.out.println(ab.a(com.a.b.a.class));
                return true;
            } catch (ClassNotFoundException e2) {
                com.bytedance.assem.arch.extensions.k kVar = com.bytedance.assem.arch.extensions.j.f25647b;
                if (kVar == null) {
                    return false;
                }
                kVar.a("Could not find AndInflater", e2);
                return false;
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f25487a = new c();

        static {
            Covode.recordClassIndex(14837);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(a());
        }

        private static boolean a() {
            try {
                System.out.println(ab.a(androidx.b.a.a.class));
                return true;
            } catch (ClassNotFoundException e2) {
                com.bytedance.assem.arch.extensions.k kVar = com.bytedance.assem.arch.extensions.j.f25647b;
                if (kVar == null) {
                    return false;
                }
                kVar.a("Could not find AsyncLayoutInflater", e2);
                return false;
            }
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f25488a = new d();

        static {
            Covode.recordClassIndex(14838);
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

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ h.f.a.a $runnable;
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(14852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(x xVar, h.f.a.a aVar) {
            super(0);
            this.this$0 = xVar;
            this.$runnable = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            u.a(this.this$0, new h.f.a.a<z>(this) {
                /* class com.bytedance.assem.arch.b.x.l.AnonymousClass1 */
                final /* synthetic */ l this$0;

                static {
                    Covode.recordClassIndex(14853);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* bridge */ /* synthetic */ z invoke() {
                    this.this$0.$runnable.invoke();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f25501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f25502b;

        static {
            Covode.recordClassIndex(14854);
        }

        m(x xVar, h.f.a.a aVar) {
            this.f25501a = xVar;
            this.f25502b = aVar;
        }

        public final void run() {
            u.a(this.f25501a, new h.f.a.a<z>(this) {
                /* class com.bytedance.assem.arch.b.x.m.AnonymousClass1 */
                final /* synthetic */ m this$0;

                static {
                    Covode.recordClassIndex(14855);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* bridge */ /* synthetic */ z invoke() {
                    this.this$0.f25502b.invoke();
                    return z.f158842a;
                }
            });
        }
    }

    public final View B() {
        View view = this.q;
        if (view == null) {
            h.f.b.l.a("contentView");
        }
        return view;
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void bO_() {
        b(new j(this));
    }

    @Override // com.bytedance.assem.arch.b.v, com.bytedance.assem.arch.core.a
    public final void j() {
        b(new i(this));
    }

    @Override // com.bytedance.assem.arch.core.a
    public final void l() {
        b(new h(this));
    }

    @Override // com.bytedance.assem.arch.b.v, com.bytedance.assem.arch.core.a
    public final void n() {
        b(new k(this));
    }

    @Override // com.bytedance.assem.arch.b.v, com.bytedance.assem.arch.core.a
    public final void p() {
        b(new g(this));
    }

    @Override // com.bytedance.assem.arch.b.v
    public void z() {
        if (this.q != null) {
            View view = this.q;
            if (view == null) {
                h.f.b.l.a("contentView");
            }
            view.setVisibility(8);
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f25491a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f25492b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f25493c;

        static {
            Covode.recordClassIndex(14840);
        }

        f(x xVar, int i2, View view) {
            this.f25491a = xVar;
            this.f25492b = i2;
            this.f25493c = view;
        }

        public final void run() {
            Context ar_ = this.f25491a.ar_();
            if (ar_ != null) {
                final View a2 = com.a.b.c.a((Activity) ar_, this.f25492b);
                this.f25491a.a(this.f25493c);
                x xVar = this.f25491a;
                h.f.b.l.a((Object) a2, "");
                xVar.d(a2);
                this.f25491a.b(a2);
                this.f25491a.A().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.b.x.f.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ f f25494a;

                    static {
                        Covode.recordClassIndex(14841);
                    }

                    {
                        this.f25494a = r1;
                    }

                    public final void run() {
                        MethodCollector.i(2450);
                        ((ViewGroup) this.f25494a.f25493c).addView(a2);
                        MethodCollector.o(2450);
                    }
                });
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(14842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(x xVar) {
            super(0);
            this.this$0 = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.E();
            if (h.f.b.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                x.super.p();
            } else {
                this.this$0.A().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.b.x.g.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ g f25496a;

                    static {
                        Covode.recordClassIndex(14843);
                    }

                    {
                        this.f25496a = r1;
                    }

                    public final void run() {
                        g.super.p();
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(14844);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(x xVar) {
            super(0);
            this.this$0 = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.D();
            if (h.f.b.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                x.super.l();
            } else {
                this.this$0.A().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.b.x.h.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ h f25497a;

                    static {
                        Covode.recordClassIndex(14845);
                    }

                    {
                        this.f25497a = r1;
                    }

                    public final void run() {
                        h.super.l();
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(14846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(x xVar) {
            super(0);
            this.this$0 = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (h.f.b.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                x.super.j();
            } else {
                this.this$0.A().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.b.x.i.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ i f25498a;

                    static {
                        Covode.recordClassIndex(14847);
                    }

                    {
                        this.f25498a = r1;
                    }

                    public final void run() {
                        i.super.j();
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(14848);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(x xVar) {
            super(0);
            this.this$0 = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (h.f.b.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                x.super.bO_();
            } else {
                this.this$0.A().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.b.x.j.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ j f25499a;

                    static {
                        Covode.recordClassIndex(14849);
                    }

                    {
                        this.f25499a = r1;
                    }

                    public final void run() {
                        j.super.bO_();
                    }
                });
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(14850);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(x xVar) {
            super(0);
            this.this$0 = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (h.f.b.l.a(Looper.myLooper(), Looper.getMainLooper())) {
                x.super.n();
            } else {
                this.this$0.A().post(new Runnable(this) {
                    /* class com.bytedance.assem.arch.b.x.k.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ k f25500a;

                    static {
                        Covode.recordClassIndex(14851);
                    }

                    {
                        this.f25500a = r1;
                    }

                    public final void run() {
                        k.super.n();
                    }
                });
            }
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(14834);
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void v() {
        View view;
        if (this.f25472i && this.q != null) {
            b(s());
        } else if (this.o != 0) {
            int C = C();
            if (C != 0) {
                View view2 = bx_().f25530c;
                if (view2 != null) {
                    view = view2.findViewById(this.o);
                } else {
                    view = null;
                }
                if (view == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                } else if (view instanceof ViewGroup) {
                    int i2 = y.f25503a[this.p.ordinal()];
                    if (i2 == 1) {
                        Context ar_ = ar_();
                        if (ar_ != null) {
                            new androidx.b.a.a(ar_).a(C, (ViewGroup) view, new e(this, view));
                            return;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else if (i2 == 2) {
                        Context ar_2 = ar_();
                        if (ar_2 != null) {
                            View a2 = com.a.b.a.a(ar_2, C);
                            if (a2 != null) {
                                ((ViewGroup) view).addView(a2);
                                a(view);
                                this.q = a2;
                                b(a2);
                                return;
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else if (i2 == 3) {
                        com.bytedance.assem.arch.extensions.j.a(true).execute(new f(this, C, view));
                    } else if (i2 == 4) {
                        Context ar_3 = ar_();
                        if (ar_3 != null) {
                            ViewGroup viewGroup = (ViewGroup) view;
                            View a3 = com.a.a(LayoutInflater.from(ar_3), C, viewGroup, false);
                            if (a3 != null) {
                                viewGroup.addView(a3);
                                a(view);
                                this.q = a3;
                                b(a3);
                                return;
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalStateException("container must be a ViewGroup.".toString());
                }
            } else {
                throw new IllegalStateException("layoutId must be assigned.".toString());
            }
        } else {
            throw new IllegalStateException("slotLayoutId must be assigned.".toString());
        }
    }

    public final void d(View view) {
        h.f.b.l.c(view, "");
        this.q = view;
    }

    private final void b(h.f.a.a<z> aVar) {
        if (this.p != com.bytedance.assem.arch.core.l.ASYNC_X2C) {
            aVar.invoke();
        } else if (com.bytedance.assem.arch.extensions.j.f25649d) {
            a(new l(this, aVar));
        } else {
            com.bytedance.assem.arch.extensions.j.a(false).execute(new m(this, aVar));
        }
    }

    public final void a(com.bytedance.assem.arch.core.l lVar) {
        com.bytedance.assem.arch.core.l lVar2;
        h.f.b.l.c(lVar, "");
        if (lVar == com.bytedance.assem.arch.core.l.ASYNC && a.a()) {
            lVar2 = com.bytedance.assem.arch.core.l.ASYNC;
        } else if (lVar == com.bytedance.assem.arch.core.l.X2C && a.b()) {
            lVar2 = com.bytedance.assem.arch.core.l.X2C;
        } else if (lVar != com.bytedance.assem.arch.core.l.ASYNC_X2C || !a.b()) {
            lVar2 = com.bytedance.assem.arch.core.l.SYNC;
        } else {
            lVar2 = com.bytedance.assem.arch.core.l.ASYNC_X2C;
        }
        this.p = lVar2;
    }

    static final class e implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f25489a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f25490b;

        static {
            Covode.recordClassIndex(14839);
        }

        e(x xVar, View view) {
            this.f25489a = xVar;
            this.f25490b = view;
        }

        @Override // androidx.b.a.a.d
        public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
            MethodCollector.i(2459);
            h.f.b.l.c(view, "");
            if (this.f25489a.f25546d.a() == i.b.DESTROYED) {
                MethodCollector.o(2459);
                return;
            }
            ((ViewGroup) this.f25490b).addView(view);
            this.f25489a.a(this.f25490b);
            this.f25489a.d(view);
            this.f25489a.b(view);
            MethodCollector.o(2459);
        }
    }
}
