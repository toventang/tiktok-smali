package com.bytedance.common.a;

import com.bytedance.covode.number.Covode;
import dalvik.system.DexFile;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class b {
    static {
        Covode.recordClassIndex(15750);
    }

    private static List<String> a(DexFile dexFile) {
        ArrayList arrayList = new ArrayList();
        if (dexFile == null) {
            return arrayList;
        }
        try {
            Enumeration<String> entries = dexFile.entries();
            while (entries.hasMoreElements()) {
                arrayList.add(entries.nextElement());
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|(2:4|(1:6)(8:7|(4:10|(2:12|(1:14)(2:15|(2:18|(1:20)(1:21))))|16|(0))|(3:25|(1:27)(1:29)|28)|30|31|(1:33)|34|(2:37|38)(5:39|(2:42|40)|45|43|44)))|8|(0)|23|25|(0)(0)|28|30|31|(0)|34|(0)(0)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x006d */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[Catch:{ Exception -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0033 A[Catch:{ Exception -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e A[Catch:{ Exception -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0056 A[Catch:{ Exception -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0073 A[Catch:{ IOException -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> a(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.a.b.a(java.lang.String):java.util.List");
    }

    public static class a {
        static {
            Covode.recordClassIndex(15751);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
            if (r1 == 1) goto L_0x0077;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static synchronized boolean a(java.io.File r6, java.io.File r7) {
            /*
            // Method dump skipped, instructions count: 130
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.a.b.a.a(java.io.File, java.io.File):boolean");
        }
    }
}
