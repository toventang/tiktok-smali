package com.bytedance.android.livesdk.actionhandler;

import com.bytedance.covode.number.Covode;
import f.a.v;
import f.a.w;

final /* synthetic */ class l implements w {

    /* renamed from: a  reason: collision with root package name */
    private final RoomActionHandler f13637a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13638b;

    static {
        Covode.recordClassIndex(7560);
    }

    l(RoomActionHandler roomActionHandler, long j2) {
        this.f13637a = roomActionHandler;
        this.f13638b = j2;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        this.f13637a.lambda$handle$0$RoomActionHandler(this.f13638b, vVar);
    }
}
