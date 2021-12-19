package com.ss.android.ugc.aweme.player.sdk.a;

import android.os.Build;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.a;
import com.bytedance.covode.number.Covode;
import java.util.Locale;
import java.util.Map;

public final class d {
    static {
        Covode.recordClassIndex(73988);
    }

    static boolean a(SparseIntArray sparseIntArray, Map<String, Object> map) {
        boolean z;
        boolean z2;
        if (!(sparseIntArray == null || map == null || sparseIntArray.get(54, 0) == 0 || Build.VERSION.SDK_INT < 21)) {
            String a2 = com.ss.android.ugc.aweme.player.sdk.util.d.a();
            if (!TextUtils.isEmpty(a2) && a2.toLowerCase(Locale.US).startsWith("mt67")) {
                boolean booleanValue = ((Boolean) map.get("bytevc1")).booleanValue();
                if (1 == sparseIntArray.get(72, 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!booleanValue || z) {
                    if (1 == sparseIntArray.get(73, 0)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (booleanValue || z2) {
                        int intValue = ((Integer) map.get("header_video_height")).intValue();
                        int i2 = sparseIntArray.get(54, 0);
                        int i3 = -1;
                        if (i2 == 1) {
                            if (((Boolean) map.get("bytevc1")).booleanValue()) {
                                i3 = com.ss.android.ugc.aweme.player.sdk.util.d.c();
                            } else {
                                i3 = com.ss.android.ugc.aweme.player.sdk.util.d.b();
                            }
                        } else if (i2 == 2) {
                            i3 = sparseIntArray.get(53, -1);
                        }
                        a.a("isHeightExceed --> videoHeight:%s, heightUpperLimit:%s", new Object[]{Integer.valueOf(intValue), Integer.valueOf(i3)});
                        if (i3 <= 0 || intValue <= i3) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
