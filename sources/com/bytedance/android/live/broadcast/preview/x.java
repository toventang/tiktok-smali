package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.model.f;
import com.bytedance.android.live.broadcast.preview.v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final v f8458a;

    /* renamed from: b  reason: collision with root package name */
    private final f f8459b;

    static {
        Covode.recordClassIndex(4339);
    }

    x(v vVar, f fVar) {
        this.f8458a = vVar;
        this.f8459b = fVar;
    }

    public final void run() {
        v vVar = this.f8458a;
        f fVar = this.f8459b;
        vVar.f8298f = new v.a(vVar.f8293a, vVar.f8294b, vVar.f8296d, IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR, IIconSlot.c.AGGREGATE);
        vVar.f8298f.f8303d.a("param_live_commercial", Boolean.valueOf(fVar.f7907b));
        vVar.f8298f.f8303d.a("param_live_ba_link", Boolean.valueOf(fVar.f7909d));
        vVar.f8298f.f8303d.a(vVar.f8293a, IIconSlot.b.SLOT_BROADCAST_PREVIEW_TOOLBAR);
        vVar.f8294b.getLifecycle().a(vVar.f8298f.f8303d);
    }
}
