package com.ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

public final class l {
    static {
        Covode.recordClassIndex(91572);
    }

    public static final JSONArray a(o oVar) {
        h.f.b.l.d(oVar, "");
        JSONArray jSONArray = new JSONArray();
        for (T t : oVar.f140169a) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aweme_id", t.f140145a);
            jSONObject.put("video_id", t.f140146b);
            jSONObject.put("vframe_uri", t.f140147c);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }
}
