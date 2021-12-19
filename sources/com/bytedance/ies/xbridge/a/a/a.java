package com.bytedance.ies.xbridge.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.a.c.a;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.model.params.c;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f35728a = "x.getUserInfo";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f35729b = b.a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.a.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0810a {
        static {
            Covode.recordClassIndex(21327);
        }

        void a(com.bytedance.ies.xbridge.a.c.a aVar, String str);

        void a(String str);
    }

    static {
        Covode.recordClassIndex(21326);
    }

    public abstract void a(c cVar, AbstractC0810a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f35728a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f35729b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<c> d() {
        return c.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.a.c.a> e() {
        return com.bytedance.ies.xbridge.a.c.a.class;
    }

    public static final class b implements AbstractC0810a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f35730a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f35731b;

        static {
            Covode.recordClassIndex(21328);
        }

        @Override // com.bytedance.ies.xbridge.a.a.a.AbstractC0810a
        public final void a(String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f35731b, 0, str, null, 8);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f35730a = aVar;
            this.f35731b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.a.a.a.AbstractC0810a
        public final void a(com.bytedance.ies.xbridge.a.c.a aVar, String str) {
            Boolean bool;
            l.c(aVar, "");
            l.c(str, "");
            l.c(aVar, "");
            Boolean bool2 = aVar.f35751b;
            if (bool2 != null) {
                bool2.booleanValue();
                if (aVar.f35750a != null) {
                    a.b bVar = aVar.f35750a;
                    if (bVar != null) {
                        if (!(bVar.f35752a == null || bVar.f35753b == null || bVar.f35754c == null || bVar.f35755d == null || (bool = bVar.f35757f) == null)) {
                            bool.booleanValue();
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Boolean bool3 = aVar.f35751b;
                    if (bool3 != null) {
                        linkedHashMap.put("hasLoggedIn", Boolean.valueOf(bool3.booleanValue()));
                    }
                    a.b bVar2 = aVar.f35750a;
                    if (bVar2 != null) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        String str2 = bVar2.f35752a;
                        if (str2 != null) {
                            linkedHashMap2.put("userID", str2);
                        }
                        String str3 = bVar2.f35753b;
                        if (str3 != null) {
                            linkedHashMap2.put("secUserID", str3);
                        }
                        String str4 = bVar2.f35754c;
                        if (str4 != null) {
                            linkedHashMap2.put("uniqueID", str4);
                        }
                        String str5 = bVar2.f35755d;
                        if (str5 != null) {
                            linkedHashMap2.put("nickname", str5);
                        }
                        String str6 = bVar2.f35756e;
                        if (str6 != null) {
                            linkedHashMap2.put("avatarURL", str6);
                        }
                        Boolean bool4 = bVar2.f35757f;
                        if (bool4 != null) {
                            linkedHashMap2.put("hasBoundPhone", Boolean.valueOf(bool4.booleanValue()));
                        }
                        linkedHashMap.put("userInfo", linkedHashMap2);
                    }
                    a.a(this.f35731b, linkedHashMap, str);
                    return;
                }
            }
            com.bytedance.ies.xbridge.c.a.a(this.f35731b, -5, null, null, 12);
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
