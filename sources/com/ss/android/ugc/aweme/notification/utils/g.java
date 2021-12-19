package com.ss.android.ugc.aweme.notification.utils;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notification.g.a;
import com.zhiliaoapp.musically.R;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static float f113874a;

    static {
        Covode.recordClassIndex(73230);
    }

    public static void b(Context context) {
        if (context != null) {
            f113874a = c(context);
        }
    }

    public static int a(Context context) {
        float f2 = f113874a;
        if (f2 > 0.0f) {
            return (int) f2;
        }
        float c2 = c(context);
        f113874a = c2;
        return (int) c2;
    }

    public static void b(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setForeground(null);
        } else {
            view.setOnClickListener(null);
        }
    }

    public static void a(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setForeground(view.getResources().getDrawable(R.drawable.ol));
        } else {
            a.a(view);
        }
    }

    private static float c(Context context) {
        float f2 = 0.0f;
        if (context == null) {
            return 0.0f;
        }
        int[] iArr = {R.string.d88, R.string.bbg, R.string.d_s, R.string.d8b, R.string.dkm, R.string.dln, R.string.bbi, R.string.byt, R.string.d3z};
        Paint paint = new Paint();
        paint.setTextSize(n.b(context, 14.0f));
        float b2 = n.b(context, 88.0f);
        float b3 = n.b(context, 120.0f);
        int i2 = 0;
        do {
            float measureText = paint.measureText(context.getString(iArr[i2]));
            if (measureText > f2) {
                f2 = measureText;
            }
            i2++;
        } while (i2 < 9);
        float b4 = f2 + n.b(context, 16.0f);
        if (b4 > b3) {
            return b3;
        }
        if (b4 < b2) {
            return b2;
        }
        return b4;
    }

    public static void a(final View view, final int i2, final int i3, final int i4, final int i5) {
        ((View) view.getParent()).post(new Runnable() {
            /* class com.ss.android.ugc.aweme.notification.utils.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(73231);
            }

            public final void run() {
                Rect rect = new Rect();
                view.setEnabled(true);
                view.getHitRect(rect);
                rect.top -= i2;
                rect.bottom += i3;
                rect.left -= i4;
                rect.right += i5;
                TouchDelegate touchDelegate = new TouchDelegate(rect, view);
                if (view.getParent() instanceof View) {
                    ((View) view.getParent()).setTouchDelegate(touchDelegate);
                }
            }
        });
    }
}
