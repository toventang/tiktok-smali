package com.bytedance.ies.xbridge.system.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.params.a;
import com.bytedance.ies.xbridge.n;
import com.bytedance.ies.xbridge.system.c.g;
import com.bytedance.ies.xbridge.system.c.h;
import h.f.b.l;
import java.util.LinkedHashMap;

public abstract class f extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36435a = "x.setCalendarEvent";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36436b = b.a.PRIVATE;

    public interface a {

        /* renamed from: com.bytedance.ies.xbridge.system.a.f$a$a  reason: collision with other inner class name */
        public static final class C0880a {
            static {
                Covode.recordClassIndex(21852);
            }
        }

        static {
            Covode.recordClassIndex(21851);
        }

        void a(int i2, String str);

        void a(h hVar, String str);
    }

    static {
        Covode.recordClassIndex(21850);
    }

    public abstract void a(g gVar, a aVar, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36435a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36436b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<g> d() {
        return g.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<h> e() {
        return h.class;
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f36437a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36438b;

        static {
            Covode.recordClassIndex(21853);
        }

        b(f fVar, b.AbstractC0814b bVar) {
            this.f36437a = fVar;
            this.f36438b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.system.a.f.a
        public final void a(int i2, String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36438b, i2, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.system.a.f.a
        public final void a(h hVar, String str) {
            l.c(hVar, "");
            l.c(str, "");
            l.c(hVar, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = hVar.f36512a;
            if (str2 != null) {
                linkedHashMap.put("eventID", str2);
            }
            f.a(this.f36438b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        Long a2 = a.C0864a.a(nVar, "startDate");
        Long a3 = a.C0864a.a(nVar, "endDate");
        if (!(a2 == null || a3 == null)) {
            String str = i.a(nVar, "location", "");
            String str2 = i.a(nVar, "url", "");
            String str3 = i.a(nVar, "title", "");
            String str4 = i.a(nVar, "notes", "");
            boolean a4 = i.a(nVar, "allDay", false);
            long a5 = (long) a.C0864a.a(nVar, "alarmOffset", 0);
            g gVar = new g();
            gVar.f36503b = a2.longValue();
            gVar.f36502a = a3.longValue();
            gVar.f36505d = str3;
            gVar.f36506e = str4;
            gVar.f36507f = Long.valueOf(a5);
            gVar.f36509h = str;
            gVar.f36510i = str2;
            gVar.f36508g = Boolean.valueOf(a4);
            if (gVar.f36502a >= gVar.f36503b && gVar.f36502a > 0 && gVar.f36503b > 0) {
                a(gVar, new b(this, bVar), eVar);
                return;
            }
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, "paramModel convert to null!", null, 8);
    }
}
