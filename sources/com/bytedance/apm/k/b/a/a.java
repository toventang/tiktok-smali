package com.bytedance.apm.k.b.a;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(14641);
    }

    private static void a(View view) {
        if (view.getBackground() != null) {
            try {
                view.getBackground().setCallback(null);
                view.setBackgroundDrawable(null);
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setCallback(null);
            }
            imageView.setImageDrawable(null);
        }
    }

    private static void a(TextView textView) {
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        for (Drawable drawable : compoundDrawables) {
            if (drawable != null) {
                drawable.setCallback(null);
            }
        }
        textView.setCompoundDrawables(null, null, null, null);
    }

    public static void a(View view, Activity activity) {
        if (view != null && view.getContext() != null) {
            if (view.getContext() == activity) {
                a(view);
                if (view instanceof ImageView) {
                    a((ImageView) view);
                }
                if (view instanceof TextView) {
                    a((TextView) view);
                }
            }
            if (view instanceof ViewGroup) {
                a((ViewGroup) view, activity);
            }
        }
    }

    private static void a(ViewGroup viewGroup, Activity activity) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            a(viewGroup.getChildAt(i2), activity);
        }
    }
}
