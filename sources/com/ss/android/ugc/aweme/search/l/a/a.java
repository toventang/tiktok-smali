package com.ss.android.ugc.aweme.search.l.a;

import android.view.View;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.a.c;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.discover.api.SearchApi;
import com.ss.android.ugc.aweme.search.l.a.a.b;
import com.ss.android.ugc.aweme.search.l.a.a.c;
import com.ss.android.ugc.aweme.search.l.a.a.d;
import com.ss.android.ugc.aweme.search.l.a.a.e;
import h.z;
import java.util.Map;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f121300a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f121301b;

    /* renamed from: c  reason: collision with root package name */
    public static e f121302c = new e();

    /* renamed from: d  reason: collision with root package name */
    public static d f121303d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static b f121304e = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final a f121305f = new a();

    /* renamed from: g  reason: collision with root package name */
    private static c f121306g = new c();

    private a() {
    }

    public static boolean c() {
        String str;
        if (!f121303d.e() || (str = f121304e.f121310d) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(79065);
    }

    private static void d() {
        f121300a = false;
        f121301b = false;
        c cVar = f121306g;
        cVar.a((String) null);
        cVar.a((l.a) null);
        cVar.a((com.bytedance.frameworks.baselib.network.a.d) null);
        e eVar = f121302c;
        eVar.f121329b = null;
        eVar.f121330c = null;
        eVar.f121331d = -2;
        eVar.f121332e = null;
        eVar.f121333f = null;
        eVar.f121334g = null;
        eVar.f121335h = null;
        b bVar = f121304e;
        bVar.f121311e = null;
        bVar.f121308b = null;
        bVar.f121310d = null;
        bVar.f121309c = null;
        d dVar = f121303d;
        dVar.f121315b = -1;
        dVar.f121316c = -1;
        dVar.f121317d = -1;
        dVar.f121318e = -1;
        dVar.f121319f = -1;
        dVar.f121320g = -1;
        dVar.f121321h = -1;
        dVar.f121322i = -1;
        dVar.f121323j = -1;
        dVar.f121324k = -1;
        dVar.f121325l = -1;
        dVar.n = null;
        dVar.f121326m = -1;
        dVar.p = null;
        dVar.v = null;
        dVar.w = null;
        dVar.o = false;
    }

    public final void a() {
        long j2;
        if (!f121300a && !f121301b && c()) {
            d dVar = f121303d;
            if (dVar.f121315b != -1 && dVar.p == null) {
                dVar.p = Long.valueOf(System.currentTimeMillis() - dVar.f121315b);
                Long l2 = dVar.p;
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = 0;
                }
                dVar.a("cost", Long.valueOf(j2));
            }
            b();
        }
    }

    public static void b() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : f121306g.f121307a.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (a(value)) {
                    jSONObject.put(key, value);
                }
            }
            for (Map.Entry<String, Object> entry2 : f121304e.f121307a.entrySet()) {
                String key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                if (a(value2)) {
                    jSONObject.put(key2, value2);
                }
            }
            for (Map.Entry<String, Object> entry3 : f121303d.f121307a.entrySet()) {
                String key3 = entry3.getKey();
                Object value3 = entry3.getValue();
                if (a(value3)) {
                    jSONObject.put(key3, value3);
                }
            }
            for (Map.Entry<String, Object> entry4 : f121302c.f121307a.entrySet()) {
                String key4 = entry4.getKey();
                Object value4 = entry4.getValue();
                if (a(value4)) {
                    jSONObject.put(key4, value4);
                }
            }
            com.ss.android.common.c.a.a("search_trigger_refresh_monitor_v3", jSONObject);
        } catch (Exception unused) {
        } finally {
            d();
            f121300a = true;
        }
    }

    public static void a(h.f.a.b<? super e, z> bVar) {
        h.f.b.l.d(bVar, "");
        bVar.invoke(f121302c);
    }

    private static boolean a(Object obj) {
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num == null || Math.abs(num.intValue()) >= 1000000) {
                return false;
            }
            return true;
        } else if (!(obj instanceof Long)) {
            return true;
        } else {
            Long l2 = (Long) obj;
            if (l2 == null || Math.abs(l2.longValue()) >= 1000000) {
                return false;
            }
            return true;
        }
    }

    public final void onEventStart(com.ss.android.ugc.aweme.search.model.d dVar) {
        String str;
        String str2;
        d();
        b bVar = f121304e;
        Integer num = null;
        if (dVar != null) {
            str = dVar.getKeyword();
        } else {
            str = null;
        }
        if (bVar.f121310d == null) {
            bVar.f121310d = str;
            if (str == null) {
                str = "";
            }
            bVar.a("search_keyword", str);
        }
        if (dVar != null) {
            str2 = dVar.getSearchFrom();
        } else {
            str2 = null;
        }
        if (bVar.f121308b == null) {
            bVar.f121308b = str2;
            if (str2 == null) {
                str2 = "";
            }
            bVar.a("search_source", str2);
        }
        if (dVar != null) {
            num = Integer.valueOf(dVar.getIndex());
        }
        if (bVar.f121309c == null && num != null) {
            num.intValue();
            bVar.f121309c = num;
            bVar.a("search_position", num);
        }
        c cVar = f121306g;
        cVar.a(SearchApi.f80771a);
        f fVar = f.a.f68431a;
        h.f.b.l.b(fVar, "");
        cVar.a(fVar.f68429a);
        com.bytedance.frameworks.baselib.network.a.c cVar2 = c.a.f28835a;
        h.f.b.l.b(cVar2, "");
        cVar.a(cVar2.a());
        if (cVar.f121312b == l.a.NONE || cVar.f121312b == l.a.NONE) {
            f121302c.a(1, "NO_NETWORK");
        }
        e eVar = f121302c;
        if (eVar.f121332e == null) {
            eVar.f121332e = 0;
            eVar.a("count", (Object) 0);
        }
        f121303d.f121315b = System.currentTimeMillis();
    }

    public static void a(View view, String str) {
        h.f.b.l.d(view, "");
        f121303d.a(view, str);
    }
}
