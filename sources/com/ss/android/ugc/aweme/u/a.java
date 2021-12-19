package com.ss.android.ugc.aweme.u;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.ConfigItem;
import com.bytedance.ies.abmock.e;
import com.bytedance.ies.abmock.f;
import com.google.gson.o;
import h.f.b.l;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f141621a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(92548);
    }

    public static String a() {
        Map<String, ConfigItem> map = f.f31846a;
        l.b(map, "");
        o oVar = new o();
        if (map != null) {
            for (Map.Entry<String, ConfigItem> entry : map.entrySet()) {
                String key = entry.getKey();
                e.a();
                Object b2 = e.b(entry.getKey(), false);
                if (b2 instanceof Number) {
                    oVar.a(key, (Number) b2);
                } else if (b2 instanceof Boolean) {
                    oVar.a(key, (Boolean) b2);
                } else if (b2 instanceof String) {
                    oVar.a(key, (String) b2);
                } else if (b2 instanceof Character) {
                    oVar.a(key, (Character) b2);
                } else if (b2 instanceof com.google.gson.l) {
                    oVar.a(key, (com.google.gson.l) b2);
                } else if (b2 == null) {
                    oVar.a(key, (com.google.gson.l) null);
                }
            }
        }
        String oVar2 = oVar.toString();
        l.b(oVar2, "");
        return oVar2;
    }
}
