package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class AndroidUtils {
    static {
        Covode.recordClassIndex(2659);
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    static boolean m32() {
        return Build.BRAND.equals("OPPO");
    }

    public static String getVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2);
            return "";
        }
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public static boolean m33(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentServices(intent, 0).size() > 0) {
            return true;
        }
        return false;
    }

    public static long getVersionCode(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo.getLongVersionCode();
            }
            return (long) packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            AFLogger.afErrorLog(e2.getMessage(), e2);
            return 0;
        }
    }

    public static boolean isPermissionAvailable(Context context, String str) {
        if (str != null) {
            int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
            AFLogger.afRDLog(new StringBuilder("is Permission Available: ").append(str).append("; res: ").append(checkPermission).toString());
            if (checkPermission == 0) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static String signature(PackageManager packageManager, String str) {
        MethodCollector.i(4780);
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            MethodCollector.o(4780);
            return null;
        }
        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        instance.update(generateCertificate.getEncoded());
        String a2 = a.a("%032X", new Object[]{new BigInteger(1, instance.digest())});
        MethodCollector.o(4780);
        return a2;
    }

    /* renamed from: ι  reason: contains not printable characters */
    static Map<String, String> m34(Context context, Map<String, String> map, Uri uri) {
        boolean z;
        String str;
        String str2;
        int i2;
        if (uri.getQuery() != null) {
            String[] split = uri.getQuery().split("&");
            z = false;
            for (String str3 : split) {
                int indexOf = str3.indexOf("=");
                if (indexOf > 0) {
                    str = str3.substring(0, indexOf);
                } else {
                    str = str3;
                }
                if (!map.containsKey(str)) {
                    if (str.equals("c")) {
                        str = "campaign";
                    } else if (str.equals("pid")) {
                        str = "media_source";
                    } else if (str.equals("af_prt")) {
                        z = true;
                        str = "agency";
                    }
                    map.put(str, "");
                }
                if (indexOf <= 0 || str3.length() <= (i2 = indexOf + 1)) {
                    str2 = null;
                } else {
                    str2 = str3.substring(i2);
                }
                map.put(str, str2);
            }
        } else {
            z = false;
        }
        try {
            if (!map.containsKey("install_time")) {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
                long j2 = packageInfo.firstInstallTime;
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                map.put("install_time", simpleDateFormat.format(new Date(j2)));
            }
        } catch (Exception e2) {
            AFLogger.afErrorLog("Could not fetch install time. ", e2);
        }
        if (uri.getQueryParameter("af_deeplink") != null && !map.containsKey("af_status")) {
            map.put("af_status", "Non-organic");
        }
        if (z) {
            map.remove("media_source");
        }
        String path = uri.getPath();
        if (path != null) {
            map.put("path", path);
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            map.put("scheme", scheme);
        }
        String host = uri.getHost();
        if (host != null) {
            map.put("host", host);
        }
        return map;
    }
}
