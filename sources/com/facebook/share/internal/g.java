package com.facebook.share.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g {

    public interface a {
        static {
            Covode.recordClassIndex(30671);
        }

        JSONObject a(SharePhoto sharePhoto);
    }

    static {
        Covode.recordClassIndex(30670);
    }

    private g() {
    }

    private static JSONArray a(List list, a aVar) {
        if (com.facebook.internal.a.b.a.a(g.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (Object obj : list) {
                jSONArray.put(a(obj, aVar));
            }
            return jSONArray;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, g.class);
            return null;
        }
    }

    private static Object a(Object obj, a aVar) {
        if (com.facebook.internal.a.b.a.a(g.class)) {
            return null;
        }
        if (obj == null) {
            try {
                return JSONObject.NULL;
            } catch (Throwable th) {
                com.facebook.internal.a.b.a.a(th, g.class);
                return null;
            }
        } else {
            if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer)) {
                if (!(obj instanceof Long)) {
                    if (obj instanceof SharePhoto) {
                        if (aVar != null) {
                            return aVar.a((SharePhoto) obj);
                        }
                        return null;
                    } else if (obj instanceof ShareOpenGraphObject) {
                        return a((ShareOpenGraphObject) obj, aVar);
                    } else {
                        if (obj instanceof List) {
                            return a((List) obj, aVar);
                        }
                        throw new IllegalArgumentException("Invalid object found for JSON serialization: " + obj.toString());
                    }
                }
            }
            return obj;
        }
    }

    public static JSONObject a(ShareOpenGraphAction shareOpenGraphAction, a aVar) {
        if (com.facebook.internal.a.b.a.a(g.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphAction.f49149a.keySet()) {
                jSONObject.put(str, a(shareOpenGraphAction.a(str), aVar));
            }
            return jSONObject;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, g.class);
            return null;
        }
    }

    private static JSONObject a(ShareOpenGraphObject shareOpenGraphObject, a aVar) {
        if (com.facebook.internal.a.b.a.a(g.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : shareOpenGraphObject.f49149a.keySet()) {
                jSONObject.put(str, a(shareOpenGraphObject.a(str), aVar));
            }
            return jSONObject;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, g.class);
            return null;
        }
    }
}
