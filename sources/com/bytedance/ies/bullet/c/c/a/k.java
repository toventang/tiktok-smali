package com.bytedance.ies.bullet.c.c.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.q;
import org.json.JSONObject;

public interface k extends q {

    public enum a {
        PUBLIC,
        PRIVATE,
        PROTECT;

        static {
            Covode.recordClassIndex(18748);
        }
    }

    public interface b extends q.a {
        static {
            Covode.recordClassIndex(18749);
        }

        void a(int i2, String str);

        void a(int i2, String str, JSONObject jSONObject);

        void a(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(18747);
    }

    void a(JSONObject jSONObject, b bVar);
}
