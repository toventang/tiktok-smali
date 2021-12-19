package com.ss.android.ugc.aweme.utils.e;

import android.content.Context;
import android.graphics.Paint;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static float f142843a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f142844b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(93459);
    }

    public static int a(Context context) {
        float f2 = f142843a;
        if (f2 > 0.0f) {
            return (int) f2;
        }
        float b2 = b(context);
        f142843a = b2;
        return (int) b2;
    }

    private static float b(Context context) {
        float f2 = 0.0f;
        if (context == null) {
            return 0.0f;
        }
        int[] iArr = {R.string.d88, R.string.bbg, R.string.d_s, R.string.d8b, R.string.dkm, R.string.dln, R.string.bbi, R.string.byt};
        Paint paint = new Paint();
        paint.setTextSize(n.b(context, 14.0f));
        float b2 = n.b(context, 88.0f);
        float b3 = n.b(context, 120.0f);
        for (int i2 = 0; i2 < 8; i2++) {
            float measureText = paint.measureText(context.getString(iArr[i2])) - 0.5f;
            if (measureText > f2) {
                f2 = measureText;
            }
        }
        float b4 = f2 + (n.b(context, 16.0f) - 0.5f);
        if (b4 > b3) {
            return b3;
        }
        if (b4 < b2) {
            return b2;
        }
        return b4;
    }
}
