package com.bytedance.android.livesdk.live.data;

import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final RoomStatsViewModel f18677a;

    static {
        Covode.recordClassIndex(10462);
    }

    b(RoomStatsViewModel roomStatsViewModel) {
        this.f18677a = roomStatsViewModel;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f18677a.f18675a.setValue(new HashMap());
    }
}
