package com.ss.android.ugc.aweme.aabplugin.core.base.view;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

final /* synthetic */ class d implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference f62558a;

    static {
        Covode.recordClassIndex(38485);
    }

    d(WeakReference weakReference) {
        this.f62558a = weakReference;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Activity activity = (Activity) this.f62558a.get();
        if (activity != null) {
            activity.finish();
        }
    }
}
