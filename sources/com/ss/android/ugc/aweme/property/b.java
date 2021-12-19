package com.ss.android.ugc.aweme.property;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.port.in.g;
import java.util.Arrays;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f118355a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f118356b;

    static {
        Covode.recordClassIndex(76867);
    }

    public static int a(int i2, int i3) {
        return (i2 <= 0 || i2 > 51) ? i3 : i2;
    }

    private static boolean j() {
        int i2 = Build.VERSION.SDK_INT;
        return true;
    }

    public static boolean b() {
        if (!j() || !eh.a()) {
            return false;
        }
        return true;
    }

    public static boolean a() {
        if (!j() || !by.a() || f118356b) {
            return false;
        }
        return true;
    }

    public static float c() {
        float a2 = SettingsManager.a().a("video_bitrate", 1.0f);
        int a3 = com.bytedance.ies.abmock.b.a().a(true, "video_bitrate_category_index", 0);
        List<Float> a4 = di.a();
        if (!h.b(a4) || a3 >= a4.size()) {
            return a2;
        }
        float floatValue = a4.get(a3).floatValue();
        return floatValue == 0.0f ? a2 : floatValue;
    }

    public static int d() {
        int intValue;
        int a2 = a(SettingsManager.a().a("video_quality", 18), 18);
        int a3 = com.bytedance.ies.abmock.b.a().a(true, "video_quality_category_index", 0);
        List<Integer> a4 = dm.a();
        return (!h.b(a4) || a3 >= a4.size() || (intValue = a4.get(a3).intValue()) == 0) ? a2 : intValue;
    }

    public static String e() {
        int[] g2 = g();
        if (g2 == null || g2.length < 2) {
            return "";
        }
        return g2[0] + "*" + g2[1];
    }

    public static String f() {
        int[] h2 = h();
        if (h2 == null || h2.length < 2) {
            return "";
        }
        return h2[0] + "*" + h2[1];
    }

    public static int[] g() {
        int[] iArr;
        int[] a2 = a(fg.a());
        int a3 = fi.a();
        List<String> a4 = fh.a();
        if (!h.b(a4) || a3 >= a4.size()) {
            iArr = null;
        } else {
            iArr = a(a4.get(a3));
        }
        Arrays.toString(iArr);
        Arrays.toString(a2);
        if (iArr != null) {
            return iArr;
        }
        return a2;
    }

    public static int[] h() {
        int[] iArr;
        int[] a2 = a(fg.a());
        int a3 = cf.a();
        List<String> a4 = ce.a();
        if (!h.b(a4) || a3 >= a4.size()) {
            iArr = null;
        } else {
            iArr = a(a4.get(a3));
        }
        Arrays.toString(iArr);
        Arrays.toString(a2);
        if (iArr != null) {
            return iArr;
        }
        return a2;
    }

    public static boolean i() {
        if (!j() || !g.a().e().getWatermarkHardcode(false) || !com.bytedance.ies.abmock.b.a().a(true, "upload_save_local", true)) {
            return false;
        }
        return true;
    }

    public static int[] a(int i2) {
        int[] iArr;
        List<String> a2 = fh.a();
        if (!h.b(a2) || i2 >= a2.size()) {
            iArr = null;
        } else {
            iArr = a(a2.get(i2));
        }
        Arrays.toString(iArr);
        return iArr;
    }

    public static int[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int[] iArr = new int[0];
        try {
            String[] split = str.split("x");
            int[] iArr2 = new int[split.length];
            for (int i2 = 0; i2 < split.length; i2++) {
                iArr2[i2] = Integer.parseInt(split[i2]);
            }
            iArr = iArr2;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (iArr.length != 2) {
            return null;
        }
        return iArr;
    }
}
