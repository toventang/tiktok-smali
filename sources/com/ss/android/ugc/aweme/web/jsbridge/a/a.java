package com.ss.android.ugc.aweme.web.jsbridge.a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.a.h;
import com.ss.android.ugc.aweme.utils.gw;
import h.f.b.l;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;

public final class a {

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.a.a$a  reason: collision with other inner class name */
    public interface AbstractC3854a {
        static {
            Covode.recordClassIndex(94798);
        }

        void a(JSONObject jSONObject);
    }

    public interface c {
        static {
            Covode.recordClassIndex(94800);
        }

        void a(b bVar, d dVar);
    }

    static {
        Covode.recordClassIndex(94797);
    }

    public static String a(h hVar) {
        JSONObject jSONObject;
        boolean z;
        boolean z2;
        if (hVar != null) {
            jSONObject = hVar.f35533d;
        } else {
            jSONObject = null;
        }
        if (jSONObject != null) {
            String optString = hVar.f35533d.optString("url", "");
            boolean z3 = false;
            if (optString == null || optString.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String optString2 = hVar.f35533d.optString("method", "get");
                if (optString2 == null || optString2.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    Locale locale = Locale.getDefault();
                    l.b(locale, "");
                    Objects.requireNonNull(optString2, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase = optString2.toLowerCase(locale);
                    l.b(lowerCase, "");
                    if (TextUtils.equals(lowerCase, "get")) {
                        JSONObject optJSONObject = hVar.f35533d.optJSONObject("params");
                        try {
                            Uri parse = Uri.parse(optString);
                            l.b(parse, "");
                            Set<String> queryParameterNames = parse.getQueryParameterNames();
                            if (queryParameterNames == null || queryParameterNames.isEmpty()) {
                                z3 = true;
                            }
                            if (!z3) {
                                if (optJSONObject == null) {
                                    optJSONObject = new JSONObject();
                                }
                                for (String str : queryParameterNames) {
                                    if (str != null) {
                                        String queryParameter = parse.getQueryParameter(str);
                                        if (queryParameter != null) {
                                            l.b(queryParameter, "");
                                            optJSONObject.put(str, queryParameter);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        if (optJSONObject != null && optJSONObject.length() > 0) {
                            gw.a();
                            gw.a(optString, optJSONObject);
                        }
                    }
                }
            }
        }
        if (TextUtils.isEmpty(hVar.f35531b)) {
            return "v2";
        }
        try {
            return hVar.f35533d.getString("proto");
        } catch (Exception unused) {
            return "";
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f144967a;

        /* renamed from: b  reason: collision with root package name */
        public Exception f144968b;

        static {
            Covode.recordClassIndex(94801);
        }

        public d(JSONObject jSONObject, Exception exc) {
            this.f144967a = jSONObject;
            this.f144968b = exc;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f144964a;

        /* renamed from: b  reason: collision with root package name */
        public String f144965b;

        /* renamed from: c  reason: collision with root package name */
        public JSONObject f144966c;

        static {
            Covode.recordClassIndex(94799);
        }

        public b(String str, String str2, JSONObject jSONObject) {
            this.f144964a = str;
            this.f144965b = str2;
            this.f144966c = jSONObject;
        }
    }

    public static b a(h hVar, JSONObject jSONObject, com.bytedance.ies.web.a.a aVar, AbstractC3854a aVar2, c cVar) {
        String a2 = a(hVar);
        a2.hashCode();
        if (!a2.equals("v2")) {
            return new c(hVar, jSONObject, aVar, aVar2, cVar);
        }
        return new d(hVar, jSONObject, aVar, aVar2, cVar);
    }
}
