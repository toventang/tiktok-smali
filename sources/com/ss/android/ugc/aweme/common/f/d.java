package com.ss.android.ugc.aweme.common.f;

import android.view.View;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f76420a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(47177);
    }

    public static void a(View view, int i2) {
        l.d(view, "");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), (int) n.b(view.getContext(), (float) i2));
    }
}
