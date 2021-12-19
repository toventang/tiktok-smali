package com.facebook.common.k;

import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import java.net.MalformedURLException;
import java.net.URL;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f47135a = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");

    static {
        Covode.recordClassIndex(28682);
    }

    public static boolean c(Uri uri) {
        return "file".equals(h(uri));
    }

    public static boolean d(Uri uri) {
        return "content".equals(h(uri));
    }

    public static boolean f(Uri uri) {
        return "asset".equals(h(uri));
    }

    public static boolean g(Uri uri) {
        return "res".equals(h(uri));
    }

    public static String h(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri a(int i2) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i2)).build();
    }

    public static boolean b(Uri uri) {
        String h2 = h(uri);
        if ("https".equals(h2) || "http".equals(h2)) {
            return true;
        }
        return false;
    }

    public static boolean e(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString())) {
            return true;
        }
        return false;
    }

    public static URL a(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.ContentResolver r11, android.net.Uri r12) {
        /*
            r4 = 4582(0x11e6, float:6.421E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            r6 = r12
            boolean r0 = d(r6)
            r1 = 0
            if (r0 == 0) goto L_0x003f
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r11
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x002f
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "_data"
            int r2 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x002c }
            r0 = -1
            if (r2 == r0) goto L_0x002f
            java.lang.String r1 = r3.getString(r2)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r0 = move-exception
            r1 = r3
            goto L_0x0036
        L_0x002f:
            if (r3 == 0) goto L_0x0049
            r3.close()
            goto L_0x0049
        L_0x0035:
            r0 = move-exception
        L_0x0036:
            if (r1 == 0) goto L_0x003b
            r1.close()
        L_0x003b:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        L_0x003f:
            boolean r0 = c(r6)
            if (r0 == 0) goto L_0x0049
            java.lang.String r1 = r6.getPath()
        L_0x0049:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.k.g.a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
