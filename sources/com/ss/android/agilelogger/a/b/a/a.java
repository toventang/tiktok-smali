package com.ss.android.agilelogger.a.b.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a implements b {
    static {
        Covode.recordClassIndex(36536);
    }

    @Override // com.ss.android.agilelogger.a.b
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return a((String) obj);
    }

    private static String a(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new com.ss.android.agilelogger.a.a("JSON empty.");
        }
        try {
            if (str.startsWith("{")) {
                return new JSONObject(str).toString(4);
            }
            if (str.startsWith("[")) {
                return new JSONArray(str).toString(4);
            }
            throw new com.ss.android.agilelogger.a.a("JSON should start with { or [, but found ".concat(String.valueOf(str)));
        } catch (Exception e2) {
            throw new com.ss.android.agilelogger.a.a("Parse JSON error. JSON string:".concat(String.valueOf(str)), e2);
        }
    }
}
