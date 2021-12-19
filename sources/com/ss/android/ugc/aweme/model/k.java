package com.ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.model.j;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class k implements d {

    /* renamed from: f  reason: collision with root package name */
    public static String f110775f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f110776g;

    /* renamed from: a  reason: collision with root package name */
    HashMap<String, l> f110777a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    g f110778b;

    /* renamed from: c  reason: collision with root package name */
    h f110779c;

    /* renamed from: d  reason: collision with root package name */
    HashMap<String, j> f110780d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    String f110781e;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<n> f110782h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private String f110783i;

    /* renamed from: j  reason: collision with root package name */
    private String f110784j;

    /* renamed from: k  reason: collision with root package name */
    private m f110785k;

    /* renamed from: l  reason: collision with root package name */
    private String f110786l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f110787m;

    public static final class a {
        static {
            Covode.recordClassIndex(71097);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static d a(o oVar) {
            m mVar;
            boolean z;
            l.d(oVar, "");
            try {
                if (oVar.b(StringSet.type)) {
                    com.google.gson.l c2 = oVar.c(StringSet.type);
                    l.b(c2, "");
                    if (l.a((Object) c2.c(), (Object) "color_picker")) {
                        mVar = m.COLOR_PICKER;
                    } else {
                        mVar = m.GRID;
                    }
                } else {
                    mVar = m.GRID;
                }
                com.google.gson.l c3 = oVar.c("key");
                l.b(c3, "");
                String c4 = c3.c();
                l.b(c4, "");
                com.google.gson.l c5 = oVar.c(StringSet.name);
                l.b(c5, "");
                String c6 = c5.c();
                l.b(c6, "");
                com.google.gson.l c7 = oVar.c("tab");
                l.b(c7, "");
                String c8 = c7.c();
                l.b(c8, "");
                if (!oVar.b("inspirations")) {
                    z = true;
                } else {
                    z = false;
                }
                k kVar = new k(c4, c6, mVar, c8, z);
                if (oVar.b("color_pickers")) {
                    g gVar = new g();
                    com.google.gson.l c9 = oVar.c("color_pickers");
                    l.b(c9, "");
                    Iterator<com.google.gson.l> it = c9.k().iterator();
                    while (it.hasNext()) {
                        com.google.gson.l next = it.next();
                        l.b(next, "");
                        o j2 = next.j();
                        l.b(j2, "");
                        e a2 = f.a(j2, kVar);
                        if (a2 != null) {
                            gVar.f110763a.add(a2);
                        }
                    }
                    kVar.f110778b = gVar;
                }
                if (oVar.b("flip")) {
                    com.google.gson.l c10 = oVar.c("flip");
                    l.b(c10, "");
                    com.google.gson.l c11 = c10.j().c("key");
                    l.b(c11, "");
                    String c12 = c11.c();
                    l.b(c12, "");
                    kVar.f110779c = new h(c12);
                }
                if (oVar.b("sliders")) {
                    com.google.gson.l c13 = oVar.c("sliders");
                    l.b(c13, "");
                    Iterator<com.google.gson.l> it2 = c13.k().iterator();
                    while (it2.hasNext()) {
                        com.google.gson.l next2 = it2.next();
                        l.b(next2, "");
                        com.google.gson.l c14 = next2.j().c("key");
                        l.b(c14, "");
                        String c15 = c14.c();
                        l.b(c15, "");
                        com.google.gson.l c16 = next2.j().c(StringSet.name);
                        l.b(c16, "");
                        String c17 = c16.c();
                        l.b(c17, "");
                        com.google.gson.l c18 = next2.j().c("min");
                        l.b(c18, "");
                        int g2 = c18.g();
                        com.google.gson.l c19 = next2.j().c("max");
                        l.b(c19, "");
                        int g3 = c19.g();
                        com.google.gson.l c20 = next2.j().c("default");
                        l.b(c20, "");
                        int g4 = c20.g();
                        com.google.gson.l c21 = next2.j().c("step");
                        l.b(c21, "");
                        l lVar = new l(c15, c17, g2, g3, g4, c21.g(), kVar);
                        kVar.f110777a.put(lVar.f110789b, lVar);
                    }
                }
                if (oVar.b("inspirations")) {
                    com.google.gson.l c22 = oVar.c("inspirations");
                    l.b(c22, "");
                    Iterator<com.google.gson.l> it3 = c22.k().iterator();
                    while (it3.hasNext()) {
                        com.google.gson.l next3 = it3.next();
                        l.b(next3, "");
                        o j3 = next3.j();
                        l.b(j3, "");
                        j a3 = j.a.a(j3, kVar);
                        if (a3 != null) {
                            kVar.f110780d.put(a3.f110772a, a3);
                        }
                    }
                }
                if (oVar.b("group")) {
                    com.google.gson.l c23 = oVar.c("group");
                    l.b(c23, "");
                    String c24 = c23.c();
                    if (c24 != null) {
                        if (c24.length() != 0) {
                            kVar.f110781e = c24;
                        }
                    }
                }
                return kVar;
            } catch (Exception e2) {
                e2.getMessage();
                return null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.model.d
    public final String a() {
        return this.f110783i;
    }

    @Override // com.ss.android.ugc.aweme.model.d
    public final String b() {
        return this.f110784j;
    }

    @Override // com.ss.android.ugc.aweme.model.d
    public final m c() {
        return this.f110785k;
    }

    @Override // com.ss.android.ugc.aweme.model.d
    public final String d() {
        return this.f110786l;
    }

    @Override // com.ss.android.ugc.aweme.model.d
    public final ArrayList<n> e() {
        return this.f110782h;
    }

    @Override // com.ss.android.ugc.aweme.model.d
    public final HashMap<String, l> f() {
        return this.f110777a;
    }

    @Override // com.ss.android.ugc.aweme.model.d
    public final HashMap<String, j> g() {
        return this.f110780d;
    }

    @Override // com.ss.android.ugc.aweme.model.d
    public final String h() {
        return this.f110781e;
    }

    @Override // com.ss.android.ugc.aweme.model.d
    public final g i() {
        return this.f110778b;
    }

    @Override // com.ss.android.ugc.aweme.model.d
    public final h j() {
        return this.f110779c;
    }

    static {
        Covode.recordClassIndex(71096);
        a aVar = new a((byte) 0);
        f110776g = aVar;
        f110775f = aVar.getClass().getSimpleName();
    }

    public k(String str, String str2, m mVar, String str3, boolean z) {
        l.d(str, "");
        l.d(str2, "");
        l.d(mVar, "");
        l.d(str3, "");
        this.f110783i = str;
        this.f110784j = str2;
        this.f110785k = mVar;
        this.f110786l = str3;
        this.f110787m = z;
    }
}
