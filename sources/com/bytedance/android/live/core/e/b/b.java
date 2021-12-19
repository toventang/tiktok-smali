package com.bytedance.android.live.core.e.b;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f9015a = null;

    static {
        Covode.recordClassIndex(4593);
    }

    b(Runnable runnable) {
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable = this.f9015a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
