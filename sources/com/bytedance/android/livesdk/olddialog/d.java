package com.bytedance.android.livesdk.olddialog;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class d implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f20018a;

    static {
        Covode.recordClassIndex(11825);
    }

    d(a aVar) {
        this.f20018a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f20018a.dismissAllowingStateLoss();
    }
}
