package com.bytedance.ies.xbridge.g.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.params.c;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f35977a = "x.getAppInfo";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f35978b = b.a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.g.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0829a {
        static {
            Covode.recordClassIndex(21518);
        }

        void a(com.bytedance.ies.xbridge.g.c.a aVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21517);
    }

    public abstract void a(c cVar, AbstractC0829a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35977a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35978b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> d() {
        return c.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.g.c.a> e() {
        return com.bytedance.ies.xbridge.g.c.a.class;
    }

    public static final class b implements AbstractC0829a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f35979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35980b;

        static {
            Covode.recordClassIndex(21519);
        }

        @Override // com.bytedance.ies.xbridge.g.a.a.AbstractC0829a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f35980b, 0, str, null, 8);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f35979a = aVar;
            this.f35980b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.g.a.a.AbstractC0829a
        public final void a(com.bytedance.ies.xbridge.g.c.a aVar, String str) {
            Boolean bool;
            Boolean bool2;
            l.c(aVar, "");
            l.c(str, "");
            l.c(aVar, "");
            if (!(aVar.f35985a == null || aVar.f35986b == null || aVar.f35987c == null || aVar.f35988d == null || aVar.f35989e == null || (bool = aVar.f35991g) == null)) {
                bool.booleanValue();
                if (!(aVar.f35993i == null || aVar.f35995k == null || aVar.f35996l == null || aVar.f35997m == null || aVar.n == null || (bool2 = aVar.o) == null)) {
                    bool2.booleanValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String str2 = aVar.f35985a;
                    if (str2 != null) {
                        linkedHashMap.put("appID", str2);
                    }
                    String str3 = aVar.f35986b;
                    if (str3 != null) {
                        linkedHashMap.put("installID", str3);
                    }
                    String str4 = aVar.f35987c;
                    if (str4 != null) {
                        linkedHashMap.put("appName", str4);
                    }
                    String str5 = aVar.f35988d;
                    if (str5 != null) {
                        linkedHashMap.put("appVersion", str5);
                    }
                    String str6 = aVar.f35989e;
                    if (str6 != null) {
                        linkedHashMap.put("channel", str6);
                    }
                    String str7 = aVar.f35990f;
                    if (str7 != null) {
                        linkedHashMap.put("language", str7);
                    }
                    Boolean bool3 = aVar.f35991g;
                    if (bool3 != null) {
                        linkedHashMap.put("isTeenMode", Boolean.valueOf(bool3.booleanValue()));
                    }
                    String str8 = aVar.f35993i;
                    if (str8 != null) {
                        linkedHashMap.put("osVersion", str8);
                    }
                    Integer num = aVar.f35994j;
                    if (num != null) {
                        linkedHashMap.put("statusBarHeight", Integer.valueOf(num.intValue()));
                    }
                    String str9 = aVar.f35995k;
                    if (str9 != null) {
                        linkedHashMap.put("devicePlatform", str9);
                    }
                    String str10 = aVar.f35996l;
                    if (str10 != null) {
                        linkedHashMap.put("deviceModel", str10);
                    }
                    String str11 = aVar.f35997m;
                    if (str11 != null) {
                        linkedHashMap.put("netType", str11);
                    }
                    String str12 = aVar.n;
                    if (str12 != null) {
                        linkedHashMap.put("carrier", str12);
                    }
                    String str13 = aVar.f35992h;
                    if (str13 != null) {
                        linkedHashMap.put("appTheme", str13);
                    }
                    Boolean bool4 = aVar.o;
                    if (bool4 != null) {
                        linkedHashMap.put("is32Bit", Boolean.valueOf(bool4.booleanValue()));
                    }
                    a.a(this.f35980b, linkedHashMap, str);
                    return;
                }
            }
            com.bytedance.ies.xbridge.c.a.a(this.f35980b, -5, null, null, 12);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        a(c.a.a(nVar), new b(this, bVar), eVar);
    }
}
