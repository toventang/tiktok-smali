package com.bytedance.lynx.hybrid;

import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.c;
import com.bytedance.lynx.hybrid.c;
import com.bytedance.lynx.hybrid.e.d;
import com.bytedance.lynx.hybrid.service.f;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.component.a;
import com.lynx.tasm.l;
import com.lynx.tasm.n;
import com.lynx.tasm.o;
import h.a.ag;
import h.f.a.b;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class j implements f {

    /* renamed from: a  reason: collision with root package name */
    c f40997a;

    /* renamed from: b  reason: collision with root package name */
    public l f40998b;

    /* renamed from: c  reason: collision with root package name */
    public String f40999c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f41000d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f41001e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f41002f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f41003g;

    /* renamed from: h  reason: collision with root package name */
    public Float f41004h;

    /* renamed from: i  reason: collision with root package name */
    public a f41005i;

    /* renamed from: j  reason: collision with root package name */
    public l f41006j;

    /* renamed from: k  reason: collision with root package name */
    public TemplateData f41007k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f41008l;

    /* renamed from: m  reason: collision with root package name */
    public b<? super n, z> f41009m;
    public f n;
    public final Map<String, Object> o;
    public List<o> p;
    public Map<String, com.bytedance.lynx.hybrid.g.b> q;
    public List<com.lynx.tasm.behavior.a> r;
    public com.bytedance.lynx.hybrid.g.a s;
    public g t;
    public String u;
    Uri v;

    static {
        Covode.recordClassIndex(25120);
    }

    @Override // com.bytedance.lynx.hybrid.f
    public final c a() {
        return this.f40997a;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Map<String, com.bytedance.lynx.hybrid.g.b> map = this.q;
        int i7 = 0;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = i2 * 31;
        List<com.lynx.tasm.behavior.a> list = this.r;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        com.bytedance.lynx.hybrid.g.a aVar = this.s;
        if (aVar != null) {
            i4 = aVar.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        g gVar = this.t;
        if (gVar != null) {
            i5 = gVar.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        String str = this.u;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 31;
        Uri uri = this.v;
        if (uri != null) {
            i7 = uri.hashCode();
        }
        return i12 + i7;
    }

    public final String toString() {
        return "LynxKitInitParams(lynxModules=" + this.q + ", lynxBehaviors=" + this.r + ", initData=" + this.s + ", asyncLayoutParam=" + this.t + ", preloadFonts=" + this.u + ", loadUri=" + this.v + ")";
    }

    @Override // com.bytedance.lynx.hybrid.f
    public final void a(Map<String, ? extends Object> map) {
        if (map != null) {
            this.o.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!h.f.b.l.a(this.q, jVar.q) || !h.f.b.l.a(this.r, jVar.r) || !h.f.b.l.a(this.s, jVar.s) || !h.f.b.l.a(this.t, jVar.t) || !h.f.b.l.a((Object) this.u, (Object) jVar.u) || !h.f.b.l.a(this.v, jVar.v)) {
            return false;
        }
        return true;
    }

    private j(Uri uri) {
        Locale locale;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = uri;
        this.f40997a = c.LYNX;
        p[] pVarArr = new p[8];
        h.f.b.l.a((Object) LynxEnv.b(), "");
        pVarArr[0] = v.a("lynxSdkVersion", LynxEnv.g());
        pVarArr[1] = v.a("screenWidth", Integer.valueOf(com.bytedance.lynx.hybrid.i.b.a((double) com.bytedance.lynx.hybrid.i.b.b(d.a()), d.a())));
        pVarArr[2] = v.a("screenHeight", Integer.valueOf(com.bytedance.lynx.hybrid.i.b.a((double) com.bytedance.lynx.hybrid.i.b.a(d.a()), d.a())));
        pVarArr[3] = v.a("statusBarHeight", Integer.valueOf(com.bytedance.lynx.hybrid.i.b.a((double) com.bytedance.lynx.hybrid.i.b.c(d.a()), d.a())));
        String str = Build.MODEL;
        h.f.b.l.a((Object) str, "");
        pVarArr[4] = v.a("deviceModel", str);
        pVarArr[5] = v.a("os", "Android");
        String str2 = Build.VERSION.RELEASE;
        h.f.b.l.a((Object) str2, "");
        pVarArr[6] = v.a("osVersion", str2);
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
            h.f.b.l.a((Object) locale, "");
        } else {
            locale = Locale.getDefault();
            h.f.b.l.a((Object) locale, "");
        }
        pVarArr[7] = v.a("language", locale.getLanguage() + "-" + locale.getCountry());
        Map<String, Object> b2 = ag.b(pVarArr);
        com.bytedance.lynx.hybrid.a.a aVar = c.a.a().f40904d;
        if (aVar != null) {
            b2.putAll(aVar);
        }
        this.o = b2;
        this.p = new ArrayList();
    }

    public /* synthetic */ j(Uri uri, byte b2) {
        this(uri);
    }
}
