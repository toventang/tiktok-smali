package com.ttnet.org.chromium.base;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.base.a.b;

public class BuildInfo {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ boolean f155113m = true;
    private static PackageInfo n;
    private static boolean o;
    private static String p = "";

    /* renamed from: a  reason: collision with root package name */
    public String f155114a;

    /* renamed from: b  reason: collision with root package name */
    public long f155115b;

    /* renamed from: c  reason: collision with root package name */
    public String f155116c;

    /* renamed from: d  reason: collision with root package name */
    public long f155117d;

    /* renamed from: e  reason: collision with root package name */
    public String f155118e;

    /* renamed from: f  reason: collision with root package name */
    public String f155119f;

    /* renamed from: g  reason: collision with root package name */
    public String f155120g;

    /* renamed from: h  reason: collision with root package name */
    public String f155121h;

    /* renamed from: i  reason: collision with root package name */
    public String f155122i;

    /* renamed from: j  reason: collision with root package name */
    public String f155123j;

    /* renamed from: k  reason: collision with root package name */
    public String f155124k;

    /* renamed from: l  reason: collision with root package name */
    public String f155125l;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static BuildInfo f155126a = new BuildInfo((byte) 0);

        static {
            Covode.recordClassIndex(103248);
        }
    }

    static {
        Covode.recordClassIndex(103247);
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    private static String[] getAll() {
        String str;
        BuildInfo buildInfo = a.f155126a;
        String packageName = c.f155223a.getPackageName();
        String[] strArr = new String[23];
        strArr[0] = Build.BRAND;
        strArr[1] = Build.DEVICE;
        strArr[2] = Build.ID;
        strArr[3] = Build.MANUFACTURER;
        strArr[4] = Build.MODEL;
        strArr[5] = String.valueOf(Build.VERSION.SDK_INT);
        strArr[6] = Build.TYPE;
        strArr[7] = Build.BOARD;
        strArr[8] = packageName;
        strArr[9] = String.valueOf(buildInfo.f155115b);
        strArr[10] = buildInfo.f155114a;
        strArr[11] = buildInfo.f155116c;
        strArr[12] = String.valueOf(buildInfo.f155117d);
        strArr[13] = buildInfo.f155118e;
        strArr[14] = buildInfo.f155122i;
        strArr[15] = buildInfo.f155120g;
        strArr[16] = buildInfo.f155119f;
        strArr[17] = buildInfo.f155121h;
        strArr[18] = p;
        strArr[19] = buildInfo.f155124k;
        strArr[20] = buildInfo.f155125l;
        strArr[21] = buildInfo.f155123j;
        if (a()) {
            str = "1";
        } else {
            str = "0";
        }
        strArr[22] = str;
        return strArr;
    }

    private BuildInfo() {
        String str;
        this.f155114a = "";
        this.f155116c = "";
        this.f155118e = "";
        this.f155119f = "";
        this.f155120g = "";
        this.f155121h = "";
        this.f155122i = "";
        this.f155123j = "";
        this.f155124k = "";
        this.f155125l = "";
        o = true;
        try {
            Context context = c.f155223a;
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            long a2 = a(packageInfo);
            this.f155115b = a2;
            PackageInfo packageInfo2 = n;
            PackageInfo packageInfo3 = null;
            if (packageInfo2 != null) {
                this.f155116c = packageInfo2.packageName;
                this.f155117d = a(n);
                this.f155118e = a(n.versionName);
                n = null;
            } else {
                this.f155116c = packageName;
                this.f155117d = a2;
                this.f155118e = a(packageInfo.versionName);
            }
            this.f155114a = a(packageManager.getApplicationLabel(packageInfo.applicationInfo));
            this.f155119f = a(packageManager.getInstallerPackageName(this.f155116c));
            try {
                packageInfo3 = packageManager.getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageInfo3 != null) {
                str = String.valueOf(a(packageInfo3));
            } else {
                str = "gms versionCode not available.";
            }
            this.f155120g = str;
            String str2 = "true";
            try {
                packageManager.getPackageInfo("projekt.substratum", 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str2 = "false";
            }
            this.f155124k = str2;
            String str3 = "Not Enabled";
            if (b.f155221d != 0) {
                try {
                    str3 = c.f155223a.getString(b.f155221d);
                } catch (Exception unused3) {
                    str3 = "Not found";
                }
            }
            this.f155125l = str3;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f155121h = TextUtils.join(", ", Build.SUPPORTED_ABIS);
            } else {
                this.f155121h = com.a.a("ABI1: %s, ABI2: %s", new Object[]{Build.CPU_ABI, Build.CPU_ABI2});
            }
            this.f155123j = com.a.a("@%x_%x", new Object[]{Long.valueOf(this.f155117d), Long.valueOf(packageInfo.lastUpdateTime)});
            this.f155122i = Build.FINGERPRINT.substring(0, Math.min(Build.FINGERPRINT.length(), 128));
        } catch (Exception e2) {
            f.c("BuildInfo", "NameNotFoundException: ".concat(String.valueOf(e2)), new Object[0]);
        }
    }

    /* synthetic */ BuildInfo(byte b2) {
        this();
    }

    private static long a(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(packageInfo);
        }
        return (long) packageInfo.versionCode;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return charSequence.toString();
    }
}
