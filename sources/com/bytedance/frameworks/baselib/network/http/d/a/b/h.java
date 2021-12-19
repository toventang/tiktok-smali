package com.bytedance.frameworks.baselib.network.http.d.a.b;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.d.a.b.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class h extends f {

    /* renamed from: b  reason: collision with root package name */
    private static final String f29196b = h.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private Map<String, String> f29197c = new HashMap();

    static {
        Covode.recordClassIndex(17068);
    }

    @Override // com.bytedance.frameworks.baselib.network.http.d.a.b.f
    public final String a(Uri uri) {
        String host = uri.getHost();
        String uri2 = uri.toString();
        String str = this.f29197c.get(host);
        if (!TextUtils.isEmpty(str)) {
            return uri2.replaceFirst(host, str);
        }
        return uri2;
    }

    public h(JSONObject jSONObject) {
        super(f.a.STATIC_DISPATCH_STRATEGY);
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString)) {
                    this.f29197c.put(next, optString);
                }
            }
        }
    }
}
