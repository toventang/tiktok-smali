package com.ss.android.ugc.aweme.qrcode;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.zhiliaoapp.musically.R;

public final class c {
    static {
        Covode.recordClassIndex(77769);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0018 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qrcode.c.a(java.lang.String):int");
    }

    public static int a(int i2, String str) {
        if (i2 == 4 && TextUtils.equals(b.g().getCurUserId(), str)) {
            return R.string.ddn;
        }
        return R.string.f6x;
    }

    public static String b(int i2, String str) {
        if (i2 == 1) {
            return "video";
        }
        if (i2 == 2) {
            return "challenge";
        }
        if (i2 == 3) {
            return "music";
        }
        if (i2 != 4) {
            if (i2 == 5) {
                return "live";
            }
            if (i2 == 8) {
                return "bodydance_detail";
            }
            if (i2 == 9) {
                return "shoot";
            }
            if (i2 == 17) {
                return "sticker_detail";
            }
            if (i2 == 23) {
                return "challenge";
            }
            if (i2 != 31) {
                return "text";
            }
            return "live";
        } else if (TextUtils.equals(b.g().getCurUserId(), str)) {
            return "personal_homepage";
        } else {
            return "others_homepage";
        }
    }
}
