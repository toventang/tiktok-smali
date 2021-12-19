package com.ss.android.ugc.aweme.sticker.view.internal.main;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.da.d;
import com.ss.android.ugc.aweme.da.e;
import com.ss.android.ugc.aweme.sticker.view.internal.h;
import f.a.l.c;
import f.a.l.g;
import f.a.t;
import h.f.b.l;

public final class n implements h {

    /* renamed from: a  reason: collision with root package name */
    public final g<com.ss.android.ugc.aweme.sticker.view.a.n> f136316a;

    /* renamed from: b  reason: collision with root package name */
    public b f136317b;

    /* renamed from: c  reason: collision with root package name */
    public final View f136318c;

    /* renamed from: d  reason: collision with root package name */
    private final d f136319d;

    /* renamed from: e  reason: collision with root package name */
    private a f136320e;

    /* renamed from: f  reason: collision with root package name */
    private final ViewGroup f136321f;

    /* access modifiers changed from: package-private */
    public enum a {
        NONE,
        SHOW,
        HIDE;

        static {
            Covode.recordClassIndex(89035);
        }
    }

    /* access modifiers changed from: package-private */
    public enum b {
        SHOWING,
        SHOWN,
        HIDING,
        HIDE;

        static {
            Covode.recordClassIndex(89036);
        }
    }

    static {
        Covode.recordClassIndex(89033);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.h
    public final boolean a() {
        if (this.f136317b == b.SHOWING || this.f136317b == b.SHOWN) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.h
    public final t<com.ss.android.ugc.aweme.sticker.view.a.n> f() {
        t<com.ss.android.ugc.aweme.sticker.view.a.n> c2 = this.f136316a.c();
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.h
    public final void c() {
        this.f136317b = b.SHOWN;
        this.f136318c.setVisibility(0);
        this.f136316a.onNext(com.ss.android.ugc.aweme.sticker.view.a.n.PRE_SHOW);
        this.f136316a.onNext(com.ss.android.ugc.aweme.sticker.view.a.n.SHOWN);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.h
    public final void e() {
        this.f136317b = b.HIDE;
        this.f136318c.setVisibility(8);
        this.f136316a.onNext(com.ss.android.ugc.aweme.sticker.view.a.n.PRE_HIDE);
        this.f136316a.onNext(com.ss.android.ugc.aweme.sticker.view.a.n.HIDDEN);
    }

    public final void g() {
        if (this.f136320e == a.SHOW) {
            b();
        } else if (this.f136320e == a.HIDE) {
            d();
        }
        this.f136320e = a.NONE;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.h
    public final void b() {
        if (this.f136319d != null) {
            int i2 = o.f136332a[this.f136317b.ordinal()];
            if (i2 == 1 || i2 == 2) {
                this.f136320e = a.NONE;
            } else if (i2 != 3) {
                this.f136317b = b.SHOWING;
                this.f136319d.a(new com.ss.android.ugc.aweme.da.b());
            } else {
                this.f136320e = a.SHOW;
            }
        } else {
            c();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.h
    public final void d() {
        if (this.f136319d != null) {
            int i2 = o.f136333b[this.f136317b.ordinal()];
            if (i2 == 1 || i2 == 2) {
                this.f136320e = a.NONE;
            } else if (i2 != 3) {
                this.f136317b = b.HIDING;
                this.f136319d.b(new com.ss.android.ugc.aweme.da.b());
            } else {
                this.f136320e = a.HIDE;
            }
        } else {
            e();
        }
    }

    private n(ViewGroup viewGroup, View view, View view2, long j2, Interpolator interpolator) {
        p pVar;
        l.d(viewGroup, "");
        l.d(view, "");
        l.d(interpolator, "");
        this.f136321f = viewGroup;
        this.f136318c = view;
        if (view2 != null) {
            pVar = new p(viewGroup, view, view2, j2, 250, interpolator);
        } else {
            pVar = null;
        }
        this.f136319d = pVar;
        c cVar = new c();
        l.b(cVar, "");
        this.f136316a = cVar;
        this.f136317b = b.HIDE;
        this.f136320e = a.NONE;
        if (pVar != null) {
            pVar.a((e) new e.a(this) {
                /* class com.ss.android.ugc.aweme.sticker.view.internal.main.n.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ n f136322a;

                static {
                    Covode.recordClassIndex(89034);
                }

                @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
                public final void c() {
                    this.f136322a.f136316a.onNext(com.ss.android.ugc.aweme.sticker.view.a.n.PRE_HIDE);
                }

                @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
                public final void a() {
                    this.f136322a.f136318c.setVisibility(0);
                    this.f136322a.f136316a.onNext(com.ss.android.ugc.aweme.sticker.view.a.n.PRE_SHOW);
                }

                @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
                public final void b() {
                    this.f136322a.f136317b = b.SHOWN;
                    this.f136322a.f136316a.onNext(com.ss.android.ugc.aweme.sticker.view.a.n.SHOWN);
                    this.f136322a.g();
                }

                @Override // com.ss.android.ugc.aweme.da.e.a, com.ss.android.ugc.aweme.da.c
                public final void d() {
                    this.f136322a.f136317b = b.HIDE;
                    this.f136322a.f136318c.setVisibility(8);
                    this.f136322a.f136316a.onNext(com.ss.android.ugc.aweme.sticker.view.a.n.HIDDEN);
                    this.f136322a.g();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f136322a = r1;
                }
            });
        }
    }

    public /* synthetic */ n(ViewGroup viewGroup, View view, View view2, long j2, Interpolator interpolator, byte b2) {
        this(viewGroup, view, view2, j2, interpolator);
    }
}
