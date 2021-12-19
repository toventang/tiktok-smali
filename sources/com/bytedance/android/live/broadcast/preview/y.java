package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.model.f;
import com.bytedance.android.live.broadcast.preview.v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final v f8460a;

    /* renamed from: b  reason: collision with root package name */
    private final f f8461b;

    static {
        Covode.recordClassIndex(4340);
    }

    y(v vVar, f fVar) {
        this.f8460a = vVar;
        this.f8461b = fVar;
    }

    public final void run() {
        v vVar = this.f8460a;
        f fVar = this.f8461b;
        vVar.f8299g = new v.a(vVar.f8293a, vVar.f8294b, vVar.f8296d, IIconSlot.b.SLOT_BROADCAST_PREVIEW_PROMOTE, IIconSlot.c.PRIORITY);
        vVar.f8299g.f8303d.a("param_broadcast_preview_promote_bool", Boolean.valueOf(fVar.f7908c));
        vVar.f8299g.f8303d.a(vVar.f8293a, IIconSlot.b.SLOT_BROADCAST_PREVIEW_PROMOTE);
        vVar.f8294b.getLifecycle().a(vVar.f8299g.f8303d);
    }
}
