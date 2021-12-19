package com.bytedance.ies.xbridge.i.d;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import h.q;
import h.r;
import java.io.File;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36131a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(21601);
    }

    private static boolean a() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    private static File a(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                q.m223constructorimpl(Boolean.valueOf(file.createNewFile()));
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
        }
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0190 A[SYNTHETIC, Splitter:B:101:0x0190] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0195 A[Catch:{ IOException -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x019a A[Catch:{ IOException -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x019f A[Catch:{ IOException -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 462
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xbridge.i.d.a.a(android.content.Context, java.lang.String):java.lang.String");
    }
}
