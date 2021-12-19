package com.ss.android.ugc.aweme.commercialize.util.adrouter;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.a.a;
import h.f.a.b;
import h.z;
import org.json.JSONObject;

public interface IAdRouterHandlerDepend {
    static {
        Covode.recordClassIndex(46533);
    }

    String a();

    void a(b<? super Boolean, z> bVar);

    void a(String str);

    void a(String str, JSONObject jSONObject, String str2, String str3);

    boolean a(Context context, String str, Uri uri, b bVar);

    boolean a(Context context, String str, String str2);

    a b(b<? super Boolean, z> bVar);

    boolean b(String str);

    a c(b<? super Boolean, z> bVar);
}
