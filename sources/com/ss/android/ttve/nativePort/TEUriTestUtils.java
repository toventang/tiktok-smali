package com.ss.android.ttve.nativePort;

import com.bytedance.covode.number.Covode;

public class TEUriTestUtils {
    static {
        Covode.recordClassIndex(37732);
    }

    public static native int checkVideo(String str);

    public static native int decodeImageFile(String str);

    public static native int getColorGamut(String str);

    public static native int getImageInfo(String str);

    public static native boolean isFileExistCompat(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0074, code lost:
        if (r3 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getRotation(android.content.ContentResolver r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TEUriTestUtils.getRotation(android.content.ContentResolver, java.lang.String):int");
    }
}
