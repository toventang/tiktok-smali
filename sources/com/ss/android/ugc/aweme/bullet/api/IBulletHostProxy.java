package com.ss.android.ugc.aweme.bullet.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.sdk.webview.m;
import java.util.List;
import org.json.JSONObject;

public interface IBulletHostProxy {
    static {
        Covode.recordClassIndex(42411);
    }

    m a();

    List<k> a(b bVar);

    JSONObject a(String str);

    boolean a(Context context, String str);
}
