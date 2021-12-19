package com.ss.android.ugc.aweme.profile.api;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.gw;
import h.f.b.l;
import java.util.Set;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f116015a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(74814);
    }

    public static final void a(String str) {
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                l.b(parse, "");
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames == null) {
                    return;
                }
                if (!queryParameterNames.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (String str2 : queryParameterNames) {
                        if (str2 != null) {
                            String queryParameter = parse.getQueryParameter(str2);
                            if (queryParameter != null) {
                                l.b(queryParameter, "");
                                jSONObject.put(str2, queryParameter);
                            }
                        }
                    }
                    if (jSONObject.length() > 0) {
                        gw.a();
                        gw.a(parse.getPath(), jSONObject);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
