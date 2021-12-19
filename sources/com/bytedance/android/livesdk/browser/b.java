package com.bytedance.android.livesdk.browser;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.android.live.b.i;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxDebugBadgeSetting;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.f.b.m;
import h.z;
import org.json.JSONObject;

public final class b implements i {

    /* renamed from: b  reason: collision with root package name */
    String f14271b;

    /* renamed from: c  reason: collision with root package name */
    String f14272c;

    /* renamed from: d  reason: collision with root package name */
    public String f14273d = "h5";

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.android.livesdk.lynx.b f14274e;

    /* renamed from: f  reason: collision with root package name */
    d.f f14275f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f14276g;

    /* renamed from: h  reason: collision with root package name */
    public i.c f14277h;

    /* renamed from: i  reason: collision with root package name */
    private Context f14278i;

    /* renamed from: j  reason: collision with root package name */
    private ViewGroup f14279j;

    public final /* synthetic */ class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f14286a;

        static {
            Covode.recordClassIndex(7915);
        }

        public f(h.f.a.b bVar) {
            this.f14286a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            l.b(this.f14286a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(7909);
    }

    public static final class a implements com.bytedance.android.livesdk.lynx.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f14280a;

        static {
            Covode.recordClassIndex(7910);
        }

        @Override // com.bytedance.android.livesdk.lynx.d
        public final void a() {
            i.c cVar = this.f14280a.f14277h;
            if (cVar != null) {
                cVar.a();
            }
            i.c cVar2 = this.f14280a.f14277h;
            if (cVar2 != null) {
                cVar2.c(this.f14280a.f14273d);
            }
            this.f14280a.f14273d = "h5";
            this.f14280a.b();
            b bVar = this.f14280a;
            String str = bVar.f14272c;
            if (str != null) {
                ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager().a(bVar.f14275f, str);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(b bVar) {
            this.f14280a = bVar;
        }

        @Override // com.bytedance.android.livesdk.lynx.d
        public final void a(View view) {
            l.d(view, "");
            i.c cVar = this.f14280a.f14277h;
            if (cVar != null) {
                cVar.b(this.f14280a.f14273d);
            }
        }
    }

    public b() {
        boolean z;
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostContext.class);
        l.b(a2, "");
        if (!((IHostContext) a2).isLocalTest() || !EnableLynxDebugBadgeSetting.INSTANCE.getValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f14276g = z;
    }

    @Override // com.bytedance.android.live.b.i
    public final void a() {
        if (l.a((Object) "lynx", (Object) this.f14273d)) {
            com.bytedance.android.livesdk.lynx.b bVar = this.f14274e;
            if (bVar != null) {
                bVar.c();
                return;
            }
            return;
        }
        ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager().a(this.f14275f);
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f14285a;

        static {
            Covode.recordClassIndex(7914);
        }

        e(b bVar) {
            this.f14285a = bVar;
        }

        public final void run() {
            b bVar = this.f14285a;
            if (l.a((Object) "lynx", (Object) bVar.f14273d) && bVar.f14274e != null) {
                i.c cVar = bVar.f14277h;
                if (cVar != null) {
                    cVar.a(bVar.f14273d);
                }
                com.bytedance.android.livesdk.lynx.b bVar2 = bVar.f14274e;
                if (bVar2 != null) {
                    String str = bVar.f14271b;
                    if (str == null) {
                        str = "";
                    }
                    bVar2.a(str);
                }
            } else if (bVar.f14275f != null) {
                i.c cVar2 = bVar.f14277h;
                if (cVar2 != null) {
                    cVar2.a(bVar.f14273d);
                }
                ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager().a(bVar.f14275f, bVar.f14271b);
            }
        }
    }

    public final void b() {
        WebView webView;
        MethodCollector.i(8221);
        if (this.f14275f == null) {
            com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
            Context context = this.f14278i;
            if (context == null) {
                l.a("mContext");
            }
            androidx.fragment.app.e a2 = p.a(context);
            if (a2 == null) {
                l.b();
            }
            this.f14275f = webViewManager.a(a2, new c(this));
        }
        d.f fVar = this.f14275f;
        if (fVar == null || (webView = fVar.f14313a) == null) {
            MethodCollector.o(8221);
            return;
        }
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        webView.setBackgroundColor(0);
        ViewGroup viewGroup = this.f14279j;
        if (viewGroup == null) {
            l.a("mRootContainer");
        }
        viewGroup.removeAllViews();
        ViewGroup viewGroup2 = this.f14279j;
        if (viewGroup2 == null) {
            l.a("mRootContainer");
        }
        viewGroup2.addView(webView, 0);
        if (this.f14276g) {
            ViewGroup viewGroup3 = this.f14279j;
            if (viewGroup3 == null) {
                l.a("mRootContainer");
            }
            a(viewGroup3, d.f14284a);
        }
        MethodCollector.o(8221);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.b$b  reason: collision with other inner class name */
    static final class C0309b extends m implements h.f.a.b<View, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0309b f14281a = new C0309b();

        static {
            Covode.recordClassIndex(7911);
        }

        C0309b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            return z.f158842a;
        }
    }

    public static final class c implements d.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f14283a;

        static {
            Covode.recordClassIndex(7912);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f14283a = bVar;
        }

        @Override // com.bytedance.android.livesdk.browser.c.d.e
        public final void a(WebView webView, String str) {
            l.d(webView, "");
            l.d(str, "");
            com.bytedance.android.live.core.c.a.a(4, "HybridContainer", "onPageFinished");
            i.c cVar = this.f14283a.f14277h;
            if (cVar != null) {
                cVar.b(this.f14283a.f14273d);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<View, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f14284a = new d();

        static {
            Covode.recordClassIndex(7913);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            return z.f158842a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.android.livesdk.browser.b$f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.view.ViewGroup r5, h.f.a.b<? super android.view.View, h.z> r6) {
        /*
            r4 = this;
            r3 = 8228(0x2024, float:1.153E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r3)
            com.bytedance.android.live.design.widget.LiveTextView r2 = new com.bytedance.android.live.design.widget.LiveTextView
            android.content.Context r1 = r4.f14278i
            if (r1 != 0) goto L_0x0010
            java.lang.String r0 = "mContext"
            h.f.b.l.a(r0)
        L_0x0010:
            r2.<init>(r1)
            java.lang.String r0 = r4.f14273d
            r2.setText(r0)
            r0 = 1096810496(0x41600000, float:14.0)
            r2.setTextSize(r0)
            java.lang.String r0 = "#FFFFFF"
            int r0 = android.graphics.Color.parseColor(r0)
            r2.setTextColor(r0)
            java.lang.String r0 = "#88008800"
            int r0 = android.graphics.Color.parseColor(r0)
            r2.setBackgroundColor(r0)
            if (r6 == 0) goto L_0x0037
            com.bytedance.android.livesdk.browser.b$f r0 = new com.bytedance.android.livesdk.browser.b$f
            r0.<init>(r6)
            r6 = r0
        L_0x0037:
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r2.setOnClickListener(r6)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r0 = -2
            r1.<init>(r0, r0)
            r0 = 8388661(0x800035, float:1.1755018E-38)
            r1.gravity = r0
            r5.addView(r2, r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.b.a(android.view.ViewGroup, h.f.a.b):void");
    }

    @Override // com.bytedance.android.live.b.i
    public final void a(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        if (l.a((Object) "lynx", (Object) this.f14273d)) {
            com.bytedance.android.livesdk.lynx.b bVar = this.f14274e;
            if (bVar != null) {
                bVar.a(str, jSONObject);
                return;
            }
            return;
        }
        d.f fVar = this.f14275f;
        if (fVar != null) {
            fVar.a(str, jSONObject);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x002f  */
    @Override // com.bytedance.android.live.b.i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r13, java.lang.String r14, java.lang.String r15, android.view.ViewGroup r16, com.bytedance.android.live.b.i.c r17) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.b.a(java.lang.String, java.lang.String, java.lang.String, android.view.ViewGroup, com.bytedance.android.live.b.i$c):void");
    }
}
