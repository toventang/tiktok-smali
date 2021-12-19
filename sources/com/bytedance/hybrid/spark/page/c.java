package com.bytedance.hybrid.spark.page;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.a.g;
import com.bytedance.lynx.hybrid.a.f;
import com.bytedance.lynx.hybrid.a.h;
import com.bytedance.lynx.hybrid.c;
import com.bytedance.lynx.hybrid.d;
import com.bytedance.lynx.hybrid.j;
import com.bytedance.lynx.hybrid.webkit.e;
import com.lynx.tasm.LynxEnv;
import com.zhiliaoapp.musically.R;
import h.f.b.ad;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import h.n;
import h.q;
import h.r;
import h.w;
import java.util.Map;

public final class c extends FrameLayout implements g {

    /* renamed from: l  reason: collision with root package name */
    public static final a f31237l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public h f31238a;

    /* renamed from: b  reason: collision with root package name */
    public SparkContext f31239b;

    /* renamed from: c  reason: collision with root package name */
    public View f31240c;

    /* renamed from: d  reason: collision with root package name */
    public View f31241d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.hybrid.spark.a.c f31242e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.hybrid.spark.a.h f31243f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.lynx.a.a.b.c f31244g;

    /* renamed from: h  reason: collision with root package name */
    public Integer f31245h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f31246i;

    /* renamed from: j  reason: collision with root package name */
    public FrameLayout f31247j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f31248k;

    /* renamed from: m  reason: collision with root package name */
    private TextView f31249m;

    static {
        Covode.recordClassIndex(18128);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18129);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.hybrid.spark.a.g
    public final void b() {
        c();
    }

    public final h getKitView() {
        return this.f31238a;
    }

    public final SparkContext getSparkContext() {
        return this.f31239b;
    }

    public final String getUrl() {
        SparkContext sparkContext = this.f31239b;
        if (sparkContext != null) {
            return sparkContext.f31050a;
        }
        return null;
    }

    /* renamed from: com.bytedance.hybrid.spark.page.c$c  reason: collision with other inner class name */
    public static final class C0661c extends f {

        /* renamed from: a  reason: collision with root package name */
        public boolean f31253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f31254b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SparkContext f31255c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lynx.hybrid.h.c f31256d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f31257e;

        static {
            Covode.recordClassIndex(18131);
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a() {
            super.a();
            com.bytedance.hybrid.spark.e.c.a("SparkView", "onPreKitCreate", this.f31255c);
            com.bytedance.hybrid.spark.a.c cVar = this.f31254b.f31242e;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void b() {
            super.b();
            com.bytedance.hybrid.spark.e.c.a("SparkView", "onPostKitCreated", this.f31255c);
            com.bytedance.hybrid.spark.a.c cVar = this.f31254b.f31242e;
            if (cVar != null) {
                cVar.b();
            }
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void c() {
            super.c();
            com.bytedance.hybrid.spark.e.c.a("SparkView", "onDestroy", this.f31255c);
            com.bytedance.hybrid.spark.a.c cVar = this.f31254b.f31242e;
            if (cVar != null) {
                cVar.c();
            }
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a(h hVar) {
            MethodCollector.i(6432);
            l.c(hVar, "");
            super.a(hVar);
            com.bytedance.hybrid.spark.e.c.a("SparkView", "onLoadFinish", this.f31255c);
            com.bytedance.lynx.hybrid.j.f.a(this.f31255c.f40979f, "container_init_end", System.currentTimeMillis());
            this.f31254b.a((com.bytedance.lynx.hybrid.service.c.b) this.f31257e.element);
            if (!this.f31253a) {
                this.f31254b.f31247j.removeAllViews();
                this.f31254b.f31247j.setVisibility(8);
            }
            com.bytedance.hybrid.spark.a.c cVar = this.f31254b.f31242e;
            if (cVar != null) {
                cVar.a(hVar);
            }
            this.f31254b.f31248k = false;
            this.f31253a = false;
            MethodCollector.o(6432);
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a(h hVar, String str) {
            MethodCollector.i(6411);
            l.c(hVar, "");
            l.c(str, "");
            this.f31254b.f31242e = (com.bytedance.hybrid.spark.a.c) this.f31255c.a(com.bytedance.hybrid.spark.a.c.class);
            c cVar = this.f31254b;
            cVar.f31243f = cVar.getStatusViewProvider();
            super.a(hVar, str);
            com.bytedance.hybrid.spark.e.c.a("SparkView", "onLoadStart url:".concat(String.valueOf(str)), this.f31255c);
            this.f31253a = false;
            com.bytedance.lynx.a.a.b.c cVar2 = this.f31254b.f31244g;
            if (cVar2 == null || cVar2.getContainerBgColor() == null) {
                if (hVar.a() instanceof e) {
                    hVar.a().setBackgroundColor(0);
                } else {
                    hVar.a().setBackgroundColor(-1);
                }
            }
            com.bytedance.hybrid.spark.a.c cVar3 = this.f31254b.f31242e;
            if (cVar3 != null) {
                cVar3.a(hVar, str);
            }
            com.bytedance.hybrid.spark.a.h hVar2 = this.f31254b.f31243f;
            if (hVar2 != null) {
                Context context = this.f31254b.getContext();
                l.a((Object) context, "");
                hVar2.a(context);
                this.f31254b.f31247j.removeAllViews();
                this.f31254b.f31247j.setVisibility(8);
                if (!this.f31254b.f31246i) {
                    this.f31254b.f31240c = hVar2.a();
                    View view = this.f31254b.f31240c;
                    if (view != null) {
                        this.f31254b.f31247j.addView(view);
                        this.f31254b.f31247j.setVisibility(0);
                        Integer num = this.f31254b.f31245h;
                        if (num != null) {
                            view.setBackgroundColor(num.intValue());
                            MethodCollector.o(6411);
                            return;
                        }
                        MethodCollector.o(6411);
                        return;
                    }
                }
                MethodCollector.o(6411);
                return;
            }
            MethodCollector.o(6411);
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void b(h hVar, String str) {
            String str2;
            MethodCollector.i(6454);
            l.c(hVar, "");
            l.c(str, "");
            super.b(hVar, str);
            this.f31253a = true;
            String concat = "onLoadFailed url:".concat(String.valueOf(str));
            SparkContext sparkContext = this.f31255c;
            l.c("SparkView", "");
            l.c(concat, "");
            com.bytedance.hybrid.spark.e.c.a(com.bytedance.lynx.hybrid.j.b.E, "SparkView", concat, sparkContext);
            if (this.f31257e.element == com.bytedance.lynx.hybrid.service.c.b.LYNX) {
                com.bytedance.lynx.a.a.b.c cVar = this.f31254b.f31244g;
                if (cVar != null) {
                    str2 = cVar.getFallbackUrl();
                } else {
                    str2 = null;
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.f31254b.f31248k = true;
                    String concat2 = "DowngradeWebView url:".concat(String.valueOf(str));
                    SparkContext sparkContext2 = this.f31255c;
                    l.c("SparkView", "");
                    l.c(concat2, "");
                    com.bytedance.hybrid.spark.e.c.a(com.bytedance.lynx.hybrid.j.b.W, "SparkView", concat2, sparkContext2);
                    this.f31254b.b(this.f31255c);
                    this.f31254b.c();
                    MethodCollector.o(6454);
                    return;
                }
            }
            com.bytedance.hybrid.spark.a.c cVar2 = this.f31254b.f31242e;
            if (cVar2 != null) {
                cVar2.b(hVar, str);
            }
            com.bytedance.hybrid.spark.a.h hVar2 = this.f31254b.f31243f;
            if (hVar2 != null) {
                c cVar3 = this.f31254b;
                cVar3.f31241d = hVar2.a(cVar3);
                View view = this.f31254b.f31241d;
                if (view != null) {
                    this.f31254b.f31247j.removeAllViews();
                    this.f31254b.f31247j.addView(view);
                    this.f31254b.f31247j.setVisibility(0);
                    MethodCollector.o(6454);
                    return;
                }
                MethodCollector.o(6454);
                return;
            }
            MethodCollector.o(6454);
        }

        C0661c(c cVar, SparkContext sparkContext, com.bytedance.lynx.hybrid.h.c cVar2, z.e eVar) {
            this.f31254b = cVar;
            this.f31255c = sparkContext;
            this.f31256d = cVar2;
            this.f31257e = eVar;
        }
    }

    private final void f() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt instanceof h) {
                removeView(childAt);
            }
        }
    }

    public final void e() {
        String str;
        SparkContext sparkContext = this.f31239b;
        if (!(sparkContext == null || (str = sparkContext.f40979f) == null)) {
            SparkContext.f31048d.remove(str);
        }
        h hVar = this.f31238a;
        if (hVar != null) {
            hVar.destroy();
        }
    }

    public final com.bytedance.hybrid.spark.a.h getStatusViewProvider() {
        com.bytedance.hybrid.spark.a.h hVar;
        SparkContext sparkContext = this.f31239b;
        com.bytedance.hybrid.spark.a.h hVar2 = null;
        if (sparkContext != null && (hVar = (com.bytedance.hybrid.spark.a.h) sparkContext.a(com.bytedance.hybrid.spark.a.h.class)) != null) {
            return hVar;
        }
        com.bytedance.hybrid.spark.b bVar = com.bytedance.hybrid.spark.d.f31109a;
        if (bVar != null) {
            hVar2 = bVar.b();
        }
        return hVar2;
    }

    public final void a() {
        Object obj;
        com.bytedance.lynx.hybrid.h.c cVar;
        long currentTimeMillis = System.currentTimeMillis();
        SparkContext sparkContext = this.f31239b;
        Map map = null;
        if (sparkContext == null || (cVar = sparkContext.f40982i) == null) {
            obj = null;
        } else {
            obj = cVar.get((Object) "queryItems");
        }
        if (ad.g(obj)) {
            map = obj;
        }
        Map map2 = map;
        if (map2 != null) {
            map2.put("containerInitTime", String.valueOf(currentTimeMillis));
        }
    }

    public final void c() {
        com.bytedance.hybrid.spark.e.c.a("SparkView", "loadUrl", this.f31239b);
        a();
        h hVar = this.f31238a;
        if (hVar != null) {
            hVar.b();
        }
    }

    public final boolean d() {
        e eVar;
        com.bytedance.hybrid.spark.e.c.a("SparkView", "goBack", this.f31239b);
        h hVar = this.f31238a;
        if (hVar == null || !(hVar instanceof e) || (eVar = (e) hVar) == null || !eVar.canGoBack()) {
            return false;
        }
        eVar.goBack();
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.hybrid.spark.a.a f31258a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f31259b;

        static {
            Covode.recordClassIndex(18132);
        }

        d(com.bytedance.hybrid.spark.a.a aVar, c cVar) {
            this.f31258a = aVar;
            this.f31259b = cVar;
        }

        public final void onClick(View view) {
            l.a((Object) view, "");
        }
    }

    public final void a(SparkContext sparkContext) {
        l.c(sparkContext, "");
        b(sparkContext);
        this.f31248k = false;
    }

    public static void c(SparkContext sparkContext) {
        com.bytedance.lynx.hybrid.j.f.a(sparkContext.f40979f, "container_init_start", System.currentTimeMillis());
        com.bytedance.lynx.hybrid.j.f.a(sparkContext.f40979f, "container_name", "Spark");
        com.bytedance.lynx.hybrid.j.f.a(sparkContext.f40979f, "schema", sparkContext.f31050a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.c(context, "");
        MethodCollector.i(4232);
        LayoutInflater.from(context).inflate(R.layout.b1_, this);
        View findViewById = findViewById(R.id.e_a);
        l.a((Object) findViewById, "");
        this.f31247j = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.aim);
        l.a((Object) findViewById2, "");
        this.f31249m = (TextView) findViewById2;
        MethodCollector.o(4232);
    }

    private final void a(com.bytedance.lynx.a.a.b.c cVar) {
        boolean z;
        Object obj;
        h hVar;
        if (cVar != null) {
            com.bytedance.lynx.a.a.e.a containerBgColor = cVar.getContainerBgColor();
            if (!(containerBgColor == null || (hVar = this.f31238a) == null)) {
                hVar.a().setBackgroundColor(containerBgColor.getColor(getContext()));
            }
            com.bytedance.lynx.a.a.e.a loadingBgColor = cVar.getLoadingBgColor();
            if (loadingBgColor != null) {
                this.f31245h = Integer.valueOf(loadingBgColor.getColor(getContext()));
            }
            z = cVar.getHideLoading();
        } else {
            z = false;
        }
        this.f31246i = z;
        if (cVar != null) {
            Boolean valueOf = Boolean.valueOf(cVar.getDisableHardwareAccelerate());
            if (valueOf.booleanValue()) {
                try {
                    valueOf.booleanValue();
                    h hVar2 = this.f31238a;
                    if (hVar2 != null) {
                        hVar2.a().setLayerType(1, null);
                    }
                    com.bytedance.hybrid.spark.e.c.a("SparkView", "hardware accelerate disabled", this.f31239b);
                    obj = q.m223constructorimpl(h.z.f158842a);
                } catch (Throwable th) {
                    obj = q.m223constructorimpl(r.a(th));
                }
                q.m222boximpl(obj);
            }
        }
    }

    public final void a(com.bytedance.lynx.hybrid.service.c.b bVar) {
        int i2;
        String str;
        com.bytedance.hybrid.spark.a.a a2;
        TextView textView = this.f31249m;
        if (c.a.a().f40901a) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        if (c.a.a().f40901a) {
            int i3 = d.f31263d[bVar.ordinal()];
            if (i3 == 1) {
                str = "lynxview";
            } else if (i3 == 2) {
                str = "webview";
            } else if (i3 == 3) {
                str = "unknown";
            } else {
                throw new n();
            }
            int i4 = d.f31264e[bVar.ordinal()];
            String str2 = "";
            if (i4 == 1) {
                StringBuilder sb = new StringBuilder("(");
                l.a((Object) LynxEnv.b(), str2);
                str2 = sb.append("2.1.5-rc.33-cxxshared)").toString();
            } else if (!(i4 == 2 || i4 == 3)) {
                throw new n();
            }
            this.f31249m.setText("Spark - " + str + str2);
            com.bytedance.hybrid.spark.a aVar = com.bytedance.hybrid.spark.d.f31110b;
            if (aVar != null && (a2 = aVar.a()) != null) {
                this.f31249m.setOnClickListener(new d(a2, this));
            }
        }
    }

    public final void b(SparkContext sparkContext) {
        com.bytedance.lynx.hybrid.webkit.d dVar;
        com.bytedance.lynx.hybrid.a.c cVar;
        j jVar;
        com.bytedance.lynx.hybrid.webkit.d dVar2;
        this.f31239b = sparkContext;
        String str = sparkContext.f40979f;
        if (str != null) {
            SparkContext.f31048d.put(str, sparkContext);
        }
        String str2 = sparkContext.f31050a;
        com.bytedance.hybrid.spark.e.c.a("SparkView", "prepareInner start, url:".concat(String.valueOf(str2)), sparkContext);
        if (!TextUtils.isEmpty(str2)) {
            c(sparkContext);
            this.f31238a = null;
            f();
            this.f31242e = (com.bytedance.hybrid.spark.a.c) sparkContext.a(com.bytedance.hybrid.spark.a.c.class);
            this.f31243f = getStatusViewProvider();
            z.e eVar = new z.e();
            Uri parse = Uri.parse(str2);
            l.a((Object) parse, "");
            eVar.element = (T) d.a.a(parse);
            if (this.f31248k) {
                eVar.element = (T) com.bytedance.lynx.hybrid.service.c.b.WEB;
            }
            int i2 = d.f31260a[eVar.element.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    com.bytedance.lynx.hybrid.j.f.a(sparkContext.f40979f, new com.bytedance.android.monitorV2.k.b("SparkView init failed, not support engine. schema = " + sparkContext.f31050a));
                    com.bytedance.hybrid.spark.e.c.a("SparkView", "HybridKit Init do nothing type:" + ((Object) eVar.element), sparkContext);
                } else if (!com.bytedance.lynx.hybrid.d.f40921d.get()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    d.a.b();
                    com.bytedance.hybrid.spark.e.c.a("SparkView", "HybridKit Init Web Finish by Spark, cost: " + (System.currentTimeMillis() - currentTimeMillis) + "ms", sparkContext);
                }
            } else if (!com.bytedance.lynx.hybrid.h.f40974a) {
                long currentTimeMillis2 = System.currentTimeMillis();
                d.a.a();
                com.bytedance.hybrid.spark.e.c.a("SparkView", "HybridKit Init Lynx Finish by Spark, cost: " + (System.currentTimeMillis() - currentTimeMillis2) + "ms", sparkContext);
            }
            com.bytedance.lynx.hybrid.h.c cVar2 = sparkContext.f31052c;
            Context context = getContext();
            l.a((Object) context, "");
            int c2 = com.bytedance.lynx.hybrid.i.b.c(context);
            com.bytedance.lynx.a.a.b.c b2 = sparkContext.b();
            this.f31244g = b2;
            if (b2 != null) {
                Map<String, String> a2 = com.bytedance.lynx.a.a.d.a.a(b2);
                cVar2.put((Object) "queryItems", (Object) a2);
                if (a2.containsKey("ab_params")) {
                    cVar2.put((Object) "abParams", (Object) String.valueOf(a2.get("ab_params")));
                }
            }
            Context context2 = getContext();
            l.a((Object) context2, "");
            cVar2.put((Object) "statusBarHeight", (Object) Integer.valueOf(com.bytedance.lynx.hybrid.i.b.a((double) c2, context2)));
            Context context3 = getContext();
            if (context3 != null) {
                Context context4 = getContext();
                l.a((Object) context4, "");
                cVar2.put((Object) "safeAreaHeight", (Object) Integer.valueOf(com.bytedance.lynx.hybrid.i.b.a((double) com.bytedance.lynx.hybrid.i.b.a(c2, (Activity) context3), context4)));
                com.bytedance.hybrid.spark.e.c.a("SparkView", "prepareInner  GlobalProps:".concat(String.valueOf(cVar2)), sparkContext);
                com.bytedance.hybrid.spark.a.b bVar = (com.bytedance.hybrid.spark.a.b) sparkContext.a(com.bytedance.hybrid.spark.a.b.class);
                com.bytedance.hybrid.spark.a.j jVar2 = (com.bytedance.hybrid.spark.a.j) sparkContext.a(com.bytedance.hybrid.spark.a.j.class);
                int i3 = d.f31261b[eVar.element.ordinal()];
                if (i3 == 1) {
                    if (sparkContext.f40981h instanceof j) {
                        com.bytedance.lynx.hybrid.f fVar = sparkContext.f40981h;
                        if (fVar != null) {
                            jVar = (j) fVar;
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    } else {
                        jVar = new j(Uri.parse(str2), (byte) 0);
                    }
                    if (bVar != null) {
                        bVar.a(jVar);
                    }
                    jVar.a(cVar2);
                    dVar = jVar;
                } else if (i3 != 2) {
                    com.bytedance.hybrid.spark.e.c.a("SparkView", "hybridParams transform do nothing type:" + ((Object) eVar.element), sparkContext);
                    return;
                } else {
                    if (sparkContext.f40981h instanceof com.bytedance.lynx.hybrid.webkit.d) {
                        com.bytedance.lynx.hybrid.f fVar2 = sparkContext.f40981h;
                        if (fVar2 != null) {
                            dVar2 = (com.bytedance.lynx.hybrid.webkit.d) fVar2;
                        } else {
                            throw new w("null cannot be cast to non-null type");
                        }
                    } else {
                        dVar2 = new com.bytedance.lynx.hybrid.webkit.d(Uri.parse(str2));
                    }
                    if (bVar != null) {
                        bVar.a(dVar2);
                    }
                    dVar2.a(cVar2);
                    dVar2.f41290b = new b(bVar, cVar2, jVar2);
                    dVar = dVar2;
                }
                sparkContext.f40981h = dVar;
                sparkContext.a(cVar2);
                int i4 = d.f31262c[eVar.element.ordinal()];
                if (i4 == 1) {
                    cVar = com.bytedance.lynx.hybrid.a.c.LYNX;
                } else if (i4 != 2) {
                    cVar = com.bytedance.lynx.hybrid.a.c.UNKNOWN;
                } else {
                    cVar = com.bytedance.lynx.hybrid.a.c.WEB;
                }
                com.bytedance.lynx.hybrid.h.b bVar2 = this.f31244g;
                if (bVar2 == null) {
                    bVar2 = new com.bytedance.lynx.hybrid.h.b(cVar);
                }
                bVar2.setEngineType(cVar);
                com.bytedance.hybrid.spark.e.c.a("SparkView", "prepareInner  HybridKit.createKitView hybridKitType:".concat(String.valueOf(cVar)), sparkContext);
                Context context5 = getContext();
                l.a((Object) context5, "");
                this.f31238a = d.a.a(bVar2, sparkContext, context5, new C0661c(this, sparkContext, cVar2, eVar));
                a(this.f31244g);
                h hVar = this.f31238a;
                if (hVar != null) {
                    addView(hVar.a(), 0, new FrameLayout.LayoutParams(-1, -1));
                }
                a((com.bytedance.lynx.hybrid.service.c.b) eVar.element);
                return;
            }
            throw new w("null cannot be cast to non-null type");
        }
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }

    public static final class b extends com.bytedance.lynx.hybrid.webkit.a.a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.hybrid.spark.a.b f31250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lynx.hybrid.h.c f31251b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.hybrid.spark.a.j f31252c;

        static {
            Covode.recordClassIndex(18130);
        }

        @Override // com.bytedance.webx.e.a.a.a.AbstractC1138a
        public final void a(WebView webView, String str) {
            String url;
            super.a(webView, str);
            if (str == null || str.length() == 0 || !(webView == null || (url = webView.getUrl()) == null || !p.a((CharSequence) url, (CharSequence) str, false))) {
                com.bytedance.hybrid.spark.a.j jVar = this.f31252c;
                if (jVar != null) {
                    jVar.a("");
                    return;
                }
                return;
            }
            com.bytedance.hybrid.spark.a.j jVar2 = this.f31252c;
            if (jVar2 != null) {
                jVar2.a(str);
            }
        }

        b(com.bytedance.hybrid.spark.a.b bVar, com.bytedance.lynx.hybrid.h.c cVar, com.bytedance.hybrid.spark.a.j jVar) {
            this.f31250a = bVar;
            this.f31251b = cVar;
            this.f31252c = jVar;
        }
    }
}
