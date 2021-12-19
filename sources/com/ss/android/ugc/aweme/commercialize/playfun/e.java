package com.ss.android.ugc.aweme.commercialize.playfun;

import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.model.ao;
import com.ss.android.ugc.aweme.commercialize.playfun.a.b;
import com.ss.android.ugc.aweme.commercialize.playfun.a.c;
import com.ss.android.ugc.aweme.commercialize.playfun.a.f;
import com.ss.android.ugc.aweme.commercialize.playfun.a.g;
import com.ss.android.ugc.aweme.commercialize.views.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.v;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public c f74995a = new c();

    /* renamed from: b  reason: collision with root package name */
    public String f74996b = "IdleState";

    /* renamed from: c  reason: collision with root package name */
    public AwemePlayFunModel f74997c;

    /* renamed from: d  reason: collision with root package name */
    public View f74998d;

    /* renamed from: e  reason: collision with root package name */
    public View f74999e;

    /* renamed from: f  reason: collision with root package name */
    public View f75000f;

    /* renamed from: g  reason: collision with root package name */
    public k f75001g;

    /* renamed from: h  reason: collision with root package name */
    public DataCenter f75002h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f75003i;

    /* renamed from: j  reason: collision with root package name */
    public long f75004j;

    /* renamed from: k  reason: collision with root package name */
    public ao f75005k;

    /* renamed from: l  reason: collision with root package name */
    public String f75006l;

    /* renamed from: m  reason: collision with root package name */
    final HashMap<String, d> f75007m;
    public final AdPlayFunView n;
    private final h o;
    private final HashMap<String, String> p;

    static {
        Covode.recordClassIndex(46234);
    }

    private final View d() {
        return (View) this.o.getValue();
    }

    static final class a extends m implements h.f.a.a<View> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(46235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            ViewParent parent = this.this$0.n.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                return viewGroup.findViewById(R.id.q0);
            }
            return null;
        }
    }

    public final boolean b() {
        d dVar = this.f75007m.get(this.f74996b);
        if (dVar != null) {
            return dVar.f();
        }
        return false;
    }

    public final void a() {
        this.f74999e.setAlpha(0.0f);
        this.f75000f.setAlpha(0.0f);
        this.f74998d.setAlpha(0.0f);
        Collection<d> values = this.f75007m.values();
        l.b(values, "");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        this.f74996b = "IdleState";
    }

    public final PointF c() {
        int a2;
        float f2 = ((1.0f - this.f74995a.f74992d) / 2.0f) * ((float) this.f74995a.f74989a);
        float b2 = n.b(d.a(), 12.0f) - f2;
        if (gb.a()) {
            b2 = -b2;
        }
        if (d() != null) {
            View d2 = d();
            if (d2 == null) {
                l.b();
            }
            a2 = f.a(d2);
        } else {
            a2 = f.a(this.n) + this.n.getHeight();
        }
        return new PointF(b2, (((float) ((a2 - f.a(this.n)) - this.f74995a.f74989a)) + f2) - n.b(d.a(), 8.0f));
    }

    public final void a(String str) {
        l.d(str, "");
        this.f75006l = str;
    }

    public final void b(String str) {
        AwemeRawAd awemeRawAd;
        l.d(str, "");
        if (this.f75001g == null) {
            AdPlayFunView adPlayFunView = this.n;
            l.d(str, "");
            Aweme aweme = adPlayFunView.f74935f;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", awemeRawAd).b("refer", str).b();
        }
    }

    public final void a(int i2) {
        if (i2 == 0) {
            String str = this.p.get(this.f74996b);
            if (str != null) {
                l.b(str, "");
                this.f74996b = str;
                d dVar = this.f75007m.get(str);
                if (dVar != null) {
                    dVar.a();
                }
            }
        } else if (i2 == 1) {
            this.f74996b = "FinishState";
        }
    }

    public e(AdPlayFunView adPlayFunView) {
        l.d(adPlayFunView, "");
        this.n = adPlayFunView;
        View findViewById = adPlayFunView.findViewById(R.id.fw);
        l.b(findViewById, "");
        this.f74998d = findViewById;
        View findViewById2 = adPlayFunView.findViewById(R.id.fx);
        l.b(findViewById2, "");
        this.f74999e = findViewById2;
        View findViewById3 = adPlayFunView.findViewById(R.id.fy);
        l.b(findViewById3, "");
        this.f75000f = findViewById3;
        this.o = i.a((h.f.a.a) new a(this));
        this.f75003i = true;
        this.f75006l = "";
        this.p = ag.c(v.a("IdleState", "ExpandState"), v.a("ExpandState", "EggShowState"), v.a("EggShowState", "CollapseState"), v.a("CollapseState", "WidgetShowState"), v.a("WidgetShowState", "FinishState"));
        this.f75007m = ag.c(v.a("IdleState", new f(this)), v.a("ExpandState", new com.ss.android.ugc.aweme.commercialize.playfun.a.d(this)), v.a("EggShowState", new c(this)), v.a("CollapseState", new b(this)), v.a("WidgetShowState", new g(this)), v.a("FinishState", new com.ss.android.ugc.aweme.commercialize.playfun.a.e(this)));
    }

    public final void a(String str, Point point, Point point2) {
        l.d(str, "");
        AdPlayFunView adPlayFunView = this.n;
        l.d(str, "");
        com.ss.android.ugc.aweme.commercialize.playfun.b.a.a(adPlayFunView.f74935f, true, str, point, point2);
    }
}
