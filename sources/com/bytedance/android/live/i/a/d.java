package com.bytedance.android.live.i.a;

import android.content.Context;
import com.bytedance.android.d.b;
import com.bytedance.android.d.c;
import com.bytedance.android.d.e;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.n.f;
import com.bytedance.android.live.n.k;
import com.bytedance.android.live.n.l;
import com.bytedance.android.live.n.m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.depend.model.live.s;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;

public interface d extends a {
    static {
        Covode.recordClassIndex(5108);
    }

    b createRoomPlayer(String str, i iVar, s.a aVar, com.bytedance.android.livesdkapi.view.d dVar, b.a aVar2, Context context, String str2);

    b createRoomPlayer(String str, String str2, i iVar, s.a aVar, com.bytedance.android.livesdkapi.view.d dVar, b.a aVar2, Context context);

    b ensureRoomPlayer(long j2, String str, i iVar, s.a aVar, com.bytedance.android.livesdkapi.view.d dVar, b.a aVar2, Context context, String str2, String str3);

    b ensureRoomPlayer(long j2, String str, String str2, i iVar, s.a aVar, com.bytedance.android.livesdkapi.view.d dVar, b.a aVar2, Context context, String str3);

    a getCpuInfoFetcher();

    f getDnsOptimizer();

    b getGpuInfoFetcher();

    e getIRoomPlayerManager();

    k getLivePlayController();

    l getLivePlayControllerManager();

    c getLivePlayerLog();

    m getLiveStreamStrategy();

    String getProjectKey();

    boolean preCreatedSurface(String str, Context context);

    void recycleRoomPlayer(String str);

    void stopRoomPlayer(String str, boolean z);

    c warmUp(long j2, EnterRoomConfig enterRoomConfig, Context context);

    c warmUp(Room room, Context context);
}
