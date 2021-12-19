package com.ss.optimizer.live.sdk.a.a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f151643a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f151644b;

    /* renamed from: c  reason: collision with root package name */
    public String f151645c;

    /* renamed from: d  reason: collision with root package name */
    public int f151646d = 300;

    /* renamed from: e  reason: collision with root package name */
    public boolean f151647e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f151648f;

    /* renamed from: g  reason: collision with root package name */
    private String f151649g;

    static {
        Covode.recordClassIndex(101177);
    }

    public final List<String> a(String str) {
        JSONObject jSONObject;
        if (this.f151643a != 0 || (jSONObject = this.f151644b) == null || jSONObject.length() <= 0) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (!this.f151644b.has(str)) {
                return null;
            }
            JSONArray jSONArray = this.f151644b.getJSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.getString(i2));
            }
            return arrayList;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public a(JSONObject jSONObject) {
        try {
            this.f151643a = jSONObject.getInt("StatusCode");
            this.f151649g = jSONObject.getString("StatusMessage");
            if (this.f151643a == 0) {
                this.f151644b = jSONObject.getJSONObject("IpMap");
                this.f151645c = jSONObject.getString("Symbol");
            }
            this.f151646d = jSONObject.getInt("DnsTTL");
            this.f151647e = jSONObject.getBoolean("EnableIpSettings");
            this.f151648f = jSONObject.getBoolean("EnablePing");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
