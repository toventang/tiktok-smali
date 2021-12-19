package com.bytedance.android.livesdkapi.host;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public interface h extends com.bytedance.android.live.base.a {

    public interface a {
        static {
            Covode.recordClassIndex(13810);
        }

        void a(JSONObject jSONObject);
    }

    public interface b {
        static {
            Covode.recordClassIndex(13811);
        }

        void a(double d2);
    }

    public interface c {
        static {
            Covode.recordClassIndex(13812);
        }

        void a();

        void a(a aVar);

        void a(b bVar);

        void b();
    }

    static {
        Covode.recordClassIndex(13809);
    }

    c a(String str, boolean z);

    Map<String, Double> a();

    Map<String, String> a(Context context);

    void a(a aVar);

    Map<String, Long> b();

    void c();

    void d();

    void e();

    double f();

    void g();
}
