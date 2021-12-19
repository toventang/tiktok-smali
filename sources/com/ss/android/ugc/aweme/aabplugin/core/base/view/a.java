package com.ss.android.ugc.aweme.aabplugin.core.base.view;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aabplugin.core.base.m;

final /* synthetic */ class a implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    private final m f62548a;

    static {
        Covode.recordClassIndex(38482);
    }

    a(m mVar) {
        this.f62548a = mVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f62548a.d();
    }
}
