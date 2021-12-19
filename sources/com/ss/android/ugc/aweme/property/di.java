package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class di {

    /* renamed from: a  reason: collision with root package name */
    public static final float[] f118447a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final di f118448b = new di();

    private di() {
    }

    static {
        Covode.recordClassIndex(76936);
    }

    public static final List<Float> a() {
        try {
            float[] fArr = (float[]) SettingsManager.a().a("video_bitrate_category", float[].class, f118447a);
            if (fArr != null) {
                l.d(fArr, "");
                int length = fArr.length;
                if (length == 0) {
                    return z.INSTANCE;
                }
                if (length == 1) {
                    return n.a(Float.valueOf(fArr[0]));
                }
                l.d(fArr, "");
                ArrayList arrayList = new ArrayList(fArr.length);
                for (float f2 : fArr) {
                    arrayList.add(Float.valueOf(f2));
                }
                return arrayList;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
