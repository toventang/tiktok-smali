package com.bytedance.android.live.wallet.model;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f13214a;

    static {
        Covode.recordClassIndex(7334);
    }

    b(a aVar) {
        this.f13214a = aVar;
    }

    public final void onClick(View view) {
        a aVar = this.f13214a;
        if (aVar.r != null) {
            aVar.r.a(aVar, aVar.f13208h.isChecked());
        }
    }
}
