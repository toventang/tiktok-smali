package com.ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.i;
import com.google.gson.o;
import com.google.gson.t;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.api.a.b;
import com.ss.android.ugc.aweme.model.api.a.c;
import com.ss.android.ugc.aweme.model.api.a.g;
import com.ss.android.ugc.aweme.user.f;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class q {

    /* renamed from: g  reason: collision with root package name */
    public static final a f110804g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f110805a;

    /* renamed from: b  reason: collision with root package name */
    public String f110806b = "#A5E6FF";

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, n> f110807c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, j> f110808d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public UrlModel f110809e;

    /* renamed from: f  reason: collision with root package name */
    public UrlModel f110810f;

    static {
        Covode.recordClassIndex(71103);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71104);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static q a(b bVar, HashMap<String, d> hashMap) {
            d dVar;
            String info;
            j jVar;
            l lVar;
            l.d(bVar, "");
            l.d(hashMap, "");
            q qVar = new q();
            String navi_id = bVar.getNavi_id();
            if (navi_id != null) {
                qVar.f110805a = navi_id;
            }
            qVar.a(bVar.getBackground_color());
            List<g> staticImage = bVar.getStaticImage();
            if (staticImage != null && (!staticImage.isEmpty())) {
                qVar.f110809e = staticImage.get(0).getThumbnailUrl();
            }
            List<com.ss.android.ugc.aweme.model.api.a.a> animationList = bVar.getAnimationList();
            if (animationList != null && (!animationList.isEmpty())) {
                qVar.f110810f = animationList.get(0).getUrl();
            }
            List<c> features = bVar.getFeatures();
            if (features != null) {
                for (c cVar : features) {
                    String category = cVar.getCategory();
                    if (!(category == null || (dVar = hashMap.get(category)) == null || (info = cVar.getInfo()) == null)) {
                        try {
                            com.google.gson.l a2 = com.google.gson.q.a(info);
                            l.b(a2, "");
                            o j2 = a2.j();
                            if (j2.b("sticker_id")) {
                                com.google.gson.l c2 = j2.c("sticker_id");
                                l.b(c2, "");
                                String c3 = c2.c();
                                Iterator<n> it = dVar.e().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    n next = it.next();
                                    if (l.a((Object) next.a(), (Object) c3)) {
                                        String h2 = dVar.h();
                                        if (h2 == null || h2.length() == 0) {
                                            qVar.f110807c.put(dVar.a(), next);
                                        } else {
                                            HashMap<String, n> hashMap2 = qVar.f110807c;
                                            String h3 = dVar.h();
                                            if (h3 == null) {
                                                l.b();
                                            }
                                            hashMap2.put(h3, next);
                                        }
                                    }
                                }
                            } else if (j2.b("inspiration_key")) {
                                String lVar2 = j2.c("inspiration_key").toString();
                                l.b(lVar2, "");
                                if (dVar.g().containsKey(lVar2) && (jVar = dVar.g().get(lVar2)) != null) {
                                    String h4 = dVar.h();
                                    if (h4 == null || h4.length() == 0) {
                                        qVar.f110808d.put(dVar.a(), jVar);
                                    } else {
                                        HashMap<String, j> hashMap3 = qVar.f110808d;
                                        String h5 = dVar.h();
                                        if (h5 == null) {
                                            l.b();
                                        }
                                        hashMap3.put(h5, jVar);
                                    }
                                }
                            }
                            l.b(dVar, "");
                            l.b(j2, "");
                            if (j2.b("color_picker")) {
                                com.google.gson.l c4 = j2.c("color_picker");
                                l.b(c4, "");
                                o j3 = c4.j();
                                l.b(j3, "");
                                if (j3.b("key")) {
                                    com.google.gson.l c5 = j3.c("key");
                                    l.b(c5, "");
                                    String c6 = c5.c();
                                    g i2 = dVar.i();
                                    if (i2 != null) {
                                        Iterator<e> it2 = i2.f110763a.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            e next2 = it2.next();
                                            if (l.a((Object) next2.f110760c, (Object) c6)) {
                                                i2.f110764b = next2;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            if (j2.b("flip")) {
                                com.google.gson.l c7 = j2.c("flip");
                                l.b(c7, "");
                                o j4 = c7.j();
                                l.b(j4, "");
                                if (j4.b("key")) {
                                    com.google.gson.l c8 = j4.c("key");
                                    l.b(c8, "");
                                    String c9 = c8.c();
                                    h j5 = dVar.j();
                                    if (j5 != null && l.a((Object) j5.f110767c, (Object) c9) && j4.b("value")) {
                                        com.google.gson.l c10 = j4.c("value");
                                        l.b(c10, "");
                                        j5.f110766b = c10.g();
                                    }
                                }
                            }
                            if (j2.b("sliders")) {
                                com.google.gson.l c11 = j2.c("sliders");
                                l.b(c11, "");
                                i k2 = c11.k();
                                l.b(k2, "");
                                Iterator<com.google.gson.l> it3 = k2.iterator();
                                while (it3.hasNext()) {
                                    com.google.gson.l next3 = it3.next();
                                    if ((next3 instanceof o) && ((o) next3).b("key") && ((o) next3).b("value")) {
                                        com.google.gson.l c12 = ((o) next3).c("key");
                                        l.b(c12, "");
                                        String c13 = c12.c();
                                        com.google.gson.l c14 = ((o) next3).c("value");
                                        l.b(c14, "");
                                        int g2 = c14.g();
                                        if (dVar.f().containsKey(c13) && (lVar = dVar.f().get(c13)) != null) {
                                            lVar.f110788a = g2;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            if (e2.getMessage() != null) {
                                Integer.valueOf(0);
                            }
                        } catch (t e3) {
                            if (e3.getMessage() != null) {
                                Integer.valueOf(0);
                            }
                        } catch (IllegalStateException e4) {
                            if (e4.getMessage() != null) {
                                Integer.valueOf(0);
                            }
                        }
                    }
                }
            }
            return qVar;
        }
    }

    private final List<c> b() {
        ArrayList arrayList = new ArrayList();
        for (n nVar : this.f110807c.values()) {
            String a2 = nVar.c().a();
            l.b(nVar, "");
            arrayList.add(new c(a2, a(nVar)));
        }
        for (j jVar : this.f110808d.values()) {
            String a3 = jVar.f110773b.a();
            l.b(jVar, "");
            arrayList.add(new c(a3, a(jVar)));
        }
        return arrayList;
    }

    public final b a() {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str = this.f110805a;
        String e2 = f.f142379d.e();
        String str2 = this.f110806b;
        UrlModel urlModel = this.f110810f;
        if (urlModel != null) {
            arrayList = new ArrayList();
            arrayList.add(new com.ss.android.ugc.aweme.model.api.a.a("anim_1", urlModel));
        } else {
            arrayList = null;
        }
        List<c> b2 = b();
        if (this.f110809e != null) {
            arrayList2 = new ArrayList();
            arrayList2.add(new g("webp", null, this.f110809e));
        } else {
            arrayList2 = null;
        }
        return new b(str, e2, str2, arrayList, b2, arrayList2);
    }

    public final void a(String str) {
        l.d(str, "");
        this.f110806b = str;
    }

    public final n b(String str) {
        l.d(str, "");
        if (this.f110807c.containsKey(str)) {
            return this.f110807c.get(str);
        }
        return null;
    }

    public final j c(String str) {
        l.d(str, "");
        if (this.f110808d.containsKey(str)) {
            return this.f110808d.get(str);
        }
        return null;
    }

    private static String a(s sVar) {
        e eVar;
        o oVar = new o();
        if (sVar instanceof n) {
            oVar.a("sticker_id", sVar.a());
        } else {
            oVar.a("inspiration_key", sVar.a());
        }
        d c2 = sVar.c();
        g i2 = c2.i();
        if (!(i2 == null || (eVar = i2.f110764b) == null)) {
            o oVar2 = new o();
            oVar2.a("key", eVar.f110760c);
            oVar.a("color_picker", oVar2);
        }
        h j2 = c2.j();
        if (j2 != null) {
            o oVar3 = new o();
            oVar3.a("key", j2.f110767c);
            oVar3.a("value", Integer.valueOf(j2.f110766b));
            oVar.a("flip", oVar3);
        }
        HashMap<String, l> f2 = c2.f();
        i iVar = new i();
        for (l lVar : f2.values()) {
            o oVar4 = new o();
            oVar4.a("slider_key", lVar.f110789b);
            oVar4.a("value", Integer.valueOf(lVar.f110788a));
            iVar.a(oVar4);
        }
        oVar.a("sliders", iVar);
        String oVar5 = oVar.toString();
        l.b(oVar5, "");
        return oVar5;
    }
}
