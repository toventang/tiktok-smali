package com.bytedance.b.b.a.b;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.b.e.a.a;
import com.bytedance.b.k.e;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static long f25882a = -1;

    static {
        Covode.recordClassIndex(15101);
    }

    public static long a() {
        if (f25882a == -1) {
            f25882a = (a.a() << 16) | ((long) Process.myPid());
        }
        return f25882a;
    }

    public static a a(byte[] bArr) {
        try {
            a aVar = new a();
            JSONObject jSONObject = new JSONObject(new String(bArr));
            aVar.f25868g = e.a(jSONObject, "version_code");
            aVar.f25869h = e.a(jSONObject, "version_name");
            aVar.f25867f = e.a(jSONObject, "manifest_version_code");
            aVar.f25865d = e.a(jSONObject, "update_version_code");
            aVar.f25866e = e.a(jSONObject, "app_version");
            aVar.f25871j = e.a(jSONObject, "os");
            aVar.f25872k = e.a(jSONObject, "device_platform");
            aVar.f25873l = e.a(jSONObject, "os_version");
            aVar.f25874m = e.b(jSONObject, "os_api");
            aVar.n = e.a(jSONObject, "device_model");
            aVar.o = e.a(jSONObject, "device_brand");
            aVar.p = e.a(jSONObject, "device_manufacturer");
            aVar.q = e.a(jSONObject, "process_name");
            aVar.r = e.c(jSONObject, "sid");
            aVar.s = e.a(jSONObject, "rom_version");
            aVar.t = e.a(jSONObject, "package");
            aVar.u = e.a(jSONObject, "monitor_version");
            aVar.f25864c = e.a(jSONObject, "channel");
            aVar.f25862a = e.b(jSONObject, "aid");
            aVar.f25863b = e.a(jSONObject, "device_id");
            aVar.w = e.c(jSONObject, "phone_startup_time");
            aVar.f25870i = e.a(jSONObject, "release_build");
            aVar.v = e.c(jSONObject, "uid");
            aVar.x = e.a(jSONObject, "verify_info");
            aVar.B = e.a(jSONObject, "current_update_version_code");
            if (jSONObject.has("config_time")) {
                aVar.C = (long) e.b(jSONObject, "config_time");
            }
            try {
                aVar.A = new JSONObject((String) jSONObject.remove("filters"));
            } catch (Exception unused) {
            }
            aVar.z = jSONObject;
            return aVar;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static JSONObject a(a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (aVar.z != null) {
                jSONObject = e.a(jSONObject, aVar.z);
            }
            if (aVar.y != null) {
                jSONObject = e.a(jSONObject, aVar.y);
            }
            jSONObject.put("version_code", aVar.f25868g);
            jSONObject.put("version_name", aVar.f25869h);
            jSONObject.put("manifest_version_code", aVar.f25867f);
            jSONObject.put("update_version_code", aVar.f25865d);
            jSONObject.put("app_version", aVar.f25866e);
            jSONObject.put("os", aVar.f25871j);
            jSONObject.put("device_platform", aVar.f25872k);
            jSONObject.put("os_version", aVar.f25873l);
            jSONObject.put("os_api", aVar.f25874m);
            jSONObject.put("device_model", aVar.n);
            jSONObject.put("device_brand", aVar.o);
            jSONObject.put("device_manufacturer", aVar.p);
            jSONObject.put("process_name", aVar.q);
            jSONObject.put("sid", aVar.r);
            jSONObject.put("rom_version", aVar.s);
            jSONObject.put("package", aVar.t);
            jSONObject.put("monitor_version", aVar.u);
            jSONObject.put("channel", aVar.f25864c);
            jSONObject.put("aid", aVar.f25862a);
            if (!TextUtils.isEmpty(aVar.f25863b)) {
                jSONObject.put("device_id", aVar.f25863b);
            }
            jSONObject.put("uid", aVar.v);
            jSONObject.put("phone_startup_time", aVar.w);
            jSONObject.put("release_build", aVar.f25870i);
            if (aVar.C != -1) {
                jSONObject.put("config_time", String.valueOf(aVar.C));
            }
            if (!TextUtils.isEmpty(aVar.x)) {
                jSONObject.put("verify_info", aVar.x);
            }
            jSONObject.put("current_update_version_code", aVar.B);
            if (aVar.A != null) {
                jSONObject.put("filters", aVar.A);
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
