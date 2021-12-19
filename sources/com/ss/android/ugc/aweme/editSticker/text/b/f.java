package com.ss.android.ugc.aweme.editSticker.text.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f88411a = new f();

    public static int a(int i2) {
        if (i2 == -14400333) {
            return -864954;
        }
        if (i2 == -864954) {
            return -16777216;
        }
        if (i2 == -469015) {
            return -2988141;
        }
        if (i2 != -27843) {
            return i2 != -1 ? -1 : -16777216;
        }
        return -12052986;
    }

    private f() {
    }

    static {
        Covode.recordClassIndex(55590);
    }

    public static float a(Context context, float f2) {
        l.d(context, "");
        Resources resources = context.getResources();
        l.b(resources, "");
        return (r.a(context, 4.0f) / TypedValue.applyDimension(2, 28.0f, resources.getDisplayMetrics())) * f2;
    }
}
