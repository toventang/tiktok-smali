package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class dm {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f118454a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final dm f118455b = new dm();

    private dm() {
    }

    static {
        Covode.recordClassIndex(76940);
    }

    public static final List<Integer> a() {
        try {
            int[] iArr = (int[]) SettingsManager.a().a("video_quality_category", int[].class, f118454a);
            if (iArr != null) {
                l.d(iArr, "");
                int length = iArr.length;
                if (length == 0) {
                    return z.INSTANCE;
                }
                if (length == 1) {
                    return n.a(Integer.valueOf(iArr[0]));
                }
                l.d(iArr, "");
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i2 : iArr) {
                    arrayList.add(Integer.valueOf(i2));
                }
                return arrayList;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
