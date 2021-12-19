package com.bytedance.crash;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.c;
import com.bytedance.crash.j.m;
import com.bytedance.crash.runtime.c.b;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i {

    /* renamed from: b  reason: collision with root package name */
    static MonitorCrash f27607b;

    /* renamed from: a  reason: collision with root package name */
    protected MonitorCrash f27608a;

    static {
        Covode.recordClassIndex(16203);
    }

    public final String b() {
        return this.f27608a.mConfig.mAid;
    }

    private JSONObject c() {
        return new JSONObject(this.f27608a.mTagMap);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f27608a.mConfig.mPackageName == null) {
                Context context = m.f27724a;
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
                if (packageInfo != null) {
                    if (this.f27608a.mConfig.mVersionInt == -1) {
                        this.f27608a.mConfig.mVersionInt = (long) packageInfo.versionCode;
                    }
                    if (this.f27608a.mConfig.mVersionStr == null) {
                        this.f27608a.mConfig.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f27608a.mConfig.mDeviceId)) {
            this.f27608a.mConfig.mDeviceId = m.b().a();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f27608a.mConfig.mAid));
            jSONObject.put("update_version_code", this.f27608a.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f27608a.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f27608a.mConfig.mVersionStr);
            jSONObject.put("channel", this.f27608a.mConfig.mChannel);
            jSONObject.put("package", this.f27608a.mConfig.mPackageName);
            jSONObject.put("device_id", this.f27608a.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f27608a.mConfig.mUID);
            jSONObject.put("os", "Android");
            if (this.f27608a.mConfig.mSoList != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.f27608a.mConfig.mSoList) {
                    jSONArray.put(str);
                }
                jSONObject.put("so_list", jSONArray);
            }
            jSONObject.put("single_upload", 0);
        } catch (JSONException unused2) {
            m.f27730g.isDebugMode();
        }
        return jSONObject;
    }

    public final boolean a(Object obj) {
        if (this.f27608a == obj) {
            return true;
        }
        return false;
    }

    i(MonitorCrash monitorCrash) {
        this.f27608a = monitorCrash;
        c.f27559a.add(this);
        b.a();
        m.a(0);
    }

    private JSONObject c(CrashType crashType) {
        Map<? extends String, ? extends String> userData;
        if (this.f27608a.mCustomData == null || (userData = this.f27608a.mCustomData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }

    public final JSONObject a(CrashType crashType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", a());
            if (crashType != null) {
                jSONObject.put("custom", c(crashType));
                jSONObject.put("filters", c());
            }
            jSONObject.put("line_num", (Object) null);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final JSONObject b(CrashType crashType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", a());
            if (crashType != null) {
                jSONObject.put("custom", c(crashType));
                jSONObject.put("filters", c());
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
