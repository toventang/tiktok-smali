package com.ss.android.ugc.aweme.im.sdk.common.data.b.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static a f102488a;

    static {
        Covode.recordClassIndex(65623);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(6993);
        if (f102488a == null) {
            synchronized (a.class) {
                try {
                    if (f102488a == null) {
                        f102488a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6993);
                    throw th;
                }
            }
        }
        a aVar = f102488a;
        MethodCollector.o(6993);
        return aVar;
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists FRIENDS_RELATION (");
        com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a[] values = com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a.values();
        for (com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r2 != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r2 != null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, java.lang.Integer> c() {
        /*
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            r4.<init>()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r0 = "select * from FRIENDS_RELATION"
            r4.append(r0)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b r1 = com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b.a()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            android.database.Cursor r2 = r1.b(r0)     // Catch:{ Exception -> 0x004b, all -> 0x0049 }
            if (r2 == 0) goto L_0x0046
        L_0x001e:
            boolean r0 = r2.moveToNext()     // Catch:{ Exception -> 0x0044 }
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a r0 = com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a.COLUMN_SEC_UID     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = r0.key     // Catch:{ Exception -> 0x0044 }
            int r0 = r2.getColumnIndex(r0)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r1 = r2.getString(r0)     // Catch:{ Exception -> 0x0044 }
            com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a r0 = com.ss.android.ugc.aweme.im.sdk.common.data.b.b.a.COLUMN_RELATION_TYPE     // Catch:{ Exception -> 0x0044 }
            java.lang.String r0 = r0.key     // Catch:{ Exception -> 0x0044 }
            int r0 = r2.getColumnIndex(r0)     // Catch:{ Exception -> 0x0044 }
            int r0 = r2.getInt(r0)     // Catch:{ Exception -> 0x0044 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0044 }
            r3.put(r1, r0)     // Catch:{ Exception -> 0x0044 }
            goto L_0x001e
        L_0x0044:
            r0 = move-exception
            goto L_0x004c
        L_0x0046:
            if (r2 == 0) goto L_0x005c
            goto L_0x0059
        L_0x0049:
            r0 = move-exception
            goto L_0x0051
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            r0.printStackTrace()     // Catch:{ all -> 0x0050 }
            goto L_0x0057
        L_0x0050:
            r0 = move-exception
        L_0x0051:
            if (r2 == 0) goto L_0x0056
            r2.close()
        L_0x0056:
            throw r0
        L_0x0057:
            if (r2 == 0) goto L_0x005c
        L_0x0059:
            r2.close()
        L_0x005c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.b.c.a.c():java.util.Map");
    }
}
