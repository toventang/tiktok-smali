package com.ss.android.ugc.aweme.net.i;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerpreload.b.i;
import com.bytedance.ies.ugc.network.partner.b;
import com.bytedance.ies.ugc.network.partner.b.f;
import com.bytedance.ies.ugc.network.partner.b.g;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.net.preload.a;
import com.ss.android.ugc.aweme.net.preload.d;
import com.ss.android.ugc.aweme.network.a.e;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class h implements b.a, b.d, b.f {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, List<String>> f112370a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, PreloadExtraInfo> f112371b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final a f112372c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final Object f112373d;

    public static final class a {
        static {
            Covode.recordClassIndex(72215);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.ugc.network.partner.b
    public final String a() {
        return b.c.a(this);
    }

    static {
        Covode.recordClassIndex(72214);
    }

    public h(Object obj) {
        this.f112373d = obj;
    }

    private Object a(com.bytedance.ies.ugc.network.partner.a aVar) {
        l.d(aVar, "");
        return b.f.a.a(this, aVar);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.a
    public final u<?> b(f fVar, com.bytedance.ies.ugc.network.partner.a aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        l.d(fVar, "");
        l.d(aVar, "");
        return null;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public com.ss.android.ugc.aweme.net.preload.b f112374a;

        /* renamed from: b  reason: collision with root package name */
        public com.ss.android.ugc.aweme.net.preload.f f112375b = null;

        /* renamed from: c  reason: collision with root package name */
        public PreloadExtraInfo f112376c = null;

        /* renamed from: d  reason: collision with root package name */
        public String f112377d;

        static {
            Covode.recordClassIndex(72216);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f112374a, bVar.f112374a) && l.a(this.f112375b, bVar.f112375b) && l.a(this.f112376c, bVar.f112376c) && l.a(this.f112377d, bVar.f112377d);
        }

        public final int hashCode() {
            com.ss.android.ugc.aweme.net.preload.b bVar = this.f112374a;
            int i2 = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            com.ss.android.ugc.aweme.net.preload.f fVar = this.f112375b;
            int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
            PreloadExtraInfo preloadExtraInfo = this.f112376c;
            int hashCode3 = (hashCode2 + (preloadExtraInfo != null ? preloadExtraInfo.hashCode() : 0)) * 31;
            String str = this.f112377d;
            if (str != null) {
                i2 = str.hashCode();
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "PreloadInfoExt(preloadKey=" + this.f112374a + ", preloadContext=" + this.f112375b + ", preloadExtraInfo=" + this.f112376c + ", simpleUrl=" + this.f112377d + ")";
        }

        public b(com.ss.android.ugc.aweme.net.preload.b bVar, String str) {
            l.d(bVar, "");
            this.f112374a = bVar;
            this.f112377d = str;
        }
    }

    private static String a(String str, List<String> list) {
        Uri parse = Uri.parse(str);
        if (list != null) {
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            for (T t : list) {
                arrayList.add(((String) t) + '=' + parse.getQueryParameter(t));
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2 != null) {
                return n.a(arrayList2, "&", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62);
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.f
    public final void a(g<?> gVar, com.bytedance.ies.ugc.network.partner.a aVar) {
        Request request;
        com.ss.android.ugc.aweme.net.preload.b bVar;
        String str;
        MethodCollector.i(7633);
        l.d(gVar, "");
        l.d(aVar, "");
        if (!e.a()) {
            MethodCollector.o(7633);
            return;
        }
        com.bytedance.retrofit2.b<?> bVar2 = aVar.f35245a;
        if (bVar2 == null || (request = bVar2.request()) == null) {
            MethodCollector.o(7633);
            return;
        }
        Object a2 = a(aVar);
        com.ss.android.ugc.aweme.net.preload.f fVar = null;
        if (!(a2 instanceof b)) {
            a2 = null;
        }
        b bVar3 = (b) a2;
        u<?> a3 = gVar.a();
        if (bVar3 != null) {
            bVar = bVar3.f112374a;
            fVar = bVar3.f112375b;
        } else {
            bVar = null;
        }
        l.d(request, "");
        l.d(a3, "");
        if (d.a(request)) {
            l.d(a3, "");
            if (com.ss.android.ugc.aweme.net.preload.a.f112496b == null || fVar == null) {
                MethodCollector.o(7633);
                return;
            } else if (bVar == null || (str = bVar.f112506b) == null) {
                MethodCollector.o(7633);
                return;
            } else if (str.length() != 0) {
                a.C2873a aVar2 = com.ss.android.ugc.aweme.net.preload.a.f112496b;
                if (aVar2 != null) {
                    l.d(a3, "");
                    if (a3.f42629a.a()) {
                        synchronized (aVar2.f112503a) {
                            try {
                                aVar2.f112503a.a(str, new com.ss.android.ugc.aweme.net.preload.e(fVar, a3));
                            } catch (Throwable th) {
                                MethodCollector.o(7633);
                                throw th;
                            }
                        }
                    }
                }
                com.ss.android.ugc.aweme.net.preload.a.a(str);
            }
        }
        MethodCollector.o(7633);
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.a
    public final u<?> a(f fVar, com.bytedance.ies.ugc.network.partner.a aVar) {
        String str;
        a.C2873a aVar2;
        u<?> uVar;
        String str2;
        List<String> list;
        List<String> list2;
        l.d(fVar, "");
        l.d(aVar, "");
        Integer num = null;
        if (!e.a()) {
            return null;
        }
        com.bytedance.ies.ugc.network.partner.b.h hVar = fVar.f35269b;
        String a2 = hVar.a();
        l.b(a2, "");
        b bVar = new b(new com.ss.android.ugc.aweme.net.preload.b(a2, (byte) 0), fVar.f35269b.a());
        Object obj = this.f112373d;
        if (obj != null) {
            if (obj instanceof i) {
                com.ss.android.ugc.aweme.net.preload.f fVar2 = new com.ss.android.ugc.aweme.net.preload.f((i) this.f112373d);
                String a3 = hVar.a();
                l.b(a3, "");
                fVar2.a(a3);
                bVar.f112375b = fVar2;
            } else if (obj instanceof com.ss.android.ugc.aweme.net.preload.f) {
                com.ss.android.ugc.aweme.net.preload.f fVar3 = (com.ss.android.ugc.aweme.net.preload.f) obj;
                String a4 = hVar.a();
                l.b(a4, "");
                fVar3.a(a4);
                bVar.f112375b = fVar3;
            }
        }
        String str3 = "1";
        if (fVar.f35276i == null || !(fVar.f35276i instanceof PreloadExtraInfo)) {
            String a5 = hVar.f35297e.a();
            Map<String, List<String>> map = f112370a;
            if (map.containsKey(a5)) {
                com.ss.android.ugc.aweme.net.preload.b bVar2 = bVar.f112374a;
                String a6 = hVar.a();
                l.b(a6, "");
                bVar2.f112506b = a(a6, map.get(a5));
            }
        } else {
            Object obj2 = fVar.f35276i;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.preload.PreloadExtraInfo");
            PreloadExtraInfo preloadExtraInfo = (PreloadExtraInfo) obj2;
            bVar.f112376c = preloadExtraInfo;
            f112371b.put(hVar.f35297e.a(), preloadExtraInfo);
            PreloadExtraInfo preloadExtraInfo2 = bVar.f112376c;
            if (!(preloadExtraInfo2 == null || (list2 = preloadExtraInfo2.f115723e) == null)) {
                f112370a.put(hVar.f35297e.a(), list2);
            }
            com.ss.android.ugc.aweme.net.preload.b bVar3 = bVar.f112374a;
            String hVar2 = hVar.toString();
            l.b(hVar2, "");
            PreloadExtraInfo preloadExtraInfo3 = bVar.f112376c;
            if (preloadExtraInfo3 != null) {
                list = preloadExtraInfo3.f115723e;
            } else {
                list = null;
            }
            bVar3.f112506b = a(hVar2, list);
            PreloadExtraInfo preloadExtraInfo4 = bVar.f112376c;
            if (preloadExtraInfo4 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String str4 = preloadExtraInfo4.f115719a;
                l.b(str4, "");
                linkedHashMap.put("enter_from", str4);
                String str5 = preloadExtraInfo4.f115721c;
                l.b(str5, "");
                linkedHashMap.put("url", str5);
                linkedHashMap.put("strategy_id", String.valueOf(preloadExtraInfo4.f115722d));
                r.a("preload", linkedHashMap);
            }
            fVar.f35269b.f35298f.b("preload", str3);
        }
        Request b2 = fVar.b();
        com.ss.android.ugc.aweme.net.preload.b bVar4 = bVar.f112374a;
        com.ss.android.ugc.aweme.net.preload.f fVar4 = bVar.f112375b;
        l.d(b2, "");
        if (!d.a(b2) || com.ss.android.ugc.aweme.net.preload.a.f112496b == null || bVar4 == null || (str = bVar4.f112506b) == null || p.a((CharSequence) str) || ((aVar2 = com.ss.android.ugc.aweme.net.preload.a.f112496b) != null && aVar2.f112503a.b() == 0 && com.ss.android.ugc.aweme.net.preload.a.f112495a.size() == 0 && fVar4 == null)) {
            uVar = null;
        } else {
            a.C2873a aVar3 = com.ss.android.ugc.aweme.net.preload.a.f112496b;
            if (aVar3 != null) {
                Integer.valueOf(aVar3.f112503a.b());
            }
            com.ss.android.ugc.aweme.net.preload.a.f112495a.size();
            uVar = (u) com.ss.android.ugc.aweme.net.preload.a.a(str, fVar4, new a.b(bVar4));
        }
        if (fVar.f35270c.a("check_preload") != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            PreloadExtraInfo preloadExtraInfo5 = f112371b.get(fVar.f35269b.f35297e.a());
            if (preloadExtraInfo5 != null) {
                str2 = preloadExtraInfo5.f115721c;
            } else {
                str2 = null;
            }
            linkedHashMap2.put("url", String.valueOf(str2));
            if (preloadExtraInfo5 != null) {
                num = Integer.valueOf(preloadExtraInfo5.f115722d);
            }
            linkedHashMap2.put("strategy_id", String.valueOf(num));
            if (uVar == null) {
                str3 = "0";
            }
            linkedHashMap2.put("is_preload", str3);
            r.a("preload_network_result", linkedHashMap2);
        }
        l.d(aVar, "");
        l.d(aVar, "");
        b.c.a(this, aVar, bVar);
        return uVar;
    }

    @Override // com.bytedance.ies.ugc.network.partner.b.d
    public final boolean a(f fVar, com.bytedance.ies.ugc.network.partner.a aVar, Throwable th, boolean z) {
        String str;
        l.d(fVar, "");
        l.d(aVar, "");
        l.d(th, "");
        Object a2 = a(aVar);
        if (!(a2 instanceof b)) {
            a2 = null;
        }
        b bVar = (b) a2;
        if (bVar == null) {
            return false;
        }
        PreloadExtraInfo preloadExtraInfo = bVar.f112376c;
        if (preloadExtraInfo != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = preloadExtraInfo.f115719a;
            l.b(str2, "");
            linkedHashMap.put("enter_from", str2);
            String str3 = preloadExtraInfo.f115721c;
            l.b(str3, "");
            linkedHashMap.put("url", str3);
            linkedHashMap.put("strategy_id", String.valueOf(preloadExtraInfo.f115722d));
            r.a("preload_fail", linkedHashMap);
        }
        com.ss.android.ugc.aweme.net.preload.b bVar2 = bVar.f112374a;
        if (bVar2 == null || (str = bVar2.f112506b) == null) {
            return false;
        }
        com.ss.android.ugc.aweme.net.preload.a.a(str);
        return false;
    }
}
