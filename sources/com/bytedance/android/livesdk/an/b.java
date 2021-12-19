package com.bytedance.android.livesdk.an;

import com.bytedance.android.livesdk.j.cc;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.d.k;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements k {

    /* renamed from: a  reason: collision with root package name */
    private final DataChannel f13958a;

    static {
        Covode.recordClassIndex(7746);
    }

    b(DataChannel dataChannel) {
        this.f13958a = dataChannel;
    }

    @Override // f.a.d.k
    public final boolean a(Object obj) {
        return cc.a(this.f13958a);
    }
}
