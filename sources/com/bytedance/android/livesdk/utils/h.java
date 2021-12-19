package com.bytedance.android.livesdk.utils;

import android.os.Build;
import android.util.Base64;
import com.a;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.livesetting.other.EnableParsePushSlimroomSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.zip.GZIPInputStream;

public final class h {
    static {
        Covode.recordClassIndex(13181);
    }

    private static String b(String str) {
        if (y.g()) {
            return "‏" + str + "‏";
        }
        return str;
    }

    public static String a(String str) {
        MethodCollector.i(10936);
        if (!EnableParsePushSlimroomSetting.INSTANCE.getValue()) {
            MethodCollector.o(10936);
            return "";
        }
        try {
            byte[] bArr = new byte[0];
            int i2 = Build.VERSION.SDK_INT;
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(Base64.decode(str, 0)), 32);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[32];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                    MethodCollector.o(10936);
                    return byteArrayOutputStream2;
                }
            }
        } catch (Exception unused) {
            HashMap hashMap = new HashMap();
            hashMap.put("slim_room", str);
            c.a("ttlive_parse_slimroom_error", 1, hashMap);
            MethodCollector.o(10936);
            return "";
        }
    }

    public static String a(int i2) {
        if (i2 < 0) {
            return "";
        }
        if (i2 <= 999) {
            return String.valueOf(i2);
        }
        if (i2 <= 999999) {
            if (i2 % 1000 < 100) {
                return b(String.valueOf(i2 / 1000) + 'K');
            }
            return b(a("%.1f", Float.valueOf(((float) ((i2 / 100) * 100)) / 1000.0f)) + 'K');
        } else if (i2 % 1000000 < 100000) {
            return b(String.valueOf(i2 / 1000000) + 'M');
        } else {
            return b(a("%.1f", Float.valueOf(((float) ((i2 / 100000) * 100000)) / 1000000.0f)) + 'M');
        }
    }

    public static String a(String str, Object... objArr) {
        return a.a(Locale.US, str, objArr);
    }
}
