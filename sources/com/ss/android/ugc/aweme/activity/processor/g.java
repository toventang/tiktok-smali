package com.ss.android.ugc.aweme.activity.processor;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.d;
import com.bytedance.ies.foundation.base.a;
import java.util.ArrayList;
import java.util.List;

public final class g extends d {
    static {
        Covode.recordClassIndex(40319);
    }

    @Override // com.bytedance.ies.foundation.activity.b, com.bytedance.ies.foundation.base.c
    public final void a(int i2, int i3, Intent intent) {
        super.a(i2, i3, intent);
        List<a> b2 = b().b();
        ArrayList<f> arrayList = new ArrayList();
        for (T t : b2) {
            if (t instanceof f) {
                arrayList.add(t);
            }
        }
        for (f fVar : arrayList) {
            fVar.f65536a.a(i2, i3, intent);
        }
    }
}
