package com.ss.android.ugc.effectmanager.common.utils;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.IOException;

public class CloseUtil {
    static {
        Covode.recordClassIndex(95326);
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
