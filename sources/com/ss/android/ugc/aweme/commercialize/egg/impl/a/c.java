package com.ss.android.ugc.aweme.commercialize.egg.impl.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.commercialize.egg.a.a;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f73983a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(45563);
    }

    public static a a(String str, com.ss.android.ugc.aweme.commercialize.egg.d.a aVar, String str2) {
        l.d(str, "");
        l.d(aVar, "");
        int hashCode = str.hashCode();
        if (hashCode != 3321751) {
            if (hashCode != 950398559 || !str.equals(UGCMonitor.EVENT_COMMENT)) {
                return null;
            }
            a aVar2 = new a();
            String str3 = aVar.f73945m;
            l.d(str3, "");
            aVar2.f73976e = str3;
            String str4 = aVar.n;
            l.d(str4, "");
            aVar2.f73977f = str4;
            String str5 = aVar.o;
            l.d(str5, "");
            aVar2.f73978g = str5;
            String str6 = aVar.f73938f;
            l.d(str6, "");
            aVar2.f73972a = str6;
            String str7 = aVar.f73936d;
            l.d(str7, "");
            aVar2.f73974c = str7;
            String str8 = aVar.f73937e;
            l.d(str8, "");
            aVar2.f73975d = str8;
            if (str2 == null) {
                str2 = "";
            }
            l.d(str2, "");
            aVar2.f73973b = str2;
            return aVar2;
        } else if (!str.equals("like")) {
            return null;
        } else {
            b bVar = new b();
            String str9 = aVar.f73945m;
            l.d(str9, "");
            bVar.f73980a = str9;
            String str10 = aVar.n;
            l.d(str10, "");
            bVar.f73981b = str10;
            String str11 = aVar.o;
            l.d(str11, "");
            bVar.f73982c = str11;
            return bVar;
        }
    }
}
