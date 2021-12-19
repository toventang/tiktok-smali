package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Environment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.ah.b.d;
import com.bytedance.android.livesdk.ah.f;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class c {
    static {
        Covode.recordClassIndex(13146);
    }

    public static void a(final Activity activity, final Fragment fragment) {
        f.a(activity).a(new d() {
            /* class com.bytedance.android.livesdk.utils.c.AnonymousClass1 */

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f22253c = 40003;

            static {
                Covode.recordClassIndex(13147);
            }

            @Override // com.bytedance.android.livesdk.ah.b.d
            public final void b(String... strArr) {
            }

            @Override // com.bytedance.android.livesdk.ah.b.d
            public final void a(String... strArr) {
                if (!"mounted".equals(Environment.getExternalStorageState())) {
                    n.a(activity, 2131234317, (int) R.string.gmc);
                    return;
                }
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                try {
                    Fragment fragment = fragment;
                    if (fragment != null) {
                        fragment.startActivityForResult(intent, this.f22253c);
                    } else {
                        activity.startActivityForResult(intent, this.f22253c);
                    }
                } catch (Exception unused) {
                    n.a(activity, 2131234317, (int) R.string.gmb);
                }
            }
        }, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r3 != null) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri a(android.content.Context r10, java.lang.String r11) {
        /*
            r5 = 11751(0x2de7, float:1.6467E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
            boolean r0 = com.bytedance.common.utility.m.a(r11)
            r4 = 0
            if (r0 == 0) goto L_0x0010
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        L_0x0010:
            android.content.ContentResolver r6 = r10.getContentResolver()     // Catch:{ Exception -> 0x0051, all -> 0x0047 }
            java.lang.String r9 = "_data= ?"
            r0 = 1
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0051, all -> 0x0047 }
            r1 = 0
            r10[r1] = r11     // Catch:{ Exception -> 0x0051, all -> 0x0047 }
            java.lang.String r0 = "_id"
            java.lang.String[] r8 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x0051, all -> 0x0047 }
            android.net.Uri r7 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0051, all -> 0x0047 }
            r11 = 0
            android.database.Cursor r3 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0051, all -> 0x0047 }
            boolean r0 = r3.moveToFirst()     // Catch:{ Exception -> 0x0052, all -> 0x0044 }
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = r3.getString(r1)     // Catch:{ Exception -> 0x0052, all -> 0x0044 }
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0052, all -> 0x0044 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0052, all -> 0x0044 }
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r2, r0)     // Catch:{ Exception -> 0x0052, all -> 0x0044 }
            r3.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r0
        L_0x0044:
            r0 = move-exception
            r4 = r3
            goto L_0x0048
        L_0x0047:
            r0 = move-exception
        L_0x0048:
            if (r4 == 0) goto L_0x004d
            r4.close()
        L_0x004d:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            throw r0
        L_0x0051:
            r3 = r4
        L_0x0052:
            if (r3 == 0) goto L_0x0057
        L_0x0054:
            r3.close()
        L_0x0057:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.c.a(android.content.Context, java.lang.String):android.net.Uri");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        if (0 == 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bc, code lost:
        if (r1 == null) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r14, android.net.Uri r15) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.c.a(android.content.Context, android.net.Uri):java.lang.String");
    }
}
