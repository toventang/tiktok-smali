package com.bytedance.android.live.core.paging.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements u {

    /* renamed from: a  reason: collision with root package name */
    private final b f9154a;

    static {
        Covode.recordClassIndex(4689);
    }

    e(b bVar) {
        this.f9154a = bVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f9154a.a(bool != null && !bool.booleanValue());
    }
}
