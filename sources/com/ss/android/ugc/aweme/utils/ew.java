package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class ew {

    /* renamed from: a  reason: collision with root package name */
    public static final ew f142894a = new ew();

    private ew() {
    }

    static {
        Covode.recordClassIndex(93501);
    }

    public static void a(String str, d dVar) {
        l.d(dVar, "");
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    dVar.a(next, jSONObject.getString(next));
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(String str, HashMap<String, String> hashMap) {
        l.d(hashMap, "");
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject.getString(next);
                    l.b(next, "");
                    l.b(string, "");
                    hashMap.put(next, string);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }
}
