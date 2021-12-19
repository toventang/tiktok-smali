package com.ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f123528a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f123529b;

    static {
        Covode.recordClassIndex(81094);
    }

    f(b bVar, Activity activity) {
        this.f123528a = bVar;
        this.f123529b = activity;
    }

    public final void run() {
        b bVar = this.f123528a;
        Activity activity = this.f123529b;
        bVar.f123511b = d.a(activity, activity.getString(R.string.cz3));
        if (bVar.f123510a != null) {
            bVar.f123510a.f124402h.setValue(true);
        }
    }
}
