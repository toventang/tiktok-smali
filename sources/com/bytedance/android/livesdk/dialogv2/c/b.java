package com.bytedance.android.livesdk.dialogv2.c;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public final class b extends a {

    /* renamed from: l  reason: collision with root package name */
    private final View f16979l;

    static {
        Covode.recordClassIndex(9435);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        l.d(view, "");
        this.f16979l = view;
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a
    public final void a(com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar, int i2, DataChannel dataChannel) {
        this.f16979l.setVisibility(8);
    }
}
