package com.ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.content.a.f;
import androidx.core.graphics.drawable.a;
import androidx.l.a.a.i;
import com.bytedance.covode.number.Covode;

public final class dd {
    static {
        Covode.recordClassIndex(82949);
    }

    private static Drawable a(Context context, int i2, int i3) {
        try {
            i a2 = i.a(context.getResources(), i2, context.getTheme());
            if (a2 != null) {
                a2.setTint(context.getResources().getColor(i3));
            }
            return a2;
        } catch (Exception e2) {
            e2.printStackTrace();
            Drawable a3 = f.a(context.getResources(), i2, context.getTheme());
            if (a3 != null) {
                a.a(a3, context.getResources().getColor(i3));
            }
            return a3;
        }
    }

    public static void a(Context context, ImageView imageView, int i2, int i3) {
        Drawable a2 = a(context, i2, i3);
        if (a2 != null) {
            imageView.setImageDrawable(a2);
        }
    }
}
