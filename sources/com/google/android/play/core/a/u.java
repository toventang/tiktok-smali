package com.google.android.play.core.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* access modifiers changed from: package-private */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    final Context f52734a;

    static {
        Covode.recordClassIndex(32655);
    }

    u(Context context) {
        this.f52734a = context;
    }

    static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j2 += a(file2);
            }
        }
        return j2;
    }
}
