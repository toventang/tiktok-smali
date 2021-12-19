package com.bytedance.ies.ugc.aweme.commercialize.scene.api.main;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.b.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.json.JSONObject;

public interface a extends b {
    static {
        Covode.recordClassIndex(20784);
    }

    void a(Context context, String str, String str2);

    void a(Aweme aweme);

    void a(Aweme aweme, Context context);

    void a(String str, String str2);

    void a(String str, String str2, JSONObject jSONObject);

    void a(boolean z, String str);

    boolean a();

    void b();

    Fragment c();

    void d();

    long e();

    void f();

    void g();

    long h();

    int i();

    long j();
}
