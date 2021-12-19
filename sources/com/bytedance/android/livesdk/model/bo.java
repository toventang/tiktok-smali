package com.bytedance.android.livesdk.model;

import com.bytedance.android.e.a.a.b;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.e.a.a.g;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class bo implements b<FansClubMember> {
    static {
        Covode.recordClassIndex(11346);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.e.a.a.b
    public final /* synthetic */ FansClubMember a(f fVar) {
        return b(fVar);
    }

    public static FansClubMember b(f fVar) {
        FansClubMember fansClubMember = new FansClubMember();
        fansClubMember.preferData = new HashMap();
        long a2 = fVar.a();
        while (true) {
            int b2 = fVar.b();
            if (b2 == -1) {
                fVar.a(a2);
                return fansClubMember;
            } else if (b2 == 1) {
                fansClubMember.data = bm.b(fVar);
            } else if (b2 != 2) {
                g.c(fVar);
            } else {
                long a3 = fVar.a();
                Integer num = null;
                FansClubData fansClubData = null;
                while (true) {
                    int b3 = fVar.b();
                    if (b3 == -1) {
                        break;
                    } else if (b3 == 1) {
                        num = Integer.valueOf(fVar.e());
                    } else if (b3 == 2) {
                        fansClubData = bm.b(fVar);
                    }
                }
                fVar.a(a3);
                if (num == null) {
                    throw new IllegalStateException("Map key must not be null!");
                } else if (fansClubData != null) {
                    fansClubMember.preferData.put(num, fansClubData);
                } else {
                    throw new IllegalStateException("Map value must not be null!");
                }
            }
        }
    }
}
