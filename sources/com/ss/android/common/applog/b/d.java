package com.ss.android.common.applog.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.u;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public long f59231a;

    /* renamed from: b  reason: collision with root package name */
    public String f59232b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f59233c;

    /* renamed from: d  reason: collision with root package name */
    public String f59234d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f59235e;

    /* renamed from: f  reason: collision with root package name */
    public String f59236f;

    /* renamed from: g  reason: collision with root package name */
    public long f59237g;

    /* renamed from: h  reason: collision with root package name */
    public long f59238h;

    /* renamed from: i  reason: collision with root package name */
    public long f59239i;

    static {
        Covode.recordClassIndex(36614);
    }

    public d() {
    }

    public final String toString() {
        return a();
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_time", this.f59231a);
            jSONObject.put("session_id", this.f59232b);
            jSONObject.put("is_front_continuous", this.f59233c);
            jSONObject.put("front_session_id", this.f59234d);
            jSONObject.put("is_end_continuous", this.f59235e);
            jSONObject.put("end_session_id", this.f59236f);
            jSONObject.put("latest_end_time", this.f59237g);
            jSONObject.put("non_task_time", this.f59238h);
            jSONObject.put("tea_event_index", this.f59239i);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public d(long j2) {
        this.f59231a = j2;
        this.f59232b = AppLog.genSession();
        this.f59239i = AppLog.genEventIndex();
    }

    public static d a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("session_id", "");
            d dVar = new d();
            dVar.f59232b = optString;
            dVar.f59231a = u.a(jSONObject, "start_time");
            dVar.f59233c = jSONObject.optBoolean("is_front_continuous", false);
            dVar.f59234d = jSONObject.optString("front_session_id", "");
            dVar.f59235e = jSONObject.optBoolean("is_end_continuous", false);
            dVar.f59236f = jSONObject.optString("end_session_id", "");
            dVar.f59237g = u.a(jSONObject, "latest_end_time");
            dVar.f59238h = u.a(jSONObject, "non_task_time");
            dVar.f59239i = u.a(jSONObject, "tea_event_index");
            return dVar;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
