package com.bytedance.immersionbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f38880a;

    static {
        Covode.recordClassIndex(23839);
    }

    a(Activity activity) {
        this.f38880a = a(activity, "status_bar_height");
    }

    private static int a(Context context, String str) {
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
                if (dimensionPixelSize2 >= dimensionPixelSize) {
                    return dimensionPixelSize2;
                }
                return Math.round((((float) dimensionPixelSize) * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density);
            }
        } catch (Resources.NotFoundException unused) {
        }
        return 0;
    }
}
