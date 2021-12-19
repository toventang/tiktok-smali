package com.bytedance.android.livesdk.lynx.ui;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxShareGroupSetting;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveForceLynxFallback;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveImportHostLynxJsb;
import com.bytedance.android.livesdk.lynx.bridge.TTLiveLynxBridgeModule;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.a.m;
import com.bytedance.ies.bullet.service.base.a.o;
import com.bytedance.ies.bullet.service.base.ao;
import com.bytedance.ies.bullet.service.base.ap;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.web.jsbridge2.x;
import com.bytedance.j.a.e.a;
import com.bytedance.j.a.f;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.shadow.text.r;
import h.a.ag;
import h.f.b.l;
import h.f.b.z;
import h.p;
import h.q;
import h.v;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;

public final class c implements com.bytedance.android.livesdk.lynx.b {
    public static final a r = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f18807a;

    /* renamed from: b  reason: collision with root package name */
    public final LynxView f18808b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.lynx.a.a f18809c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.android.livesdk.browser.jsbridge.c f18810d;

    /* renamed from: e  reason: collision with root package name */
    public String f18811e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f18812f;

    /* renamed from: g  reason: collision with root package name */
    public LynxPerfMetric f18813g;

    /* renamed from: h  reason: collision with root package name */
    public LynxPerfMetric f18814h;

    /* renamed from: i  reason: collision with root package name */
    public long f18815i;

    /* renamed from: j  reason: collision with root package name */
    public long f18816j;

    /* renamed from: k  reason: collision with root package name */
    public long f18817k;

    /* renamed from: l  reason: collision with root package name */
    public long f18818l;

    /* renamed from: m  reason: collision with root package name */
    com.bytedance.ies.bullet.service.base.c.c f18819m;
    public final boolean n;
    public final String o;
    public String p;
    public com.bytedance.android.livesdk.lynx.d q;
    private int s;
    private String t;
    private final m u;
    private o v;
    private String w;

    public static final class a {
        static {
            Covode.recordClassIndex(11192);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.bytedance.android.livesdk.lynx.ui.c$a$a  reason: collision with other inner class name */
        static final class C0397a implements r.a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0397a f18820a = new C0397a();

            static {
                Covode.recordClassIndex(11193);
            }

            C0397a() {
            }

            @Override // com.lynx.tasm.behavior.shadow.text.r.a
            public final Typeface a(String str, int i2) {
                if (l.a((Object) str, (Object) "live_font")) {
                    return ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).getHostTypeface(i2);
                }
                return null;
            }
        }
    }

    final class b extends com.lynx.tasm.o {
        static {
            Covode.recordClassIndex(11194);
        }

        @Override // com.lynx.tasm.o
        public final void c() {
            super.c();
        }

        @Override // com.lynx.tasm.o
        public final void a() {
            super.a();
            c.this.f18812f = true;
            c.this.f18818l = System.currentTimeMillis();
            com.bytedance.android.livesdk.lynx.d dVar = c.this.q;
            if (dVar != null) {
                dVar.a(c.this.f18808b);
            }
            com.bytedance.android.livesdk.lynx.b.a.a(0, c.this.f18818l - c.this.f18816j, c.this.a(new p[0]));
        }

        @Override // com.lynx.tasm.o
        public final void b() {
            super.b();
            c.this.f18817k = System.currentTimeMillis();
            long j2 = c.this.f18817k - c.this.f18816j;
            c cVar = c.this;
            p<String, ? extends Object>[] pVarArr = new p[2];
            pVarArr[0] = v.a("ev_type", "performance");
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("initStart", c.this.f18815i);
            jSONObject2.put("pageStart", c.this.f18816j);
            jSONObject2.put("loadEnd", c.this.f18818l);
            jSONObject2.put("firstScreen", c.this.f18817k);
            jSONObject.put("navigation", jSONObject2);
            LynxPerfMetric lynxPerfMetric = c.this.f18814h;
            if (lynxPerfMetric != null) {
                jSONObject.put("performance", lynxPerfMetric.toJSONObject());
            }
            pVarArr[1] = v.a("event", jSONObject);
            com.bytedance.android.livesdk.lynx.b.a.c(j2, cVar.a(pVarArr));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        @Override // com.lynx.tasm.o
        public final void c(String str) {
            super.c(str);
            com.bytedance.android.livesdk.lynx.b.a.b(c.this.a(v.a("err_log", str)));
        }

        @Override // com.lynx.tasm.o
        public final void a(LynxPerfMetric lynxPerfMetric) {
            super.a(lynxPerfMetric);
            c.this.f18814h = lynxPerfMetric;
            c.this.a("perf", ag.a(v.a("perfBaseTimeStamp", String.valueOf(System.currentTimeMillis())), v.a("perf", lynxPerfMetric)));
        }

        @Override // com.lynx.tasm.o
        public final void a(String str) {
            if (!c.this.n || !LiveForceLynxFallback.INSTANCE.getValue()) {
                super.a(str);
                c.this.f18816j = System.currentTimeMillis();
                com.bytedance.android.livesdk.lynx.b.a.a(System.currentTimeMillis() - c.this.f18815i, c.this.a(new p[0]));
                return;
            }
            com.bytedance.android.livesdk.lynx.d dVar = c.this.q;
            if (dVar != null) {
                dVar.a();
            }
        }

        @Override // com.lynx.tasm.o
        public final void b(LynxPerfMetric lynxPerfMetric) {
            JSONObject jSONObject;
            super.b(lynxPerfMetric);
            c.this.f18813g = lynxPerfMetric;
            c cVar = c.this;
            p<String, ? extends Object>[] pVarArr = new p[2];
            pVarArr[0] = v.a("ev_type", "performance");
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("initStart", c.this.f18815i);
            jSONObject3.put("pageStart", c.this.f18816j);
            jSONObject3.put("loadEnd", c.this.f18818l);
            jSONObject3.put("firstScreen", c.this.f18817k);
            jSONObject2.put("navigation", jSONObject3);
            if (lynxPerfMetric != null) {
                jSONObject = lynxPerfMetric.toJSONObject();
            } else {
                jSONObject = null;
            }
            jSONObject2.put("performance", jSONObject);
            pVarArr[1] = v.a("event", jSONObject2);
            com.bytedance.android.livesdk.lynx.b.a.a(cVar.a(pVarArr));
        }

        @Override // com.lynx.tasm.behavior.f, com.lynx.tasm.o
        public final String d(String str) {
            int i2;
            if (TextUtils.isEmpty(str) || str == null || !h.m.p.b(str, "app://", false)) {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = null;
                    if (((k) com.bytedance.android.live.t.a.a(k.class)).a((WebView) null, str) != null) {
                        if (str != null) {
                            i2 = h.m.p.a((CharSequence) str, "tiktok_live_lynx", 0, false, 6);
                        } else {
                            i2 = -1;
                        }
                        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(k.class);
                        l.b(a2, "");
                        String b2 = ((k) a2).b();
                        if (b2 != null && i2 > 0) {
                            StringBuilder append = new StringBuilder("file://").append(b2).append('/');
                            if (str != null) {
                                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                                str2 = str.substring(i2 + 16);
                                l.b(str2, "");
                            }
                            return append.append(str2).toString();
                        }
                    }
                }
                return super.d(str);
            }
            String substring = str.substring(6);
            l.b(substring, "");
            return "res:///".concat(String.valueOf(substring));
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // com.lynx.tasm.o
        public final void b(java.lang.String r11) {
            /*
            // Method dump skipped, instructions count: 118
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.lynx.ui.c.b.b(java.lang.String):void");
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.a
    public final View a() {
        return this.f18808b;
    }

    @Override // com.bytedance.android.livesdk.lynx.a
    public final /* bridge */ /* synthetic */ com.bytedance.android.livesdk.browser.c.a b() {
        return this.f18810d;
    }

    @Override // com.bytedance.android.livesdk.lynx.b
    public final /* bridge */ /* synthetic */ View d() {
        return this.f18808b;
    }

    static final class d extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(11198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return this.this$0.f18811e;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(11199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return this.this$0.f18811e;
        }
    }

    static {
        Covode.recordClassIndex(11189);
        r.a(a.C0397a.f18820a);
    }

    @Override // com.bytedance.android.livesdk.lynx.a
    public final void c() {
        com.bytedance.ies.bullet.service.base.c.c cVar = this.f18819m;
        if (cVar != null) {
            cVar.b();
        }
        this.f18810d.b();
        Object obj = null;
        this.q = null;
        int i2 = !this.f18812f ? 1 : 0;
        p<String, ? extends Object>[] pVarArr = new p[2];
        pVarArr[0] = v.a("ev_type", "performance");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("initStart", this.f18815i);
        jSONObject2.put("pageStart", this.f18816j);
        jSONObject2.put("loadEnd", this.f18818l);
        jSONObject2.put("firstScreen", this.f18817k);
        jSONObject.put("navigation", jSONObject2);
        LynxPerfMetric lynxPerfMetric = this.f18813g;
        if (lynxPerfMetric != null) {
            obj = lynxPerfMetric.toJSONObject();
        }
        jSONObject.put("performance", obj);
        pVarArr[1] = v.a("event", jSONObject);
        Map<String, Object> a2 = a(pVarArr);
        l.d(a2, "");
        l.b(LynxEnv.b(), "");
        a2.put("lynx_version", "2.1.5-rc.33-cxxshared");
        com.bytedance.android.live.core.d.c.a("ttlive_lynx_overview_service", i2, a2);
    }

    @Override // com.bytedance.android.livesdk.lynx.a
    public final void a(String str) {
        l.d(str, "");
        d(str);
    }

    private final void d(String str) {
        this.f18815i = System.currentTimeMillis();
        if (str.length() > 0 && str != null) {
            c(str);
            this.s++;
            com.bytedance.ies.bullet.service.base.c.c cVar = this.f18819m;
            if (cVar != null) {
                cVar.a(str);
            }
        }
    }

    private void c(String str) {
        Object obj;
        String str2 = "";
        this.f18811e = str;
        try {
            Uri parse = Uri.parse(str);
            l.b(parse, str2);
            obj = q.m223constructorimpl(parse.getPath());
        } catch (Throwable th) {
            obj = q.m223constructorimpl(h.r.a(th));
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        String str3 = (String) obj;
        if (str3 != null) {
            str2 = str3;
        }
        this.t = str2;
    }

    /* renamed from: com.bytedance.android.livesdk.lynx.ui.c$c  reason: collision with other inner class name */
    public static final class C0398c extends f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f18822a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.lynx.bridge.c f18823b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Integer f18824c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f18825d;

        static {
            Covode.recordClassIndex(11195);
        }

        @Override // com.bytedance.j.a.f
        public final void a(ap apVar) {
            int i2;
            l.d(apVar, "");
            c cVar = this.f18822a;
            if (apVar.q == ao.GECKO) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            cVar.f18807a = i2;
            this.f18822a.f18809c.a(this.f18822a.f18811e, this.f18822a.f18810d, new h.f.a.b<com.google.gson.o, h.z>(this) {
                /* class com.bytedance.android.livesdk.lynx.ui.c.C0398c.AnonymousClass1 */
                final /* synthetic */ C0398c this$0;

                static {
                    Covode.recordClassIndex(11196);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(com.google.gson.o oVar) {
                    com.google.gson.o oVar2 = oVar;
                    l.d(oVar2, "");
                    oVar2.a("offline", Integer.valueOf(this.this$0.f18822a.f18807a));
                    return h.z.f158842a;
                }
            }, new h.f.a.b<Map<String, ? extends Object>, h.z>(this) {
                /* class com.bytedance.android.livesdk.lynx.ui.c.C0398c.AnonymousClass2 */
                final /* synthetic */ C0398c this$0;

                static {
                    Covode.recordClassIndex(11197);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(Map<String, ? extends Object> map) {
                    Map<String, ? extends Object> map2 = map;
                    l.d(map2, "");
                    this.this$0.f18822a.f18808b.updateData(map2);
                    return h.z.f158842a;
                }
            });
            LynxView lynxView = this.f18822a.f18808b;
            Object obj = this.f18822a.f18809c.f18755b.get("__globalProps");
            if (!(obj instanceof Map)) {
                obj = null;
            }
            lynxView.setGlobalProps((Map) obj);
            com.bytedance.android.livesdk.lynx.b.a.a(this.f18822a.f18807a, this.f18822a.a(new p[0]));
        }

        C0398c(c cVar, com.bytedance.android.livesdk.lynx.bridge.c cVar2, Integer num, z.e eVar) {
            this.f18822a = cVar;
            this.f18823b = cVar2;
            this.f18824c = num;
            this.f18825d = eVar;
        }
    }

    public final Map<String, Object> a(p<String, ? extends Object>... pVarArr) {
        p[] pVarArr2 = new p[5];
        boolean z = false;
        pVarArr2[0] = v.a("ts", Long.valueOf(System.currentTimeMillis()));
        if (this.s < 2) {
            z = true;
        }
        pVarArr2[1] = v.a("isFirstTime", Boolean.valueOf(z));
        pVarArr2[2] = v.a("offline", Integer.valueOf(this.f18807a));
        pVarArr2[3] = v.a("template_url", this.f18811e);
        pVarArr2[4] = v.a("path", this.t);
        Map<String, Object> b2 = ag.b(pVarArr2);
        ag.a(b2, pVarArr);
        return b2;
    }

    public static com.google.gson.o b(String str) {
        Long l2;
        User owner;
        FollowInfo followInfo;
        User owner2;
        String valueOf;
        String str2;
        com.google.gson.o oVar = new com.google.gson.o();
        try {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            l.b(queryParameterNames, "");
            for (T t2 : queryParameterNames) {
                oVar.a(t2, parse.getQueryParameter(t2));
            }
            String str3 = "0";
            if (!oVar.b("room_id")) {
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (room == null || (str2 = String.valueOf(room.getId())) == null) {
                    str2 = str3;
                }
                oVar.a("room_id", str2);
            }
            if (!oVar.b("user_id")) {
                com.bytedance.android.livesdk.at.f b2 = u.a().b();
                l.b(b2, "");
                oVar.a("user_id", String.valueOf(b2.c()));
            }
            if (!oVar.b("anchor_id")) {
                Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (!(room2 == null || (owner2 = room2.getOwner()) == null || (valueOf = String.valueOf(owner2.getId())) == null)) {
                    str3 = valueOf;
                }
                oVar.a("anchor_id", str3);
            }
            if (!oVar.b("follow_status")) {
                Room room3 = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (room3 == null || (owner = room3.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(followInfo.getFollowStatus());
                }
                oVar.a("follow_status", l2);
            }
            com.bytedance.android.livesdkapi.session.f fVar = f.a.f23366a;
            l.b(fVar, "");
            EnterRoomLinkSession a2 = fVar.a();
            l.b(a2, "");
            EnterRoomConfig.RoomsData roomsData = a2.f23354b.f23299c;
            if (!oVar.b("enter_from_merge")) {
                oVar.a("enter_from_merge", roomsData.J);
            }
            if (!oVar.b("enter_method")) {
                oVar.a("enter_method", roomsData.L);
            }
            if (!oVar.b("action_type")) {
                oVar.a("action_type", roomsData.M);
            }
            q.m223constructorimpl(h.z.f158842a);
        } catch (Throwable th) {
            q.m223constructorimpl(h.r.a(th));
        }
        return oVar;
    }

    @Override // com.bytedance.android.livesdk.browser.jsbridge.b
    public final <T> void a(String str, T t2) {
        this.f18810d.a(str, t2);
    }

    private c(final Activity activity, final String str, Integer num, String str2, String str3, com.bytedance.android.livesdk.lynx.d dVar, boolean z, String str4) {
        Configuration configuration;
        final String str5;
        int i2;
        String str6;
        String str7;
        com.bytedance.ies.bullet.service.base.c.c cVar;
        l.d(activity, "");
        l.d(str, "");
        this.o = str2;
        this.p = str3;
        this.q = dVar;
        this.w = str4;
        this.t = "";
        this.f18811e = "";
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostContext.class);
        l.b(a2, "");
        boolean isLocalTest = ((IHostContext) a2).isLocalTest();
        this.n = isLocalTest;
        if (TextUtils.isEmpty(this.p)) {
            this.p = com.bytedance.android.livesdk.browser.c.b();
        }
        c(str);
        ((com.bytedance.android.livesdk.lynx.c) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.lynx.c.class)).tryInitEnvIfNeeded();
        Resources resources = activity.getResources();
        View view = null;
        if (resources != null) {
            configuration = resources.getConfiguration();
        } else {
            configuration = null;
        }
        if (configuration == null || (configuration.uiMode & 48) != 32) {
            str5 = "light";
        } else {
            str5 = "dark";
        }
        this.f18809c = new com.bytedance.android.livesdk.lynx.a.a(new h.f.a.b<com.google.gson.o, h.z>(this) {
            /* class com.bytedance.android.livesdk.lynx.ui.c.AnonymousClass1 */
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(11190);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(com.google.gson.o oVar) {
                int i2;
                String str;
                com.google.gson.o oVar2 = oVar;
                l.d(oVar2, "");
                Resources resources = activity.getResources();
                l.b(resources, "");
                if (resources.getConfiguration().orientation == 2) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                oVar2.a("orientation", Integer.valueOf(i2));
                oVar2.a("initTimestamp", String.valueOf(System.currentTimeMillis()));
                oVar2.a("theme", str5);
                oVar2.a("containerID", this.this$0.p);
                String str2 = this.this$0.o;
                if (str2 == null || h.m.p.a((CharSequence) str2)) {
                    str = str;
                } else {
                    str = this.this$0.o;
                }
                oVar2.a("queryItems", c.b(str));
                return h.z.f158842a;
            }
        });
        com.bytedance.android.livesdk.lynx.bridge.c cVar2 = new com.bytedance.android.livesdk.lynx.bridge.c(activity, new e(this));
        cVar2.f18766c = new h.f.a.b<TTLiveLynxBridgeModule, h.z>(this) {
            /* class com.bytedance.android.livesdk.lynx.ui.c.AnonymousClass2 */
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(11191);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ h.z invoke(TTLiveLynxBridgeModule tTLiveLynxBridgeModule) {
                TTLiveLynxBridgeModule tTLiveLynxBridgeModule2 = tTLiveLynxBridgeModule;
                l.d(tTLiveLynxBridgeModule2, "");
                c cVar = this.this$0;
                Activity activity = activity;
                if (LiveImportHostLynxJsb.INSTANCE.getValue()) {
                    com.bytedance.android.livesdk.lynx.bridge.c cVar2 = new com.bytedance.android.livesdk.lynx.bridge.c(activity, new d(cVar));
                    cVar2.a(tTLiveLynxBridgeModule2);
                    cVar2.f18765b = cVar.f18819m;
                    Object a2 = ((k) com.bytedance.android.live.t.a.a(k.class)).a(cVar.f18810d.f14451b, activity, cVar.f18819m, cVar.f18808b, cVar2);
                    if (a2 instanceof x) {
                        cVar.f18810d.f14451b.a("host", (x) a2);
                    }
                }
                return h.z.f158842a;
            }
        };
        com.bytedance.android.livesdk.browser.jsbridge.c a3 = com.bytedance.android.livesdk.browser.jsbridge.c.a(activity, cVar2);
        l.b(a3, "");
        this.f18810d = a3;
        com.bytedance.ies.bullet.service.base.a.a aVar = new com.bytedance.ies.bullet.service.base.a.a(activity, isLocalTest);
        this.u = aVar;
        z.e eVar = new z.e();
        com.bytedance.j.a.c cVar3 = new com.bytedance.j.a.c((byte) 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bridge", new com.bytedance.j.a.e.b(TTLiveLynxBridgeModule.class, cVar2));
        cVar3.n = linkedHashMap;
        cVar3.o = b.a();
        if (num == null || num.intValue() <= 0) {
            Resources a4 = y.a();
            l.b(a4, "");
            i2 = a4.getDisplayMetrics().widthPixels;
        } else {
            i2 = num.intValue();
        }
        cVar3.f38964e = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        cVar3.f38963d = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, 0));
        if (!EnableLynxShareGroupSetting.INSTANCE.getValue() || !(true ^ h.m.p.a((CharSequence) this.f18811e))) {
            com.bytedance.android.livesdk.lynx.b.a.a(this.f18811e);
            str6 = "unspecified-" + this.p;
        } else {
            Uri parse = Uri.parse(this.f18811e);
            if (parse == null || (str6 = parse.getQueryParameter("business_type")) == null) {
                str6 = "unspecified-" + this.p;
            }
        }
        l.b(str6, "");
        Uri parse2 = Uri.parse(str2);
        if (parse2 != null) {
            str7 = parse2.getQueryParameter("enable_canvas");
        } else {
            str7 = null;
        }
        cVar3.f38960a = com.lynx.tasm.l.a(str6, null, l.a((Object) "1", (Object) str7));
        com.bytedance.j.a.e.a a5 = a.C0927a.a(this.f18809c.f18754a);
        if (!TextUtils.isEmpty(this.w)) {
            String str8 = this.w;
            if (str8 == null) {
                l.b();
            }
            a5.a("initial_data", new JSONObject(str8));
        }
        cVar3.p = a5;
        cVar3.a(new b());
        eVar.element = (T) com.bytedance.android.livesdk.lynx.b.a.a.f18759a.a(cVar3);
        cVar3.f38967h = new C0398c(this, cVar2, num, eVar);
        Object obj = this.f18809c.f18755b.get("__globalProps");
        cVar3.a((Map) (!(obj instanceof Map) ? null : obj));
        aVar.a().a(com.bytedance.j.a.c.class, cVar3);
        com.bytedance.ies.bullet.service.base.a.b bVar = new com.bytedance.ies.bullet.service.base.a.b("live", aVar);
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.ies.bullet.service.base.c.b bVar2 = (com.bytedance.ies.bullet.service.base.c.b) bVar.b_(com.bytedance.ies.bullet.service.base.c.b.class);
        if (bVar2 != null) {
            cVar = bVar2.b(bVar);
        } else {
            cVar = null;
        }
        this.f18819m = cVar;
        com.bytedance.android.livesdk.lynx.b.a.a(currentTimeMillis);
        this.v = bVar;
        cVar2.f18765b = this.f18819m;
        com.bytedance.ies.bullet.service.base.c.c cVar4 = this.f18819m;
        view = cVar4 != null ? cVar4.a() : view;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
        LynxView lynxView = (LynxView) view;
        T t2 = eVar.element;
        if (t2 != null) {
            t2.a(lynxView);
        }
        this.f18808b = lynxView;
        if (z) {
            d(this.f18811e);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c(android.app.Activity r10, java.lang.String r11, java.lang.Integer r12, java.lang.String r13, java.lang.String r14, com.bytedance.android.livesdk.lynx.d r15, boolean r16, java.lang.String r17, int r18) {
        /*
            r9 = this;
            r1 = r18
            r2 = r11
            r7 = r16
            r3 = r12
            r8 = r17
            r4 = r13
            r0 = r1 & 2
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0010
            r2 = r5
        L_0x0010:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0019
            r0 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x0019:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x001e
            r4 = r5
        L_0x001e:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0034
        L_0x0022:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0028
            r0 = 0
            r7 = 0
        L_0x0028:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x002d
            r8 = 0
        L_0x002d:
            r0 = r9
            r1 = r10
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0034:
            r5 = r14
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.lynx.ui.c.<init>(android.app.Activity, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, com.bytedance.android.livesdk.lynx.d, boolean, java.lang.String, int):void");
    }
}
