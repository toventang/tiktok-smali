package com.ss.android.ugc.tools.view.base;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.da.e;
import f.a.d.k;
import f.a.l.g;
import f.a.t;
import h.f.b.l;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public b f150045a;

    /* renamed from: b  reason: collision with root package name */
    public final g<e> f150046b;

    /* renamed from: c  reason: collision with root package name */
    public final View f150047c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.da.d f150048d;

    /* renamed from: e  reason: collision with root package name */
    private EnumC4047a f150049e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tools.view.base.a$a  reason: collision with other inner class name */
    public enum EnumC4047a {
        NONE,
        SHOW,
        HIDE;

        static {
            Covode.recordClassIndex(98785);
        }
    }

    /* access modifiers changed from: package-private */
    public enum b {
        UNKNOWN,
        SHOWING,
        SHOWN,
        HIDING,
        HIDE;

        static {
            Covode.recordClassIndex(98786);
        }
    }

    static {
        Covode.recordClassIndex(98783);
    }

    @Override // com.ss.android.ugc.tools.view.base.d
    public final t<e> e() {
        t<e> c2 = this.f150046b.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.view.base.d
    public final void b() {
        this.f150045a = b.UNKNOWN;
        this.f150047c.setVisibility(0);
        this.f150046b.onNext(e.PRE_SHOW);
        this.f150046b.onNext(e.SHOWN);
    }

    @Override // com.ss.android.ugc.tools.view.base.d
    public final t<Boolean> d() {
        t<R> d2 = e().a(c.f150062a).d(d.f150063a);
        l.b(d2, "");
        return d2;
    }

    @Override // com.ss.android.ugc.tools.view.base.d
    public final void f() {
        this.f150045a = b.HIDE;
        this.f150047c.setVisibility(8);
        this.f150046b.onNext(e.PRE_HIDE);
        this.f150046b.onNext(e.HIDDEN);
    }

    public final void g() {
        if (this.f150049e == EnumC4047a.SHOW) {
            a();
        } else if (this.f150049e == EnumC4047a.HIDE) {
            c();
        }
        this.f150049e = EnumC4047a.NONE;
    }

    @Override // com.ss.android.ugc.tools.view.base.d
    public final void a() {
        if (this.f150048d != null) {
            int i2 = b.f150064a[this.f150045a.ordinal()];
            if (i2 == 1 || i2 == 2) {
                this.f150049e = EnumC4047a.NONE;
            } else if (i2 != 3) {
                this.f150045a = b.SHOWING;
                this.f150048d.a(new com.ss.android.ugc.aweme.da.b());
            } else {
                this.f150049e = EnumC4047a.SHOW;
            }
        } else {
            b();
        }
    }

    @Override // com.ss.android.ugc.tools.view.base.d
    public final void c() {
        if (this.f150048d != null) {
            int i2 = b.f150065b[this.f150045a.ordinal()];
            if (i2 == 1 || i2 == 2) {
                this.f150049e = EnumC4047a.NONE;
            } else if (i2 != 3) {
                this.f150045a = b.HIDING;
                this.f150048d.b(new com.ss.android.ugc.aweme.da.b());
            } else {
                this.f150049e = EnumC4047a.HIDE;
            }
        } else {
            f();
        }
    }

    static final class c<T> implements k<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f150062a = new c();

        static {
            Covode.recordClassIndex(98787);
        }

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.k
        public final /* synthetic */ boolean a(e eVar) {
            l.d(eVar, "");
            if (eVar == e.PRE_SHOW || eVar == e.PRE_HIDE) {
                return true;
            }
            return false;
        }
    }

    static final class d<T, R> implements f.a.d.g<e, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f150063a = new d();

        static {
            Covode.recordClassIndex(98788);
        }

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ Boolean apply(e eVar) {
            boolean z;
            l.d(eVar, "");
            if (eVar == e.PRE_SHOW) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public a(View view, final View view2, View view3, h.f.a.b<? super View, ? extends com.ss.android.ugc.aweme.da.d> bVar) {
        com.ss.android.ugc.aweme.da.d dVar;
        l.d(view, "");
        l.d(bVar, "");
        this.f150047c = view;
        if (view3 != null) {
            dVar = (com.ss.android.ugc.aweme.da.d) bVar.invoke(view3);
        } else {
            dVar = null;
        }
        this.f150048d = dVar;
        this.f150045a = b.UNKNOWN;
        this.f150049e = EnumC4047a.NONE;
        f.a.l.c cVar = new f.a.l.c();
        l.b(cVar, "");
        this.f150046b = cVar;
        if (dVar != null) {
            dVar.a((e) new e.a(this) {
                /* class com.ss.android.ugc.tools.view.base.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f150050a;

                static {
                    Covode.recordClassIndex(98784);
                }

                @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
                public final void a() {
                    this.f150050a.f150047c.setVisibility(0);
                    View view = view2;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    this.f150050a.f150046b.onNext(e.PRE_SHOW);
                }

                @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
                public final void b() {
                    this.f150050a.f150045a = b.SHOWN;
                    View view = view2;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    this.f150050a.f150046b.onNext(e.SHOWN);
                    this.f150050a.g();
                }

                @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
                public final void c() {
                    View view = view2;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    this.f150050a.f150046b.onNext(e.PRE_HIDE);
                }

                @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
                public final void d() {
                    this.f150050a.f150045a = b.HIDE;
                    View view = view2;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    this.f150050a.f150047c.setVisibility(8);
                    this.f150050a.f150046b.onNext(e.HIDDEN);
                    this.f150050a.g();
                }

                {
                    this.f150050a = r1;
                }
            });
        }
    }
}
