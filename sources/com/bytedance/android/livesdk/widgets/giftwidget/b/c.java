package com.bytedance.android.livesdk.widgets.giftwidget.b;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements u {

    /* renamed from: a  reason: collision with root package name */
    private final b f22780a;

    static {
        Covode.recordClassIndex(13422);
    }

    c(b bVar) {
        this.f22780a = bVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        b bVar = this.f22780a;
        if (bVar.f22769c != null) {
            bVar.f22769c.setVisibility(8);
        }
    }
}
