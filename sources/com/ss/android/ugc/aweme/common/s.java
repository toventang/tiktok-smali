package com.ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class s {

    /* renamed from: a  reason: collision with root package name */
    private Map f76482a = new HashMap();

    static {
        Covode.recordClassIndex(47233);
    }

    public final JSONObject a() {
        return new JSONObject(this.f76482a);
    }

    public final s a(String str, String str2) {
        this.f76482a.put(str, str2);
        return this;
    }
}
