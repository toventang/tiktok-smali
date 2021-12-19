package com.bytedance.android.live.core.paging.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class g implements u {

    /* renamed from: a  reason: collision with root package name */
    private final b f9156a;

    static {
        Covode.recordClassIndex(4691);
    }

    g(b bVar) {
        this.f9156a = bVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        b bVar = this.f9156a;
        Integer num = (Integer) obj;
        if (num != null && num.intValue() >= 0 && num.intValue() < bVar.getItemCount()) {
            bVar.notifyItemChanged(num.intValue());
        }
    }
}
