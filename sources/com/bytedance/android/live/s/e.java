package com.bytedance.android.live.s;

import android.app.Dialog;
import android.content.Context;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.model.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.ab;
import h.f.a.b;
import h.z;
import java.util.List;

public interface e extends a {
    static {
        Covode.recordClassIndex(6944);
    }

    d configUserHelper(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, f.a.b.a aVar2);

    void fetchAdminList(a aVar, long j2);

    void fetchKickOutList(b bVar, long j2, int i2, int i3);

    void fetchMuteDurationList(b<? super List<j>, z> bVar);

    void fetchMuteList(c cVar, long j2, int i2, int i3);

    Dialog getEnsureKickOutDialog(Context context, long j2, long j3, long j4, f fVar);

    ab<j> getMuteDuration();

    String getReportScene();

    void kickOut(b bVar, boolean z, long j2, long j3);

    void muteUser(User user, long j2, j jVar, g gVar);

    void report(Context context, c cVar);

    void report(Context context, d dVar);

    void setMuteDuration(j jVar);

    void unmuteUser(User user, long j2, g gVar);

    void updateAdmin(a aVar, boolean z, User user, long j2, long j3, String str);

    void updateAdmin(a aVar, boolean z, com.bytedance.android.live.s.a.a aVar2, long j2, long j3, String str);
}
