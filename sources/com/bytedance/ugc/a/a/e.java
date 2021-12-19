package com.bytedance.ugc.a.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.a.c;
import h.f.b.l;

public final class e extends c.e<View> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f45831a = new e();

    @Override // com.bytedance.ugc.a.c.e
    public final int a(View view) {
        l.c(view, "");
        return 0;
    }

    private e() {
    }

    static {
        Covode.recordClassIndex(27916);
    }

    @Override // com.bytedance.ugc.a.c.e
    public final View b(View view) {
        l.c(view, "");
        if (view.getClass().isAssignableFrom(View.class)) {
            return view;
        }
        return null;
    }
}
