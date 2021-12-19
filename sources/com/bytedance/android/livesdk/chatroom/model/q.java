package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class q implements b<EnterRoomExtra> {
    static {
        Covode.recordClassIndex(8712);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ EnterRoomExtra a(f fVar) {
        EnterRoomExtra enterRoomExtra = new EnterRoomExtra();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return enterRoomExtra;
            } else if (b2 == 4) {
                enterRoomExtra.isOfficialChannel = g.a(fVar);
            } else if (b2 == 5) {
                enterRoomExtra.region = fVar.d();
            } else if (b2 != 6) {
                g.c(fVar);
            } else {
                enterRoomExtra.isSameAppLanguage = g.a(fVar);
            }
        }
    }
}
