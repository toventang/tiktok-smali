package com.ss.ttvideoengine.j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public String f152912a;

    /* renamed from: b  reason: collision with root package name */
    public String f152913b;

    /* renamed from: c  reason: collision with root package name */
    public String[] f152914c;

    static {
        Covode.recordClassIndex(101669);
    }

    public final void a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        String optString = jSONObject.optString("main_play_url");
        this.f152912a = optString;
        if (!TextUtils.isEmpty(optString)) {
            arrayList.add(this.f152912a);
        }
        String optString2 = jSONObject.optString("backup_play_url");
        this.f152913b = optString2;
        if (!TextUtils.isEmpty(optString2)) {
            arrayList.add(this.f152913b);
        }
        String[] strArr = new String[arrayList.size()];
        this.f152914c = strArr;
        arrayList.toArray(strArr);
    }
}
