package com.ss.android.vesdk;

import android.media.MediaExtractor;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static String f151488a = "VEConcatHelper";

    static {
        Covode.recordClassIndex(99598);
    }

    private static String a(String str) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        String str2 = null;
        try {
            mediaExtractor.setDataSource(str);
            for (int i2 = 0; i2 < mediaExtractor.getTrackCount(); i2++) {
                String string = mediaExtractor.getTrackFormat(i2).getString("mime");
                if (string != null && string.startsWith("video/")) {
                    str2 = string;
                }
            }
            mediaExtractor.release();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return str2;
    }

    public static boolean a(String[] strArr) {
        String str = null;
        for (String str2 : strArr) {
            String a2 = a(str2);
            if ((str == null && (str = a2) == null) || !str.equals(a2)) {
                an.d(f151488a, "isCodecsValid false mime= " + a2 + " lastMime " + str);
                return false;
            }
        }
        an.a(f151488a, "isCodecsValid");
        return true;
    }
}
