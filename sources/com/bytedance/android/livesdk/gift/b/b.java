package com.bytedance.android.livesdk.gift.b;

import com.bytedance.android.livesdk.gift.b.a;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(9910);
    }

    /* JADX WARN: Init of enum SHOW can be incorrect */
    public enum a {
        SHOW("Show the gift icon", r3),
        TOAST("Show the toast but not the low age Dialog", null);
        
        String description;
        List<a.c> mStatusSets;

        static {
            Covode.recordClassIndex(9911);
            LinkedList linkedList = new LinkedList();
            linkedList.add(new a.c(a.b.YES, a.b.WHATEVER, a.b.YES, a.b.WHATEVER, a.b.YES));
            a.b bVar = a.b.NO;
            a.b bVar2 = a.b.WHATEVER;
            a.b bVar3 = a.b.YES;
            linkedList.add(new a.c(bVar, bVar2, bVar3, bVar3, a.b.YES));
        }

        private a(String str, List list) {
            this.description = str;
            this.mStatusSets = list;
        }
    }

    public static a a(boolean z, boolean z2, boolean z3) {
        a.c b2 = a.b(z, z2, z3);
        a[] values = a.values();
        for (a aVar : values) {
            if (aVar.mStatusSets != null) {
                boolean z4 = false;
                for (a.c cVar : aVar.mStatusSets) {
                    if (cVar.a(b2)) {
                        z4 = true;
                    }
                }
                if (z4) {
                    return aVar;
                }
            }
        }
        return a.TOAST;
    }
}
