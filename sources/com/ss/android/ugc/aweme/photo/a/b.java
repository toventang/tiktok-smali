package com.ss.android.ugc.aweme.photo.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.out.AVServiceImpl;

public final class b {
    static {
        Covode.recordClassIndex(73873);
    }

    public static String a(int i2) {
        return i2 != 1 ? i2 != 2 ? "public" : "friend" : "private";
    }

    public static String b(int i2) {
        if (i2 == 0) {
            return "video";
        }
        return null;
    }

    public static String a(int i2, Object obj) {
        if (i2 != 0) {
            return null;
        }
        if (AVServiceImpl.a().convertToExposureData(obj).getOrigin() == 1) {
            return "shoot";
        }
        return "upload";
    }
}
