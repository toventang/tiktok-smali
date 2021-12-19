package com.bytedance.bpea.core.checker.a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f26654a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, Class<? extends a>> f26655b;

    private d() {
    }

    static {
        Covode.recordClassIndex(15694);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f26655b = linkedHashMap;
        linkedHashMap.put(c.CONFIG.getValue(), e.class);
        linkedHashMap.put(c.PLACEHOLDER.getValue(), h.class);
        linkedHashMap.put(c.INVALID.getValue(), g.class);
        linkedHashMap.put(c.ENTRY_VERIFY.getValue(), f.class);
    }

    public static a a(JSONObject jSONObject) {
        l.c(jSONObject, "");
        try {
            Class<? extends a> cls = f26655b.get(jSONObject.getString(StringSet.type));
            if (cls == null) {
                return null;
            }
            a aVar = (a) cls.newInstance();
            if (aVar == null) {
                return aVar;
            }
            l.c(jSONObject, "");
            try {
                aVar.f26651a = jSONObject;
                aVar.a(jSONObject.optJSONObject("params"));
                return aVar;
            } catch (Throwable unused) {
                return aVar;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }
}
