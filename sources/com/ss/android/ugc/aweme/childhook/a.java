package com.ss.android.ugc.aweme.childhook;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.childhook.a.a.b;
import com.ss.android.ugc.aweme.childhook.a.a.c;
import com.ss.android.ugc.aweme.childhook.a.a.d;
import h.f.b.l;
import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f70248a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(43329);
    }

    public static boolean a(Intent intent) {
        l.d(intent, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.ss.android.ugc.aweme.childhook.a.a.a());
        arrayList.add(new c());
        arrayList.add(new b());
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((d) arrayList.get(i2)).a(intent)) {
                    return ((d) arrayList.get(i2)).b(intent);
                }
            }
        }
        return true;
    }
}
