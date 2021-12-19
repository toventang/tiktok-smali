package com.bytedance.ies.xbridge.base.runtime.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.k;
import com.bytedance.ies.xbridge.l;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.o.c;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import h.q;
import h.r;
import h.w;
import h.z;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f35835a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static String f35836b = d.class.getSimpleName();

    private d() {
    }

    static {
        Covode.recordClassIndex(21398);
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f35837a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Integer f35838b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Throwable f35839c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f35840d;

        static {
            Covode.recordClassIndex(21399);
        }

        a(a aVar, Integer num, Throwable th, String str) {
            this.f35837a = aVar;
            this.f35838b = num;
            this.f35839c = th;
            this.f35840d = str;
        }

        public final void run() {
            try {
                a aVar = this.f35837a;
                Integer num = this.f35838b;
                Throwable th = this.f35839c;
                if (th == null) {
                    th = new Throwable(this.f35840d);
                }
                aVar.a(num, th);
                q.m223constructorimpl(z.f158842a);
            } catch (Throwable th2) {
                q.m223constructorimpl(r.a(th2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f35841a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinkedHashMap f35842b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f35843c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Integer f35844d;

        static {
            Covode.recordClassIndex(21400);
        }

        b(String str, LinkedHashMap linkedHashMap, a aVar, Integer num) {
            this.f35841a = str;
            this.f35842b = linkedHashMap;
            this.f35843c = aVar;
            this.f35844d = num;
        }

        public final void run() {
            z zVar;
            JSONObject jSONObject;
            String str;
            try {
                jSONObject = new JSONObject(this.f35841a);
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
                return;
            }
            this.f35843c.a(jSONObject, this.f35842b, this.f35844d);
            zVar = z.f158842a;
            q.m223constructorimpl(zVar);
        }
    }

    public static LinkedHashMap<String, String> a(n nVar) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (nVar != null) {
            l a2 = nVar.a();
            while (a2.a()) {
                String b2 = a2.b();
                String str = i.a(nVar, b2, "");
                if (str.length() > 0 && str != null) {
                    linkedHashMap.put(b2, str);
                }
            }
        }
        return linkedHashMap;
    }

    public static void a(com.bytedance.ies.xbridge.base.runtime.b.b bVar, a aVar) {
        if (bVar == null) {
            a((Integer) -408, "connection failed", (Throwable) null, aVar);
            return;
        }
        String a2 = bVar.a();
        if (a2 == null || a2.length() <= 0) {
            if (!a(bVar.c(), bVar.d(), bVar.e(), aVar)) {
                a((String) null, bVar.b(), bVar.c(), aVar);
            }
        } else if (!a(bVar.c(), bVar.d(), bVar.e(), aVar)) {
            a(a2, bVar.b(), bVar.c(), aVar);
        }
    }

    public static String a(String str, n nVar, e eVar) {
        String str2 = "";
        h.f.b.l.c(str, str2);
        h.f.b.l.c(eVar, str2);
        com.bytedance.ies.xbridge.base.runtime.b.d dVar = new com.bytedance.ies.xbridge.base.runtime.b.d(str);
        if (nVar != null) {
            l a2 = nVar.a();
            while (a2.a()) {
                String b2 = a2.b();
                k i2 = nVar.i(b2);
                switch (e.f35846b[i2.a().ordinal()]) {
                    case 1:
                        dVar.a(b2, String.valueOf(i2.d()));
                        break;
                    case 2:
                        dVar.a(b2, String.valueOf(i2.c()));
                        break;
                    case 3:
                        dVar.a(b2, i2.e());
                        break;
                    case 4:
                        dVar.a(b2, String.valueOf(i2.b()));
                        break;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        n g2 = i2.g();
                        if (g2 == null) {
                            h.f.b.l.a();
                        }
                        String jSONObject = c.a(g2).toString();
                        h.f.b.l.a((Object) jSONObject, str2);
                        dVar.a(b2, jSONObject);
                        break;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        m f2 = i2.f();
                        if (f2 == null) {
                            h.f.b.l.a();
                        }
                        String jSONArray = c.a(f2).toString();
                        h.f.b.l.a((Object) jSONArray, str2);
                        dVar.a(b2, jSONArray);
                        break;
                }
            }
        }
        if (eVar == e.WEB) {
            str2 = "h5";
        } else if (eVar == e.LYNX) {
            str2 = "lynx";
        }
        dVar.a("request_tag_from", str2);
        dVar.a();
        return dVar.a();
    }

    private static void a(String str, LinkedHashMap<String, String> linkedHashMap, Integer num, a aVar) {
        com.bytedance.ies.xbridge.base.runtime.c.a.a().post(new b(str, linkedHashMap, aVar, num));
    }

    private static boolean a(Integer num, String str, Throwable th, a aVar) {
        if (th == null && TextUtils.isEmpty(str)) {
            return false;
        }
        if ((str == null || str.length() <= 0) && (th == null || (str = th.getMessage()) == null)) {
            str = "";
        }
        com.bytedance.ies.xbridge.base.runtime.c.a.a().post(new a(aVar, num, th, str));
        return true;
    }

    public static void a(String str, Map<String, String> map, String str2, JSONObject jSONObject, a aVar, IHostNetworkDepend iHostNetworkDepend) {
        com.bytedance.ies.xbridge.base.runtime.b.b bVar;
        h.f.b.l.c(str, "");
        h.f.b.l.c(map, "");
        h.f.b.l.c(str2, "");
        h.f.b.l.c(jSONObject, "");
        h.f.b.l.c(aVar, "");
        h.f.b.l.c(iHostNetworkDepend, "");
        try {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.putAll(map);
            if (h.f.b.l.a((Object) str2, (Object) "application/json")) {
                com.bytedance.ies.xbridge.base.runtime.b.c a2 = new com.bytedance.ies.xbridge.base.runtime.b.c(str).a(linkedHashMap).a(str2);
                a2.f35814b = true;
                String jSONObject2 = jSONObject.toString();
                h.f.b.l.a((Object) jSONObject2, "");
                Charset forName = Charset.forName("UTF-8");
                h.f.b.l.a((Object) forName, "");
                if (jSONObject2 != null) {
                    byte[] bytes = jSONObject2.getBytes(forName);
                    h.f.b.l.a((Object) bytes, "");
                    a2.f35816d = bytes;
                    bVar = a2.a(iHostNetworkDepend);
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next, "");
                    h.f.b.l.a((Object) next, "");
                    h.f.b.l.a((Object) optString, "");
                    linkedHashMap2.put(next, optString);
                }
                com.bytedance.ies.xbridge.base.runtime.b.c a3 = new com.bytedance.ies.xbridge.base.runtime.b.c(str).a(linkedHashMap).a((Map<String, String>) linkedHashMap2);
                a3.f35814b = true;
                bVar = a3.a(iHostNetworkDepend);
            }
            a(bVar, aVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, Map<String, String> map, String str2, byte[] bArr, a aVar, IHostNetworkDepend iHostNetworkDepend) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(map, "");
        h.f.b.l.c(str2, "");
        h.f.b.l.c(bArr, "");
        h.f.b.l.c(aVar, "");
        h.f.b.l.c(iHostNetworkDepend, "");
        try {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.putAll(map);
            com.bytedance.ies.xbridge.base.runtime.b.c a2 = new com.bytedance.ies.xbridge.base.runtime.b.c(str).a(linkedHashMap).a(str2);
            a2.f35814b = true;
            a2.f35816d = bArr;
            a(a2.a(iHostNetworkDepend), aVar);
        } catch (Throwable unused) {
        }
    }
}
