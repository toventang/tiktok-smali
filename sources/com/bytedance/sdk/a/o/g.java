package com.bytedance.sdk.a.o;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;

public final class g {
    static {
        Covode.recordClassIndex(26625);
    }

    public static void a(Context context) {
        if (context != null) {
            Toast makeText = Toast.makeText(context, (int) R.string.bey, 0);
            if (Build.VERSION.SDK_INT == 25) {
                ic.a(makeText);
            }
            makeText.show();
        }
    }
}
