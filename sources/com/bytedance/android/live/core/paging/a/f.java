package com.bytedance.android.live.core.paging.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class f implements u {

    /* renamed from: a  reason: collision with root package name */
    private final b f9155a;

    static {
        Covode.recordClassIndex(4690);
    }

    f(b bVar) {
        this.f9155a = bVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        boolean booleanValue;
        b bVar = this.f9155a;
        Boolean bool = (Boolean) obj;
        if (bool != null && bVar.f9137e != (booleanValue = bool.booleanValue())) {
            bVar.f9137e = booleanValue;
            bVar.notifyDataSetChanged();
        }
    }
}
