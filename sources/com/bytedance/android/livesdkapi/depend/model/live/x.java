package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;

public final class x implements b<ContinueRoomResponse> {
    static {
        Covode.recordClassIndex(13735);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ ContinueRoomResponse a(f fVar) {
        ContinueRoomResponse continueRoomResponse = new ContinueRoomResponse();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return continueRoomResponse;
            } else if (b2 != 1) {
                g.c(fVar);
            } else {
                continueRoomResponse.room = al.b(fVar);
            }
        }
    }
}
