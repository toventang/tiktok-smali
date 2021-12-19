package com.ss.android.ugc.aweme.df;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private Map f80054a = new HashMap();

    static {
        Covode.recordClassIndex(49832);
    }

    public final JSONObject a() {
        return new JSONObject(this.f80054a);
    }

    public final k a(String str, String str2) {
        this.f80054a.put(str, str2);
        return this;
    }
}
