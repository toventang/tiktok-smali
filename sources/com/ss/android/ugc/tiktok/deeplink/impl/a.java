package com.ss.android.ugc.tiktok.deeplink.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f148982a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f148983b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<c> f148984c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public Long f148985d = -1L;

    static {
        Covode.recordClassIndex(98110);
    }

    private void a(JSONObject jSONObject) {
        JSONArray names;
        if (!(jSONObject == null || (names = jSONObject.names()) == null || names.length() <= 0)) {
            for (int i2 = 0; i2 < names.length(); i2++) {
                String optString = names.optString(i2);
                if (!TextUtils.isEmpty(optString)) {
                    this.f148983b.add(optString);
                    JSONObject optJSONObject = jSONObject.optJSONObject(optString);
                    if (optJSONObject != null) {
                        this.f148984c.add(new c(optString, optJSONObject));
                    }
                }
            }
        }
    }

    public a(String str, Long l2) {
        if (l2 != null) {
            this.f148985d = l2;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f148982a = jSONObject;
                a(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public a(JSONObject jSONObject, Long l2) {
        if (l2 != null) {
            this.f148985d = l2;
        }
        this.f148982a = jSONObject;
        a(jSONObject);
    }
}
