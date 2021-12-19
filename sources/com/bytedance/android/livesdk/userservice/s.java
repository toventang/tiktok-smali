package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.b;
import com.bytedance.covode.number.Covode;
import f.a.d.k;

final /* synthetic */ class s implements k {

    /* renamed from: a  reason: collision with root package name */
    private final long f22108a;

    static {
        Covode.recordClassIndex(13019);
    }

    s(long j2) {
        this.f22108a = j2;
    }

    @Override // f.a.d.k
    public final boolean a(Object obj) {
        b bVar = (b) obj;
        return bVar != null && bVar.getId() == this.f22108a;
    }
}
