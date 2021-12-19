package com.bytedance.android.livesdk.envelope.widget;

import android.view.View;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.gift.d.g;
import com.bytedance.android.livesdk.gift.d.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final DataChannel f17175a;

    static {
        Covode.recordClassIndex(9532);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
    }

    public b(DataChannel dataChannel) {
        l.d(dataChannel, "");
        this.f17175a = dataChannel;
    }

    public final void onClick(View view) {
        this.f17175a.c(g.class, new j("more"));
    }
}
