package com.bytedance.android.livesdk.liveroom;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements u {

    /* renamed from: a  reason: collision with root package name */
    private final RoomStatusController f18696a;

    static {
        Covode.recordClassIndex(10489);
    }

    a(RoomStatusController roomStatusController) {
        this.f18696a = roomStatusController;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        this.f18696a.bridge$lambda$0$RoomStatusController((Map) obj);
    }
}
