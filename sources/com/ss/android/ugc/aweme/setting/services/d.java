package com.ss.android.ugc.aweme.setting.services;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.policy.a;

final /* synthetic */ class d implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f122669a;

    static {
        Covode.recordClassIndex(80518);
    }

    d(Activity activity) {
        this.f122669a = activity;
    }

    public final void onShow(DialogInterface dialogInterface) {
        new a(this.f122669a).a();
    }
}
