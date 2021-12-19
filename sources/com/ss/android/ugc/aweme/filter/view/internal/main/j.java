package com.ss.android.ugc.aweme.filter.view.internal.main;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.da.e;
import com.ss.android.ugc.tools.view.base.e;
import f.a.d.k;
import f.a.l.g;
import f.a.t;
import h.f.b.l;

public final class j implements com.ss.android.ugc.tools.view.base.d {

    /* renamed from: a  reason: collision with root package name */
    public b f95906a;

    /* renamed from: b  reason: collision with root package name */
    public final g<e> f95907b;

    /* renamed from: c  reason: collision with root package name */
    public final View f95908c;

    /* renamed from: d  reason: collision with root package name */
    private final q f95909d;

    /* renamed from: e  reason: collision with root package name */
    private a f95910e;

    /* access modifiers changed from: package-private */
    public enum a {
        NONE,
        SHOW,
        HIDE;

        static {
            Covode.recordClassIndex(60763);
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
            Covode.recordClassIndex(60764);
        }
    }

    static {
        Covode.recordClassIndex(60761);
    }

    @Override // com.ss.android.ugc.tools.view.base.d
    public final t<e> e() {
        t<e> c2 = this.f95907b.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.tools.view.base.d
    public final void b() {
        this.f95906a = b.UNKNOWN;
        this.f95908c.setVisibility(0);
        this.f95907b.onNext(e.PRE_SHOW);
        this.f95907b.onNext(e.SHOWN);
    }

    @Override // com.ss.android.ugc.tools.view.base.d
    public final t<Boolean> d() {
        t<R> d2 = e().a(c.f95922a).d(d.f95923a);
        l.b(d2, "");
        return d2;
    }

    @Override // com.ss.android.ugc.tools.view.base.d
    public final void f() {
        this.f95906a = b.HIDE;
        this.f95908c.setVisibility(8);
        this.f95907b.onNext(e.PRE_HIDE);
        this.f95907b.onNext(e.HIDDEN);
    }

    public final void g() {
        if (this.f95910e == a.SHOW) {
            a();
        } else if (this.f95910e == a.HIDE) {
            c();
        }
        this.f95910e = a.NONE;
    }

    @Override // com.ss.android.ugc.tools.view.base.d
    public final void a() {
        if (this.f95909d != null) {
            int i2 = k.f95924a[this.f95906a.ordinal()];
            if (i2 == 1 || i2 == 2) {
                this.f95910e = a.NONE;
            } else if (i2 != 3) {
                this.f95906a = b.SHOWING;
                this.f95909d.a(new com.ss.android.ugc.aweme.da.b());
            } else {
                this.f95910e = a.SHOW;
            }
        } else {
            b();
        }
    }

    @Override // com.ss.android.ugc.tools.view.base.d
    public final void c() {
        if (this.f95909d != null) {
            int i2 = k.f95925b[this.f95906a.ordinal()];
            if (i2 == 1 || i2 == 2) {
                this.f95910e = a.NONE;
            } else if (i2 != 3) {
                this.f95906a = b.HIDING;
                this.f95909d.b(new com.ss.android.ugc.aweme.da.b());
            } else {
                this.f95910e = a.HIDE;
            }
        } else {
            f();
        }
    }

    static final class c<T> implements k<e> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f95922a = new c();

        static {
            Covode.recordClassIndex(60765);
        }

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.k
        public final /* synthetic */ boolean a(e eVar) {
            l.d(eVar, "");
            if (eVar == e.PRE_SHOW || eVar == e.HIDDEN) {
                return true;
            }
            return false;
        }
    }

    static final class d<T, R> implements f.a.d.g<e, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f95923a = new d();

        static {
            Covode.recordClassIndex(60766);
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

    public j(View view, View view2) {
        q qVar;
        l.d(view, "");
        this.f95908c = view;
        if (view2 != null) {
            qVar = new q(view2, (byte) 0);
        } else {
            qVar = null;
        }
        this.f95909d = qVar;
        this.f95906a = b.UNKNOWN;
        this.f95910e = a.NONE;
        f.a.l.c cVar = new f.a.l.c();
        l.b(cVar, "");
        this.f95907b = cVar;
        if (qVar != null) {
            qVar.a((com.ss.android.ugc.aweme.da.e) new e.a(this) {
                /* class com.ss.android.ugc.aweme.filter.view.internal.main.j.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ j f95911a;

                static {
                    Covode.recordClassIndex(60762);
                }

                @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
                public final void c() {
                    this.f95911a.f95907b.onNext(com.ss.android.ugc.tools.view.base.e.PRE_HIDE);
                }

                @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
                public final void a() {
                    this.f95911a.f95908c.setVisibility(0);
                    this.f95911a.f95907b.onNext(com.ss.android.ugc.tools.view.base.e.PRE_SHOW);
                }

                @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
                public final void b() {
                    this.f95911a.f95906a = b.SHOWN;
                    this.f95911a.f95907b.onNext(com.ss.android.ugc.tools.view.base.e.SHOWN);
                    this.f95911a.g();
                }

                @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
                public final void d() {
                    this.f95911a.f95906a = b.HIDE;
                    this.f95911a.f95908c.setVisibility(8);
                    this.f95911a.f95907b.onNext(com.ss.android.ugc.tools.view.base.e.HIDDEN);
                    this.f95911a.g();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f95911a = r1;
                }
            });
        }
    }
}
