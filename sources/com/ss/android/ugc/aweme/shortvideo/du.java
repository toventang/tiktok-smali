package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.g;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.tools.c;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class du {
    static {
        Covode.recordClassIndex(82968);
    }

    public static final String a(ArrayList<TimeSpeedModelExtension> arrayList) {
        l.d(arrayList, "");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().toJson(c.f149148c));
        }
        g gVar = new g();
        gVar.f54713c = true;
        return gVar.b().b(arrayList2);
    }
}
