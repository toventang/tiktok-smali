package com.ss.android.ugc.aweme.detail.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ac implements u {

    /* renamed from: a  reason: collision with root package name */
    private final z f79916a;

    static {
        Covode.recordClassIndex(49712);
    }

    ac(z zVar) {
        this.f79916a = zVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        z zVar = this.f79916a;
        if (((Integer) obj).intValue() == 0) {
            zVar.n = false;
        }
    }
}
