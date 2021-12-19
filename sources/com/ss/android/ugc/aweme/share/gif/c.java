package com.ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f123518a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f123519b;

    static {
        Covode.recordClassIndex(81091);
    }

    c(b bVar, Activity activity) {
        this.f123518a = bVar;
        this.f123519b = activity;
    }

    public final void run() {
        b bVar = this.f123518a;
        Activity activity = this.f123519b;
        if (bVar.f123511b != null) {
            bVar.f123511b.dismiss();
        }
        new a(activity).a(R.string.cyy).a();
        if (bVar.f123510a != null) {
            bVar.f123510a.f124402h.setValue(false);
        }
    }
}
