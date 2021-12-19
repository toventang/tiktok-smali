package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;

final /* synthetic */ class be implements bl {

    /* renamed from: a  reason: collision with root package name */
    private final bm f52871a;

    /* renamed from: b  reason: collision with root package name */
    private final List f52872b;

    static {
        Covode.recordClassIndex(32697);
    }

    be(bm bmVar, List list) {
        this.f52871a = bmVar;
        this.f52872b = list;
    }

    @Override // com.google.android.play.core.assetpacks.bl
    public final Object a() {
        bm bmVar = this.f52871a;
        List list = this.f52872b;
        HashMap hashMap = new HashMap();
        for (bj bjVar : bmVar.f52896e.values()) {
            String str = bjVar.f52885c.f52878a;
            if (list.contains(str)) {
                bj bjVar2 = (bj) hashMap.get(str);
                if ((bjVar2 == null ? -1 : bjVar2.f52883a) < bjVar.f52883a) {
                    hashMap.put(str, bjVar);
                }
            }
        }
        return hashMap;
    }
}
