package com.bytedance.android.live.broadcast.bgbroadcast.a.a;

import com.bytedance.android.live.broadcast.widget.ControlButton;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements ControlButton.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f7610a;

    static {
        Covode.recordClassIndex(3752);
    }

    c(a aVar) {
        this.f7610a = aVar;
    }

    @Override // com.bytedance.android.live.broadcast.widget.ControlButton.a
    public final void a() {
        a aVar = this.f7610a;
        if (aVar.f7606b != null) {
            aVar.f7606b.a();
        }
    }
}
