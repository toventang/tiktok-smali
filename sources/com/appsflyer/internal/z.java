package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.covode.number.Covode;
import java.security.MessageDigest;
import java.util.Formatter;

public final class z {
    static {
        Covode.recordClassIndex(2779);
    }

    z() {
    }

    /* renamed from: ι  reason: contains not printable characters */
    public static String m215(long j2) {
        return m214(new StringBuilder().append(AppsFlyerProperties.getInstance().getString("AppsFlyerKey")).append(j2).toString());
    }

    /* renamed from: ı  reason: contains not printable characters */
    private static String m211(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            formatter.format("%02x", Byte.valueOf(bArr[i2]));
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    /* renamed from: ǃ  reason: contains not printable characters */
    public static String m212(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return m211(instance.digest());
        } catch (Exception e2) {
            AFLogger.afErrorLog(new StringBuilder("Error turning ").append(str.substring(0, 6)).append(".. to MD5").toString(), e2);
            return null;
        }
    }

    /* renamed from: Ι  reason: contains not printable characters */
    public static String m214(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.getBytes("UTF-8"));
            return m211(instance.digest());
        } catch (Exception e2) {
            AFLogger.afErrorLog(new StringBuilder("Error turning ").append(str.substring(0, 6)).append(".. to SHA1").toString(), e2);
            return null;
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static String m213(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : digest) {
                sb.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception e2) {
            AFLogger.afErrorLog(new StringBuilder("Error turning ").append(str.substring(0, 6)).append(".. to SHA-256").toString(), e2);
            return null;
        }
    }
}
