package com.ss.android.newmedia;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(37042);
    }

    public static boolean a(String str, String str2, List<String> list) {
        boolean startsWith;
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            if (str2 == null) {
                str2 = Uri.parse(str).getScheme();
            }
            if (TextUtils.equals(str2, "sslocal")) {
                return true;
            }
            for (String str3 : list) {
                if (!(str == null || str2 == null || str3 == null)) {
                    if (!str3.contains(":")) {
                        startsWith = TextUtils.equals(str2, str3);
                    } else {
                        startsWith = str.startsWith(str3);
                    }
                    if (startsWith) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
