package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.i.a;
import java.io.Closeable;
import java.io.IOException;

public final class c {
    static {
        Covode.recordClassIndex(17489);
    }

    public static boolean a(Closeable closeable) {
        if (closeable == null) {
            return true;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException unused) {
            a.c();
            return false;
        }
    }
}
