package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.publish.f.h;
import com.ss.android.ugc.aweme.uploader.g;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ir {
    static {
        Covode.recordClassIndex(93680);
    }

    public static final h a(g gVar) {
        int i2;
        JSONException e2;
        l.d(gVar, "");
        int i3 = 0;
        try {
            JSONObject jSONObject = new JSONObject(gVar.f142021h);
            i2 = jSONObject.getInt("width");
            try {
                i3 = jSONObject.getInt("height");
            } catch (JSONException e3) {
                e2 = e3;
            }
        } catch (JSONException e4) {
            e2 = e4;
            i2 = 0;
            e2.printStackTrace();
            h hVar = new h();
            hVar.f118767i = gVar.f142014a;
            hVar.f118763e = gVar.f142015b;
            hVar.f118764f = i2;
            hVar.f118765g = i3;
            l.b(hVar, "");
            return hVar;
        }
        h hVar2 = new h();
        hVar2.f118767i = gVar.f142014a;
        hVar2.f118763e = gVar.f142015b;
        hVar2.f118764f = i2;
        hVar2.f118765g = i3;
        l.b(hVar2, "");
        return hVar2;
    }

    public static final String a(List<? extends User> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(((User) list.get(i2)).getSecUid());
            if (i2 != list.size() - 1) {
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public static final void a(h hVar, LinkedHashMap<String, String> linkedHashMap) {
        l.d(hVar, "");
        l.d(linkedHashMap, "");
        linkedHashMap.put("video_width", new StringBuilder().append(hVar.f118764f).toString());
        linkedHashMap.put("video_height", new StringBuilder().append(hVar.f118765g).toString());
        linkedHashMap.put("video_cover_uri", hVar.f118763e);
        String str = hVar.f118766h;
        if (str != null && str.length() != 0) {
            String str2 = hVar.f118766h;
            l.b(str2, "");
            linkedHashMap.put("cover_text_uri", str2);
        }
    }
}
