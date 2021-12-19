package com.ss.android.ad.splash.core.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.f.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f58477a;

    /* renamed from: b  reason: collision with root package name */
    public int f58478b;

    /* renamed from: c  reason: collision with root package name */
    public int f58479c;

    /* renamed from: d  reason: collision with root package name */
    public String f58480d;

    /* renamed from: e  reason: collision with root package name */
    public String f58481e;

    static {
        Covode.recordClassIndex(36289);
    }

    public final boolean a() {
        if (this.f58478b > 0 && this.f58479c > 0 && !com.ss.android.ad.splash.f.f.a(this.f58477a) && !l.a(this.f58480d)) {
            String str = this.f58477a.get(0);
            if (l.a(str) && this.f58477a.size() >= 2) {
                str = this.f58477a.get(1);
                if (l.a(str) && this.f58477a.size() >= 3) {
                    str = this.f58477a.get(2);
                }
            }
            if (!l.a(str)) {
                return true;
            }
        }
        return false;
    }

    public static f a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("url_list");
        ArrayList arrayList = new ArrayList(3);
        if (optJSONArray == null) {
            return null;
        }
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("url");
                if (!l.a(optString)) {
                    arrayList.add(optString);
                }
            }
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString2 = jSONObject.optString("uri");
        String optString3 = jSONObject.optString("secret_key");
        if (l.a(optString2)) {
            return null;
        }
        return new f(arrayList, optInt, optInt2, optString2, optString3);
    }

    private f(List<String> list, int i2, int i3, String str, String str2) {
        this.f58477a = list;
        this.f58478b = i2;
        this.f58479c = i3;
        this.f58480d = str;
        this.f58481e = str2;
    }
}
