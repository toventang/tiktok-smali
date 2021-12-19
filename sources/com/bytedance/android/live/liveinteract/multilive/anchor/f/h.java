package com.bytedance.android.live.liveinteract.multilive.anchor.f;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.api.as;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.b.o;
import com.bytedance.android.live.liveinteract.multilive.e.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class h extends a {
    static {
        Covode.recordClassIndex(6344);
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a() {
        return R.layout.bd6;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a
    public final int b() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final boolean d() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.b
    public final n c() {
        return n.NORMAL;
    }

    private final void f() {
        this.f11788i.c(as.class, new o(n.NORMAL, null, false, false, 0, 0, 0, 0, false, 510));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(DataChannel dataChannel) {
        super(dataChannel);
        l.d(dataChannel, "");
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final void a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        super.a(viewGroup);
        f();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.e.a, com.bytedance.android.live.liveinteract.multilive.e.b
    public final int a(View view, int i2) {
        l.d(view, "");
        f();
        return -1;
    }
}
