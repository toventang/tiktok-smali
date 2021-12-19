package com.bytedance.sdk.bdlynx.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.bdlynx.a.a.f;
import com.bytedance.sdk.bdlynx.c.a;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.l;
import com.lynx.tasm.n;
import h.f.b.m;
import h.p;
import h.z;
import java.io.File;
import java.util.LinkedList;
import org.json.JSONObject;

public class BDLynxView extends FrameLayout implements e {

    /* renamed from: e  reason: collision with root package name */
    public static final a f43777e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public LynxView f43778a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43779b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedList<TemplateData> f43780c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f43781d;

    /* renamed from: g  reason: collision with root package name */
    private final com.bytedance.sdk.bdlynx.a.b f43782g;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.sdk.bdlynx.a.c.a f43783h;

    /* renamed from: i  reason: collision with root package name */
    private final n f43784i;

    /* renamed from: j  reason: collision with root package name */
    private l f43785j;

    /* renamed from: k  reason: collision with root package name */
    private final JSONObject f43786k;

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.sdk.bdlynx.c.b f43787l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f43788m;
    private final boolean n;
    private final com.bytedance.sdk.bdlynx.d.a o;
    private final d p;

    static {
        Covode.recordClassIndex(26781);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(26782);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final com.bytedance.sdk.bdlynx.a.b getBDLynxContext() {
        return this.f43782g;
    }

    public final d getDefaultLynxViewClient() {
        return this.p;
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BDLynxView f43790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TemplateData f43791b;

        static {
            Covode.recordClassIndex(26785);
        }

        d(BDLynxView bDLynxView, TemplateData templateData) {
            this.f43790a = bDLynxView;
            this.f43791b = templateData;
        }

        public final void run() {
            this.f43790a.getLynxView().updateData(this.f43791b);
        }
    }

    public final LynxView getLynxView() {
        LynxView lynxView = this.f43778a;
        if (lynxView == null) {
            h.f.b.l.a("lynxView");
        }
        return lynxView;
    }

    private final void a() {
        LynxView lynxView = this.f43778a;
        if (lynxView == null) {
            h.f.b.l.a("lynxView");
        }
        lynxView.setGlobalProps(com.bytedance.sdk.bdlynx.f.b.f43768a.a(c()));
    }

    private final void b() {
        MethodCollector.i(2221);
        synchronized (this.f43780c) {
            try {
                this.f43781d = false;
                this.f43780c.clear();
            } finally {
                MethodCollector.o(2221);
            }
        }
    }

    private final JSONObject c() {
        JSONObject a2 = com.bytedance.sdk.bdlynx.f.a.a();
        com.bytedance.sdk.bdlynx.a.f.a.a(a2, this.f43786k);
        a2.put("groupId", this.f43783h.f43659b);
        a2.put("cardId", this.f43783h.f43660c);
        return a2;
    }

    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BDLynxView f43789a;

        static {
            Covode.recordClassIndex(26783);
        }

        @Override // com.lynx.tasm.o, com.bytedance.sdk.bdlynx.view.d
        public final void d() {
            MethodCollector.i(268);
            super.d();
            synchronized (this.f43789a.f43780c) {
                try {
                    this.f43789a.f43781d = true;
                    while (!this.f43789a.f43780c.isEmpty()) {
                        TemplateData removeFirst = this.f43789a.f43780c.removeFirst();
                        BDLynxView bDLynxView = this.f43789a;
                        h.f.b.l.a((Object) removeFirst, "");
                        h.f.b.l.c(removeFirst, "");
                        synchronized (bDLynxView.f43780c) {
                            try {
                                if (!bDLynxView.f43781d) {
                                    bDLynxView.f43780c.add(removeFirst);
                                } else {
                                    f.a(new d(bDLynxView, removeFirst));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } finally {
                    MethodCollector.o(268);
                }
            }
            MethodCollector.o(268);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(BDLynxView bDLynxView) {
            this.f43789a = bDLynxView;
        }
    }

    public final void setLynxView(LynxView lynxView) {
        h.f.b.l.c(lynxView, "");
        this.f43778a = lynxView;
    }

    public final void setCurActivity(Activity activity) {
        h.f.b.l.c(activity, "");
        com.bytedance.sdk.bdlynx.a.b bVar = this.f43782g;
        h.f.b.l.c(activity, "");
        bVar.f43654b = activity;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        LynxView lynxView = this.f43778a;
        if (lynxView == null) {
            h.f.b.l.a("lynxView");
        }
        lynxView.setOnClickListener(onClickListener);
    }

    static final class c extends m implements h.f.a.b<com.bytedance.sdk.bdlynx.a.c.a, z> {
        final /* synthetic */ com.bytedance.sdk.bdlynx.e.b.a.a $template;

        static {
            Covode.recordClassIndex(26784);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.bytedance.sdk.bdlynx.e.b.a.a aVar) {
            super(1);
            this.$template = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.sdk.bdlynx.a.c.a aVar) {
            com.bytedance.sdk.bdlynx.a.c.a aVar2 = aVar;
            h.f.b.l.c(aVar2, "");
            String str = this.$template.f43709f;
            h.f.b.l.c(str, "");
            aVar2.f43659b = str;
            String str2 = this.$template.f43710g;
            h.f.b.l.c(str2, "");
            aVar2.f43660c = str2;
            return z.f158842a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BDLynxView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new c());
        h.f.b.l.c(context, "");
    }

    @Override // com.bytedance.sdk.bdlynx.view.e
    public final void a(String str, String str2) {
        h.f.b.l.c(str, "");
        b();
        a();
        LynxView lynxView = this.f43778a;
        if (lynxView == null) {
            h.f.b.l.a("lynxView");
        }
        lynxView.renderTemplateUrl(str, str2);
    }

    @Override // com.bytedance.sdk.bdlynx.view.e
    public final void a(com.bytedance.sdk.bdlynx.e.b.a.a aVar, String str) {
        h.f.b.l.c(aVar, "");
        c cVar = new c(aVar);
        h.f.b.l.c(cVar, "");
        cVar.invoke(this.f43783h);
        com.bytedance.sdk.bdlynx.a.b bVar = this.f43782g;
        com.bytedance.sdk.bdlynx.a.c.a aVar2 = this.f43783h;
        h.f.b.l.c(aVar2, "");
        bVar.f43653a = aVar2;
        this.f43787l.a(this.f43783h);
        d dVar = this.p;
        h.f.b.l.c(aVar, "");
        com.bytedance.sdk.bdlynx.d.c cVar2 = dVar.f43810b;
        cVar2.f43698a = aVar.a().f43716f;
        cVar2.f43699b = aVar.f43707d;
        cVar2.f43700c = aVar.f43706c;
        dVar.a(aVar.f43704a);
        dVar.f43811c = aVar.f43709f;
        dVar.f43812d = aVar.f43710g;
        a();
        byte[] bArr = aVar.f43708e;
        String str2 = "bdlynx" + File.separator + aVar.a().f43712b;
        h.f.b.l.c(bArr, "");
        new com.bytedance.sdk.bdlynx.a.a.b("bdlynx_tpl_render_start", (byte) 0).a("group_id", this.f43783h.f43659b).a("card_id", this.f43783h.f43660c).a("cli_version", this.f43783h.f43658a).a();
        b();
        a();
        LynxView lynxView = this.f43778a;
        if (lynxView == null) {
            h.f.b.l.a("lynxView");
        }
        lynxView.renderTemplateWithBaseUrl(bArr, str, str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BDLynxView(Context context, AttributeSet attributeSet, c cVar) {
        super(context, attributeSet);
        com.bytedance.sdk.bdlynx.a.e.a aVar;
        p a2;
        h.f.b.l.c(context, "");
        h.f.b.l.c(cVar, "");
        MethodCollector.i(2232);
        com.bytedance.sdk.bdlynx.a.b bVar = new com.bytedance.sdk.bdlynx.a.b(context);
        this.f43782g = bVar;
        this.f43783h = cVar.f43804e;
        n nVar = cVar.f43803d;
        this.f43784i = nVar;
        this.f43785j = cVar.f43800a;
        this.f43779b = cVar.f43801b;
        this.f43786k = cVar.f43807h;
        this.f43780c = new LinkedList<>();
        this.f43787l = a.C1058a.a(this.f43783h, null);
        this.f43788m = cVar.f43802c;
        boolean z = cVar.f43806g;
        this.n = z;
        com.bytedance.sdk.bdlynx.d.a aVar2 = cVar.f43805f;
        this.o = aVar2;
        b bVar2 = new b(this);
        if (aVar2 != null) {
            bVar2.a(new b(aVar2));
        } else {
            bVar2.a(new a());
        }
        this.p = bVar2;
        if (!(!this.f43788m || (aVar = (com.bytedance.sdk.bdlynx.a.e.a) com.bytedance.sdk.bdlynx.a.d.a.f43661a.a(com.bytedance.sdk.bdlynx.a.e.a.class)) == null || (a2 = aVar.a()) == null)) {
            nVar.a((String) a2.getFirst(), (Class) a2.getSecond(), bVar);
        }
        l lVar = this.f43785j;
        nVar.a(lVar == null ? l.a("default", new String[]{"assets://bdlynx_core.js"}) : lVar);
        LynxView a3 = nVar.a(getContext());
        h.f.b.l.a((Object) a3, "");
        this.f43778a = a3;
        bVar2.a(this.f43787l);
        this.f43787l.b();
        if (z) {
            LynxView lynxView = this.f43778a;
            if (lynxView == null) {
                h.f.b.l.a("lynxView");
            }
            lynxView.addLynxViewClient(bVar2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        LynxView lynxView2 = this.f43778a;
        if (lynxView2 == null) {
            h.f.b.l.a("lynxView");
        }
        addView(lynxView2, layoutParams);
        MethodCollector.o(2232);
    }
}
