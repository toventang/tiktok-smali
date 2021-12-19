package com.ss.android.ugc.tiktok.deeplink.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public String f148989a;

    /* renamed from: b  reason: collision with root package name */
    public b f148990b;

    static {
        Covode.recordClassIndex(98112);
    }

    /* renamed from: com.ss.android.ugc.tiktok.deeplink.impl.c$c  reason: collision with other inner class name */
    public static class C4021c {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f148996a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public List<String> f148997b = new ArrayList();

        static {
            Covode.recordClassIndex(98115);
        }

        public C4021c(JSONObject jSONObject) {
            if (jSONObject != null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("includes");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("excludes");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String optString = optJSONArray.optString(i2);
                        if (!TextUtils.isEmpty(optString)) {
                            this.f148996a.add(optString);
                        }
                    }
                }
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                        String optString2 = optJSONArray2.optString(i3);
                        if (!TextUtils.isEmpty(optString2)) {
                            this.f148997b.add(optString2);
                        }
                    }
                }
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f148993a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public List<String> f148994b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public List<a> f148995c = new ArrayList();

        static {
            Covode.recordClassIndex(98114);
        }

        public b(JSONObject jSONObject) {
            JSONArray names;
            JSONObject optJSONObject;
            if (jSONObject != null) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject("param_validator");
                if (!(optJSONObject2 == null || (names = optJSONObject2.names()) == null || names.length() <= 0)) {
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String optString = names.optString(i2);
                        if (!TextUtils.isEmpty(optString) && (optJSONObject = optJSONObject2.optJSONObject(optString)) != null) {
                            this.f148995c.add(new a(optString, optJSONObject));
                        }
                    }
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("param_includes");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        String optString2 = optJSONArray.optString(i3);
                        if (!TextUtils.isEmpty(optString2)) {
                            this.f148993a.add(optString2);
                        }
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("param_excludes");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                        String optString3 = optJSONArray2.optString(i4);
                        if (!TextUtils.isEmpty(optString3)) {
                            this.f148994b.add(optString3);
                        }
                    }
                }
            }
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f148991a;

        /* renamed from: b  reason: collision with root package name */
        public C4021c f148992b;

        static {
            Covode.recordClassIndex(98113);
        }

        public a(String str, JSONObject jSONObject) {
            this.f148991a = str;
            if (jSONObject != null) {
                this.f148992b = new C4021c(jSONObject);
            }
        }
    }

    public c(String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f148989a = str;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("filter")) != null) {
            this.f148990b = new b(optJSONObject);
        }
    }
}
