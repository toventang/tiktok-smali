package com.ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.ArrayList;

public final class r {
    static {
        Covode.recordClassIndex(94703);
    }

    public static String[] a(q[] qVarArr, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < qVarArr.length; i2++) {
            String path = new File(str, str2 + i2 + ".png").getPath();
            if (qVarArr[i2].a(path)) {
                arrayList.add(path);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
