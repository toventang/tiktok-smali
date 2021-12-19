package com.ss.android.ugc.aweme.ax.a;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public abstract class d implements t {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f67726a;

    static {
        Covode.recordClassIndex(41685);
    }

    public final JSONObject a() {
        Map<String, String> map = this.f67726a;
        if (map == null || map.isEmpty()) {
            return new JSONObject();
        }
        return new JSONObject(this.f67726a);
    }

    public d(Map<String, String> map) {
        this.f67726a = map;
    }
}
