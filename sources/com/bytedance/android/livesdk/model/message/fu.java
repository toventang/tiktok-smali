package com.bytedance.android.livesdk.model.message;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class fu implements b<RoomNotifyMessageExtra> {
    static {
        Covode.recordClassIndex(11668);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ RoomNotifyMessageExtra a(f fVar) {
        return b(fVar);
    }

    public static RoomNotifyMessageExtra b(f fVar) {
        RoomNotifyMessageExtra roomNotifyMessageExtra = new RoomNotifyMessageExtra();
        roomNotifyMessageExtra.f19105a = new ArrayList();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return roomNotifyMessageExtra;
            } else if (b2 == 1) {
                roomNotifyMessageExtra.f19108d = g.b(fVar);
            } else if (b2 == 2) {
                roomNotifyMessageExtra.f19106b = ft.b(fVar);
            } else if (b2 != 3) {
                g.c(fVar);
            } else {
                roomNotifyMessageExtra.f19107c = es.b(fVar);
            }
        }
    }
}
