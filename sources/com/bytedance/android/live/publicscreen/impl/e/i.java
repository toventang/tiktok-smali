package com.bytedance.android.live.publicscreen.impl.e;

import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;

final /* synthetic */ class i implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    static final Comparator f12351a = new i();

    static {
        Covode.recordClassIndex(6788);
    }

    private i() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        h hVar = (h) obj;
        h hVar2 = (h) obj2;
        if (hVar.p() == hVar2.p()) {
            return 0;
        }
        return hVar.p() - hVar2.p() < 0 ? -1 : 1;
    }
}
