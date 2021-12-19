package com.ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public String f148732a;

    /* renamed from: b  reason: collision with root package name */
    public int f148733b;

    /* renamed from: c  reason: collision with root package name */
    public long f148734c;

    /* renamed from: d  reason: collision with root package name */
    public long f148735d;

    static {
        Covode.recordClassIndex(97997);
    }

    public static JSONObject a(h hVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", hVar.f148732a);
            jSONObject.put("stage", hVar.f148733b);
            jSONObject.put("start", hVar.f148734c);
            jSONObject.put("end", hVar.f148735d);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
