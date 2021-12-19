package com.appsflyer.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class ac extends ContentFetcher<String> {
    static {
        Covode.recordClassIndex(2710);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.appsflyer.internal.ContentFetcher
    public final /* synthetic */ String get() {
        start();
        return super.get();
    }

    /* renamed from: ɩ  reason: contains not printable characters */
    public final String m124() {
        start();
        return (String) super.get();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* renamed from: ı  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String query() {
        /*
            r11 = this;
            r4 = 3510(0xdb6, float:4.919E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            r3 = 0
            java.lang.String r2 = "aid"
            android.content.Context r0 = r11.context     // Catch:{ all -> 0x0050 }
            android.content.ContentResolver r5 = r0.getContentResolver()     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "content://"
            r1.<init>(r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r11.authority     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0050 }
            android.net.Uri r6 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x0050 }
            java.lang.String[] r7 = new java.lang.String[]{r2}     // Catch:{ all -> 0x0050 }
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r1 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0047
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0047
            int r0 = r1.getColumnIndex(r2)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0045 }
            r1.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r0
        L_0x0045:
            r0 = move-exception
            goto L_0x0052
        L_0x0047:
            if (r1 == 0) goto L_0x004c
            r1.close()
        L_0x004c:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r3
        L_0x0050:
            r0 = move-exception
            r1 = r3
        L_0x0052:
            if (r1 == 0) goto L_0x0057
            r1.close()
        L_0x0057:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.ac.query():java.lang.String");
    }

    public ac(Context context) {
        super(context, "com.facebook.katana.provider.AttributionIdProvider", "e3f9e1e0cf99d0e56a055ba65e241b3399f7cea524326b0cdd6ec1327ed0fdc1", 500);
    }
}
