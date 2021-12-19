package com.bytedance.im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.b;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.a.i;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.proto.IMCMD;
import java.util.List;

public class e {

    /* renamed from: a  reason: collision with root package name */
    static final String f38769a = e.class.getSimpleName();

    public static String a(int i2) {
        return i2 != 0 ? i2 != 6 ? i2 != 9 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "other" : "manual" : "net" : "cursor" : "migrate" : "token" : "init";
    }

    public static boolean a(long j2, long j3) {
        return (j2 & j3) == j3;
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    public static int[] a() {
        int[] iArr = d.a().b().t;
        return iArr == null ? d.a().b().s : iArr;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String valueOf = String.valueOf(d.a().f37562b.a());
        String[] split = str.split(",");
        for (String str2 : split) {
            if (str2 != null && (str2.equals(valueOf) || str2.equals("0"))) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception e2) {
            f.b("imsdk", f38769a, e2);
            return z;
        }
    }

    public static boolean a(Integer num) {
        if (num == null) {
            return false;
        }
        if (IMCMD.REPORT_CLIENT_METRICS.getValue() == num.intValue() || IMCMD.BROADCAST_RECV_MESSAGE.getValue() == num.intValue()) {
            return true;
        }
        i iVar = d.a().f37568h;
        return iVar != null && iVar.a(num);
    }

    static {
        Covode.recordClassIndex(23122);
    }

    public static int b() {
        int[] a2 = a();
        if (a2 == null) {
            return 0;
        }
        return a2.length;
    }

    public static long c() {
        b bVar = d.a().f37562b;
        if (bVar == null) {
            return 0;
        }
        return bVar.a();
    }

    public static int a(List list) {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static String a(Object obj) {
        try {
            return h.f38770a.b(obj);
        } catch (Throwable th) {
            f.b("imsdk", "toJson", th);
            return "";
        }
    }

    public static float a(String str, float f2) {
        if (TextUtils.isEmpty(str)) {
            return f2;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception e2) {
            f.b("imsdk", f38769a, e2);
            return f2;
        }
    }

    public static int a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return i2;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e2) {
            f.b("imsdk", f38769a, e2);
            return i2;
        }
    }

    public static long a(String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            return j2;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e2) {
            f.b("imsdk", f38769a, e2);
            return j2;
        }
    }

    public static String a(List list, String str) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2));
            if (i2 < list.size() - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
