package com.bytedance.sdk.bdlynx.container;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.e.b.a.f;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f43693a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(26739);
    }

    public static b a(Uri uri) {
        boolean z;
        String queryParameter;
        l.c(uri, "");
        if (!l.a((Object) "bdlynx", (Object) uri.getScheme()) || !l.a((Object) "lynxview", (Object) uri.getAuthority())) {
            z = false;
        } else {
            z = true;
        }
        List<String> list = null;
        if (!z || (queryParameter = uri.getQueryParameter("groupid")) == null || queryParameter.length() == 0 || queryParameter == null) {
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("cardid");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        l.a((Object) queryParameter2, "");
        f fVar = new f();
        try {
            List<String> queryParameters = uri.getQueryParameters("providers");
            if (queryParameters != null && !queryParameters.isEmpty()) {
                list = queryParameters;
            }
            fVar.f43722b = list;
            List<? extends Object> a2 = n.a(new com.bytedance.sdk.bdlynx.e.b.b.a(uri.getQueryParameter("url"), 6));
            l.c(a2, "");
            fVar.f43721a = a2;
            fVar.f43726f = uri.getQueryParameter("accesskey");
            fVar.f43727g = uri.getQueryParameter("lynxcardpath");
        } catch (Exception unused) {
        }
        String queryParameter3 = uri.getQueryParameter("post_url");
        l.a((Object) queryParameter, "");
        b bVar = new b(queryParameter, queryParameter2, fVar);
        bVar.f43694a = queryParameter3;
        return bVar;
    }
}
