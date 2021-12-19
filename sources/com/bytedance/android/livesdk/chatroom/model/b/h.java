package com.bytedance.android.livesdk.chatroom.model.b;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.android.livesdk.chatroom.model.c.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class h implements b<b> {
    static {
        Covode.recordClassIndex(8684);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ b a(f fVar) {
        b bVar = new b();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return bVar;
            } else if (b2 == 2) {
                bVar.f15703a = (int) fVar.f();
            } else if (b2 != 3) {
                switch (b2) {
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        bVar.f15704b = fVar.d();
                        continue;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        bVar.f15706d = fVar.d();
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        long a3 = fVar.a();
                        Long l2 = null;
                        String str = null;
                        while (true) {
                            int b3 = fVar.b();
                            if (b3 == -1) {
                                fVar.a(a3);
                                if (l2 == null) {
                                    throw new IllegalStateException("Map key must not be null!");
                                } else if (str != null) {
                                    bVar.f15707e.put(l2, str);
                                    continue;
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else if (b3 == 1) {
                                l2 = Long.valueOf(fVar.f());
                            } else if (b3 == 2) {
                                str = fVar.d();
                            }
                        }
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        bVar.f15708f = fVar.e();
                        continue;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        bVar.f15709g = d.b(fVar);
                        continue;
                    default:
                        g.c(fVar);
                        continue;
                }
            } else {
                bVar.f15705c = fVar.e();
            }
        }
    }
}
