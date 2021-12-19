package com.ss.android.ugc.aweme.shortvideo.subtitle;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.data.h;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(85813);
    }

    public static final ArrayList<h> a(List<h> list, int i2) {
        l.d(list, "");
        ArrayList<h> arrayList = new ArrayList<>();
        if (list.isEmpty()) {
            return arrayList;
        }
        int i3 = 0;
        if (((int) list.get(0).getStartTime()) != 0) {
            arrayList.add(new h(0, list.get(0).getStartTime()));
        }
        int size = list.size();
        while (true) {
            if (i3 >= size) {
                break;
            } else if (i3 == list.size() - 1) {
                arrayList.add(new h(list.get(i3)));
                break;
            } else {
                arrayList.add(new h(list.get(i3)));
                i3++;
                arrayList.add(new h(list.get(i3).getEndTime(), list.get(i3).getStartTime()));
            }
        }
        if (((int) list.get(list.size() - 1).getEndTime()) != i2) {
            arrayList.add(new h(list.get(list.size() - 1).getEndTime(), (long) i2));
        }
        return arrayList;
    }
}
