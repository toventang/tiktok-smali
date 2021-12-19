package com.ss.android.ugc.aweme.bullet.business;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.f.a.b;
import com.bytedance.ies.bullet.service.f.a.b.a;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.bullet.module.ad.c;
import com.ss.android.ugc.aweme.bullet.module.ad.h;
import com.ss.android.ugc.aweme.commercialize.log.a.a;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class AdLynxStatBusiness extends BulletBusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public boolean f69206a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f69207b;

    /* renamed from: c  reason: collision with root package name */
    public long f69208c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f69209d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private boolean f69210e;

    /* renamed from: f  reason: collision with root package name */
    private long f69211f;

    static {
        Covode.recordClassIndex(42674);
    }

    private final h c() {
        b bVar = this.f69222k.f69252a;
        if (!(bVar instanceof h)) {
            bVar = null;
        }
        return (h) bVar;
    }

    public final void b() {
        this.f69210e = false;
        this.f69211f = System.currentTimeMillis();
    }

    public final void a() {
        Object obj;
        a aVar;
        h c2 = c();
        if (c2 == null || (aVar = c2.at) == null) {
            obj = null;
        } else {
            obj = aVar.b();
        }
        if (!(!l.a(obj, (Object) true))) {
            this.f69206a = true;
            c("load_finish");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLynxStatBusiness(a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    public final void b(String str) {
        Object obj;
        a aVar;
        h c2 = c();
        if (c2 == null || (aVar = c2.at) == null) {
            obj = null;
        } else {
            obj = aVar.b();
        }
        if (!(!l.a(obj, (Object) true))) {
            a("init_fail", str);
        }
    }

    public final void a(String str) {
        Object obj;
        a aVar;
        h c2 = c();
        if (c2 == null || (aVar = c2.at) == null) {
            obj = null;
        } else {
            obj = aVar.b();
        }
        if (!(!l.a(obj, (Object) true))) {
            this.f69206a = true;
            this.f69207b = true;
            if (str != null) {
                this.f69209d.add(str);
            }
        }
    }

    private final void c(String str) {
        String str2;
        c cVar = this.f69222k.f69253b;
        if (cVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("render_type", "lynx");
            if (l.a((Object) "load_finish", (Object) str)) {
                linkedHashMap.put("duration", Long.valueOf(this.f69208c));
            } else if (l.a((Object) "stay_page", (Object) str)) {
                long currentTimeMillis = System.currentTimeMillis() - this.f69211f;
                this.f69211f = 0;
                if (currentTimeMillis > 0) {
                    linkedHashMap.put("stay_time", Long.valueOf(currentTimeMillis));
                    this.f69210e = true;
                } else {
                    return;
                }
            }
            h c2 = c();
            if (c2 != null) {
                str2 = c2.b();
            } else {
                str2 = null;
            }
            linkedHashMap.put("channel_name", str2);
            a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
            a2.f74715a = "ad_wap_stat";
            a2.f74716b = str;
            a.b c3 = a2.a(Long.valueOf(cVar.b())).c(cVar.d());
            c3.f74718d = cVar.c();
            c3.a(linkedHashMap).c();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    hashMap.put(entry.getKey(), value);
                }
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("ad_wap_stat", str, String.valueOf(cVar.b()), cVar.d(), cVar.c()).a(hashMap).c();
        }
    }

    public final void a(boolean z) {
        Object obj;
        Activity a2;
        com.bytedance.ies.bullet.service.f.a.b.a aVar;
        h c2 = c();
        if (c2 == null || (aVar = c2.at) == null) {
            obj = null;
        } else {
            obj = aVar.b();
        }
        if (!(!l.a(obj, (Object) true)) && (a2 = this.f69222k.a()) != null) {
            if (!this.f69210e) {
                c("stay_page");
            }
            if (!z && !a2.isFinishing()) {
                return;
            }
            if (!this.f69206a) {
                c("load");
            } else if (this.f69207b) {
                a("load_fail", this.f69209d.toString());
            }
        }
    }

    private final void a(String str, String str2) {
        String str3;
        c cVar = this.f69222k.f69253b;
        if (cVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            h c2 = c();
            if (c2 != null) {
                str3 = c2.b();
            } else {
                str3 = null;
            }
            linkedHashMap.put("channel_name", str3);
            linkedHashMap.put("status", str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("message", str2);
            a.b a2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a();
            a2.f74715a = "lynx_landing_page";
            a2.f74716b = "fallback";
            a.b c3 = a2.a(Long.valueOf(cVar.b())).c(cVar.d());
            c3.f74718d = cVar.c();
            c3.a(linkedHashMap).c();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    hashMap.put(entry.getKey(), value);
                }
            }
            com.bytedance.ies.ugc.aweme.rich.a.a.a("lynx_landing_page", "fallback", String.valueOf(cVar.b()), cVar.d(), cVar.c()).a(hashMap).c();
        }
    }
}
