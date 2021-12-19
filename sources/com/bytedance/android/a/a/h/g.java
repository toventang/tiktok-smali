package com.bytedance.android.a.a.h;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;

public final class g {
    static {
        Covode.recordClassIndex(3211);
    }

    public static void a(Closeable... closeableArr) {
        int i2 = 0;
        do {
            Closeable closeable = closeableArr[0];
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            i2++;
        } while (i2 <= 0);
    }
}
