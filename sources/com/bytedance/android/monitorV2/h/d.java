package com.bytedance.android.monitorV2.h;

import android.content.SharedPreferences;
import com.bytedance.android.monitorV2.b.a;
import com.bytedance.android.monitorV2.h.a.c;
import com.bytedance.android.monitorV2.i.b;
import com.bytedance.android.monitorV2.l.f;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private String f23993a = "HybridSettingRequestService";

    /* renamed from: b  reason: collision with root package name */
    private c f23994b;

    /* renamed from: c  reason: collision with root package name */
    private String f23995c = "/monitor_web/settings/hybrid-settings";

    static {
        Covode.recordClassIndex(14143);
    }

    public final com.bytedance.android.monitorV2.h.a.d a() {
        OkHttpClient build = new OkHttpClient().newBuilder().build();
        MediaType parse = MediaType.parse("application/json");
        JSONObject jSONObject = new JSONObject();
        f.a(jSONObject, "aid", this.f23994b.f23940a);
        if (this.f23994b.f23940a == null) {
            b.c(this.f23993a, "monitor setting aid should not be null");
        }
        f.a(jSONObject, "os", this.f23994b.f23942c);
        f.a(jSONObject, "os_version", this.f23994b.f23943d);
        f.a(jSONObject, "install_id", this.f23994b.f23944e);
        f.a(jSONObject, "device_id", this.f23994b.f23945f);
        f.a(jSONObject, "channel", this.f23994b.f23946g);
        f.a(jSONObject, "version_code", this.f23994b.f23947h);
        f.a(jSONObject, "update_version_code", this.f23994b.f23948i);
        f.a(jSONObject, "region", this.f23994b.f23949j);
        f.a(jSONObject, "language", this.f23994b.f23950k);
        try {
            return a(build.newCall(new Request.Builder().url(this.f23994b.f23941b + this.f23995c).method("POST", RequestBody.create(parse, jSONObject.toString())).addHeader("Content-Type", "application/json").build()).execute().body().string());
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public d(c cVar) {
        this.f23994b = cVar;
    }

    private com.bytedance.android.monitorV2.h.a.d a(String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        try {
            if (f.a(new JSONObject(str), "errno") == 200) {
                b.a(this.f23993a, "monitor setting request: succeeded");
                com.bytedance.android.monitorV2.h.a.d a2 = com.bytedance.android.monitorV2.l.b.a(str);
                l.c("monitor_setting_response", "");
                l.c(str, "");
                if (!(a.f23835b == null || (sharedPreferences = a.f23834a) == null || (edit = sharedPreferences.edit()) == null || (putString = edit.putString("monitor_setting_response", str)) == null)) {
                    putString.apply();
                }
                return a2;
            }
            b.a(this.f23993a, "monitor setting request: failed, checking sp...");
            String a3 = a.a("monitor_setting_response", "");
            if (!m.a(a3)) {
                return com.bytedance.android.monitorV2.l.b.a(a3);
            }
            return null;
        } catch (JSONException e2) {
            e2.printStackTrace();
            b.a(this.f23993a, "monitor setting request: failed, checking sp...");
            String a4 = a.a("monitor_setting_response", "");
            if (!m.a(a4)) {
                return com.bytedance.android.monitorV2.l.b.a(a4);
            }
            return null;
        }
    }
}
