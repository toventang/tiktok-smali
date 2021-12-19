package com.bytedance.android.livesdk.container.b;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.container.c.b;
import com.bytedance.android.livesdk.container.i.c;
import com.bytedance.android.livesdk.container.util.d;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveForceLynxFallback;
import com.bytedance.android.livesdk.lynx.b.a;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.lynx.tasm.LynxPerfMetric;
import com.lynx.tasm.j;
import com.lynx.tasm.o;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class a extends o {

    /* renamed from: a  reason: collision with root package name */
    public final b f16724a;

    /* renamed from: b  reason: collision with root package name */
    private long f16725b;

    /* renamed from: c  reason: collision with root package name */
    private long f16726c;

    /* renamed from: d  reason: collision with root package name */
    private long f16727d;

    /* renamed from: e  reason: collision with root package name */
    private long f16728e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16729f;

    /* renamed from: g  reason: collision with root package name */
    private LynxPerfMetric f16730g;

    /* renamed from: h  reason: collision with root package name */
    private LynxPerfMetric f16731h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f16732i = true;

    static {
        Covode.recordClassIndex(9272);
    }

    @Override // com.lynx.tasm.o
    public final void a() {
        super.a();
        this.f16729f = true;
        this.f16728e = System.currentTimeMillis();
        com.bytedance.android.livesdk.container.h.a aVar = this.f16724a.f16754e;
        if (aVar != null) {
            aVar.d();
        }
        c.f16799b.a(this.f16724a.f16757f, this.f16724a.f16752c.getOriginUri(), (String) null, this.f16732i);
        this.f16732i = false;
        com.bytedance.android.livesdk.lynx.b.a.a(0, this.f16728e - this.f16726c, this.f16724a.a(new p[0]));
    }

    @Override // com.lynx.tasm.o
    public final void b() {
        super.b();
        long currentTimeMillis = System.currentTimeMillis();
        this.f16727d = currentTimeMillis;
        long j2 = currentTimeMillis - this.f16726c;
        b bVar = this.f16724a;
        p<String, ? extends Object>[] pVarArr = new p[2];
        pVarArr[0] = v.a("ev_type", "performance");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("initStart", this.f16725b);
        jSONObject2.put("pageStart", this.f16726c);
        jSONObject2.put("loadEnd", this.f16728e);
        jSONObject2.put("firstScreen", this.f16727d);
        jSONObject.put("navigation", jSONObject2);
        LynxPerfMetric lynxPerfMetric = this.f16731h;
        if (lynxPerfMetric != null) {
            jSONObject.put("performance", lynxPerfMetric.toJSONObject());
        }
        pVarArr[1] = v.a("event", jSONObject);
        com.bytedance.android.livesdk.lynx.b.a.c(j2, bVar.a(pVarArr));
    }

    public a(b bVar) {
        l.d(bVar, "");
        this.f16724a = bVar;
    }

    @Override // com.lynx.tasm.o
    public final void a(j jVar) {
        l.d(jVar, "");
        super.a(jVar);
        c.f16799b.a(this.f16724a.f16757f, this.f16724a.f16752c.getOriginUri(), jVar.f56744a, jVar.a());
    }

    @Override // com.lynx.tasm.o
    public final void c(String str) {
        super.c(str);
        com.bytedance.android.livesdk.lynx.b.a.b(this.f16724a.a(v.a("err_log", str)));
    }

    @Override // com.lynx.tasm.o
    public final void a(LynxPerfMetric lynxPerfMetric) {
        super.a(lynxPerfMetric);
        this.f16731h = lynxPerfMetric;
        b bVar = this.f16724a;
        Map a2 = ag.a(v.a("perfBaseTimeStamp", String.valueOf(System.currentTimeMillis())), v.a("perf", lynxPerfMetric));
        l.d("perf", "");
        l.d(a2, "");
        com.bytedance.android.livesdk.browser.jsbridge.c cVar = bVar.f16750a;
        if (cVar != null) {
            cVar.a("perf", a2);
        }
    }

    @Override // com.lynx.tasm.o
    public final void a(String str) {
        if (!d.a() || !LiveForceLynxFallback.INSTANCE.getValue()) {
            if (str == null || str.length() == 0) {
                c.f16799b.a(this.f16724a.f16757f, this.f16724a.f16752c.getOriginUri());
            } else {
                c.f16799b.a(this.f16724a.f16757f, this.f16724a.f16752c.getOriginUri(), str);
            }
            super.a(str);
            this.f16726c = System.currentTimeMillis();
            com.bytedance.android.livesdk.lynx.b.a.a(System.currentTimeMillis() - this.f16725b, this.f16724a.a(new p[0]));
            return;
        }
        com.bytedance.android.livesdk.container.h.a aVar = this.f16724a.f16754e;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.lynx.tasm.o
    public final void b(LynxPerfMetric lynxPerfMetric) {
        JSONObject jSONObject;
        super.b(lynxPerfMetric);
        this.f16730g = lynxPerfMetric;
        b bVar = this.f16724a;
        p<String, ? extends Object>[] pVarArr = new p[2];
        pVarArr[0] = v.a("ev_type", "performance");
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("initStart", this.f16725b);
        jSONObject3.put("pageStart", this.f16726c);
        jSONObject3.put("loadEnd", this.f16728e);
        jSONObject3.put("firstScreen", this.f16727d);
        jSONObject2.put("navigation", jSONObject3);
        if (lynxPerfMetric != null) {
            jSONObject = lynxPerfMetric.toJSONObject();
        } else {
            jSONObject = null;
        }
        jSONObject2.put("performance", jSONObject);
        pVarArr[1] = v.a("event", jSONObject2);
        com.bytedance.android.livesdk.lynx.b.a.a(bVar.a(pVarArr));
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

    @Override // com.lynx.tasm.o
    public final void b(String str) {
        String str2;
        super.b(str);
        this.f16728e = System.currentTimeMillis();
        this.f16729f = true;
        com.bytedance.android.livesdk.container.h.a aVar = this.f16724a.f16754e;
        if (aVar != null) {
            aVar.e();
        }
        a.EnumC0392a aVar2 = a.EnumC0392a.LOAD_FAILED;
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        com.bytedance.android.livesdk.lynx.b.a.a(aVar2, str2);
        com.bytedance.android.livesdk.lynx.b.a.a(1, this.f16728e - this.f16726c, this.f16724a.a(v.a("err_msg", str)));
        com.bytedance.android.livesdk.lynx.b.a.b(System.currentTimeMillis() - this.f16726c, this.f16724a.a(v.a("err_msg", str), v.a(StringSet.type, 0)));
        a.EnumC0392a aVar3 = a.EnumC0392a.LOAD_FAILED;
        if (str == null) {
            str = "";
        }
        com.bytedance.android.livesdk.lynx.b.a.a(aVar3, str, this.f16724a.f16752c.getUrl());
        this.f16732i = false;
    }
}
