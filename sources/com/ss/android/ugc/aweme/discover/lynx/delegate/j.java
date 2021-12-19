package com.ss.android.ugc.aweme.discover.lynx.delegate;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b.q;
import com.bytedance.ies.bullet.ui.common.BulletContainerView;
import com.bytedance.ies.bullet.ui.common.h;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.lynx.spark.d;
import com.ss.android.ugc.aweme.hybridkit.bridge.b;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.m.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class j extends b implements com.bytedance.ies.bullet.kit.lynx.a, h.b, com.ss.android.ugc.aweme.discover.lynx.a.c {

    /* renamed from: h  reason: collision with root package name */
    public static final a f81504h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f81505a;

    /* renamed from: c  reason: collision with root package name */
    public boolean f81506c;

    /* renamed from: d  reason: collision with root package name */
    public int f81507d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f81508e = -1;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.discover.lynx.d.b f81509f;

    /* renamed from: g  reason: collision with root package name */
    public int f81510g;

    /* renamed from: i  reason: collision with root package name */
    private final l f81511i = new l();

    /* renamed from: j  reason: collision with root package name */
    private String f81512j;

    static {
        Covode.recordClassIndex(50662);
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri) {
        l.d(uri, "");
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
        l.d(list, "");
        l.d(uri, "");
        l.d(iVar, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50663);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(String str) {
            boolean z;
            if (str == null || p.a((CharSequence) str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "";
            }
            try {
                String queryParameter = Uri.parse(str).getQueryParameter("bundle");
                if (queryParameter == null) {
                    l.b();
                }
                l.b(queryParameter, "");
                return p.a(queryParameter, "/template.js", "", false);
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public static final class c implements com.bytedance.ies.bullet.ui.common.b.b {
        static {
            Covode.recordClassIndex(50665);
        }

        @Override // com.bytedance.ies.bullet.ui.common.b.b
        public final boolean p() {
            return true;
        }

        @Override // com.bytedance.ies.bullet.ui.common.b.b
        public final boolean q() {
            return true;
        }

        c() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d3, code lost:
        if (r6 != 2) goto L_0x00d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.discover.lynx.e.b r20, java.lang.String r21, java.lang.String r22, com.lynx.tasm.TemplateData r23, com.ss.android.ugc.aweme.discover.mixfeed.d r24, com.ss.android.ugc.aweme.discover.lynx.b.a r25, boolean r26) {
        /*
        // Method dump skipped, instructions count: 287
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.lynx.delegate.j.a(com.ss.android.ugc.aweme.discover.lynx.e.b, java.lang.String, java.lang.String, com.lynx.tasm.TemplateData, com.ss.android.ugc.aweme.discover.mixfeed.d, com.ss.android.ugc.aweme.discover.lynx.b.a, boolean):void");
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a
    public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar, JSONObject jSONObject) {
        LynxView lynxView;
        l.d(bVar, "");
        bVar.p_();
        com.ss.android.ugc.aweme.discover.lynx.a.b bVar2 = this.f81477b;
        if (bVar2 != null && (lynxView = bVar2.f81413d) != null) {
            lynxView.post(new h(this));
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a
    public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar, String str) {
        l.d(bVar, "");
        bVar.p_();
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b f81513a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BulletContainerView f81514b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f81515c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.lynx.b.d f81516d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f81517e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f81518f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ TemplateData f81519g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.d f81520h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.lynx.b.a f81521i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f81522j;

        static {
            Covode.recordClassIndex(50664);
        }

        b(com.bytedance.ies.bullet.c.e.a.b bVar, BulletContainerView bulletContainerView, j jVar, com.ss.android.ugc.aweme.discover.lynx.b.d dVar, String str, String str2, TemplateData templateData, com.ss.android.ugc.aweme.discover.mixfeed.d dVar2, com.ss.android.ugc.aweme.discover.lynx.b.a aVar, boolean z) {
            this.f81513a = bVar;
            this.f81514b = bulletContainerView;
            this.f81515c = jVar;
            this.f81516d = dVar;
            this.f81517e = str;
            this.f81518f = str2;
            this.f81519g = templateData;
            this.f81520h = dVar2;
            this.f81521i = aVar;
            this.f81522j = z;
        }

        public final void run() {
            ((LynxView) this.f81521i.f81435b).updateData((TemplateData) this.f81513a.c(TemplateData.class));
        }
    }

    public final void d() {
        com.ss.android.ugc.aweme.discover.lynx.d.b bVar = this.f81509f;
        if (bVar != null) {
            bVar.a(this.f81477b, this.f81505a, this.f81507d, this.f81510g, this.f81506c);
        }
        this.f81509f = null;
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f81533a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f81534b;

        static {
            Covode.recordClassIndex(50669);
        }

        g(j jVar, z.e eVar) {
            this.f81533a = jVar;
            this.f81534b = eVar;
        }

        public final void run() {
            new com.ss.android.ugc.aweme.discover.lynx.d.a().c("schema", this.f81534b.element.getSchema()).c("status", String.valueOf(this.f81533a.f81507d)).f();
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f81535a;

        static {
            Covode.recordClassIndex(50670);
        }

        h(j jVar) {
            this.f81535a = jVar;
        }

        public final void run() {
            String str;
            LynxView lynxView;
            LynxView lynxView2;
            LynxView lynxView3;
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81535a.f81477b;
            if (!(bVar == null || (lynxView3 = bVar.f81413d) == null)) {
                Integer.valueOf(lynxView3.getHeight());
            }
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar2 = this.f81535a.f81477b;
            if (!(bVar2 == null || (lynxView2 = bVar2.f81413d) == null)) {
                Integer.valueOf(lynxView2.getWidth());
            }
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar3 = this.f81535a.f81477b;
            int i2 = 0;
            if (bVar3 == null || (lynxView = bVar3.f81413d) == null || lynxView.getHeight() == 0) {
                com.ss.android.ugc.aweme.discover.lynx.d.c a2 = new com.ss.android.ugc.aweme.discover.lynx.d.c().a("template_height_error");
                com.ss.android.ugc.aweme.discover.mixfeed.d dVar = this.f81535a.f81477b.f81417h;
                if (dVar != null) {
                    str = dVar.getSchema();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.discover.lynx.d.c e2 = a2.b(str).d(String.valueOf(this.f81535a.f81477b.f81416g)).e(String.valueOf(this.f81535a.f81505a ? 1 : 0));
                if (this.f81535a.f81507d == 1) {
                    i2 = 1;
                }
                e2.g(String.valueOf(i2)).f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.lynx.a.b f81536a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f81537b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.bullet.c.c.i f81538c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ View f81539d;

        static {
            Covode.recordClassIndex(50671);
        }

        i(com.ss.android.ugc.aweme.discover.lynx.a.b bVar, j jVar, com.bytedance.ies.bullet.c.c.i iVar, View view) {
            this.f81536a = bVar;
            this.f81537b = jVar;
            this.f81538c = iVar;
            this.f81539d = view;
        }

        public final void run() {
            String str;
            LynxView lynxView;
            LynxView lynxView2;
            LynxView lynxView3;
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81537b.f81477b;
            if (!(bVar == null || (lynxView3 = bVar.f81413d) == null)) {
                Integer.valueOf(lynxView3.getHeight());
            }
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar2 = this.f81537b.f81477b;
            if (!(bVar2 == null || (lynxView2 = bVar2.f81413d) == null)) {
                Integer.valueOf(lynxView2.getWidth());
            }
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar3 = this.f81537b.f81477b;
            int i2 = 0;
            if (bVar3 == null || (lynxView = bVar3.f81413d) == null || lynxView.getHeight() == 0) {
                com.ss.android.ugc.aweme.discover.lynx.d.c a2 = new com.ss.android.ugc.aweme.discover.lynx.d.c().a("template_height_error");
                com.ss.android.ugc.aweme.discover.mixfeed.d dVar = this.f81537b.f81477b.f81417h;
                if (dVar != null) {
                    str = dVar.getSchema();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.discover.lynx.d.c e2 = a2.b(str).d(String.valueOf(this.f81537b.f81477b.f81416g)).e(String.valueOf(this.f81537b.f81505a ? 1 : 0));
                if (this.f81537b.f81507d == 1) {
                    i2 = 1;
                }
                e2.g(String.valueOf(i2)).f();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.lynx.delegate.j$j  reason: collision with other inner class name */
    static final class RunnableC1901j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f81540a;

        static {
            Covode.recordClassIndex(50672);
        }

        RunnableC1901j(j jVar) {
            this.f81540a = jVar;
        }

        public final void run() {
            String str;
            LynxView lynxView;
            LynxView lynxView2;
            LynxView lynxView3;
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81540a.f81477b;
            if (!(bVar == null || (lynxView3 = bVar.f81413d) == null)) {
                Integer.valueOf(lynxView3.getHeight());
            }
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar2 = this.f81540a.f81477b;
            if (!(bVar2 == null || (lynxView2 = bVar2.f81413d) == null)) {
                Integer.valueOf(lynxView2.getWidth());
            }
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar3 = this.f81540a.f81477b;
            int i2 = 0;
            if (bVar3 == null || (lynxView = bVar3.f81413d) == null || lynxView.getHeight() == 0) {
                com.ss.android.ugc.aweme.discover.lynx.d.c a2 = new com.ss.android.ugc.aweme.discover.lynx.d.c().a("template_height_error");
                com.ss.android.ugc.aweme.discover.mixfeed.d dVar = this.f81540a.f81477b.f81417h;
                if (dVar != null) {
                    str = dVar.getSchema();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.discover.lynx.d.c e2 = a2.b(str).d(String.valueOf(this.f81540a.f81477b.f81416g)).e(String.valueOf(this.f81540a.f81505a ? 1 : 0));
                if (this.f81540a.f81507d == 1) {
                    i2 = 1;
                }
                e2.g(String.valueOf(i2)).f();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e3, code lost:
        if (r4 == 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f6, code lost:
        if (r2 == null) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e8  */
    @Override // com.ss.android.ugc.aweme.discover.lynx.delegate.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 893
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.lynx.delegate.j.a():void");
    }

    static final class e extends m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ z.a $hasPreloadAction;
        final /* synthetic */ String $schema;

        static {
            Covode.recordClassIndex(50667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(z.a aVar, String str) {
            super(1);
            this.$hasPreloadAction = aVar;
            this.$schema = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            this.$hasPreloadAction.element = bool.booleanValue();
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a
    public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar) {
        l.d(bVar, "");
        bVar.p_();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a
    public final void b(com.bytedance.ies.bullet.kit.lynx.b bVar) {
        l.d(bVar, "");
        bVar.p_();
        bVar.h();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a
    public final void c(com.bytedance.ies.bullet.kit.lynx.b bVar) {
        l.d(bVar, "");
        bVar.p_();
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a
    public final void d(com.bytedance.ies.bullet.kit.lynx.b bVar) {
        l.d(bVar, "");
        bVar.p_();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(com.ss.android.ugc.aweme.discover.lynx.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
        bVar.a().a(this);
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a
    public final void e(com.bytedance.ies.bullet.kit.lynx.b bVar) {
        LynxView lynxView;
        l.d(bVar, "");
        bVar.p_();
        bVar.h();
        com.ss.android.ugc.aweme.discover.lynx.a.b bVar2 = this.f81477b;
        if (bVar2 != null && (lynxView = bVar2.f81413d) != null) {
            lynxView.post(new RunnableC1901j(this));
        }
    }

    public static final class f extends com.bytedance.hybrid.spark.a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f81531a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.d f81532b;

        static {
            Covode.recordClassIndex(50668);
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a(com.bytedance.lynx.hybrid.a.h hVar) {
            l.d(hVar, "");
            this.f81532b.getSchema();
            this.f81531a.f81477b.q = d.a.a(hVar);
            this.f81531a.f81477b.f81413d = (LynxView) hVar.a();
            this.f81531a.d();
            l.d(hVar, "");
            com.bytedance.ies.bullet.c.e.a.b bVar = b.a.a().get(hVar);
            if (bVar != null) {
                this.f81531a.f81477b.a().a(bVar);
            }
        }

        f(j jVar, com.ss.android.ugc.aweme.discover.mixfeed.d dVar) {
            this.f81531a = jVar;
            this.f81532b = dVar;
        }

        @Override // com.bytedance.lynx.hybrid.a.f
        public final void a(com.bytedance.lynx.hybrid.a.h hVar, String str, String str2) {
            l.d(hVar, "");
            l.d(str, "");
            super.a(hVar, str, str2);
            if (this.f81531a.f81509f != null) {
                com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81531a.f81477b;
                if (str2 == null) {
                    str2 = "";
                }
                com.ss.android.ugc.aweme.discover.lynx.d.b.a(bVar, str2, this.f81531a.f81507d, this.f81531a.f81510g);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.a.c
    public final void a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.d(bVar, "");
        bVar.b(com.ss.android.ugc.aweme.discover.helper.g.class, this.f81477b.f81422m.getValue());
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a
    public final void f(com.bytedance.ies.bullet.kit.lynx.b bVar) {
        int i2;
        l.d(bVar, "");
        bVar.p_();
        bVar.h();
        this.f81477b.c();
        com.ss.android.ugc.aweme.discover.lynx.c.a aVar = this.f81477b.n;
        if (aVar != null) {
            Integer num = this.f81477b.f81416g;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            aVar.a(i2, this.f81477b);
        }
    }

    private final TemplateData a(TemplateData templateData) {
        JSONObject jSONObject = new JSONObject();
        com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81477b;
        Map<String, ? extends Object> map = bVar.f81418i;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        jSONObject.put("reactId", bVar.f81412c);
        jSONObject.put("sessionid", this.f81508e);
        jSONObject.put("screenWidth", n.a(bVar.f81410a));
        jSONObject.put("isPreload", false);
        Iterator<String> keys = jSONObject.keys();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            templateData.a(next, jSONObject.get(next));
        }
        return templateData;
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(Uri uri, Throwable th) {
        String str = "";
        l.d(uri, str);
        l.d(th, str);
        if (this.f81509f != null) {
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81477b;
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            com.ss.android.ugc.aweme.discover.lynx.d.b.a(bVar, str, this.f81507d, this.f81510g);
        }
    }

    public static final class d implements h.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f81523a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f81524b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.lynx.e.b f81525c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f81526d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f81527e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.discover.mixfeed.d f81528f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ z.a f81529g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ z.e f81530h;

        static {
            Covode.recordClassIndex(50666);
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(Uri uri) {
            l.d(uri, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
            l.d(iVar, "");
            l.d(uri, "");
            l.d(qVar, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(List<? extends com.bytedance.ies.bullet.ui.common.c.d<? extends View>> list, Uri uri, com.bytedance.ies.bullet.c.c.i iVar, boolean z) {
            l.d(list, "");
            l.d(uri, "");
            l.d(iVar, "");
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(Uri uri, Throwable th) {
            l.d(uri, "");
            l.d(th, "");
            this.f81523a.a(this.f81525c, this.f81524b, this.f81526d.element, this.f81527e.element, this.f81528f, new com.ss.android.ugc.aweme.discover.lynx.b.a(com.ss.android.ugc.aweme.discover.lynx.b.d.FAILED, null, null, null, 30), this.f81529g.element);
        }

        @Override // com.bytedance.ies.bullet.ui.common.h.b
        public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
            l.d(view, "");
            l.d(uri, "");
            l.d(iVar, "");
            T t = this.f81530h.element;
            if (t != null) {
                this.f81523a.f81505a = true;
                this.f81525c.a(t.f69288a);
                this.f81526d.element = (T) t.f69289b.c(String.class);
                this.f81527e.element = (T) t.f69289b.c(TemplateData.class);
            }
            this.f81523a.a(this.f81525c, this.f81524b, this.f81526d.element, this.f81527e.element, this.f81528f, new com.ss.android.ugc.aweme.discover.lynx.b.a(com.ss.android.ugc.aweme.discover.lynx.b.d.SUCCEED, view, uri, iVar, 16), this.f81529g.element);
        }

        d(j jVar, String str, com.ss.android.ugc.aweme.discover.lynx.e.b bVar, z.e eVar, z.e eVar2, com.ss.android.ugc.aweme.discover.mixfeed.d dVar, z.a aVar, z.e eVar3) {
            this.f81523a = jVar;
            this.f81524b = str;
            this.f81525c = bVar;
            this.f81526d = eVar;
            this.f81527e = eVar2;
            this.f81528f = dVar;
            this.f81529g = aVar;
            this.f81530h = eVar3;
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a
    public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar, com.bytedance.ies.bullet.kit.lynx.b.b bVar2) {
        String str;
        l.d(bVar, "");
        com.ss.android.ugc.aweme.discover.lynx.d.c a2 = new com.ss.android.ugc.aweme.discover.lynx.d.c().a("load_error");
        com.ss.android.ugc.aweme.discover.mixfeed.d dVar = this.f81477b.f81417h;
        String str2 = null;
        if (dVar != null) {
            str = dVar.getSchema();
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.discover.lynx.d.c e2 = a2.b(str).d(String.valueOf(this.f81477b.f81416g)).e(String.valueOf(this.f81505a ? 1 : 0));
        int i2 = 1;
        if (this.f81507d != 1) {
            i2 = 0;
        }
        com.ss.android.ugc.aweme.discover.lynx.d.c g2 = e2.g(String.valueOf(i2));
        if (bVar2 != null) {
            str2 = bVar2.f32319c;
        }
        g2.c(str2).f();
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(View view, Uri uri, com.bytedance.ies.bullet.c.c.i iVar) {
        com.ss.android.ugc.aweme.discover.lynx.a.b bVar;
        LynxView lynxView;
        androidx.lifecycle.i lifecycle;
        l.d(view, "");
        l.d(uri, "");
        l.d(iVar, "");
        com.ss.android.ugc.aweme.discover.lynx.a.b bVar2 = this.f81477b;
        bVar2.f81411b = iVar;
        bVar2.f81412c = iVar.a().f32074a;
        int i2 = 0;
        if (bVar2.f81417h != null) {
            if (view instanceof WebView) {
                bVar2.f81415f = true;
            } else if (view instanceof LynxView) {
                bVar2.f81415f = false;
                LynxView lynxView2 = (LynxView) view;
                bVar2.f81413d = lynxView2;
                androidx.fragment.app.e eVar = bVar2.f81410a;
                if (!(eVar == null || (lifecycle = eVar.getLifecycle()) == null)) {
                    lifecycle.a(new LynxViewReleaseObserver(lynxView2));
                }
                LynxView lynxView3 = bVar2.f81413d;
                if (lynxView3 != null) {
                    lynxView3.onEnterForeground();
                }
                if (!(!this.f81505a || (bVar = this.f81477b) == null || (lynxView = bVar.f81413d) == null)) {
                    lynxView.post(new i(bVar2, this, iVar, view));
                }
            }
        }
        this.f81477b.c();
        com.ss.android.ugc.aweme.discover.lynx.c.a aVar = this.f81477b.n;
        if (aVar != null) {
            Integer num = this.f81477b.f81416g;
            if (num != null) {
                i2 = num.intValue();
            }
            aVar.a(i2, this.f81477b);
        }
        d();
    }

    @Override // com.bytedance.ies.bullet.ui.common.h.b
    public final void a(com.bytedance.ies.bullet.c.c.i iVar, Uri uri, q qVar) {
        double d2;
        l.d(iVar, "");
        l.d(uri, "");
        l.d(qVar, "");
        iVar.p_();
        String scheme = uri.getScheme();
        if (scheme == null) {
            return;
        }
        if (l.a((Object) scheme, (Object) "https") || l.a((Object) scheme, (Object) "http")) {
            com.ss.android.ugc.aweme.discover.lynx.a.b bVar = this.f81477b;
            com.ss.android.ugc.aweme.discover.mixfeed.d dVar = bVar.f81417h;
            double d3 = 0.0d;
            if (dVar != null) {
                d2 = (double) dVar.getHeight();
            } else {
                d2 = 0.0d;
            }
            bVar.r.getLayoutParams().height = com.ss.android.ugc.aweme.base.utils.n.a(d2);
            com.ss.android.ugc.aweme.discover.mixfeed.d dVar2 = bVar.f81417h;
            if (dVar2 != null) {
                d3 = (double) dVar2.getWidth();
            }
            bVar.r.getLayoutParams().width = com.ss.android.ugc.aweme.base.utils.n.a(d3);
            com.ss.android.ugc.aweme.framework.a.a.a(3, null, "uri:".concat(String.valueOf(uri)));
        }
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.a
    public final void a(com.bytedance.ies.bullet.kit.lynx.b bVar, Context context, h.f.a.m<Object, ? super Throwable, h.z> mVar) {
        l.d(bVar, "");
        l.d(context, "");
        l.d(mVar, "");
        bVar.p_();
    }
}
