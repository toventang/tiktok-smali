package com.bytedance.ies.bullet.ui.common;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.c.z;
import com.bytedance.ies.bullet.c.d;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.n;
import com.bytedance.ies.bullet.service.base.a.q;
import com.bytedance.ies.bullet.service.base.an;
import com.bytedance.ies.bullet.service.base.b.e;
import com.bytedance.ies.bullet.service.base.k;
import com.bytedance.ies.bullet.service.base.m;
import com.bytedance.ies.bullet.service.base.o;
import com.bytedance.ies.bullet.service.base.y;
import com.bytedance.ies.bullet.service.f.a.b.t;
import com.bytedance.ies.bullet.ui.common.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.r;
import h.w;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public class BulletContainerView extends FrameLayout implements j, h, h.b {

    /* renamed from: a  reason: collision with root package name */
    public h.b f33027a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.c.i f33028b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f33029c;

    /* renamed from: d  reason: collision with root package name */
    public View f33030d;

    /* renamed from: e  reason: collision with root package name */
    public Timer f33031e;

    /* renamed from: f  reason: collision with root package name */
    public TimerTask f33032f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f33033g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f33034h;

    /* renamed from: i  reason: collision with root package name */
    public com.bytedance.ies.bullet.c.a.b f33035i;

    /* renamed from: j  reason: collision with root package name */
    public m f33036j;

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f33037k;

    /* renamed from: l  reason: collision with root package name */
    private final i f33038l;

    /* renamed from: m  reason: collision with root package name */
    private List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> f33039m;
    private long n;
    private View o;
    private Uri p;
    private com.bytedance.ies.bullet.service.f.a.b q;
    private String r;
    private String s;
    private boolean t;
    private long u;
    private final h.h v;
    private HashMap w;

    static {
        Covode.recordClassIndex(19711);
    }

    public BulletContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, (byte) 0);
    }

    public View f() {
        if (this.w == null) {
            this.w = new HashMap();
        }
        View view = (View) this.w.get(Integer.valueOf((int) R.id.a0g));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.a0g);
        this.w.put(Integer.valueOf((int) R.id.a0g), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public q getLoggerWrapper() {
        return (q) this.v.getValue();
    }

    public static final class a implements com.bytedance.ies.bullet.c.f.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f33040a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BulletContainerView f33041b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f33042c;

        static {
            Covode.recordClassIndex(19712);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.ies.bullet.c.f.a
        public final /* bridge */ /* synthetic */ Bundle a() {
            return this.f33040a;
        }

        a(BulletContainerView bulletContainerView, Bundle bundle) {
            this.f33041b = bulletContainerView;
            this.f33042c = bundle;
            this.f33040a = bundle;
        }

        @Override // com.bytedance.ies.bullet.c.f.a
        public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, com.bytedance.ies.bullet.service.f.a.b.q qVar) {
            l.c(iVar, "");
            l.c(uri, "");
            l.c(qVar, "");
            this.f33041b.a(iVar, uri, qVar);
            h.b bVar = this.f33041b.f33027a;
            if (bVar != null) {
                bVar.a(iVar, uri, qVar);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.c.d.a
    public void a(d.b bVar) {
        l.c(bVar, "");
        this.t = false;
        this.f33038l.a(bVar);
        com.bytedance.ies.bullet.c.e.a.b b2 = bVar.a().b();
        com.bytedance.ies.bullet.c.a.a aVar = (com.bytedance.ies.bullet.c.a.a) b2.c(com.bytedance.ies.bullet.c.a.a.class);
        if (aVar != null) {
            this.f33035i = aVar.f31976b;
            this.r = aVar.f31975a;
        }
        m mVar = (m) b2.c(m.class);
        if (mVar != null) {
            this.f33036j = mVar;
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h
    public void a(Uri uri, Bundle bundle, h.b bVar) {
        l.c(uri, "");
        a(bundle);
        b(uri, bundle, bVar);
        b(uri);
    }

    public final void a(Uri uri, Bundle bundle, com.bytedance.ies.bullet.c.e.a.b bVar, h.b bVar2) {
        l.c(uri, "");
        a(bundle);
        b(uri, bundle, bVar2);
        if (bVar != null) {
            getProviderFactory().a(bVar);
        }
        b(uri);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, com.bytedance.ies.bullet.service.f.a.b.q qVar) {
        com.bytedance.ies.bullet.service.f.a.b.d<t> dVar;
        t b2;
        l.c(iVar, "");
        l.c(uri, "");
        l.c(qVar, "");
        j.b.a(this, "view onLoadParamsSuccess", null, null, 6);
        if (!(qVar instanceof com.bytedance.ies.bullet.service.f.a.b)) {
            qVar = null;
        }
        com.bytedance.ies.bullet.service.f.a.b bVar = (com.bytedance.ies.bullet.service.f.a.b) qVar;
        if (bVar != null) {
            com.bytedance.ies.bullet.ui.common.d.b.a(bVar);
            com.bytedance.ies.bullet.ui.common.d.b.b(bVar);
            this.q = bVar;
            if (l.a((Object) bVar.n.b(), (Object) true)) {
                this.f33033g = false;
                Boolean b3 = bVar.n.b();
                if (b3 == null) {
                    l.a();
                }
                a(b3.booleanValue(), 0);
            } else {
                View view = this.f33030d;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            com.bytedance.ies.bullet.service.f.a.b bVar2 = this.q;
            if (bVar2 != null && (dVar = bVar2.f32695k) != null && (b2 = dVar.b()) != null && b2.f32728a != -2) {
                setBackgroundColor(b2.f32728a);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
        l.c(list, "");
        l.c(uri, "");
        l.c(iVar, "");
        j.b.a(this, "view onLoadKitInstanceSuccess kit: " + iVar.b(), null, null, 6);
        this.f33028b = iVar;
        this.f33039m = list;
        a(list, new h(this, iVar));
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
        l.c(view, "");
        l.c(uri, "");
        l.c(iVar, "");
        j.b.a(this, "view onLoadUriSuccess kit: " + iVar.b() + " uri=" + uri, null, null, 6);
        this.f33037k.getAndSet(m.SUCCESS.ordinal());
        this.f33033g = true;
        TimerTask timerTask = this.f33032f;
        if (timerTask != null) {
            timerTask.cancel();
        }
        Timer timer = this.f33031e;
        if (timer != null) {
            timer.cancel();
        }
        View view2 = this.f33030d;
        if (!(view2 instanceof k)) {
            view2 = null;
        }
        k kVar = (k) view2;
        if (kVar != null) {
            kVar.b();
        }
        View view3 = this.o;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        a(true, (Throwable) null);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri, Throwable th) {
        com.bytedance.ies.bullet.service.f.a.b.d<Boolean> dVar;
        Boolean b2;
        l.c(uri, "");
        l.c(th, "");
        j.b.a(this, "view onLoadFail e: " + th.getMessage(), null, null, 6);
        this.f33037k.getAndSet(m.FAIL.ordinal());
        this.f33033g = true;
        TimerTask timerTask = this.f33032f;
        if (timerTask != null) {
            timerTask.cancel();
        }
        Timer timer = this.f33031e;
        if (timer != null) {
            timer.cancel();
        }
        View view = this.f33030d;
        if (!(view instanceof k)) {
            view = null;
        }
        k kVar = (k) view;
        if (kVar != null) {
            kVar.b();
        }
        com.bytedance.ies.bullet.service.f.a.b bVar = this.q;
        if (!(bVar == null || (dVar = bVar.o) == null || (b2 = dVar.b()) == null || !b2.booleanValue())) {
            b2.booleanValue();
            View view2 = this.o;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        a(false, th);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h
    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        l.c(view, "");
        View view2 = this.f33030d;
        if (view2 != null) {
            removeView(view2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = i3;
        layoutParams.rightMargin = i5;
        layoutParams.topMargin = i4;
        layoutParams.bottomMargin = i6;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
        view.setVisibility(8);
        addView(view);
        this.f33030d = view;
    }

    public final void a(View view, FrameLayout.LayoutParams layoutParams) {
        l.c(view, "");
        l.c(layoutParams, "");
        View view2 = this.f33030d;
        if (view2 != null) {
            removeView(view2);
        }
        view.setLayoutParams(layoutParams);
        view.setVisibility(8);
        addView(view);
        this.f33030d = view;
    }

    public final void a(com.bytedance.ies.bullet.c.e.a.b bVar, h.b bVar2) {
        List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list;
        j.b.a(this, "reload " + this.p, null, null, 6);
        if (this.p != null && this.f33028b != null && (list = this.f33039m) != null && !list.isEmpty()) {
            this.f33027a = bVar2;
            if (bVar2 != null) {
                Uri uri = this.p;
                if (uri == null) {
                    l.a();
                }
                bVar2.a(uri);
            }
            this.f33038l.b().a(bVar);
            g();
            com.bytedance.ies.bullet.c.c.i iVar = this.f33028b;
            if (iVar == null) {
                l.a();
            }
            iVar.l();
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<q> {
        final /* synthetic */ BulletContainerView this$0;

        static {
            Covode.recordClassIndex(19720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(BulletContainerView bulletContainerView) {
            super(0);
            this.this$0 = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            return new q(this.this$0.f33036j, "View");
        }
    }

    private final void g() {
        List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list = this.f33039m;
        if (list != null) {
            a(list, new i(this));
        }
    }

    public final void c() {
        View view = this.f33030d;
        if (!(view instanceof k)) {
            view = null;
        }
        k kVar = (k) view;
        if (kVar != null) {
            kVar.a();
        }
    }

    public final void d() {
        View view = this.f33030d;
        if (!(view instanceof k)) {
            view = null;
        }
        k kVar = (k) view;
        if (kVar != null) {
            kVar.b();
        }
    }

    public com.bytedance.ies.bullet.c.e.a.b getProviderFactory() {
        com.bytedance.ies.bullet.c.e.a.b b2 = this.f33038l.b();
        b2.a(BulletContainerView.class, this);
        return b2;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
        if (this.f33034h) {
            a();
        }
    }

    public static final class b extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BulletContainerView f33043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f33044b;

        static {
            Covode.recordClassIndex(19713);
        }

        public final void run() {
            Activity a2 = com.bytedance.ies.bullet.ui.common.d.e.a((Context) this.f33043a.getProviderFactory().c(Context.class));
            if (a2 instanceof Activity) {
                a2.runOnUiThread(new a(this));
            }
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f33045a;

            static {
                Covode.recordClassIndex(19714);
            }

            a(b bVar) {
                this.f33045a = bVar;
            }

            public final void run() {
                View view;
                k kVar = null;
                this.f33045a.f33043a.f33031e = null;
                this.f33045a.f33043a.f33032f = null;
                if (!this.f33045a.f33043a.f33033g) {
                    View view2 = this.f33045a.f33043a.f33030d;
                    if (!(view2 instanceof k)) {
                        view2 = null;
                    }
                    k kVar2 = (k) view2;
                    if (kVar2 != null) {
                        kVar2.a();
                    }
                    if (this.f33045a.f33044b != 0) {
                        View view3 = this.f33045a.f33043a.f33030d;
                        if (view3 instanceof k) {
                            kVar = view3;
                        }
                        k kVar3 = kVar;
                        if (kVar3 != null && (view = kVar3.getView()) != null) {
                            view.postDelayed(new Runnable(this) {
                                /* class com.bytedance.ies.bullet.ui.common.BulletContainerView.b.a.AnonymousClass1 */

                                /* renamed from: a  reason: collision with root package name */
                                final /* synthetic */ a f33046a;

                                static {
                                    Covode.recordClassIndex(19715);
                                }

                                {
                                    this.f33046a = r1;
                                }

                                public final void run() {
                                    View view = this.f33046a.f33045a.f33043a.f33030d;
                                    if (!(view instanceof k)) {
                                        view = null;
                                    }
                                    k kVar = (k) view;
                                    if (kVar != null) {
                                        kVar.b();
                                    }
                                }
                            }, this.f33045a.f33044b);
                        }
                    }
                }
            }
        }

        b(BulletContainerView bulletContainerView, long j2) {
            this.f33043a = bulletContainerView;
            this.f33044b = j2;
        }
    }

    private boolean h() {
        if (this.f33037k.get() == m.LOADING.ordinal()) {
            return true;
        }
        return false;
    }

    public String getReactId() {
        z a2;
        String str;
        com.bytedance.ies.bullet.c.c.i iVar = this.f33028b;
        if (iVar == null || (a2 = iVar.a()) == null || (str = a2.f32074a) == null) {
            return "";
        }
        return str;
    }

    public final void b() {
        Uri uri;
        j.b.a(this, "reLoadUri " + this.p, null, null, 6);
        if (!h() && (uri = this.p) != null) {
            h.b bVar = this.f33027a;
            if (bVar != null) {
                bVar.a(uri);
            }
            g();
            b(uri);
        }
    }

    public final void e() {
        String str;
        if (!this.t) {
            long currentTimeMillis = System.currentTimeMillis() - this.u;
            int i2 = this.f33037k.get();
            if (i2 == m.SUCCESS.ordinal()) {
                str = "success";
            } else if (i2 == m.FAIL.ordinal()) {
                str = "failure";
            } else {
                str = "cancel";
            }
            o oVar = (o) getProviderFactory().c(o.class);
            if (oVar != null) {
                an anVar = new an("bdx_monitor_container_exit", null, null, 254);
                anVar.f32550c = (com.bytedance.ies.bullet.service.base.e.d) getProviderFactory().c(com.bytedance.ies.bullet.service.base.e.d.class);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", str);
                anVar.f32554g = jSONObject;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("stay_duration", currentTimeMillis);
                anVar.f32555h = jSONObject2;
                oVar.a(anVar);
            }
        }
    }

    @Override // com.bytedance.ies.bullet.c.e.a
    public void a() {
        j.b.a(this, "view release", null, null, 6);
        this.f33038l.a();
        getProviderFactory().c(com.bytedance.ies.bullet.c.c.b.class);
        getProviderFactory().a(g.class);
        getProviderFactory().a(com.bytedance.ies.bullet.c.f.a.class);
        getProviderFactory().a(com.bytedance.ies.bullet.c.c.b.class);
        View view = this.f33030d;
        if (view instanceof com.bytedance.ies.bullet.c.e.a) {
            if (view != null) {
                ((com.bytedance.ies.bullet.c.e.a) view).a();
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        View view2 = this.o;
        if (view2 instanceof com.bytedance.ies.bullet.c.e.a) {
            if (view2 != null) {
                ((com.bytedance.ies.bullet.c.e.a) view2).a();
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
        this.f33027a = null;
        this.t = true;
    }

    public final void setAutoReleasableWhenDetached(boolean z) {
        this.f33034h = z;
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.ui.common.c.d<View>, AnonymousClass1> {
        final /* synthetic */ com.bytedance.ies.bullet.c.c.i $instance;
        final /* synthetic */ BulletContainerView this$0;

        static {
            Covode.recordClassIndex(19721);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(BulletContainerView bulletContainerView, com.bytedance.ies.bullet.c.c.i iVar) {
            super(1);
            this.this$0 = bulletContainerView;
            this.$instance = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ AnonymousClass1 invoke(com.bytedance.ies.bullet.ui.common.c.d<View> dVar) {
            final com.bytedance.ies.bullet.ui.common.c.d<View> dVar2 = dVar;
            l.c(dVar2, "");
            return new com.bytedance.ies.bullet.ui.common.c.e<View>(this) {
                /* class com.bytedance.ies.bullet.ui.common.BulletContainerView.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f33047a;

                static {
                    Covode.recordClassIndex(19722);
                }

                {
                    this.f33047a = r1;
                }

                @Override // com.bytedance.ies.bullet.ui.common.c.e
                public final void a(com.bytedance.ies.bullet.ui.common.c.d<View> dVar, Uri uri) {
                    l.c(dVar, "");
                    l.c(uri, "");
                    this.f33047a.this$0.f33029c = false;
                }

                @Override // com.bytedance.ies.bullet.ui.common.c.e
                public final void b(com.bytedance.ies.bullet.ui.common.c.d<View> dVar, Uri uri) {
                    l.c(dVar, "");
                    l.c(uri, "");
                    if (!this.f33047a.this$0.f33029c) {
                        this.f33047a.this$0.f33029c = true;
                        this.f33047a.this$0.a(dVar.f33078a, uri, this.f33047a.$instance);
                        h.b bVar = this.f33047a.this$0.f33027a;
                        if (bVar != null) {
                            bVar.a(dVar.f33078a, uri, this.f33047a.$instance);
                        }
                    }
                    dVar2.b(this);
                }

                @Override // com.bytedance.ies.bullet.ui.common.c.e
                public final void a(com.bytedance.ies.bullet.ui.common.c.d<View> dVar, Uri uri, Throwable th) {
                    l.c(dVar, "");
                    l.c(uri, "");
                    l.c(th, "");
                    if (!this.f33047a.this$0.f33029c) {
                        this.f33047a.this$0.f33029c = true;
                        this.f33047a.this$0.b(uri, th);
                        h.b bVar = this.f33047a.this$0.f33027a;
                        if (bVar != null) {
                            bVar.a(uri, th);
                        }
                    }
                    dVar2.b(this);
                }
            };
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.ui.common.c.d<View>, registerDelegatesForViewComponents.1.1.1> {
        final /* synthetic */ BulletContainerView this$0;

        static {
            Covode.recordClassIndex(19723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(BulletContainerView bulletContainerView) {
            super(1);
            this.this$0 = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ registerDelegatesForViewComponents.1.1.1 invoke(com.bytedance.ies.bullet.ui.common.c.d<View> dVar) {
            final com.bytedance.ies.bullet.ui.common.c.d<View> dVar2 = dVar;
            l.c(dVar2, "");
            return new com.bytedance.ies.bullet.ui.common.c.e<View>(this) {
                /* class com.bytedance.ies.bullet.ui.common.BulletContainerView.i.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ i f33049a;

                static {
                    Covode.recordClassIndex(19724);
                }

                @Override // com.bytedance.ies.bullet.ui.common.c.e
                public final void a(com.bytedance.ies.bullet.ui.common.c.d<View> dVar, Uri uri) {
                    l.c(dVar, "");
                    l.c(uri, "");
                }

                {
                    this.f33049a = r1;
                }

                @Override // com.bytedance.ies.bullet.ui.common.c.e
                public final void b(com.bytedance.ies.bullet.ui.common.c.d<View> dVar, Uri uri) {
                    l.c(dVar, "");
                    l.c(uri, "");
                    h.b bVar = this.f33049a.this$0.f33027a;
                    if (bVar != null) {
                        T t = dVar.f33078a;
                        com.bytedance.ies.bullet.c.c.i iVar = this.f33049a.this$0.f33028b;
                        if (iVar == null) {
                            l.a();
                        }
                        bVar.a(t, uri, iVar);
                    }
                    dVar2.b(this);
                }

                @Override // com.bytedance.ies.bullet.ui.common.c.e
                public final void a(com.bytedance.ies.bullet.ui.common.c.d<View> dVar, Uri uri, Throwable th) {
                    l.c(dVar, "");
                    l.c(uri, "");
                    l.c(th, "");
                    h.b bVar = this.f33049a.this$0.f33027a;
                    if (bVar != null) {
                        bVar.a(uri, th);
                    }
                    dVar2.b(this);
                }
            };
        }
    }

    public final void b(d.b bVar) {
        l.c(bVar, "");
        a(bVar);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h
    public void onEvent(p pVar) {
        l.c(pVar, "");
        com.bytedance.ies.bullet.c.c.i iVar = this.f33028b;
        if (iVar != null) {
            iVar.onEvent(pVar);
        }
    }

    public void setActivityWrapper(g gVar) {
        l.c(gVar, "");
        getProviderFactory().b(g.class, gVar);
    }

    public final void setLoadingDelay(long j2) {
        if (j2 >= 0) {
            this.n = j2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<Throwable, h.z> {
        final /* synthetic */ Uri $uri;
        final /* synthetic */ BulletContainerView this$0;

        static {
            Covode.recordClassIndex(19719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(BulletContainerView bulletContainerView, Uri uri) {
            super(1);
            this.this$0 = bulletContainerView;
            this.$uri = uri;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Throwable th) {
            Throwable th2 = th;
            l.c(th2, "");
            this.this$0.b(this.$uri, th2);
            h.b bVar = this.this$0.f33027a;
            if (bVar != null) {
                bVar.a(this.$uri, th2);
            }
            return h.z.f158842a;
        }
    }

    private final String a(Bundle bundle) {
        String str;
        if (bundle == null || (str = bundle.getString("__x_session_id")) == null || str.length() == 0) {
            str = n.a();
        }
        this.s = str;
        return str;
    }

    public final void setLoadingViewInternal$bullet_ui_common_release(View view) {
        l.c(view, "");
        View view2 = this.f33030d;
        if (view2 != null) {
            removeView(view2);
        }
        view.setVisibility(0);
        addView(view);
        this.f33030d = view;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, h.z> {
        final /* synthetic */ BulletContainerView this$0;

        static {
            Covode.recordClassIndex(19716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(BulletContainerView bulletContainerView) {
            super(1);
            this.this$0 = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            MethodCollector.i(12508);
            l.c(bVar, "");
            if (this.this$0.f() == null) {
                j.b.a(this.this$0, "Remove views failed: bullet_container is null", com.bytedance.ies.bullet.service.base.a.p.E, null, 4);
            } else {
                FrameLayout frameLayout = (FrameLayout) this.this$0.f();
                l.a((Object) frameLayout, "");
                if (frameLayout.getChildCount() != 0) {
                    ((FrameLayout) this.this$0.f()).removeAllViews();
                }
            }
            h.z zVar = h.z.f158842a;
            MethodCollector.o(12508);
            return zVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.ui.common.c.d<? extends View>, h.z> {
        final /* synthetic */ BulletContainerView this$0;

        static {
            Covode.recordClassIndex(19717);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BulletContainerView bulletContainerView) {
            super(1);
            this.this$0 = bulletContainerView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.ies.bullet.ui.common.c.d<? extends View> dVar) {
            MethodCollector.i(10467);
            com.bytedance.ies.bullet.ui.common.c.d<? extends View> dVar2 = dVar;
            l.c(dVar2, "");
            if (this.this$0.f() == null) {
                j.b.a(this.this$0, "Add view failed: bullet_container is null", com.bytedance.ies.bullet.service.base.a.p.E, null, 4);
            } else {
                ((FrameLayout) this.this$0.f()).addView(dVar2.f33078a, dVar2.f33079b);
            }
            h.z zVar = h.z.f158842a;
            MethodCollector.o(10467);
            return zVar;
        }
    }

    private final void b(Uri uri) {
        String str;
        Long a2;
        com.bytedance.ies.bullet.service.a.e<String, Object> b2;
        String str2 = this.s;
        if (str2 == null || (b2 = e.a.a().b(str2)) == null) {
            str = null;
        } else {
            str = b2.getString("__x_monitor_router_open_start_time");
        }
        this.u = System.currentTimeMillis();
        if (!(str == null || (a2 = com.bytedance.ies.bullet.service.base.e.c.a(str)) == null)) {
            this.u = a2.longValue();
        }
        l.c(uri, "");
        n<l> nVar = f.f33110a;
        l lVar = new l(uri, System.currentTimeMillis());
        if (nVar.f33115a.size() >= nVar.f33116b) {
            nVar.f33115a.pop();
        }
        nVar.f33115a.add(lVar);
        com.bytedance.ies.bullet.c.e.a.b bVar = new com.bytedance.ies.bullet.c.e.a.b();
        com.bytedance.ies.bullet.c.i iVar = new com.bytedance.ies.bullet.c.i();
        iVar.f32089a = this.s;
        iVar.f32090b = Long.valueOf(this.u);
        bVar.b(com.bytedance.ies.bullet.c.i.class, iVar);
        j.b.a(this, "loadUri: ".concat(String.valueOf(uri)), null, null, 6);
        this.f33037k.getAndSet(m.LOADING.ordinal());
        this.f33038l.a(uri, bVar, new c(this), new d(this), new e(this, uri), new f(this, uri));
    }

    @Override // com.bytedance.ies.bullet.c.c.k
    public final <T extends com.bytedance.ies.bullet.c.c.d<?, ?, ?, ?>> com.bytedance.ies.bullet.c.c.i a(Class<? extends T> cls) {
        l.c(cls, "");
        return this.f33038l.a(cls);
    }

    @Override // com.bytedance.ies.bullet.c.c.k
    public final com.bytedance.ies.bullet.c.c.i a(String str) {
        l.c(str, "");
        return this.f33038l.a(str);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri) {
        l.c(uri, "");
        j.b.a(this, "view onLoadStart", null, null, 6);
        String queryParameter = uri.getQueryParameter("url");
        long j2 = 0;
        boolean z = true;
        if (queryParameter != null) {
            try {
                Uri parse = Uri.parse(queryParameter);
                if (parse != null) {
                    z = parse.getBooleanQueryParameter("show_loading", true);
                    String queryParameter2 = parse.getQueryParameter("loading_duration");
                    if (queryParameter2 != null) {
                        j2 = Long.parseLong(queryParameter2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        this.f33033g = false;
        a(z, j2);
    }

    public final void b(Uri uri, Throwable th) {
        a(uri, th);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        j.b.a(this, th, str);
    }

    public final void b(View view, FrameLayout.LayoutParams layoutParams) {
        l.c(view, "");
        View view2 = this.o;
        if (view2 != null) {
            removeView(view2);
        }
        view.setLayoutParams(layoutParams);
        view.setVisibility(8);
        addView(view);
        this.o = view;
    }

    private static void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, h.f.a.b<? super com.bytedance.ies.bullet.ui.common.c.d<View>, ? extends com.bytedance.ies.bullet.ui.common.c.e<View>> bVar) {
        for (T t2 : list) {
            if (t2 != null) {
                t2.a((com.bytedance.ies.bullet.ui.common.c.e) bVar.invoke(t2));
            } else {
                throw new w("null cannot be cast to non-null type");
            }
        }
    }

    private final void a(boolean z, long j2) {
        if (this.f33031e == null && z && !this.f33029c) {
            this.f33031e = new Timer();
            TimerTask timerTask = this.f33032f;
            if (timerTask != null) {
                timerTask.cancel();
            }
            b bVar = new b(this, j2);
            this.f33032f = bVar;
            Timer timer = this.f33031e;
            if (timer != null) {
                timer.schedule(bVar, this.n);
            }
        }
    }

    private final void a(boolean z, Throwable th) {
        Boolean bool;
        boolean z2;
        String str;
        String str2;
        String str3;
        com.bytedance.ies.bullet.c.c.c cVar;
        com.bytedance.ies.bullet.c.i iVar = (com.bytedance.ies.bullet.c.i) getProviderFactory().c(com.bytedance.ies.bullet.c.i.class);
        if (iVar != null) {
            bool = Boolean.valueOf(iVar.a());
        } else {
            bool = null;
        }
        boolean z3 = true;
        if (bool == null || !bool.booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        com.bytedance.ies.bullet.c.i iVar2 = (com.bytedance.ies.bullet.c.i) getProviderFactory().c(com.bytedance.ies.bullet.c.i.class);
        if (iVar2 == null || (cVar = iVar2.f32091c) == null) {
            str = null;
        } else {
            str = cVar.f32043c;
        }
        if (z) {
            str2 = "success";
        } else {
            str2 = "failure";
        }
        com.bytedance.ies.bullet.c.i iVar3 = (com.bytedance.ies.bullet.c.i) getProviderFactory().c(com.bytedance.ies.bullet.c.i.class);
        if (iVar3 == null || (str3 = iVar3.f32096h) == null) {
            if (th != null) {
                str3 = th.getMessage();
            } else {
                str3 = null;
            }
        }
        o oVar = (o) getProviderFactory().c(o.class);
        if (oVar != null) {
            an anVar = new an("bdx_monitor_container_load_url", null, null, 254);
            anVar.f32550c = (com.bytedance.ies.bullet.service.base.e.d) getProviderFactory().c(com.bytedance.ies.bullet.service.base.e.d.class);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", str2);
            jSONObject.put("fail_reason", str3);
            jSONObject.put("fallback", z2);
            if (this.o == null) {
                z3 = false;
            }
            jSONObject.put("has_error_view", String.valueOf(z3));
            jSONObject.put("fallback_reason", str);
            anVar.f32554g = jSONObject;
            oVar.a(anVar);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public void printLog(String str, com.bytedance.ies.bullet.service.base.a.p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        j.b.a(this, str, pVar, str2);
    }

    private final void b(Uri uri, Bundle bundle, h.b bVar) {
        a(uri);
        this.p = uri;
        this.f33027a = bVar;
        if (bVar != null) {
            bVar.a(uri);
        }
        getProviderFactory().b(com.bytedance.ies.bullet.c.f.a.class, new a(this, bundle));
        y yVar = (y) e.a.a().a(this.r, y.class);
        if (yVar != null) {
            yVar.b(uri);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BulletContainerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        l.c(context, "");
        MethodCollector.i(11220);
        this.f33038l = new e(context);
        this.n = 500;
        this.r = "default_bid";
        try {
            h.q.m223constructorimpl(LayoutInflater.from(context).inflate(R.layout.m4, this));
        } catch (Throwable th) {
            h.q.m223constructorimpl(r.a(th));
        }
        this.f33037k = new AtomicInteger(m.INIT.ordinal());
        this.u = System.currentTimeMillis();
        this.v = h.i.a((h.f.a.a) new g(this));
        MethodCollector.o(11220);
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.q<com.bytedance.ies.bullet.c.c.i, List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>>, Boolean, h.z> {
        final /* synthetic */ Uri $uri;
        final /* synthetic */ BulletContainerView this$0;

        static {
            Covode.recordClassIndex(19718);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(BulletContainerView bulletContainerView, Uri uri) {
            super(3);
            this.this$0 = bulletContainerView;
            this.$uri = uri;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
            if (r2 != null) goto L_0x0094;
         */
        @Override // h.f.a.q
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.ies.bullet.c.c.i r10, java.util.List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends android.view.View>> r11, java.lang.Boolean r12) {
            /*
            // Method dump skipped, instructions count: 259
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.ui.common.BulletContainerView.e.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BulletContainerView(Context context, AttributeSet attributeSet, int i2, byte b2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }
}
