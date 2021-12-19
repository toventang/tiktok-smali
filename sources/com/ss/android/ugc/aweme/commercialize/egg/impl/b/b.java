package com.ss.android.ugc.aweme.commercialize.egg.impl.b;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.e.q;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.j.f;
import com.ss.android.ugc.aweme.commercialize.egg.a;
import h.f.b.l;

public final class b extends a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f73990i = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public SimpleDraweeView f73991f;

    /* renamed from: g  reason: collision with root package name */
    public long f73992g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f73993h;

    /* renamed from: j  reason: collision with root package name */
    private final Handler f73994j = new Handler();

    static {
        Covode.recordClassIndex(45567);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45568);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f74003a;

        static {
            Covode.recordClassIndex(45573);
        }

        e(b bVar) {
            this.f74003a = bVar;
        }

        public final void run() {
            this.f74003a.e();
        }
    }

    public final void e() {
        this.f73993h = false;
        this.f73988e.setVisibility(8);
        SimpleDraweeView simpleDraweeView = this.f73991f;
        if (simpleDraweeView != null) {
            simpleDraweeView.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.impl.b.a
    public final void c() {
        MethodCollector.i(9002);
        this.f73993h = false;
        this.f73986c = null;
        this.f73994j.removeCallbacksAndMessages(null);
        e();
        if (this.f73991f != null) {
            this.f73988e.removeView(this.f73991f);
            this.f73991f = null;
        }
        MethodCollector.o(9002);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.impl.b.a
    public final void b() {
        com.facebook.drawee.h.a controller;
        Animatable i2;
        MethodCollector.i(9001);
        if (this.f73993h) {
            MethodCollector.o(9001);
            return;
        }
        com.ss.android.ugc.aweme.commercialize.egg.d.a aVar = this.f73985b;
        if (aVar == null) {
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar2 = this.f73986c;
            if (aVar2 != null) {
                aVar2.b();
                MethodCollector.o(9001);
                return;
            }
            MethodCollector.o(9001);
            return;
        }
        String str = aVar.f73933a;
        if (str == null || str.length() == 0) {
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar3 = this.f73986c;
            if (aVar3 != null) {
                aVar3.b();
            }
            a("materialUrl is null");
            MethodCollector.o(9001);
            return;
        }
        boolean z = aVar.f73939g;
        boolean a2 = com.ss.android.ugc.aweme.base.e.a(Uri.parse(str));
        if (!z || a2) {
            Context context = this.f73984a;
            if (this.f73991f == null) {
                SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
                simpleDraweeView.setHierarchy(new com.facebook.drawee.f.b(context.getResources()).a(q.b.f47438d).a());
                this.f73991f = simpleDraweeView;
                this.f73988e.addView(this.f73991f);
            }
            SimpleDraweeView simpleDraweeView2 = this.f73991f;
            if (simpleDraweeView2 != null) {
                com.ss.android.ugc.aweme.commercialize.egg.a.a aVar4 = this.f73986c;
                if (aVar4 != null) {
                    aVar4.b(simpleDraweeView2, this.f73988e);
                }
                com.facebook.drawee.a.a.e a3 = com.facebook.drawee.a.a.c.b().a(str);
                a3.f47319g = new C1666b(this);
                a3.f47322j = true;
                simpleDraweeView2.setController(a3.e());
                com.ss.android.ugc.aweme.commercialize.egg.a.a aVar5 = this.f73986c;
                if (aVar5 != null) {
                    if (aVar5.c()) {
                        simpleDraweeView2.setOnClickListener(new c(aVar5, simpleDraweeView2, this, str));
                    } else {
                        simpleDraweeView2.setOnClickListener(null);
                        simpleDraweeView2.setClickable(false);
                    }
                }
            }
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar6 = this.f73986c;
            if (aVar6 != null) {
                if (aVar6.d()) {
                    this.f73988e.setOnClickListener(new d(aVar6, this));
                } else {
                    this.f73988e.setOnClickListener(null);
                    this.f73988e.setClickable(false);
                }
            }
            this.f73988e.setVisibility(0);
            SimpleDraweeView simpleDraweeView3 = this.f73991f;
            if (simpleDraweeView3 != null) {
                simpleDraweeView3.setVisibility(0);
            }
            SimpleDraweeView simpleDraweeView4 = this.f73991f;
            if (simpleDraweeView4 != null) {
                simpleDraweeView4.bringToFront();
                String str2 = aVar.f73934b;
                if (l.a((Object) str2, (Object) a.C1661a.f73925c) || l.a((Object) str2, (Object) a.C1661a.f73926d)) {
                    SimpleDraweeView simpleDraweeView5 = this.f73991f;
                    if (!(simpleDraweeView5 == null || (controller = simpleDraweeView5.getController()) == null || (i2 = controller.i()) == null || i2.isRunning())) {
                        i2.start();
                    }
                    if (a()) {
                        a(5000);
                    }
                } else {
                    this.f73993h = true;
                    a(3000);
                }
                this.f73992g = System.currentTimeMillis();
                MethodCollector.o(9001);
                return;
            }
            this.f73993h = false;
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar7 = this.f73986c;
            if (aVar7 != null) {
                aVar7.b();
                MethodCollector.o(9001);
                return;
            }
            MethodCollector.o(9001);
            return;
        }
        this.f73993h = false;
        com.ss.android.ugc.aweme.commercialize.egg.a.a aVar8 = this.f73986c;
        if (aVar8 != null) {
            aVar8.b();
        }
        a("preload failed");
        MethodCollector.o(9001);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.b$b  reason: collision with other inner class name */
    public static final class C1666b extends com.facebook.drawee.c.c<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f73995a;

        static {
            Covode.recordClassIndex(45569);
        }

        /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.b$b$a */
        public static final class a implements com.facebook.fresco.animation.c.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1666b f73996a;

            static {
                Covode.recordClassIndex(45570);
            }

            @Override // com.facebook.fresco.animation.c.b
            public final void a(com.facebook.fresco.animation.c.a aVar) {
                l.d(aVar, "");
            }

            @Override // com.facebook.fresco.animation.c.b
            public final void a(com.facebook.fresco.animation.c.a aVar, int i2) {
                l.d(aVar, "");
            }

            @Override // com.facebook.fresco.animation.c.b
            public final void c(com.facebook.fresco.animation.c.a aVar) {
                l.d(aVar, "");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(C1666b bVar) {
                this.f73996a = bVar;
            }

            @Override // com.facebook.fresco.animation.c.b
            public final void b(com.facebook.fresco.animation.c.a aVar) {
                l.d(aVar, "");
                this.f73996a.f73995a.e();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1666b(b bVar) {
            this.f73995a = bVar;
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFailure(String str, Throwable th) {
            String str2;
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar = this.f73995a.f73986c;
            if (aVar != null) {
                aVar.b();
            }
            b bVar = this.f73995a;
            if (th != null) {
                str2 = th.getMessage();
            } else {
                str2 = null;
            }
            bVar.a(false, str2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, f fVar, Animatable animatable) {
            try {
                this.f73995a.f73993h = true;
                com.ss.android.ugc.aweme.commercialize.egg.a.a aVar = this.f73995a.f73986c;
                if (aVar != null) {
                    aVar.a();
                }
                this.f73995a.a(true, null);
                if (animatable != null && (animatable instanceof com.facebook.fresco.animation.c.a)) {
                    com.facebook.fresco.animation.c.a aVar2 = (com.facebook.fresco.animation.c.a) animatable;
                    aVar2.a(new com.ss.android.ugc.aweme.commercialize.g.d(aVar2.f47564d, ((Number) this.f73995a.f73987d.getValue()).intValue()));
                    aVar2.a(new a(this));
                    animatable.start();
                }
            } catch (Throwable th) {
                com.ss.android.ugc.aweme.framework.a.a.a(3, null, "frescoOpenGifSplashError: e = ".concat(String.valueOf(th)));
                com.ss.android.ugc.aweme.framework.a.a.a(th);
                this.f73995a.a(false, th.getMessage());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(FrameLayout frameLayout) {
        super(frameLayout);
        l.d(frameLayout, "");
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.egg.a.a f73997a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SimpleDraweeView f73998b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f73999c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f74000d;

        static {
            Covode.recordClassIndex(45571);
        }

        c(com.ss.android.ugc.aweme.commercialize.egg.a.a aVar, SimpleDraweeView simpleDraweeView, b bVar, String str) {
            this.f73997a = aVar;
            this.f73998b = simpleDraweeView;
            this.f73999c = bVar;
            this.f74000d = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar = this.f73997a;
            l.b(view, "");
            aVar.a(view, (int) (System.currentTimeMillis() - this.f73999c.f73992g));
            this.f73999c.e();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.commercialize.egg.a.a f74001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f74002b;

        static {
            Covode.recordClassIndex(45572);
        }

        d(com.ss.android.ugc.aweme.commercialize.egg.a.a aVar, b bVar) {
            this.f74001a = aVar;
            this.f74002b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.commercialize.egg.a.a aVar = this.f74001a;
            SimpleDraweeView simpleDraweeView = this.f74002b.f73991f;
            l.b(view, "");
            aVar.a(simpleDraweeView, view);
        }
    }

    private final void a(long j2) {
        this.f73994j.removeCallbacksAndMessages(null);
        this.f73994j.postDelayed(new e(this), j2);
    }
}
