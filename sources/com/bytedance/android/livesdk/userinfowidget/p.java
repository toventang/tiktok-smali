package com.bytedance.android.livesdk.userinfowidget;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.t.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f21981a;

    static {
        Covode.recordClassIndex(12941);
    }

    p(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f21981a = liveRoomUserInfoWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        ((com.bytedance.android.live.b.f) a.a(com.bytedance.android.live.b.f.class)).xSetStorageItem(this.f21981a.context, "user_subscribe_entry_info", ((o) ((d) obj).data).toString());
    }
}
