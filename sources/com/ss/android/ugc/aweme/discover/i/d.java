package com.ss.android.ugc.aweme.discover.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b;

public final class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f81228a;

    static {
        Covode.recordClassIndex(50479);
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b
    public final boolean a() {
        b bVar = this.f81228a;
        if (bVar != null) {
            return bVar.a();
        }
        return false;
    }

    public d(b bVar) {
        this.f81228a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.b
    public final void setRefreshing(boolean z) {
        b bVar = this.f81228a;
        if (bVar != null) {
            bVar.setRefreshing(z);
        }
    }
}
