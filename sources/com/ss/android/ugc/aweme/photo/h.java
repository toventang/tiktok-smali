package com.ss.android.ugc.aweme.photo;

import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.i;

public final class h {
    static {
        Covode.recordClassIndex(73888);
    }

    public static int[] a(String str) {
        MethodCollector.i(12424);
        if (!i.a(str)) {
            int[] iArr = {0, 0};
            MethodCollector.o(12424);
            return iArr;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int[] iArr2 = {options.outWidth, options.outHeight};
        MethodCollector.o(12424);
        return iArr2;
    }
}
