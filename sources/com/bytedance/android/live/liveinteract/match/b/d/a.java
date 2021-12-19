package com.bytedance.android.live.liveinteract.match.b.d;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f10692a = new a();

    private static int b(boolean z) {
        return z ? 138 : 154;
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(5717);
    }

    public static int a(boolean z) {
        return y.a((float) b(z));
    }

    public static void a(View view, boolean z) {
        int i2;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z) {
                i2 = 28;
            } else {
                i2 = 12;
            }
            marginLayoutParams.topMargin = y.a((float) i2);
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
