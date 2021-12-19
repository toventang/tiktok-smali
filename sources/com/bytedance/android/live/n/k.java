package com.bytedance.android.live.n;

import android.content.Context;
import com.bytedance.android.live.i.a.c;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.view.d;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

public interface k extends g {
    static {
        Covode.recordClassIndex(6600);
    }

    void a(Context context);

    void a(c cVar);

    void a(d dVar);

    void a(String str);

    void a(String str, d dVar, int i2, g.d dVar2, g.c cVar, String str2, String str3);

    void a(String str, String str2, d dVar, int i2, g.d dVar2, g.c cVar, String str3);

    void a(Map<String, String> map);

    void a(JSONObject jSONObject, String str);

    void a(boolean z);

    void a(boolean z, String str);

    boolean a();

    String b();

    void b(Context context);

    void b(String str);

    void b(boolean z);

    void c();

    void c(String str);

    void c(boolean z);

    void d();

    void d(String str);

    void d(boolean z);

    JSONObject e();

    void e(String str);

    void e(boolean z);

    boolean f();

    String g();
}
