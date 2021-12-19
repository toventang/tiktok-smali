package com.ss.android.ugc.aweme.music.k;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f111554a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(71650);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final HashMap<String, String> f111555a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri.Builder f111556b;

        static {
            Covode.recordClassIndex(71651);
        }

        public final Uri a() {
            for (Map.Entry<String, String> entry : this.f111555a.entrySet()) {
                this.f111556b.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            Uri build = this.f111556b.build();
            l.b(build, "");
            return build;
        }

        public a(HashMap<String, String> hashMap, Uri.Builder builder) {
            l.d(hashMap, "");
            l.d(builder, "");
            this.f111555a = hashMap;
            this.f111556b = builder;
        }

        public final a a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            if (!TextUtils.isEmpty(this.f111555a.get("rn_schema"))) {
                HashMap<String, String> hashMap = this.f111555a;
                String uri = Uri.parse(this.f111555a.get("rn_schema")).buildUpon().appendQueryParameter(str, str2).build().toString();
                l.b(uri, "");
                hashMap.put("rn_schema", uri);
            }
            if (!TextUtils.isEmpty(this.f111555a.get("url"))) {
                HashMap<String, String> hashMap2 = this.f111555a;
                String uri2 = Uri.parse(this.f111555a.get("url")).buildUpon().appendQueryParameter(str, str2).build().toString();
                l.b(uri2, "");
                hashMap2.put("url", uri2);
            }
            return this;
        }
    }

    public static final a a(String str) {
        l.d(str, "");
        HashMap<String, String> b2 = b(str);
        Uri.Builder clearQuery = Uri.parse(str).buildUpon().clearQuery();
        l.b(clearQuery, "");
        return new a(b2, clearQuery);
    }

    private static HashMap<String, String> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        Uri parse = Uri.parse(str);
        HashMap<String, String> hashMap = new HashMap<>();
        l.b(parse, "");
        for (String str2 : parse.getQueryParameterNames()) {
            String queryParameter = parse.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                l.b(str2, "");
                if (queryParameter == null) {
                    l.b();
                }
                hashMap.put(str2, queryParameter);
            }
        }
        return hashMap;
    }
}
