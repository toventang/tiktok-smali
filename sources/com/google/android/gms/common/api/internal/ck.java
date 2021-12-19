package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import com.bytedance.covode.number.Covode;

final class ck extends bh {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Dialog f50165a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ci f50166b;

    static {
        Covode.recordClassIndex(31283);
    }

    @Override // com.google.android.gms.common.api.internal.bh
    public final void a() {
        this.f50166b.f50161a.f();
        if (this.f50165a.isShowing()) {
            this.f50165a.dismiss();
        }
    }

    ck(ci ciVar, Dialog dialog) {
        this.f50166b = ciVar;
        this.f50165a = dialog;
    }
}
