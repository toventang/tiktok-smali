package com.bytedance.sdk.xbridge.protocol.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.ad;
import com.bytedance.ies.web.jsbridge2.ai;
import com.bytedance.ies.web.jsbridge2.x;
import com.bytedance.sdk.xbridge.a.c;
import com.bytedance.sdk.xbridge.protocol.a.a;
import com.bytedance.sdk.xbridge.protocol.c.c;
import com.bytedance.sdk.xbridge.protocol.c.d;
import com.bytedance.sdk.xbridge.protocol.d.e;
import com.bytedance.sdk.xbridge.protocol.impl.a.a;
import com.bytedance.sdk.xbridge.registry.core_api.i;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String f43943b = f43943b;

    /* renamed from: c  reason: collision with root package name */
    public static final C1069a f43944c = new C1069a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f43945a;

    /* renamed from: com.bytedance.sdk.xbridge.protocol.b.a$a  reason: collision with other inner class name */
    public static final class C1069a {
        static {
            Covode.recordClassIndex(26848);
        }

        private C1069a() {
        }

        public /* synthetic */ C1069a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(26847);
    }

    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.sdk.xbridge.protocol.c.b f43946a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.sdk.xbridge.protocol.c.a f43947b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.sdk.xbridge.protocol.a.a f43948c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a.d.C1071a f43949d;

        static {
            Covode.recordClassIndex(26849);
        }

        @Override // com.bytedance.sdk.xbridge.protocol.c.d
        public final void a(Object obj) {
            l.c(obj, "");
            this.f43946a.a();
            this.f43947b.a(new com.bytedance.sdk.xbridge.protocol.a.b(obj), this.f43948c, this.f43949d);
        }

        b(com.bytedance.sdk.xbridge.protocol.c.b bVar, com.bytedance.sdk.xbridge.protocol.c.a aVar, com.bytedance.sdk.xbridge.protocol.a.a aVar2, a.d.C1071a aVar3) {
            this.f43946a = bVar;
            this.f43947b = aVar;
            this.f43948c = aVar2;
            this.f43949d = aVar3;
        }
    }

    public final void a(com.bytedance.sdk.xbridge.protocol.a.a aVar, com.bytedance.sdk.xbridge.protocol.c.a aVar2, com.bytedance.sdk.xbridge.protocol.a aVar3, a.d.C1071a aVar4) {
        com.bytedance.sdk.xbridge.protocol.a.b a2;
        c.a aVar5;
        l.c(aVar, "");
        l.c(aVar2, "");
        l.c(aVar3, "");
        if (aVar3.f43920b == null) {
            aVar3.f43920b = new com.bytedance.sdk.xbridge.protocol.b(aVar3);
        }
        if (this.f43945a == null) {
            this.f43945a = new i();
        }
        ad a3 = x.a("host");
        if (a3 != null) {
            HashMap hashMap = new HashMap();
            Map<String, List<ad.b>> map = a3.f35575a;
            int i2 = 0;
            hashMap.put("DEFAULT", new com.bytedance.sdk.xbridge.a.a.b("DEFAULT", new JSONObject(), (byte) 0));
            if (map != null && (!map.isEmpty())) {
                for (Map.Entry<String, List<ad.b>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    List<ad.b> value = entry.getValue();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    l.a((Object) value, "");
                    int size = value.size();
                    while (i2 < size) {
                        ad.b bVar = value.get(i2);
                        Pattern pattern = bVar.f35585a;
                        ai aiVar = bVar.f35586b;
                        if (aiVar != null) {
                            int i3 = b.f43950a[aiVar.ordinal()];
                            if (i3 == 1) {
                                aVar5 = c.a.PUBLIC;
                            } else if (i3 == 2) {
                                aVar5 = c.a.PROTECT;
                            } else if (i3 == 3) {
                                aVar5 = c.a.PRIVATE;
                            } else if (i3 == 4) {
                                aVar5 = c.a.SECURE;
                            }
                            if (aVar5 != null) {
                                List<String> list = bVar.f35587c;
                                List<String> list2 = bVar.f35588d;
                                l.a((Object) list, "");
                                l.a((Object) list2, "");
                                com.bytedance.sdk.xbridge.a.a.a aVar6 = new com.bytedance.sdk.xbridge.a.a.a(pattern, aVar5, list, list2);
                                if (linkedHashMap.get(key) == null) {
                                    l.a((Object) key, "");
                                    linkedHashMap.put(key, new ArrayList());
                                }
                                List list3 = (List) linkedHashMap.get(key);
                                if (list3 != null) {
                                    list3.add(aVar6);
                                }
                            }
                        }
                        i2++;
                    }
                    com.bytedance.sdk.xbridge.a.a.b bVar2 = (com.bytedance.sdk.xbridge.a.a.b) hashMap.get("DEFAULT");
                    if (bVar2 != null) {
                        l.c(linkedHashMap, "");
                        bVar2.f43905a.putAll(linkedHashMap);
                    }
                    i2 = 0;
                }
            }
            l.c(hashMap, "");
            com.bytedance.sdk.xbridge.a.c.a.f43917a.putAll(hashMap);
        }
        e.b(f43943b, "realDispatchBridgeMethod: " + Thread.currentThread() + " and call is \n" + aVar);
        com.bytedance.sdk.xbridge.protocol.c.b bVar3 = aVar3.f43920b;
        if (bVar3 == null) {
            l.a();
        }
        bVar3.b(aVar);
        a.b bVar4 = aVar.f43937k;
        if (bVar4 == null) {
            l.a("platform");
        }
        if (bVar4 == a.b.Web && (a2 = bVar3.a(aVar)) != null && a2.a().optInt("code") == -1) {
            bVar3.a();
            aVar2.a(a2, aVar, aVar4);
            return;
        }
        com.bytedance.sdk.xbridge.protocol.c.c cVar = this.f43945a;
        if (cVar == null) {
            l.a();
        }
        cVar.a(aVar3, aVar.f43928b, aVar.f43933g, aVar.f43936j, aVar.f43931e, new b(bVar3, aVar2, aVar, aVar4));
    }
}
