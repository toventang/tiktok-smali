package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class MusicCollectionFilterKt {
    static {
        Covode.recordClassIndex(71670);
    }

    public static final List<MusicCollectionItem> distinctByName(List<? extends MusicCollectionItem> list) {
        l.d(list, "");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (hashSet.add(t.mcName)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
