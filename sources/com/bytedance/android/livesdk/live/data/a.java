package com.bytedance.android.livesdk.live.data;

import com.bytedance.android.live.network.response.c;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final RoomStatsViewModel f18676a;

    static {
        Covode.recordClassIndex(10461);
    }

    a(RoomStatsViewModel roomStatsViewModel) {
        this.f18676a = roomStatsViewModel;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        RoomStatsViewModel roomStatsViewModel = this.f18676a;
        c cVar = (c) obj;
        if (!h.a(cVar.f12145b)) {
            HashMap hashMap = new HashMap();
            for (com.bytedance.android.livesdk.live.model.c cVar2 : cVar.f12145b) {
                hashMap.put(String.valueOf(cVar2.f18686a), cVar2);
            }
            roomStatsViewModel.f18675a.setValue(hashMap);
        }
    }
}
