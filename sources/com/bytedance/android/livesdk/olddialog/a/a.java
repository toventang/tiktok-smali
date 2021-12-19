package com.bytedance.android.livesdk.olddialog.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public final class a {
    static {
        Covode.recordClassIndex(11818);
    }

    public static long a(Context context, String str) {
        return d.a(context, "gift_dialog_storage", 0).getLong(str, 0);
    }

    public static int a(Context context, String str, int i2) {
        return d.a(context, "gift_dialog_storage", 0).getInt(str, i2);
    }
}
