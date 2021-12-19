package com.bytedance.android.livesdk.a;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e {
    static {
        Covode.recordClassIndex(7385);
    }

    public static final String a(j jVar, Context context) {
        l.d(jVar, "");
        l.d(context, "");
        if (jVar.f7925a == -1) {
            String string = context.getString(R.string.egc);
            l.b(string, "");
            return string;
        } else if (jVar.f7925a < 60) {
            String quantityString = context.getResources().getQuantityString(R.plurals.ge, (int) jVar.f7925a, Integer.valueOf((int) jVar.f7925a));
            l.b(quantityString, "");
            return quantityString;
        } else {
            Resources resources = context.getResources();
            int i2 = (int) (jVar.f7925a / 60);
            String quantityString2 = resources.getQuantityString(R.plurals.gd, i2, Integer.valueOf(i2));
            l.b(quantityString2, "");
            return quantityString2;
        }
    }
}
