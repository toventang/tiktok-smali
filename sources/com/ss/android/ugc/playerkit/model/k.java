package com.ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public int f148739a;

    /* renamed from: b  reason: collision with root package name */
    public String f148740b;

    /* renamed from: c  reason: collision with root package name */
    public int f148741c;

    /* renamed from: d  reason: collision with root package name */
    public long f148742d;

    /* renamed from: e  reason: collision with root package name */
    public long f148743e;

    /* renamed from: f  reason: collision with root package name */
    public long f148744f;

    /* renamed from: g  reason: collision with root package name */
    public long f148745g;

    static {
        Covode.recordClassIndex(98000);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("{taskType=");
        int i2 = this.f148741c;
        String str2 = "N/A";
        if (1 == i2) {
            str = "player";
        } else if (2 == i2) {
            str = "preloader";
        } else {
            str = str2;
        }
        StringBuilder append = sb.append(str).append(", action=");
        int i3 = this.f148739a;
        if (-1 == i3) {
            str2 = "und";
        } else if (i3 == 0) {
            str2 = "start";
        } else if (1 == i3) {
            str2 = "complete";
        } else if (2 == i3) {
            str2 = "cancel";
        }
        return append.append(str2).append(", bytesLoaded=").append(this.f148742d).append(", off=").append(this.f148744f).append(", endOff=").append(this.f148745g).append(", fileKey: ").append(this.f148740b).append('}').toString();
    }

    public static JSONObject a(k kVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", kVar.f148740b);
            jSONObject.put("action", kVar.f148739a);
            jSONObject.put("task_type", kVar.f148741c);
            jSONObject.put("bytes_loaded", kVar.f148742d);
            jSONObject.put("off", kVar.f148744f);
            jSONObject.put("end_off", kVar.f148745g);
            jSONObject.put("load_cost", kVar.f148743e);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
