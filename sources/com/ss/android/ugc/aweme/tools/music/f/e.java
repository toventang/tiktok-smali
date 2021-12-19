package com.ss.android.ugc.aweme.tools.music.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.f.b;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class e {
    static {
        Covode.recordClassIndex(91827);
    }

    public static final MusicModel a(c cVar) {
        l.d(cVar, "");
        return b.a.a(cVar);
    }

    public static final boolean a(ArrayList<MusicModel> arrayList, MusicModel musicModel) {
        l.d(arrayList, "");
        if (musicModel == null) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (l.a((Object) it.next().getMusicId(), (Object) musicModel.getMusicId())) {
                return true;
            }
        }
        return false;
    }

    public static final int b(ArrayList<MusicModel> arrayList, MusicModel musicModel) {
        l.d(arrayList, "");
        if (musicModel == null) {
            return -1;
        }
        int i2 = 0;
        for (T t : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            if (l.a((Object) t.getMusicId(), (Object) musicModel.getMusicId())) {
                return i2;
            }
            i2 = i3;
        }
        return -1;
    }
}
