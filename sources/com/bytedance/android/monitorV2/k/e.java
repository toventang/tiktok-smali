package com.bytedance.android.monitorV2.k;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f24018a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<View> f24019b;

    static {
        Covode.recordClassIndex(14155);
    }

    public final View a() {
        return this.f24019b.get();
    }

    public e(View view, String str) {
        l.c(view, "");
        l.c(str, "");
        this.f24018a = str;
        this.f24019b = new WeakReference<>(view);
    }
}
