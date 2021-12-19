package com.ss.android.ugc.aweme.commerce.a.a.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commerce.a.a.b.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public final class a {
    static {
        Covode.recordClassIndex(45151);
    }

    public static float a(b bVar) {
        Context context;
        if (!bVar.f73335c || (context = com.ss.android.ugc.aweme.commerce.a.a.c.a.f73347a.f73350d.get()) == null) {
            return 0.0f;
        }
        b.a a2 = bVar.f73336d.a(new b.a(0, 0, com.bytedance.ies.dmt.ui.f.b.a(context), com.bytedance.ies.dmt.ui.f.b.b(context)));
        ArrayList<b.a> arrayList = bVar.f73337e;
        ArrayList arrayList2 = new ArrayList();
        Iterator<b.a> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(a2.a(it.next()));
        }
        return ((float) a(a2, arrayList2)) / ((float) bVar.f73336d.a());
    }

    private static int a(b.a aVar, ArrayList<b.a> arrayList) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<b.a> it = arrayList.iterator();
        while (it.hasNext()) {
            b.a next = it.next();
            hashSet.add(Integer.valueOf(next.f73338a));
            hashSet.add(Integer.valueOf(next.f73340c));
            hashSet2.add(Integer.valueOf(next.f73339b));
            hashSet2.add(Integer.valueOf(next.f73341d));
        }
        ArrayList arrayList2 = new ArrayList(hashSet);
        ArrayList arrayList3 = new ArrayList(hashSet2);
        Collections.sort(arrayList2);
        Collections.sort(arrayList3);
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList2.size() - 1; i3++) {
            int i4 = 0;
            while (i4 < arrayList3.size() - 1) {
                int i5 = i3 + 1;
                int intValue = ((Integer) arrayList2.get(i5)).intValue() - ((Integer) arrayList2.get(i3)).intValue();
                int i6 = i4 + 1;
                int intValue2 = ((Integer) arrayList3.get(i6)).intValue() - ((Integer) arrayList3.get(i4)).intValue();
                Iterator<b.a> it2 = arrayList.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    b.a next2 = it2.next();
                    if (next2.f73338a <= ((Integer) arrayList2.get(i3)).intValue() && next2.f73340c >= ((Integer) arrayList2.get(i5)).intValue() && next2.f73341d >= ((Integer) arrayList3.get(i6)).intValue() && next2.f73339b <= ((Integer) arrayList3.get(i4)).intValue()) {
                        z = true;
                    }
                }
                if (z) {
                    i2 += intValue * intValue2;
                }
                i4 = i6;
            }
        }
        return aVar.a() - i2;
    }
}
