package com.ss.android.ugc.aweme.common.f;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f76419a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(47176);
    }

    public static void a(View view) {
        l.d(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = (int) n.b(view.getContext(), -29.0f);
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
