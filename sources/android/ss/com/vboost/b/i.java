package android.ss.com.vboost.b;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import java.io.File;

public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f437a = i.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static h f438b = null;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f439c = false;

    /* renamed from: d  reason: collision with root package name */
    private static int[] f440d = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1082130944, 4095, 1098907648, 255, 1119944704, 1, 1124073472, 255, 1128267776, 65535, 1115799552, LiveNetAdaptiveHurryTimeSetting.DEFAULT, 1115734016, 1000};

    /* renamed from: e  reason: collision with root package name */
    private static int[] f441e = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1, 1124073472, 255, 1128267776, 65535, 1115799552, LiveNetAdaptiveHurryTimeSetting.DEFAULT, 1115734016, 1000};

    /* renamed from: f  reason: collision with root package name */
    private static int[] f442f = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1, 1124073472, 255, 1128267776, 65535, 1115799552, 1, 1115734016, 1000};

    /* renamed from: g  reason: collision with root package name */
    private static int[] f443g = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1};

    /* renamed from: h  reason: collision with root package name */
    private static int[] f444h = {1077936128, 1, 1086324736, 1, 1090519040, 4, 1090519296, 4, 1082130432, 4095, 1082130688, 4095, 1098907648, 255};

    /* renamed from: i  reason: collision with root package name */
    private static int[] f445i;

    /* renamed from: j  reason: collision with root package name */
    private static int[] f446j;

    /* renamed from: k  reason: collision with root package name */
    private static int[] f447k = {1077936128, 1, 1115799552, LiveNetAdaptiveHurryTimeSetting.DEFAULT, 1115734016, 1000};

    /* renamed from: l  reason: collision with root package name */
    private static int[] f448l = {1082146816, 4095};

    @Override // android.ss.com.vboost.b.c
    public final void b() {
        h hVar = f438b;
        if (hVar != null) {
            hVar.a();
        }
    }

    @Override // android.ss.com.vboost.b.c
    public final void a() {
        h hVar = f438b;
        if (hVar != null) {
            hVar.a(30000, f446j);
            f439c = true;
        }
    }

    static {
        Covode.recordClassIndex(23);
        int[] iArr = {1077936128, 1, 1086324736, 1, 1082130432, 4095, 1082130688, 4095, 1098907648, 255, 1119944704, 1};
        f445i = iArr;
        f446j = iArr;
    }

    @Override // android.ss.com.vboost.b.c
    public final void b(long j2) {
        h hVar = f438b;
        if (hVar != null) {
            hVar.a((int) j2, f446j);
            f439c = true;
        }
    }

    @Override // android.ss.com.vboost.b.c
    public final void c(long j2) {
        h hVar = f438b;
        if (hVar != null) {
            hVar.a((int) j2, f447k);
            f439c = true;
        }
    }

    @Override // android.ss.com.vboost.b.c
    public final void a(long j2) {
        h hVar = f438b;
        if (hVar != null) {
            hVar.a((int) j2, f446j);
            f439c = true;
        }
    }

    @Override // android.ss.com.vboost.b.c
    public final boolean a(Context context) {
        if (f438b == null) {
            f438b = new h(context);
        }
        if (h.f432a) {
            File[] listFiles = new File("/sys/devices/system/cpu/cpufreq").listFiles();
            int i2 = 2;
            if (listFiles != null && listFiles.length > 0) {
                int i3 = 0;
                for (File file : listFiles) {
                    if (file.getName().startsWith("policy")) {
                        i3++;
                    }
                }
                if (i3 != 0) {
                    i2 = i3;
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                if (i2 == 3) {
                    f446j = f440d;
                    return true;
                }
                f446j = f441e;
                return true;
            } else if (Build.VERSION.SDK_INT >= 26) {
                f446j = f442f;
                return true;
            } else if (Build.VERSION.SDK_INT >= 24) {
                f446j = f443g;
                return true;
            } else if (Build.VERSION.SDK_INT >= 23) {
                f446j = f444h;
                return true;
            }
        }
        return false;
    }
}
