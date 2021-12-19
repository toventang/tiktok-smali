package com.ss.android.medialib;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class e {
    static {
        Covode.recordClassIndex(36879);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }
}
