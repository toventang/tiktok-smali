package com.ss.android.pushmanager.a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public final class b {

    public interface a extends com.ss.android.ug.bus.a {
        static {
            Covode.recordClassIndex(37133);
        }

        void a();
    }

    /* renamed from: com.ss.android.pushmanager.a.b$b  reason: collision with other inner class name */
    public interface AbstractC1307b extends com.ss.android.ug.bus.a {
        static {
            Covode.recordClassIndex(37134);
        }

        com.ss.android.pushmanager.b a();

        void a(Context context, String str, String str2, String str3, long j2, long j3, JSONObject jSONObject);

        void a(String str, Bundle bundle);

        String b();

        String c();

        String d();

        boolean e();

        Map<String, String> f();

        boolean g();
    }

    static {
        Covode.recordClassIndex(37132);
    }

    public static AbstractC1307b a() {
        return (AbstractC1307b) com.ss.android.ug.bus.b.a(AbstractC1307b.class);
    }
}
