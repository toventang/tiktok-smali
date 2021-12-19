package com.bytedance.crash.util;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.m;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import org.json.JSONObject;

public final class ac {
    static {
        Covode.recordClassIndex(16372);
    }

    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free_real", b(a(m.f27724a)));
            jSONObject.put("inner_total_real", a(a(m.f27724a)));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static long a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            int i2 = Build.VERSION.SDK_INT;
            return statFs.getTotalBytes();
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static long b(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            int i2 = Build.VERSION.SDK_INT;
            return statFs.getFreeBytes();
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static File a(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }
}
