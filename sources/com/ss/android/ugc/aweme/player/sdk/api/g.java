package com.ss.android.ugc.aweme.player.sdk.api;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public interface g {

    public interface a {
        static {
            Covode.recordClassIndex(74063);
        }

        void a(JSONObject jSONObject, b bVar);
    }

    static {
        Covode.recordClassIndex(74062);
    }

    Map<String, String> a();

    void a(String str, a aVar);

    void a(String str, Map<String, String> map, a aVar);

    void a(String str, Map<String, String> map, JSONObject jSONObject, int i2, a aVar);

    void b();

    public static class b extends Error {
        public int code;

        static {
            Covode.recordClassIndex(74064);
        }

        public b(int i2, String str, Throwable th) {
            super(str, th);
            this.code = i2;
        }
    }
}
