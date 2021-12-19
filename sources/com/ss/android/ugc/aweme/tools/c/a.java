package com.ss.android.ugc.aweme.tools.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ar;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(91059);
    }

    public static final JSONObject a(Map<String, String> map) {
        l.d(map, "");
        ar arVar = new ar();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arVar.a(entry.getKey(), entry.getValue());
        }
        JSONObject a2 = arVar.a();
        l.b(a2, "");
        return a2;
    }
}
