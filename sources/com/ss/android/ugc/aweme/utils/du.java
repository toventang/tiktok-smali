package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.t;
import h.f.b.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class du {
    static {
        Covode.recordClassIndex(93449);
    }

    public static final JSONObject b(String str) {
        boolean z;
        String str2;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                try {
                    return new JSONObject(str);
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }

    public static final JSONArray a(String str) {
        boolean z;
        String str2;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = str;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                try {
                    return new JSONArray(str);
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }

    public static final <T> T a(f fVar, String str, Class<T> cls) {
        boolean z;
        l.d(fVar, "");
        l.d(cls, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            return (T) fVar.a(str, (Class) cls);
        } catch (t unused) {
            return null;
        }
    }
}
