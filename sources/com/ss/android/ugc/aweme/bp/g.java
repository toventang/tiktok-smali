package com.ss.android.ugc.aweme.bp;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;

public final class g {
    static {
        Covode.recordClassIndex(42338);
    }

    public static boolean a() {
        Context a2;
        if (Build.VERSION.SDK_INT < 23 || (a2 = d.a()) == null) {
            return false;
        }
        try {
            if (a2.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            System.err.println("isOk ".concat(String.valueOf(th)));
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        if (r3 == null) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bp.g.a(android.content.Context):void");
    }
}
