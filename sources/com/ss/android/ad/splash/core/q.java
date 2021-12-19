package com.ss.android.ad.splash.core;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.b.b;
import com.ss.android.ad.splash.c.a;
import com.ss.android.ad.splash.core.e.c;
import com.ss.android.ad.splash.core.i.c;
import com.ss.android.ad.splash.f.f;
import com.ss.android.ad.splash.f.g;
import com.ss.android.ad.splash.f.j;
import com.ss.android.ad.splash.f.p;
import com.ss.android.ad.splash.l;
import com.ss.android.ad.splash.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

final class q implements p {

    /* renamed from: a  reason: collision with root package name */
    private l f58681a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f58682b;

    /* renamed from: c  reason: collision with root package name */
    private long f58683c;

    /* renamed from: d  reason: collision with root package name */
    private View f58684d;

    static {
        Covode.recordClassIndex(36369);
    }

    @Override // com.ss.android.ad.splash.core.p
    public final void b() {
        this.f58683c = System.currentTimeMillis();
    }

    private void d() {
        this.f58682b = true;
        s.r().f58688a = false;
    }

    @Override // com.ss.android.ad.splash.core.p
    public final void c() {
        this.f58681a.a(a(4));
        d();
    }

    @Override // com.ss.android.ad.splash.core.p
    public final void a() {
        if (!this.f58682b) {
            d();
            b.a().c();
            this.f58681a.a(a(0));
        }
    }

    private static o a(int i2) {
        o oVar = new o();
        oVar.f58680a = i2;
        return oVar;
    }

    @Override // com.ss.android.ad.splash.core.p
    public final void b(com.ss.android.ad.splash.core.e.b bVar) {
        this.f58681a.a(bVar.f58441d, bVar.f58447j);
    }

    @Override // com.ss.android.ad.splash.core.p
    public final void a(com.ss.android.ad.splash.core.e.b bVar) {
        String str;
        if (!this.f58682b) {
            int i2 = bVar.q;
            if (h.f58584m) {
                int i3 = 1;
                if (i2 == 0 || i2 == 1 || i2 == 4) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    if (bVar.C) {
                        str = "real_time";
                    } else {
                        str = "not_real_time";
                    }
                    if (h.X != -1) {
                        if (h.X != 1) {
                            i3 = 2;
                        }
                        hashMap2.put("awemelaunch", Integer.valueOf(i3));
                    }
                    hashMap2.put("show_type", str);
                    hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - this.f58683c));
                    hashMap.put("is_ad_event", "1");
                    if (!TextUtils.isEmpty(bVar.f58447j)) {
                        hashMap.put("log_extra", bVar.f58447j);
                    }
                    hashMap.put("ad_fetch_time", Long.valueOf(bVar.f58439b));
                    com.ss.android.ad.splash.core.c.b.a();
                    com.ss.android.ad.splash.core.c.b.a(bVar, 0, "show_over", hashMap, hashMap2);
                }
            }
            d();
            b.a().c();
            this.f58681a.a(a(2));
        }
    }

    public q(View view, l lVar) {
        this.f58684d = view;
        this.f58681a = lVar;
    }

    @Override // com.ss.android.ad.splash.core.p
    public final void c(com.ss.android.ad.splash.core.e.b bVar, c cVar) {
        boolean z;
        if (this.f58682b) {
            g.b("mAdEnded");
        }
        g.b("onVideoAdEndAndGoLandingPage");
        List<q.b> a2 = a("", "", bVar.f58448k);
        if (f.b(a2)) {
            com.ss.android.ad.splash.q w = bVar.w();
            w.n = cVar.f58459h;
            if (bVar.G == 3) {
                z = true;
            } else {
                z = false;
            }
            w.o = z;
            w.f59012j = a2;
            this.f58681a.a(w);
        } else {
            this.f58681a.a(a(2));
        }
        d();
    }

    @Override // com.ss.android.ad.splash.core.p
    public final void a(com.ss.android.ad.splash.core.e.b bVar, int i2) {
        if (!this.f58682b) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            if (i2 != -1) {
                try {
                    jSONObject2.putOpt("position", Integer.valueOf(i2));
                } catch (Exception unused) {
                    jSONObject = null;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.f58683c;
            long j3 = currentTimeMillis - j2;
            if (j2 != 0 && (bVar.q == 2 || bVar.q == 3)) {
                jSONObject2.putOpt("duration", Long.valueOf(j3));
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            if (bVar.q == 0 || bVar.q == 4) {
                jSONObject.putOpt("show_time", Long.valueOf(j3));
            }
            if (!com.ss.android.ad.splash.f.l.a(bVar.f58447j)) {
                jSONObject.putOpt("log_extra", bVar.f58447j);
            }
            jSONObject.putOpt("is_ad_event", "1");
            jSONObject.put("ad_fetch_time", bVar.f58439b);
            h.a(bVar.f58441d, "splash_ad", "skip", jSONObject);
            b.a().c();
            d();
            this.f58681a.a(a(1));
        }
    }

    @Override // com.ss.android.ad.splash.core.p
    public final boolean b(com.ss.android.ad.splash.core.e.b bVar, c cVar) {
        JSONObject jSONObject;
        String str;
        if (this.f58682b) {
            g.b("mAdEnded");
        }
        g.b("onVideoAdClick");
        List<q.b> a2 = a(bVar.f58442e, bVar.f58444g, bVar.f58448k);
        boolean z = false;
        if (!f.b(a2)) {
            return false;
        }
        com.ss.android.ad.splash.q w = bVar.w();
        w.n = cVar.f58459h;
        if (bVar.G == 3) {
            z = true;
        }
        w.o = z;
        w.f59012j = a2;
        this.f58681a.a(w);
        try {
            Point point = cVar.f58454c;
            jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("click_x", Integer.valueOf(point.x));
            jSONObject2.putOpt("click_y", Integer.valueOf(point.y));
            if (bVar.G == 3 && cVar.f58458g == 0) {
                jSONObject2.putOpt("duration", Long.valueOf(cVar.f58459h));
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.put("ad_fetch_time", bVar.f58439b);
            if (!com.ss.android.ad.splash.f.l.a(bVar.f58447j)) {
                jSONObject.put("log_extra", bVar.f58447j);
            }
            jSONObject.putOpt("is_ad_event", "1");
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (!TextUtils.isEmpty(cVar.f58460i)) {
            str = cVar.f58460i;
        } else if (cVar.f58453b) {
            str = "click";
        } else {
            str = "banner_click";
        }
        h.a(bVar.f58441d, "splash_ad", str, jSONObject);
        h.h().h();
        if (bVar.r != null) {
            c.a aVar = new c.a();
            aVar.f58598a = j.a((a) bVar);
            com.ss.android.ad.splash.core.i.c a3 = aVar.a();
            if (h.a().f58910b) {
                h.g().a(null, "click", bVar.f58441d, bVar.y, bVar.f58447j, true, -1, null, a3);
            } else {
                h.g().b(null, bVar.f58441d, bVar.y, bVar.f58447j, true, -1, null, a3);
            }
        }
        d();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a8 A[RETURN] */
    @Override // com.ss.android.ad.splash.core.p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ad.splash.core.e.b r28, com.ss.android.ad.splash.core.e.c r29) {
        /*
        // Method dump skipped, instructions count: 426
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.q.a(com.ss.android.ad.splash.core.e.b, com.ss.android.ad.splash.core.e.c):boolean");
    }

    private static List<q.b> a(String str, String str2, String str3) {
        int a2;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && j.b(str) && (a2 = j.a(str)) != 0) {
            if (a2 != 5) {
                arrayList.add(new q.b(str, a2));
            } else if (h.f58575d != null && h.f58575d.a()) {
                arrayList.add(new q.b(str, 1));
            }
        }
        if (p.b(str2) && h.f58575d != null && h.f58575d.a()) {
            arrayList.add(new q.b(str2, 5));
        }
        if (p.a(str3)) {
            arrayList.add(new q.b(str3, 2));
        }
        return arrayList;
    }
}
