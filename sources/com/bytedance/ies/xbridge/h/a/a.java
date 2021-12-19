package com.bytedance.ies.xbridge.h.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.model.c.b;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: com.bytedance.ies.xbridge.h.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0833a {
        static {
            Covode.recordClassIndex(21534);
        }

        void a(int i2, String str);

        void a(com.bytedance.ies.xbridge.model.c.b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21533);
    }

    public abstract void a(com.bytedance.ies.xbridge.h.c.a aVar, AbstractC0833a aVar2, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return "x.reportADLog";
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return b.a.PROTECT;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.h.c.a> d() {
        return com.bytedance.ies.xbridge.h.c.a.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.model.c.b> e() {
        return com.bytedance.ies.xbridge.model.c.b.class;
    }

    public static final class b implements AbstractC0833a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f36007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36008b;

        static {
            Covode.recordClassIndex(21535);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f36007a = aVar;
            this.f36008b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.h.a.a.AbstractC0833a
        public final void a(int i2, String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36008b, i2, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.h.a.a.AbstractC0833a
        public final void a(com.bytedance.ies.xbridge.model.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            a.a(this.f36008b, b.a.a(bVar), str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        boolean z;
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        String str = i.a(nVar, "label", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = i.a(nVar, "tag", "");
            if (str2.length() != 0) {
                String str3 = i.a(nVar, "refer", "");
                String str4 = i.a(nVar, "groupID", "");
                String str5 = i.a(nVar, "creativeID", "");
                String str6 = i.a(nVar, "logExtra", "");
                n b2 = i.b(nVar, "extraParams");
                com.bytedance.ies.xbridge.h.c.a aVar = new com.bytedance.ies.xbridge.h.c.a();
                l.c(str, "");
                aVar.f36025a = str;
                l.c(str2, "");
                aVar.f36026b = str2;
                if (str3.length() > 0) {
                    aVar.f36027c = str3;
                }
                if (str4.length() > 0) {
                    aVar.f36028d = str4;
                }
                if (str5.length() > 0) {
                    aVar.f36029e = str5;
                }
                if (str6.length() > 0) {
                    aVar.f36030f = str6;
                }
                if (b2 != null) {
                    aVar.f36031g = b2;
                }
                a(aVar, new b(this, bVar), eVar);
                return;
            }
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
