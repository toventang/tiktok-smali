package com.facebook.a.b.a;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f46620a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46621b;

    /* renamed from: c  reason: collision with root package name */
    public final List<c> f46622c;

    /* renamed from: d  reason: collision with root package name */
    public final String f46623d;

    static {
        Covode.recordClassIndex(28424);
    }

    public b(JSONObject jSONObject) {
        this.f46620a = jSONObject.getString(StringSet.name);
        this.f46621b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList.add(new c(optJSONArray.getJSONObject(i2)));
            }
        }
        this.f46622c = arrayList;
        this.f46623d = jSONObject.optString("path_type", "absolute");
    }
}
